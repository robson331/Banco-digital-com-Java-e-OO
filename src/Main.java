
public class Main {

	public static void main(String[] args) {
		
		Cliente robson = new Cliente();
		robson.setNome("Robson Gonçalves");
		
				
		Conta cc = new ContaCorrente(robson);
		Conta poupanca = new ContaPoupanca(robson);
		
		Conta aplicacao = new ContaAcao(robson);
		
		
		cc.depositar(5500);
		cc.transferir(1000, poupanca);
		cc.aplicarEmAcao(500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		aplicacao.imprimirExtrato();
	}


}


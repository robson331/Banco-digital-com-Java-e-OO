
public class ContaAcao extends Conta {

	public ContaAcao(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Aplica��o em A��es ===");
		super.imprimirInfosComuns();
		
	}

}

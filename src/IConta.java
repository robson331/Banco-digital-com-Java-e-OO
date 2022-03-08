
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta Destino);
	
	void imprimirExtrato();
	
	void aplicarEmAcao(double valor);
	
	
}

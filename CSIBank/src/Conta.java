
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}		
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
}

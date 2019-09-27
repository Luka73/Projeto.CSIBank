
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	public void deposita(double valor) {
		if(valor < 3000) {
			saldo += valor;
		}
	}
	
	public void saca(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}
	}
	
}

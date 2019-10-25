
public class Conta {
	double saldo;
	int agencia;
	int numero;
	Titular titular;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
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
			destino.setSaldo(valor);
			return true;
		}
		return false;
	}
	
}

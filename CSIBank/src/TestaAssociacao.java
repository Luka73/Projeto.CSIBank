
public class TestaAssociacao {

	public static void main(String[] args) {
		Conta contaDaPaula = new Conta();
		contaDaPaula.agencia = 1234;
		contaDaPaula.numero = 1234567;
		contaDaPaula.setSaldo(100.00);
		
		if(!contaDaPaula.saca(200.00)) {
			System.out.println("Saldo insuficiente!");
		}
		contaDaPaula.saldo = -100;
		
		Titular paula = new Titular();
		paula.setNome("Paula Silva");
		contaDaPaula.titular = paula;
			
		System.out.println(contaDaPaula.numero);
		System.out.println(contaDaPaula.saldo);
		System.out.println(contaDaPaula.titular.getNome());
		
		

	}

}

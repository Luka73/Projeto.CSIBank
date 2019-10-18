
public class TestaMetodos {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		conta1.deposita(100.0);
		conta1.deposita(50);
		
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.saca(80);
		System.out.println("Saldo: " + conta1.saldo);
		
		if(conta1.saca(100)) {
			System.out.println("Saldo: " + conta1.saldo);
		} else {
			System.out.println("Saldo insuficiente!");
			System.out.println("Seu saldo é: " + conta1.saldo);
		}
		
		System.out.println("Saldo da conta2 antes: " + conta2.saldo);
		conta1.transfere(50, conta2);
		System.out.println("Saldo da conta2 depois: " + conta2.saldo);
		System.out.println("Saldo da conta1 atual: " + conta1.saldo);
		

	}

}

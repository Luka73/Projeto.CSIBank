
public class TestaHeranca {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria");
	
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Pedro");
		pf1.setCpf("123.456.789-00");
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Loreal");
		pj1.setCnpj("123.456.789/00");

	}

}

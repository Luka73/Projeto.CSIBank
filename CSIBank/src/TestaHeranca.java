
public class TestaHeranca {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Luana");
		p1.setNome("Maria");
		
		Pessoa p2 = new Pessoa("Raquel", "raquel@gmail.com");
		
		Pessoa p3 = new Pessoa();
	
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Pedro");
		pf1.setCpf("123.456.789-00");
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Loreal");
		pj1.setCnpj("123.456.789/00");

	}

}

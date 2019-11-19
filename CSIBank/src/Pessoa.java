
public class Pessoa {
	
	private String nome;
	private String email;
	private int	ativo;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome){
		this.nome = nome;
		this.ativo = 1;
	}
	
	Pessoa(String nome, String email){
		this.nome = nome;
		this.email = email;
		this.ativo = 1;
	}
	
	Pessoa(int ativo){
		this.ativo = ativo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

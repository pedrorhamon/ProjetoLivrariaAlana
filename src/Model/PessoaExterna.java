package Model;

//Pessoa Externa 

public class PessoaExterna extends Usuario {
	
	private String id;
	private String login;
	private String senha;
	private Double taxasemestral;
	
	public PessoaExterna() {
		super();
	}

	public PessoaExterna(String nome, String endereco, String email, Integer idade, char genero, long telefone,
			String id, String login, String senha, Double taxasemestral) {
		super(nome, endereco, email, idade, genero, telefone);
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.taxasemestral = taxasemestral;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getTaxasemestral() {
		return taxasemestral;
	}

	@Override
	public String toString() {
		return "PessoaExterna [id=" + id + ", login=" + login + ", senha=" + senha + ", taxasemestral=" + taxasemestral
				+ "]";
	}
		
}

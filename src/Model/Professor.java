package Model;

//Classe Professor

public class Professor extends Usuario {
	
	private String formacao;
	private String curso;
	
	public Professor () {
		
	}

	public Professor(String nome, String endereco, String email, Integer idade, char genero, long telefone,
			String formacao, String curso) {
		super(nome, endereco, email, idade, genero, telefone);
		this.formacao = formacao;
		this.curso = curso;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	

}

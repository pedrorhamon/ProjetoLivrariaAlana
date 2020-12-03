package Model;

// Classe Aluno

public class Aluno extends Usuario {
	
	private long matricula;
	private String curso;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String endereco, String email, Integer idade, char genero, long telefone, long matricula,
			String curso) {
		super(nome, endereco, email, idade, genero, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}

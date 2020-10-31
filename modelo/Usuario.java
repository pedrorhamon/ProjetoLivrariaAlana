package modelo;

	// Cadastrar e remover usuarios da biblioteca
public class Usuario {
	
	private String usuario;
	private String endereco;
	private int matricula;
	private int cpf;
	
	public Usuario() {	
	}
	
	public Usuario(String usuario, String endereco, int matricula, int cpf) {
		this.usuario = usuario;
		this.endereco = endereco;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void removeUsuario(String usuarios) {
		this.usuario=usuarios;
	}
	public void addUsuario(String usuarios) {
		this.usuario=usuarios;
	}

	public String toString() {
		return "Usuario [usuario=" + usuario + ", endereco=" + endereco + ", matricula=" + matricula + ", cpf=" + cpf
				+ "]";
	}
}

	

	

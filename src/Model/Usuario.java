package Model;

// Classe Alfa

public class Usuario {
	
	private String nome;
	private String endereco;
	private String email;
	private Integer idade;
	private char genero;
	private long telefone;
	
	public Usuario() {	
	}

	public Usuario(String nome, String endereco, String email, Integer idade, char genero, long telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.idade = idade;
		this.genero = genero;
		this.telefone = telefone;
	}

    Usuario(String string, String string0, String string1, char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario(String nome, String nomeUsuario, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public void addUsuario() {	
	}
	
	public void removeUsuario() {	
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", idade=" + idade
				+ ", genero=" + genero + ", telefone=" + telefone + "]";
	}

    void setCadastroList(CadastroList aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getNomeUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	
}

	

	

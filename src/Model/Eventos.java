package Model;

public class Eventos {
	
	private String nome;
	private Espaco espaco;
	private String date;
	private int cpf;
	private String solicitacao;
	
	public Eventos () {
		
	}

	public Eventos(String nome, Espaco espaco, String date, int cpf, String solicitacao) {
		this.nome = nome;
		this.espaco = espaco;
		this.date = date;
		this.cpf = cpf;
		this.solicitacao = solicitacao;
	}

    Eventos(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Espaco getEspaco() {
		return espaco;
	}

	public void setEspaco(Espaco espaco) {
		this.espaco = espaco;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	@Override
	public String toString() {
		return "Eventos [nome=" + nome + ", espaco=" + espaco + ", date=" + date + ", cpf=" + cpf + ", solicitacao="
				+ solicitacao + "]";
	}
	
	
}

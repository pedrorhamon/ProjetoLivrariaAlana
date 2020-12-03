package Model;

public class Aluguel {
	
	private Usuario usuario;
	private Status status;
	private String quantLivros;
	private long prazo;
	private Double multa;
	
	public Aluguel () {
		
	}

	public Aluguel(Usuario usuario, Status status, String quantLivros, long prazo, Double multa) {
		this.usuario = usuario;
		this.status = status;
		this.quantLivros = quantLivros;
		this.prazo = prazo;
		this.multa = multa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getQuantLivros() {
		return quantLivros;
	}

	public void setQuantLivros(String quantLivros) {
		this.quantLivros = quantLivros;
	}

	public long getPrazo() {
		return prazo;
	}

	public void setPrazo(long prazo) {
		this.prazo = prazo;
	}

	public Double getMulta() {
		return multa;
	}

	public void setMulta(Double multa) {
		this.multa = multa;
	}

	@Override
	public String toString() {
		return "Aluguel [usuario=" + usuario + ", status=" + status + ", quantLivros=" + quantLivros + ", prazo="
				+ prazo + ", multa=" + multa + "]";
	}
	
	
}

package modelo;

public class Numero_15 {
	
	private String titulo;
	private String autor;
	private int ano_publicado;
	private int numeracao;
	private String posicao;
	
	public Numero_15(String titulo, String autor, int ano_publicado, int numeracao, String posicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano_publicado = ano_publicado;
		this.numeracao = numeracao;
		this.posicao = posicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_publicado() {
		return ano_publicado;
	}

	public void setAno_publicado(int ano_publicado) {
		this.ano_publicado = ano_publicado;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String toString() {
		return "Numero_15 [titulo=" + titulo + ", autor=" + autor + ", ano_publicado=" + ano_publicado + ", numeracao="
				+ numeracao + ", posicao=" + posicao + "]";
	}
	
	
	
	
	
	

}

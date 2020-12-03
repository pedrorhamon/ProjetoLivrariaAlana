package Model;

public class FichaCatalografica {
	
	private String titulo;
	private String autor;
	private String anoPublicado;
	private String editora;
	private String categoria;
	
	public FichaCatalografica() {
		
	}

	public FichaCatalografica(String titulo, String autor, String anoPublicado, String editora, String categoria) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicado = anoPublicado;
		this.editora = editora;
		this.categoria = categoria;
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

	public String getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(String anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "FichaCatalografica [titulo=" + titulo + ", autor=" + autor + ", anoPublicado=" + anoPublicado
				+ ", editora=" + editora + ", categoria=" + categoria + "]";
	}
	

}

package modelo;

public class Numero_13 {

	// Cadastrar Eventos na biblioteca

	private String nomeDoLivro;
	private int posicao;
	private int numeros;

	public Numero_13(String nomeDoLivro, int posicao, int numeros) {
		this.nomeDoLivro = nomeDoLivro;
		this.posicao = posicao;
		this.numeros = numeros;
	}

	public String getNomeDoLivro() {
		return nomeDoLivro;
	}

	public void setNomeDoLivro(String nomeDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public String toString() {
		return "Numero_13 [nomeDoLivro=" + nomeDoLivro + ", posicao=" + posicao + ", numeros=" + numeros + "]";
	}
	

}

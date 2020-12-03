package Model;

public class Espaco {
	
	private String nome;
	private Double capacidade;
	
	public Espaco() {
		
	}

	public Espaco(String nome, Double capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Espaco [nome=" + nome + ", capacidade=" + capacidade + "]";
	}
	
	
	

}

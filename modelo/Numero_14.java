package modelo;

public class Numero_14 {
	
	//Reservar Espaços para eventos
	
	private String nome;
	private int horario;
	private int dia, mes, ano;
	
	public Numero_14(String nome, int horario, int dia, int mes, int ano) {
		this.nome = nome;
		this.horario = horario;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	public String toString() {
		return "Numero_14 [nome=" + nome + ", horario=" + horario + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano
				+ "]";
	}
	
	

}

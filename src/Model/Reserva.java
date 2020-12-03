package Model;

public class Reserva extends Espaco{
	
	private Status status;
	private String horario;
	
	public Reserva () {
		
	}
	
	public Reserva(String nome, Double capacidade, Status status, String horario) {
		super(nome, capacidade);
		this.status = status;
		this.horario = horario;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getHorario() {
		return horario;
	}

	public void addReserva() {
		
	}
	
	public void removeReserva() {
		
	}

	@Override
	public String toString() {
		return "Reserva [status=" + status + ", horario=" + horario + "]";
	}
	
}

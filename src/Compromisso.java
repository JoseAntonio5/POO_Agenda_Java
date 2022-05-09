public class Compromisso {
	
	private String assunto;
	private Integer horaInicio;
	private Integer horaFim;
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Integer getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Integer getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}
	
	public String toString() {
		return "Assunto: " + assunto + "\nInicio/fim: " + horaInicio + "/" + horaFim;
	}
}
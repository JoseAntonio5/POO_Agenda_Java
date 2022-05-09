public class Aniversario extends Compromisso {
	private String local;
	private String aniversariante;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getAniversariante() {
		return aniversariante;
	}
	public void setAniversariante(String aniversariante) {
		this.aniversariante = aniversariante;
	}
	
	public String toString() {
		return "Assunto: " + getAssunto() + 
				"\nInicio/fim: " + getHoraInicio() + "/" + getHoraFim() +
				"\nLocal: " + getLocal() +
				"\nAniversariante: " + getAniversariante();
	}
}
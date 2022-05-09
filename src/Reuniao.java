public class Reuniao extends Compromisso {
	
	private String local;
	private Boolean presenca;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Boolean getPresenca() {
		return presenca;
	}
	public void setPresenca(Boolean presenca) {
		this.presenca = presenca;
	}
	
	public String toString() {
		return "Assunto: " + getAssunto() + 
				"\nInicio/fim: " + getHoraInicio() + "/" + getHoraFim() +
				"\nLocal: " + getLocal() +
				"\nObrigatoriedade: " + getPresenca();
	}

}
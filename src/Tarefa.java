public class Tarefa extends Compromisso {
	private Integer esforco;
	private Integer prioridade;

	public Integer getEsforco() {
		return esforco;
	}
	public void setEsforco(Integer esforco) {
		this.esforco = esforco;
	}
	public Integer getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	
	public String toString() {
		return "Assunto: " + getAssunto() + 
				"\nInicio/fim: " + getHoraInicio() + "/" + getHoraFim() +
				"\nEsforco: " + getEsforco() +
				"\nPrioridade: " + getPrioridade();
	}
}
import java.util.List;
import java.util.ArrayList;

public class Agenda {
	
	private List<Compromisso> compromissos = new ArrayList<Compromisso>();
	
	public void adicionaCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
	}
	
	public List<Compromisso> getCompromisso() {
		return compromissos;
	}
	
	public String toString() {
		String conteudo = "";
		
		conteudo += "----------------------\n";
		
		for(Compromisso compromisso : compromissos) {
			conteudo += compromisso.toString() + "\n";
			conteudo += "----------------------\n";
		}
		
		return conteudo;
	}
}
import java.util.List;

public class Programa {
	
	static Usuario[] usuarios = new Usuario[100];
	static int numUsuarios = 0;
	
	public static void main(String[] args) {
		
		boolean executando = true;
		
		while(executando) {
			
			System.out.println("Menu");
			System.out.println("1 - Cadastrar novo usuario");
			System.out.println("2 - Listar usuarios cadastrados");
			System.out.println("3 - Cadastrar reuniao para usuario");
			System.out.println("4 - Cadastrar tarefa para usuario");
			System.out.println("5 - Cadastrar aniversario para usuario");
			System.out.println("6 - Imprimir agenda");
			System.out.println("9 - Sair");
			System.out.print("Escolha uma opcao: ");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
			
			case 1:
				cadastrarUsuario();
				break;
			case 2:
				listaUsuarios();
				break;
			case 3:
				adicionaReuniao();
				break;
			case 4:
				adicionaTarefa();
				break;
			case 5:
				adicionaAniversario();
				break;
			case 6:
				imprimirAgenda();
				break;
			case 9:
				executando = false;
				break;
			default:
				System.out.println("Opcao invalida!");
			
			}
			
		}
		
	}
	
	public static void cadastrarUsuario() {
		
		// PEGANDO OS DADOS DO USUARIO
		System.out.println("Cadastro de usuario");
		
		System.out.print("Digite o nome do usuario: ");
		String nome = Console.readLine();
		
		System.out.print("Digite o email do usuario: ");
		String email = Console.readLine();
		
		// SALVANDO O USUARIO
		Usuario usuario = new Usuario(nome, email);
		
		System.out.println("Usuario cadastrado com sucesso! O seu ID de usuario e: " + numUsuarios);
		
		usuarios[numUsuarios++] = usuario;
	}
	
	public static void listaUsuarios() {
		
		System.out.println("USUARIOS CADASTRADOS:");
		
		for(int i=0; i < numUsuarios; i++) {
			System.out.println("ID: " + i + "\n" + usuarios[i].toString());
			System.out.print("\n");
		}
	}
	
	public static void adicionaReuniao() {
		System.out.println("ADICIONAR NOVA REUNIAO");
		
		System.out.print("Entre o ID do usuario: ");
		Integer id = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o assunto: ");
		String assunto = Console.readLine();
		
		System.out.print("Entre com a hora inicio: ");
		Integer horaInicio = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com a hora fim: ");
		Integer horaFim = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o local: ");
		String local = Console.readLine();
		
		System.out.print("Entre com a obrigatoriedade: ");
		Boolean presenca = Boolean.parseBoolean(Console.readLine());
		
		Reuniao reuniao = new Reuniao();
		reuniao.setAssunto(assunto);
		reuniao.setHoraInicio(horaInicio);
		reuniao.setHoraFim(horaFim);
		reuniao.setLocal(local);
		reuniao.setPresenca(presenca);
		Usuario usuario = usuarios[id];
		Agenda agenda = usuario.getAgenda();
		agenda.adicionaCompromisso(reuniao);
		
	}
	
	public static void adicionaTarefa() {
		System.out.println("ADICIONAR NOVA TAREFA");
		
		System.out.print("Entre o ID do usuario: ");
		Integer id = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o assunto: ");
		String assunto = Console.readLine();
		
		System.out.print("Entre com a hora inicio: ");
		Integer horaInicio = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com a hora fim: ");
		Integer horaFim = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o esforco: ");
		Integer esforco = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com a prioridade: ");
		Integer prioridade = Integer.parseInt(Console.readLine());
		
		Tarefa tarefa = new Tarefa();
		tarefa.setAssunto(assunto);
		tarefa.setHoraInicio(horaInicio);
		tarefa.setHoraFim(horaFim);
		tarefa.setEsforco(esforco);
		tarefa.setPrioridade(prioridade);
		Usuario usuario = usuarios[id];
		Agenda agenda = usuario.getAgenda();
		agenda.adicionaCompromisso(tarefa);
	}
	
	public static void adicionaAniversario() {
		System.out.println("ADICIONAR NOVO ANIVERSARIO");
		
		System.out.print("Entre o ID do usuario: ");
		Integer id = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o assunto: ");
		String assunto = Console.readLine();
		
		System.out.print("Entre com a hora inicio: ");
		Integer horaInicio = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com a hora fim: ");
		Integer horaFim = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o local: ");
		String local = Console.readLine();
		
		System.out.print("Entre o nome do aniversariante: ");
		String aniversariante = Console.readLine();
		
		Aniversario aniversario = new Aniversario();
		aniversario.setAssunto(assunto);
		aniversario.setHoraInicio(horaInicio);
		aniversario.setHoraFim(horaFim);
		aniversario.setLocal(local);
		aniversario.setAniversariante(aniversariante);
		Usuario usuario = usuarios[id];
		Agenda agenda = usuario.getAgenda();
		agenda.adicionaCompromisso(aniversario);
		
	}
	
	public static void imprimirAgenda() {
		System.out.println("Imprimir agenda");
		
		System.out.print("Entre com o ID do usuario: ");
		Integer id = Integer.parseInt(Console.readLine());
		
		List<Compromisso> compromissos = usuarios[id].getAgenda().getCompromisso();
		for(Compromisso compromisso : compromissos) {
			System.out.println(compromisso.toString());
		}
		
		System.out.println(usuarios[id].getAgenda().toString());
	}
}
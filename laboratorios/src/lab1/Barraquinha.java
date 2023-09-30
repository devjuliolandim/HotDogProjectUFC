package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Barraquinha {

	private Scanner dados;
	private ArrayList<Venda> listaVenda;

	public Barraquinha() {
		System.out.println("Bem vindo a barrainha de t�cnicas!\n\n");
		dados = new Scanner(System.in);
		listaVenda = new ArrayList<Venda>();
		menuOperacoes();
	}

	private void menuOperacoes() {

		int op = 0;
		Aluno comprador = null;
		CachorroQuente cachorroQuenteEscolhido;
		Venda venda= null;
		do {
			op = itensDoMenu();
			switch (op) {
			case 1:
				comprador = registrarAluno();
				venda = new Venda(comprador);
				break;
			case 2:
				String tipoQueijo = escolherTipoQueijo();
				cachorroQuenteEscolhido = escolherCachorroQuente(tipoQueijo);
				
				venda.realizarVenda(cachorroQuenteEscolhido);
				
				listaVenda.add(venda);
				break;

			default:
				break;
			}

		} while (op != -1);
		System.out.println("Bye!");

	}

	private int itensDoMenu() {
		System.out.println("Escolha uma op��o para registra a venda ou digite -1 para sair!");
		System.out.println("1: informar os dados do aluno comprador");
		System.out.println("2: Escolher cachorro quente");
		return dados.nextInt();
	}

	private String escolherTipoQueijo() {
		System.out.println("Escolha a opcao de queijo: [1 - Mussarela, 2 - Prato, 3 - Parmesao , 4- Coalho]");
		int queijo = dados.nextInt();
		String tipoQueijo = null;

		switch (queijo) {
		case 1:
			tipoQueijo = "Mussarela";
			break;
		case 2:
			tipoQueijo = "Prato";
			break;
		case 3:
			tipoQueijo = "Parmesao";
			break;
		case 4:
			tipoQueijo = "Coalho";
			break;
		default:
			break;
		}
		return tipoQueijo;
	}

	private CachorroQuente escolherCachorroQuente(String tipoQueijo) {
		System.out.println("\n Escolha a opcaode cachorro quente: [1 - Salsicha, 2 - Linguica, 3 - Frango, 4- Bacon]");
		int tipo = dados.nextInt();
		CachorroQuente c = null;
		switch (tipo) {
		case 1:
			c = new Salsicha(tipoQueijo);
			break;
		case 2:
			c = new Linguica(tipoQueijo);
			break;
		case 3:
			c = new Frango(tipoQueijo);
			break;
		case 4:
			c = new Bacon(tipoQueijo);
			break;

		default:
			break;
		}
		return c;
	}

	private Aluno registrarAluno() {
		System.out.print("\n Nome: ");
		String nome = dados.next();
		System.out.print("\n matricula:");
		int matricula = dados.nextInt();
		return new Aluno(nome, matricula);
	}
}

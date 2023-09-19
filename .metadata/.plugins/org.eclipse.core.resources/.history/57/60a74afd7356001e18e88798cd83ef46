package SistemaDeVendasDeCachorroQuenteUFC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int VendaMaxima = 100;

		CachorroQuente cachorroquente = null;
		Queijo queijo = null;
		Proteina proteina = null;
		Bebida bebida = null;
		Venda[] vendas = new Venda[VendaMaxima];

		int NumVendas = 0;

		while (true) {
			System.out.println("Seja bem-vindo à barraquinha de cachorro-quente da UFC!");
			System.out.println("1. Realizar uma nova venda");
			System.out.println("2. Mostrar relatórios");
			System.out.println("3. Sair");

			int escolha;
			escolha = scanner.nextInt();

			switch (escolha) {

			case 1:

				System.out.println("Digite o nome do aluno");
				String nomedoaluno;
				nomedoaluno = scanner.next();

				System.out.println("Digite a matrícula atrelada ao aluno");
				int matricula;
				matricula = scanner.nextInt();

				Aluno aluno = new Aluno(nomedoaluno, matricula);

				Utilidades.mostrarProteinas();
				int opcao = Utilidades.retornarInteiro();
				proteina = new Proteina(Utilidades.retornarProteina(opcao));

				Utilidades.mostrarQueijos();
				opcao = Utilidades.retornarInteiro();
				queijo = new Queijo(Utilidades.retornarQueijo(opcao));

				Utilidades.mostrarAdicionais();
				Adicional[] adicional = new Adicional(Utilidades.retornaradicionais());

				Utilidades.mostrarBebidas();
				opcao = Utilidades.retornarInteiro();
				bebida = new Bebida(Utilidades.retornarBebida(opcao));

				cachorroquente = new CachorroQuente(proteina, queijo, adicional);
				Venda venda = new Venda(aluno, cachorroquente, bebida);
				vendas[NumVendas] = venda;
				NumVendas++;

			case 2:

				if (NumVendas == 0) {

					System.out.println("Nenhuma venda foi realizada ainda!");

				} else {
					System.out.println("Relatório de Vendas:");

					for (int i = 0; i < NumVendas; i++) {
						System.out.println("Venda " + (1 + i));
						System.out.println("Aluno: " + vendas[i].getAluno().getNome());
						System.out.println("Matricula: " + vendas[i].getAluno().getMatricula());
						System.out.println("Proteína: " + vendas[i].getCachorroquente().getProteina());
						System.out.println("Queijo: " + vendas[i].getCachorroquente().getQueijo());
						System.out.println("Adicionais: " + vendas[i].getCachorroquente().getAdicional() + ", ");
						System.out.println("Bebida: " + vendas[i].getBebida().getNome());
						System.out.println("\n\n");
					}

				}

				break;

			case 3:
				System.out.println("Obrigado por utilizar o sistema! Tchauzinho!");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Escolha inválida!");

			}

		}

	}

}

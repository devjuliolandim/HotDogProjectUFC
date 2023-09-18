package SistemaDeVendasDeCachorroQuenteUFC;

import java.util.Scanner;

public class Utilidades {

	public static void mostrarProteinas() {
		System.out.println("Digite a proteína que você deseja adicionar ao cachorro-quente! As opções são:");
		System.out.println("1 - Salsicha");
		System.out.println("2 - Linguiça");
		System.out.println("3 - Frango");
		System.out.println("4 - Bacon");
	}
	
	public static void mostrarQueijos() {
		System.out.println("Digite o queijo que você deseja adicionar ao seu cachorro-quente! As opções são:");
		System.out.println("1 - Mussarela");
		System.out.println("2 - Prato");
		System.out.println("3 - Parmesão");
		System.out.println("4 - Coalho");
	}
	
	public static void mostrarAdicionais() {
		System.out.println("Digite os adicionais que você deseja! OBS: Você pode escolher mais de um!");
		System.out.println("1 - Maionese");
		System.out.println("1 - Ketchup");
		System.out.println("1 - Ovo");
		System.out.println("1 - Batata Palha");
		
	}
	
	public static void mostrarBebidas() {
		System.out.println("Digite o número correspondente à bebida que você deseja:");
		System.out.println("1 - Coca-Cola");
		System.out.println("2 - Del Rio");
		System.out.println("3 - Suco do Chaves");
	}
	
	
	
	
	
	public static int retornarInteiroParaBebidas() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		do {
		opcao = scanner.nextInt();	
			if(opcao < 1 || opcao > 3) {
				System.out.println("Por favor, digite uma das opções válidas");
				
			}
		}while(opcao < 1 || opcao > 3);
		
		
		
		return opcao;
	}
	
	public static int retornarInteiro() {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		do {
		opcao = scanner.nextInt();
		if(opcao < 1 || opcao >4) {
			System.out.println("Digite uma das opções válidas, por gentileza.");
			
		}
		
		}while(opcao < 1 || opcao > 4);
		
	
		return opcao;
	}
	
	public static String retornarProteina(int opcao) {
		String proteina = null;
		
		if(opcao == 1) {
			proteina = "Salsicha";
		}else if(opcao == 2) {
		    proteina = "Linguiça";
		}else if(opcao == 3) {
		    proteina = "Frango";
		}else if(opcao == 4) {
			proteina = "Bacon";
		}
		
		
		
		return proteina;
	}
	
	public static String retornarQueijo(int opcao) {
		String queijo = null;
		
		if(opcao == 1) {
			 queijo = "Mussarela";
		}else if(opcao == 2) {
			 queijo = "Prato";	
		}else if(opcao == 3) {
		     queijo = "Parmesão";
		}else if(opcao == 4) {
			 queijo = "Coalho";
		}
		
		
		return queijo;
	}
	
	
	
	public static String retornarBebida(int opcao) {
		
		String bebida = null;
		
		
		if(opcao == 1) {
			bebida = "Coca-Cola";
		}else if(opcao == 2) {
			 bebida = "Del Rio";	
		}else if(opcao == 3) {
			 bebida = "Suco do Chaves";
		}
		
		
		return bebida;
	}
	
	
	
	public static String funcaoDeAdicionais(int opcao) {
		Scanner scanner = new Scanner(System.in);
		String adicional = null;
		
		if(opcao == 1) {
			adicional = "Ketchup";
			
		}else if(opcao == 2) {
			adicional = "Maionese";
			
		}else if(opcao == 3) {
			adicional = "Ovo";
			
		}else if(opcao == 4) {
			adicional = "Batata Palha";
			
		}
		
		
		
		return adicional;
	}
	
	public static String[] retornaradicionais() {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		
		
		
		System.out.println("Quantos adicionais você deseja adicionar ao seu cachorro quente? Você precisa adicionar pelo menos um e no máximo quatro");
		int quantidade = 0;
		do {
			quantidade = scanner.nextInt();
			if(quantidade > 4 || quantidade < 1);{
				System.out.println("Por favor digite uma opção válida.");
			}
		}while(quantidade> 4 || quantidade < 1);
		
		String[] adicionais = new String[quantidade];
		
		adicionais[quantidade] = null;
		
		if(quantidade == 4) {
			
			adicionais[0] = "Ketchup, ";
			adicionais[1] = "Maionese, ";
			adicionais[2] = "Ovo e ";
			adicionais[3] = "Batata Palha";
		}else {
			
			for (int i = 0; i < quantidade; i++) {
				System.out.println("Digite a opção do " + (i+1) + "º adicional");
				System.out.println("1 - Ketchup");
				System.out.println("2 - Maionese");
				System.out.println("3 - Ovo");
				System.out.println("4 - Batata Palha");
				
				opcao = retornarInteiro();
					
				switch(opcao) {
				case 1:
					adicionais[i] = "Ketchup";
				
				case 2:
					adicionais[i] = "Maionese";
				
				case 3:
					adicionais[i] = "Ovo";
					
				case 4:
					adicionais[i] = "Batata Palha";
				}		
			
			}
				
		}
		
	
		return adicionais;
	}
	
	
	
	
}

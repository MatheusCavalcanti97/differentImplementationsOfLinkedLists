package linkedListSimple;

import java.util.Scanner;

public class MainListEncSimples {

	public static void mostraLinhas() {
		System.out.println("\n------------------------------------------------------\n");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ListaEncSimples l = new ListaEncSimples();
		Integer opcaoMenu = null;

		do {
			System.out.println(
					"Informe uma das opções a seguir\n1. Inserir Elemento.\n2. Excluir Elemento.\n3. Mostrar Elementos na Lista.\n0. Sair.");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {

			case 0:
				mostraLinhas();
				System.out.println("Programa Encerrado!");
				mostraLinhas();
				break;

			case 1:
				int valor = 0;

				mostraLinhas();
				System.out.print("Informe o primeiro Número a ser inserido: ");
				valor = ler.nextInt();

				l.insertIntoList(valor);
				mostraLinhas();
				System.out.println("Elemento Inserido!");
				mostraLinhas();
				break;

			case 2:
				int valorInfo = 0;
				
				mostraLinhas();
				System.out.printf("Qual o elemento que você deseja Excluir -> " + l.printsListElements() + ": ");
				valorInfo = ler.nextInt();
				mostraLinhas();
				System.out.println("Valor Excluído!");
				l.exclude(valorInfo);
				break;

			case 3:
				mostraLinhas();
				System.out.printf("Elementos na Lista: " + l.printsListElements() + "\n");
				mostraLinhas();
				break;

			default:
				break;
			}

		} while (opcaoMenu != 0);

	}

}

package aulas;

import java.util.Scanner;

public class AtividadeMenuLanche {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char menuItem = '0';
		int quantity = 0;

		System.out.println("Por favor, escolha um item do cardápio digitando o número correspondente.\n\n1 – Sanduíche Natureba\n2 – Sanduba Bomba\n3 – Coxinha de Jaca\n4 – Feijoada Vegetariana");
		System.out.print("\nitem: ");
		menuItem = scan.next().charAt(0);

		System.out.print("\nAgora, escolha a quantidade de unidades do respectivo item: ");
		quantity = scan.nextInt();

		switch (menuItem) {
		case '1':
			if (quantity > 1) {
				System.out.println("\n" + quantity + " sanduíches naturebas foram adicionados a seu pedido.");
			} else {
				System.out.println("\n" + quantity + " sanduíche natureba foi adicionado a seu pedido.");
			}
			break;
		case '2':
			if (quantity > 1) {
				System.out.println("\n" + quantity + " sandubas bomba foram adicionados a seu pedido.");
			} else {
				System.out.println("\n" + quantity + " sanduba bomba foi adicionado a seu pedido.");
			}
			break;
		case '3':
			if (quantity > 1) {
				System.out.println("\n" + quantity + " coxinhas de jaca foram adicionadas a seu pedido.");
			} else {
				System.out.println("\n" + quantity + " coxinha de jaca foi adicionada a seu pedido.");
			}
			break;
		case '4':
			if (quantity > 1) {
				System.out.println("\n" + quantity + " feijoadas vegetarianas foram adicionadas a seu pedido.");
			} else {
				System.out.println("\n" + quantity + " feijoada vegetariana foi adicionada a seu pedido.");
			}
			break;
		default: System.out.println("\nOpção Inválida: Escolha um item (1-4) e sua respectiva quantidade unitária. Tente novamente.");
		}

		scan.close();
	}

}
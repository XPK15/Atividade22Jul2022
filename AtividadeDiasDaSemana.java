package aulas;

import java.util.Scanner;

public class AtividadeDiasDaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char day = '0';

		System.out.print("Digite um número (1-7). O número escolhido corresponde a um dia da semana: ");
		day = sc.next().charAt(0);

		switch (day) {
		case '1':
			System.out.println("\nO número 1 corresponde ao domingo.");
			break;
		case '2':
			System.out.println("\nO número 2 corresponde à segunda-feira.");
			break;
		case '3':
			System.out.println("\nO número 3 corresponde à terça-feira.");
			break;
		case '4':
			System.out.println("\nO número 4 corresponde à quarta-feira.");
			break;
		case '5':
			System.out.println("\nO número 5 corresponde à quinta-feira.");
			break;
		case '6':
			System.out.println("\nO número 6 corresponde à sexta-feira.");
			break;
		case '7':
			System.out.println("\nO número 7 corresponde ao sábado.");
			break;
		default:
			System.out.println("\nApenas os números de 1 a 7 são aceitos. Tente novamente.");
		}

		sc.close();
	}

}

package aulas;

import java.util.Scanner;

public class AtividadeIrrf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int salarioBruto = 0;

		System.out.print("Por favor, digite o valor de seu salário bruto mensal: R$");
		salarioBruto = scan.nextInt();

		double descontoInss = 0;
		double descontoIrrf = 0;
		double salLiq2PorcentoBonus = 0;
		double salLiq5PorcentoBonus = 0;

		descontoInss = salarioBruto - 0.11 * salarioBruto;
		descontoIrrf = descontoInss - 0.05 * descontoInss;
		salLiq2PorcentoBonus = (descontoIrrf + 0.02 * descontoIrrf);
		salLiq5PorcentoBonus = (descontoIrrf + 0.05 * descontoIrrf);

		if (descontoIrrf < 1200) {
			System.out.printf("Seu salário líquido corresponde a R$%.2f.", salLiq5PorcentoBonus);
		} else if (descontoIrrf >= 1200 && descontoIrrf <= 3500) {
			System.out.printf("Seu salário líquido corresponde a R$%.2f.", descontoIrrf);
		} else if (descontoIrrf > 3500) {
			System.out.printf("Seu salário líquido corresponde a R$%.2f.", salLiq2PorcentoBonus);
		}

		scan.close();
	}

}
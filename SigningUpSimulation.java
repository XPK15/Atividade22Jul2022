package aulas;

import java.util.Scanner;

public class SimulaçãoCadastro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String username = null;
		String password = null;

		System.out.print("Crie um nome de usuário para sua conta: ");
		username = scan.next();
		System.out.print("Crie uma senha para sua conta: ");
		password = scan.next();

		String proofUsername = null;
		String proofPassword = null;

		System.out.print("\nConfirme seu nome de usuário: ");
		proofUsername = scan.next();
		System.out.print("Confirme sua senha: ");
		proofPassword = scan.next();

		if (username.equals(proofUsername) && password.equals(proofPassword)) {
			System.out.println("\nSua conta foi criada com sucesso.");
		} else if (!username.equals(proofUsername) && password.equals(proofPassword)) {
			System.out.println("\nO nome de usuário deve ser idêntico ao que foi registrado.");
		} else if (!password.equals(proofPassword) && username.equals(proofUsername)) {
			System.out.println("\nA senha deve ser idêntica à que foi registrada.");
		} else if (!username.equals(proofUsername) && !password.equals(proofPassword)) {
			System.out.println("\nO nome de usuário e a senha devem ser idênticos aos que foram registrados. Tente novamente.");
		} else {
			System.out.println("Os dados informados são inválidos.");
		}
		// Decidi deixar o último else ali, por segurança.

		scan.close();
	}

}

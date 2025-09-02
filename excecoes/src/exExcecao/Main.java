package exExcecao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta: ");
		System.out.print("Numero: ");
		int num = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo: ");
		double saldoConta = sc.nextDouble();
		System.out.print("Limite: ");
		double limiteConta = sc.nextDouble();
		Conta c1 = new Conta(num, nome, saldoConta, limiteConta);

		try {
			System.out.print("Insira o valor para o saque: ");
			double valorSaque = sc.nextDouble();
			c1.saque(valorSaque);
			System.out.println("Novo saldo: " + c1.getSaldo());
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());

		}

		sc.close();
	}

}

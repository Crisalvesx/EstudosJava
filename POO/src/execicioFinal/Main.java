package execicioFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Insira o numero de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Individual ou empresarial(i/e)? ");
			char tipo = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
		
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (tipo == 'i') {
				System.out.print("Gasto com saude: ");
				double gasto = sc.nextDouble();
				Pessoa p1 = new PessoaFisica(nome, renda, gasto);

				lista.add(p1);

			} else if (tipo == 'e') {
				System.out.print("Numero de funcionarios: ");
				int numF = sc.nextInt();
				Pessoa p2 = new PessoaJuridica(nome, renda, numF);

				lista.add(p2);

			}
		}

		double aux = 0;
		for (Pessoa k : lista) {
			System.out.printf(k.getNome() + ": %.2f", k.imposto());
			System.out.println ();
			aux += k.imposto();
		}
		System.out.println();
		System.out.printf("Imposto total : %.2f", aux);
		sc.close();
	}

}

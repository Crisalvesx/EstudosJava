package vetores2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n]; // é um vetor do tipo product, ou seja, possui nomeProd e preco a cada indice
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}

}

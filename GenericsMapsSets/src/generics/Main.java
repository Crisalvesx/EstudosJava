package generics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aux = sc.nextInt();
		
		PrintService<Integer> ps = new PrintService<>();
		
		for(int i = 0; i < aux; i++) {
			
			int valor = sc.nextInt();
			ps.adcValor(valor);
			
			
		}
		ps.print();
		
		System.out.println();
		System.out.println("Primeiro: " + ps.primeiro());
		
		sc.close();
	}

}

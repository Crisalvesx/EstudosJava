package EntradaSaida;

import java.util.Scanner;

public class IO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		int y;
		String z;

		x = sc.next().charAt(0); // pega somente o primeiro caractere
		y = sc.nextInt();// caso eu queira uma string seria next(), double nextDouble() (o java pega a
							// localizacao, logo o digito do double eh com ',') ...
		sc.nextLine(); // consumir o enter para eliminar a quebra de linha pendente
		z = sc.nextLine(); // ler a linha toda o next() so ler a primeira palavra
		System.out.println("os dados que voce digitou foram:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}

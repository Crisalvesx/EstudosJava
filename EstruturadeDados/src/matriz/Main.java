package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) { //ele ve as linhas, como se fosse um vect, vai ser igual a m. dá o número de linhas da matriz (quantos "arrays" existem dentro dela).
			for (int j = 0; j < mat[i].length; j++) { // e ve as colunas, vai ser igual ao n. dá o número de colunas daquela linha específica i (quantos elementos tem o array mat[i]).
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println(mat[1][1]);
		sc.close();
	}

}

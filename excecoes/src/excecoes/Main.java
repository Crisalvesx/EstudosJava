package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try { //trata as excecoes sem encerrar o programa
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");

		} catch (InputMismatchException e) {
			System.out.println("Input error");
		} finally { // esse bloco sempre vai executar, independentemente se houver exeption ou n,  mt usado em arquivos
			System.out.println("passou finally");
			sc.close();
		}
			
		System.out.println("final do programa");

	}
}

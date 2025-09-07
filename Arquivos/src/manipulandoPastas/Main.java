package manipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory); // criamos um vect para listar as pastas, esse predicado
															// indica q eh para listar so os diretorios,
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile); // aqui eh parecido com o de cima, mas pegamos so os arquivos
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\teste").mkdir();// cria-se uma subpasta chamada teste no caminho strPath
		System.out.println("Directory created successfully: " + success);
		sc.close();

	}

}

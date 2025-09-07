package infoCaminhoArq;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath()); // pega o caminho
		System.out.println("getParent: " + path.getParent());// so o caminho do arq
		System.out.println("getName: " + path.getName());// nome do arq
		
		sc.close();
	}

}

package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\cnlun\\OneDrive\\Documentos\\ArquivosUdemy\\arq01.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // verifica se ainda possui linha nova no arquivo
				System.out.println(sc.nextLine()); // automaticamente le a linha do arquivo e imprime
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {

			if (sc != null) {
				sc.close();
			}
		}
	}

}

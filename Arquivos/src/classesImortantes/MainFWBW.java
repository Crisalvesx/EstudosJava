package classesImortantes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainFWBW {

	public static void main(String[] args) {
		String[] line = new String[] { "oi", "ola", "tchau", "ate logo" };

		String caminho = "C:\\Users\\cnlun\\OneDrive\\Documentos\\ArquivosUdemy\\arq02.txt"; // ele vai criar um arquivo arq02.txt

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) { // caso eu n queira recriar o arquivo, e sim so acrescentar
			for (String lines : line) {											// eu uso new FileWriter(caminho, true), ele acrescentara no final
				bw.write(lines);// por padrao n tem a quebra de linha
				bw.newLine();// quebra de linha
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

}

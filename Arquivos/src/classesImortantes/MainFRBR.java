package classesImortantes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFRBR { // outra formula de ler os arquivos

	public static void main(String[] args) {
		String caminho = "C:\\Users\\cnlun\\OneDrive\\Documentos\\ArquivosUdemy\\arq01.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(caminho);// sequencia de leitura para o 'caminho'
			br = new BufferedReader(fr);// otimiza a leitura

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

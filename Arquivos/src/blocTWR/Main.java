package blocTWR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String caminho = "C:\\Users\\cnlun\\OneDrive\\Documentos\\ArquivosUdemy\\arq01.txt";
		//BufferedReader br = null;		   * n preciso
		//FileReader fr = null;            * n preciso
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
		
		//	fr = new FileReader(caminho); sequencia de leitura para o 'caminho' *nao preciso mais
	    //  br = new BufferedReader(fr); otimiza a leitura *nao preciso mais

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		/* finally {
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
		}  n preciso mais         */

	}
}

package exMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();

		System.out.print("Entre com o caminho do artigo: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] campo = line.split(",");

				String nome = campo[0];
				int quantVotos = Integer.parseInt(campo[1]);

				if (map.containsKey(nome)) {
					int votesSoFar = map.get(nome);// valor referente a o nome
					map.put(nome, quantVotos + votesSoFar);
				} else {
					map.put(nome, quantVotos);
				}

				line = br.readLine();
			}

			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

		} catch (IOException e) {

			System.out.println(e.getMessage());

		}

		sc.close();
	}

}

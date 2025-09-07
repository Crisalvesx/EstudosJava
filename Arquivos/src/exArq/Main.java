package exArq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Item> lista = new ArrayList<>();
		System.out.println("Digite o caminho desejado: ");
		String caminho = sc.nextLine();
		File file = new File(caminho);

		String caminhoPasta = file.getParent();

		boolean sucess = new File(caminhoPasta + "\\out").mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String line = br.readLine();

			while (line != null) {
				String[] aux = line.split(",");
				String nome0 = aux[0];
				double preco0 = Double.parseDouble(aux[1]);
				int quantidade0 = Integer.parseInt(aux[2]);

				lista.add(new Item(nome0, preco0, quantidade0));

				line = br.readLine();

			}
			String caminhoNovo = caminhoPasta + "\\out\\sumary.csv";
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoNovo))) {
				for (Item k : lista) {
					bw.write(k.getNome() + "," + String.format("%.2f", k.total()));
					bw.newLine();

				}
				System.out.println("Criado com sucesso!");
			} catch (IOException e) {
				System.out.println("Erro na escrita: " + e.getMessage());
			}
		} catch (IOException e) {

			System.out.println("Erro na leitura: " + e.getMessage());
		}
		sc.close();
	}
}

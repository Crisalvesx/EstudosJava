package exProgFuncional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert file path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Pessoa> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Pessoa(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();

			System.out.println("Email salary of people whose salary is more than " + salary + ":");

			List<String> emailResult = list.stream()
					.filter(x -> x.getSalario() > salary)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());

			emailResult.forEach(System.out::println);

			double soma = list.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.mapToDouble((x -> x.getSalario()))
					.sum();

			System.out.println("Sum of salary of people whose names starts with 'M': " + soma);

		} catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}

		sc.close();
	}
}

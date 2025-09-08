package exInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Insira os dados do contrato:");
		try {
			System.out.print("Numero: ");
			int numeroContrato = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate dataContrato = LocalDate.parse(sc.next(), dtf);
			System.out.print("Valor do contrato: ");
			double valorContrato = sc.nextDouble();
			Contrato c1 = new Contrato(numeroContrato, dataContrato, valorContrato);

			System.out.print("Insira o numero de parcelas: ");
			int parcelas = sc.nextInt();

			System.out.println("Parcelas: ");

			EmpresaPagamento pagSeguro = new PagSeguro();
			pagSeguro.tax(c1, parcelas);

		} catch (InputMismatchException e) {
			System.out.println("Erro ao inserir os dados: Digite-os corretamente!");
			
		} catch (DateTimeParseException e) {
			System.out.println("Erro ao inserir a data: Digite-a corretamente! (dd/MM/yyyy)");
			
		}

		sc.close();

	}

}

package exSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Service {

	private Scanner scanner;

	Set<Integer> set = new HashSet<>();

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public void service(int quant) {

		for (int i = 0; i < quant; i++) {
			int aux = scanner.nextInt();
			set.add(aux);

		}

	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Service(Scanner scanner, Set<Integer> set) {

		this.scanner = scanner;
		this.set = set;
	}

}

package exSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		Service s = new Service(sc, set);
		
		
		
		System.out.print("Quanto alunos no curso A?");
		int quantA = sc.nextInt();
		s.service(quantA);
		
		System.out.print("Quanto alunos no curso B?");
		int quantB = sc.nextInt();
		s.service(quantB);
		
		System.out.print("Quanto alunos no curso C?");
		int quantC = sc.nextInt();
		s.service(quantC);
		
		System.out.println("Total de estudantes: " + set.size());
		
		sc.close();
		
		
		
		
	}
}

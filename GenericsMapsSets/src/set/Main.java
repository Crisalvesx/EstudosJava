package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		/*
		 * set
		 * 
		 * HashSet = rapido e nao ordenado TreeSet = lento e ordenado LinkedHashSet =
		 * intermediario e os elementos estao na ordem em q foram adicionados
		 * 
		 */
		System.out.println("=====HashSet=====");
		Set<String> set = new HashSet<>();

		set.add("oi");
		set.add("Como vai?");
		set.add("Adeus");

		System.out.println(set.contains("oi"));

		for (String a : set) {
			System.out.println(a);
		}
		
		System.out.println("=====TreeSet=====");
		
		Set<String> set1 = new TreeSet<>();

		set1.add("oi");
		set1.add("Como vai?");
		set1.add("Adeus");

		System.out.println(set1.contains("ola"));

		for (String a : set1) {
			System.out.println(a);
		}
		
		System.out.println("=====LinkedHashSet=====");
		
		Set<String> set2 = new LinkedHashSet<>();

		set2.add("oi");
		set2.add("Como vai?");
		set2.add("Adeus");

		System.out.println(set2.contains("oi"));

		for (String a : set2) {
			System.out.println(a);
		}

	}

}

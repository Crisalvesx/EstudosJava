package funcoesStrings;

public class Main {

	public static void main(String[] args) {
		
		String original = " abcd EFGH ABC abc DEFg    ";
		String s = "Potato apple lemon";
		
		String[] vect = s.split(" "); // ele vai pegar as subpalavars de s e armazenar em um vect[i], guiada pelo separador " "
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
		String s0 = original.toLowerCase(); // deixa toda a string minuscula
		String s1 = original.toUpperCase(); // deixa toda a string maiuscula
		String s2 = original.trim(); // elimina os espaços nas extremidades da string
		String s3 = original.substring(2); // vai formar uma nova string a partir do indice desejado( neste caso a partir do original[2])
		String s4 = original.substring(2,9); // agora vai pegar do original[2] ate o original[9]
		String s5 = original.replace("ab", "xy"); // toda a vez q eu achar um 'ab', subtituirei por 'xy'
		int s6 = original.indexOf("ab"); // retorna o indice da primeira ocorrencia de 'ab'
		int s7 = original.lastIndexOf("ab"); // retorna o indice da ultima ocorrencia de 'ab'
		
		
		
		System.out.println("original: " + original);
		System.out.println("to Lower case : " + s0);
		System.out.println("to Upper case : " + s1);
		System.out.println("trim : " + s2);
		System.out.println("substring(2) : " + s3);
		System.out.println("substring(2,9) : " + s4);
		System.out.println("replace(\"ab\", \"xy\") : " + s5);
		System.out.println("indexOf(\"ab\") : " + s6);
		System.out.println("lastIndexOf(\"ab\") : " + s7);
		
		
		
	}

}

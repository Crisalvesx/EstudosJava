package hashCodeEEquals;

public class Main {

	public static void main(String[] args) {
		// equal = lenta , mas 100% de resposta
		//hashCode = rapido, mas reposta positiva n eh 100%
		// ambos podem ser gerados e sobrescritos quando necessario, o eclipse ajuda nisso.
		
		String a = "Cris";
		String b = "Vava";
		String c = "Cris";
		
		System.out.println(a.hashCode());// pode dar um numero igual, mesmo q sejam palavras diferentes
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());// usado junto ao equals() para percorrer um arquivo a fim de encontrar algo
										 //se o hashCode for igual, muito provavelmente eh a msm coisa 
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

	}

}

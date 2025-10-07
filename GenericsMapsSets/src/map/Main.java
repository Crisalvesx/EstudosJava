package map;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/* map
		 * 
		 * HashMap = rapido e nao ordenado
		 * TreeMap = lento e ordenado
		 * LinkedHashMap = intermediario e ordem q sao adicionados
		 *  put(key, value) = adcionar um value
		 *  containsKey(key) = ve se tem uma determinada chave
		 *  get(key) = recupera um value pela chave
		 *  keySet() = retorna um set com as chaves do map
		 *  values() = retorna uma coleção do tipo valor
		 * 
		 */
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("idade", "23");
		cookies.put("telefone", "40028922");
		
		System.out.println("====valores====");
		
		for(String a: cookies.keySet() ) {
			
			System.out.println(a + ": " + cookies.get(a));
		}
		
	}

}

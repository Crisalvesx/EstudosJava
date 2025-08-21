package box;



public class Main {

	public static void main(String[] args) {
		//boxing: processo de conversão de um objeto tipo valor para um objeto tipo referência
		int x = 20;
		Object obj = x;
		
		//unboxing: processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
		int z = 20;
		Object obj2 = z;
		int y = (int) obj2;
		
		System.out.println(obj + "" + y);
	}

}

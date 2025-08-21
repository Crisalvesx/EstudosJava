package encapsulamento;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Cris", 19);
		
		System.out.println("nome : " + p.getName() + " idade: " + p.getIdade());
		
		p.setName("Caio");
		p.setIdade(25);
		
		System.out.println("nome : " + p.getName() + " idade: " + p.getIdade());
		
	}

}

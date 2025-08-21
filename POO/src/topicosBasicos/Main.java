package topicosBasicos;

public class Main {

	public static void main(String[] args) {
		
		String name = "Cris";
		int idade = 19;
		
		Pessoa p = new Pessoa(name, idade);
		
		Pessoa p2 = new Pessoa("Rita");
		
		System.out.println("pessoa 1: nome: " + p.name + " idade: " + p.idade);
		System.out.println("pessoa 2: nome: " + p2.name + " idade: " + p2.idade);
		
		//Pessoa p = new Pessoa("Cris" , 19);   tem essa possibilidade tbm
	}
	
}

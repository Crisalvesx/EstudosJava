package topicosBasicos;

public class Pessoa {

	public String name;
	public int idade;
	
	public Pessoa(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	public Pessoa(String name) {
		this.name = name;
		idade = 18;
	}
}
/*
construtor - obriga a ter esses atributos na hr da criação do objeto
sobrecarga - uma outra forma de definir o meu objeto, so trocar os parametros
*/
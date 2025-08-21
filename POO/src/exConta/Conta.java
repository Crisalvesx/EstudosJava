package exConta;

public class Conta {	
	
	private String nome;
	private final String numConta;
	private double saldo;
	
	public Conta(String nome, String numConta){
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = 0;
		
	}
	
	public double saque(double val){
		this.saldo -= 5;
		this.saldo -= val;
		return saldo;
		
	}
	
	public double deposito(double val){
		this.saldo += val;
		return saldo;
		
	}

	public double getSaldo() {
		return saldo;
	}
	public String getNome(){
		return this.nome;	
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}
	
	public String toString() {
		
		return "Account " + getNumConta() + ", Holder: " + getNome() + ", Balance: " + getSaldo();
		
	}
}

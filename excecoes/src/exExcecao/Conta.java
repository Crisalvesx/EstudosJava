package exExcecao;

public class Conta {
	private int numero;
	private String proprietario;
	private double saldo;
	private double limiteSaque;

	public Conta(int numero, String proprietario, double saldo, double limiteSaque) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) throws MinhaExcecao {
		
		if(limiteSaque < valor ) {
			throw new MinhaExcecao("O valor do saque excede o limite ");
		}
		
		if(saldo < valor ) {
			throw new MinhaExcecao("O valor do saque excede o saldo em " + (valor - saldo));
		}
		
		saldo -= valor;
		
	}
}

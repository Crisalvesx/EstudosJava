package heranca;

public final class ContaPoupanca extends Conta { // essa classe n pode ser superclasse de ninguem, gracas ao final
	//pode ser usadas em metodos tbm, para q eles sejam sobrepostos
	
	private double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public ContaPoupanca(int numero, String proprietario, double saldo, double taxa) {
		super(numero, proprietario, saldo);
		this.taxa = taxa;
	}

	public void atualizaSaldo() {
		saldo += saldo * taxa;
	}
	
	@Override  // sobrescrever
	public double saque(double valor) {
		saldo -= valor - 5.0; // diferentemente do saque da Conta o saque da ContaPoupanca desconta 5.0 como taxa
		return saldo;
	}
}

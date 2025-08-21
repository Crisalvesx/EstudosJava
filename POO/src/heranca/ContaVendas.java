package heranca;

public class ContaVendas extends Conta {

	private double limiteEmprestimo;

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public ContaVendas(int numero, String proprietario, double saldo, double limiteEmprestimo) {
		super(numero, proprietario, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {

		if (limiteEmprestimo >= valor) {
			deposito(valor);
		}
	}

	@Override // sobrescrever
	public double saque(double valor) {
		super.saque(valor); // uso a implementaçao da superclassse (Conta)
		saldo -= 2.0;// adiciono a aquela implementacao uma taxa de 2.0
		return saldo;
	}

}

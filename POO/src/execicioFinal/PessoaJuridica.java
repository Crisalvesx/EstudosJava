package execicioFinal;

public class PessoaJuridica extends Pessoa {

	private int numFuncionarios;

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {

		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto;

		if (numFuncionarios <= 10) {
			imposto = 0.16 * rendaAnual;
		} else {

			imposto = 0.14 * rendaAnual;
		}
		return imposto;
	}

}

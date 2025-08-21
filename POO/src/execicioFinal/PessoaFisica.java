package execicioFinal;

public class PessoaFisica extends Pessoa {
	private double gastoSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double imposto;
		
		if(rendaAnual <= 20000.0) {
			imposto = (rendaAnual * 0.15) - (0.5 * gastoSaude);		
		}else {
			
			imposto = (rendaAnual * 0.25) - (0.5 * gastoSaude);
		}
		return imposto;
	}
}

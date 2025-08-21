package polimorfismo;

public class Conta00 { 
	
		//public abstract class Conta00 { n pode ser intanciada, ou seja, neste banco n podemos criar uma conta normal
		/*os metodos abtratos n possuem implementacao .Usado, por ex, em uma area de uma figura geometrica, 
		 se é um trinagulo ou um quadrado por ex eles mudam seu calculo, presente ent na classe formageom, mas 
		 implementada somente nas especificas
		 */
	
		private int numero;
		private String proprietario;
		protected double saldo;

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

		public double deposito(double valor) {
			saldo += valor;
			return saldo;
		}

		public double saque(double valor) {
			saldo -= valor;
			return saldo;
		}

		public Conta00(int numero, String proprietario, double saldo) {
			this.numero = numero;
			this.proprietario = proprietario;
			this.saldo = saldo;
		}

	}



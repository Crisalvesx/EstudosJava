package excecoesPersonalizadas;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta(100.0);

		try {
			// Tentando sacar um valor maior do que o saldo
			conta.sacar(150.0);
		} catch (SaldoInsuficienteException e) {
			// Captura a exceção personalizada
			// "getMessage()" pega o texto passado no "throw new ..."
			System.out.println("Erro ao sacar: " + e.getMessage());
		}

		try {
			// Agora um saque válido
			conta.sacar(50.0);
		} catch (SaldoInsuficienteException e) {
			// Aqui não vai cair, pois o saque é válido
			System.out.println("Erro ao sacar: " + e.getMessage());
		}
	}
}

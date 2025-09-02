package excecoesPersonalizadas;

public class Conta {
	private double saldo;

	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Método que pode lançar uma exceção → por isso tem "throws"
	// Aqui estou avisando que quem chamar esse método precisa tratar essa exceção
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			// Aqui realmente lanço (throw) a exceção, com uma mensagem explicando o erro
			throw new SaldoInsuficienteException("Saldo insuficiente! Tentou sacar " + valor + ", mas só tem " + saldo);
		}
		saldo -= valor;
		System.out.println("Saque realizado. Saldo atual: " + saldo);
	}
}

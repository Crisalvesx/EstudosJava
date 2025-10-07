package exInterface;

import java.time.format.DateTimeFormatter;

public class PagSeguro implements EmpresaPagamento {

	@Override
	public void tax(Contrato contrato, int parcelas) {
		double valorParcela = contrato.getValor() / parcelas;
		double vect[] = new double[parcelas];
		for (int i = 1; i <= parcelas; i++) {
			double aux = valorParcela + valorParcela * 0.01 * i;
			double result = aux + aux * 0.02;
			vect[i - 1] = result;
		}

		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < parcelas; i++) {

			System.out.println(contrato.getData().plusMonths(i + 1).format(dft) + " - " + String.format("%.2f", vect[i]));

		}

	}

}

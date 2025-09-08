package exInterface;

import java.time.LocalDate;


public class Contrato {
	private int numero;
	private LocalDate data;
	protected double valor;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Contrato(int numero, LocalDate data, double valor) {

		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}

}

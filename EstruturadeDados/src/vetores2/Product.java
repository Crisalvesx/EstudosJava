package vetores2;

public class Product {

	private String nomeProd;
	private double preco;

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Product(String nomeProd, double preco) {

		this.nomeProd = nomeProd;
		this.preco = preco;
	}

}

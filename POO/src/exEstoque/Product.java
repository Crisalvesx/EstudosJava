package exEstoque;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	public double totalValueInStock() {
		double result = quantity * price;
		return result;
		
	}
	public void addStock(int quantity) {
		this.quantity += quantity;
		
		
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
		
	}
	
	/*
	 poderia fazer um tostring() tbm para a formataçao da minha reposta, este metodo e chamado automaticamente qunado eu dou um print(p), por exemplo.
	 poderia ser assim por exemplo 
	  public void toString(){
	  	return name
	  	+ ", $ "
	  	+ String.format(%.2f, price)
	  	+ ", "
	  	+ quantity
	  	+ "unity , Total : $
	  	+ totalValueInStock();
	  
	  }
	 
	 
	 */
	
	
}

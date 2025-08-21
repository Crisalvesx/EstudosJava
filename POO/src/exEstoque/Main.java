package exEstoque;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Scanner sc = new Scanner(System.in);
		
		double total;
		int quant;
		int quantRemove;
		
		
		System.out.println("Enter product date: ");
		System.out.print("Name: ");
		p1.name = sc.next();
		System.out.print("Price: ");
		p1.price = sc.nextDouble();
		System.out.print("Quantity: ");
		p1.quantity = sc.nextInt();
		System.out.println();
		
		total = p1.totalValueInStock();
		
		System.out.println("Product date: " + p1.name + ", $" + p1.price + ", " + p1.quantity + " units, total: $" + total);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quant = sc.nextInt();
		System.out.println();
		p1.addStock(quant);
		total = p1.totalValueInStock();
		
		System.out.println("Update date: " + p1.name + ", $" + p1.price + ", " + p1.quantity + " units, total: $" + total);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantRemove = sc.nextInt();
		System.out.println();
		p1.removeProduct(quantRemove);
		total = p1.totalValueInStock();
		
		System.out.println("Update date: " + p1.name + ", $" + p1.price + ", " + p1.quantity + " units, total: $" + total);
		
		
		
		
		
		
		
		sc.close();
		
	}
	
}

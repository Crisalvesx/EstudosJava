package exConta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		String id = sc.next();
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		Conta c = new Conta(holder, id);
		
		System.out.print("Is the an initial deposit(y/n): ");
		char aux = sc.next().charAt(0);
		System.out.println();
		
		if(aux == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			c.deposito(value);
			
			
		}else if(aux != 'n' && aux != 'y'){
			
			System.out.print("Invalid chosen.");
						
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(c);
		
		System.out.print("Enter a deposit value: ");
		double valueDeposit  = sc.nextDouble();
		c.deposito(valueDeposit);
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(c);
		
		System.out.print("Enter a withdraw value: ");
		double valueWithdraw  = sc.nextDouble();
		c.saque(valueWithdraw);
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(c);
		
		sc.close();
		
	}

}

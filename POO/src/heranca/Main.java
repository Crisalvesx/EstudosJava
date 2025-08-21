package heranca;

public class Main {

	public static void main(String[] args) {
	
		 Conta a = new Conta(1001, "jota", 0.0);
		 ContaVendas av = new ContaVendas(1002, "Ana", 0.0, 500.00);
		 
		 
		 //Upcasting: por ContaVendas ser uma conta eu posso atribuir um obj dela  a um objeto de Conta
		 
		 Conta a1 = av;
		 Conta av1 = new ContaVendas(1003, "andreas", 0.0, 200.00);
		 Conta ap = new ContaPoupanca(1004, "Analivia", 0.0, 0.01);
		 
		 //Downcasting:aq o contrario n se vale, ou seja, uma Conta, n necessariamente, é uma ContaVendas, logo
		 //ContasVendas av2 = a da erro, para resolver precisamos fazer um casting
		 ContaVendas av2 = (ContaVendas)a; // eu n poderia fazer  com o ap, pq ap é ContaPoupanca q n esta ligada a ContaVendas
		 								   // em tempo de compilacao n daria erro, mas ja em tempo de execucao apareceria uma exception  
		 av2.emprestimo(100.00);
		 	
		 
		 //podemos verificar isso com o instanceof
		 
		 boolean t = av1 instanceof ContaVendas; // isso vai dar true, por ex 
		 System.out.println(t);
		 System.out.println(a1.saldo + ap.saldo);
	}
	

}

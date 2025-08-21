package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Conta00 x = new Conta00(1020, "jota", 100.0);
		Conta00 y = new Poupanca(1021, "Ana", 100.0, 0.0);
		
		x.saque(5.0);
		y.saque(5.0);//mesma operacao e do mesmo tipo, conta, tiveram comportamentos diferentess
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}

}

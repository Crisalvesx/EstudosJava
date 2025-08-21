package enumerate;

public class Main {

	public static void main(String[] args) {
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1 + "" + os2);
	}

}

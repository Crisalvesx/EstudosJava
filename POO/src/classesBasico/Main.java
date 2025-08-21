package classesBasico;

public class Main {
	
	public static void main(String[] args) {
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = 3.0;
		x.b = 4.0;
		x.c = 5.0;
		
		y.a = 6.0;
		y.b = 7.0;
		y.c = 8.0;
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Os lados do triangulo x sao: " + x.a + " " + x.b + " " + x.c);
		System.out.println("Os lados do triangulo y sao: " + y.a + " " + y.b + " " + y.c);
		System.out.println("A area do triangulo x eh : " + areaX);
		System.out.println("A area do triangulo y eh : " + areaY);
	}
}

/*
  faz referencia a nossa classe triangulo
  
*/
 
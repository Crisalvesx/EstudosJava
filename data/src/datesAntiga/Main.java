package datesAntiga;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date agora1 = new Date();
		System.out.println("Date: " + agora1);

		Calendar cal = Calendar.getInstance();
		Date agora = cal.getTime();

		System.out.println("Agora: " + agora);
		System.out.println("Dia: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + (cal.get(Calendar.MONTH) + 1)); // Janeiro = 0
		System.out.println("Ano: " + cal.get(Calendar.YEAR));

		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("Daqui 7 dias: " + cal.getTime());

	}

}

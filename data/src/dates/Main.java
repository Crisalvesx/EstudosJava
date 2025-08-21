package dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// Data atual
		LocalDate dataHoje = LocalDate.now();
		System.out.println("Data de hoje: " + dataHoje);

		// Data e hora atual
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + agora);

		// Instante global (sempre UTC)
		Instant instante = Instant.now();
		System.out.println("Instante UTC: " + instante);

		// Pegando horário do PC (ZoneId default)
		ZoneId zonaPC = ZoneId.systemDefault();
		System.out.println("ZoneId do PC: " + zonaPC);

		ZonedDateTime dataHoraPC = agora.atZone(zonaPC);
		System.out.println("Data/hora do PC com fuso: " + dataHoraPC);

		// Criando datas específicas
		LocalDate natal = LocalDate.of(2025, 12, 25);
		System.out.println("Natal: " + natal);

		// Formatando data
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formatado = agora.format(fmt);
		System.out.println("Data/hora formatada: " + formatado);

		// Convertendo texto em data
		LocalDate dataConvertida = LocalDate.parse("21/08/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Data convertida: " + dataConvertida);

		// Cálculos com datas
		LocalDate hoje = LocalDate.now();
        LocalDateTime agora2 = LocalDateTime.now();

        System.out.println("Hoje: " + hoje);
        System.out.println("Agora: " + agora2);

        // LocalDate / LocalDateTime aceitam plus/minus
        System.out.println("Daqui 7 dias: " + hoje.plusDays(7));
        System.out.println("Semana passada: " + hoje.minusWeeks(1));
        System.out.println("Ano que vem: " + hoje.plusYears(1));

        // Instant só aceita plus/minus também
        Instant instante2 = Instant.now();
        System.out.println("Instante atual: " + instante2);
        System.out.println("Instante + 10 segundos: " + instante2.plusSeconds(10));
        System.out.println("Instante - 2 dias: " + instante2.minus(Duration.ofDays(2)));
        
        LocalDate hoje2 = LocalDate.now();
        LocalDate natal2 = LocalDate.of(2025, 12, 25);

        // Getters de informações
        System.out.println("Dia do mês: " + hoje2.getDayOfMonth());
        System.out.println("Mês (número): " + hoje2.getMonthValue());
        System.out.println("Mês (enum): " + hoje2.getMonth());
        System.out.println("Ano: " + hoje2.getYear());
        System.out.println("Dia da semana: " + hoje2.getDayOfWeek());
        System.out.println("Dias no mês: " + hoje2.lengthOfMonth());
        System.out.println("É bissexto? " + hoje2.isLeapYear());
        System.out.println("Natal: " + natal2 );
	}

}

package Basicos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TempoDeUmEvento {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int diaInicio = Integer.parseInt(entrada.nextLine().split(" ")[1]);
		String horaInicial[] = entrada.nextLine().split(":");
		int tempoInicial[] = parseHora(entrada, horaInicial);

		int diaFinal = Integer.parseInt(entrada.nextLine().split(" ")[1]);
		String horaFinal[] = entrada.nextLine().split(":");
		int tempoFinal[] = parseHora(entrada, horaFinal);
		
		LocalDateTime inicio = LocalDateTime.of(2020, 1, diaInicio, tempoInicial[0], tempoInicial[1], tempoInicial[2]);
		LocalDateTime fim = LocalDateTime.of(2020, 1, diaFinal, tempoFinal[0], tempoFinal[1], tempoFinal[2]);
		
		long dias=inicio.until(fim, ChronoUnit.DAYS);
		inicio = inicio.plusDays(dias);
		long horas=inicio.until(fim, ChronoUnit.HOURS);
		inicio = inicio.plusHours(horas);
		long minutos=inicio.until(fim, ChronoUnit.MINUTES);
		inicio = inicio.plusMinutes(minutos);
		long segundos=inicio.until(fim, ChronoUnit.SECONDS);
		
		
		System.out.printf("%d dia(s)\n", dias);
		System.out.printf("%d hora(s)\n", horas);
		System.out.printf("%d minuto(s)\n", minutos);
		System.out.printf("%d segundo(s)\n", segundos);

	}

	public static int[] parseHora(Scanner entrada, String[] hora) {
		int tempo[] = new int[3];
		for (int i = 0; i < 3; i++) {
			tempo[i] = Integer.parseInt(hora[i].trim());
		}
		return tempo;		
	}

}

package Basicos;

import java.util.Scanner;

public class TempoDeJogoMinutos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b, c, d;
		System.out.println("Digite um numero:");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		int horas = c - a;
		int minutos = d - b;

		if (horas <= 24 || minutos >= 1) {
			if (d < b) {
				minutos = (60 + d) - b;
				horas = (c - 1) - a;
			}
			if (a == c || d == b) {
				horas = 24;
				minutos = 0;
			}
			if(c<d) {
				int resto=c*60+d;
				int resto1=a*60+c;
				
			}
		}
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos, "\n");

		entrada.close();
	}

}

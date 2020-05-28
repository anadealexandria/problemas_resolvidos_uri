package Basicos;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i;
		System.out.println("Digite dois números: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();

		int contador1 = 0;
		int contador2 = 0;

		if (a >= b) {
			for (i = a; i < 24; i++) {
				contador1++;
			}
			for (i = 0; i < b; i++) {
				contador2++;
			}

			int total = contador1 + contador2;

			System.out.printf("O JOGO DUROU %d HORA(S)", total);
		} else {
			int contador = 0;
			for (i = a; i < b; i++) {
				contador++;
			}
			System.out.printf("O JOGO DUROU %d HORA(S)", contador);
		}

		entrada.close();
	}

}

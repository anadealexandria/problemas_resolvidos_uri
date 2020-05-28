package Basicos;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		double notas[] = new double[2];
		while (true) {
			double nota = entrada.nextDouble();
			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida\n");
				continue;
			}
			if(nota>=0 && nota<=10){
				notas[contador]=nota;
				contador++;
			}

			if (contador == 2) {
				break;
			}

		}
		Locale.setDefault(new Locale("en", "us"));
		double media = (notas[0] + notas[1]) / 2;
		System.out.printf("media = %.2f\n", media);
		entrada.close();
	}
}

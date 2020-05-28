package Basicos;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		while (true) {
			System.out.println("Digite um número: ");
			Double n;
			n = entrada.nextDouble();

			interval(n);
			entrada.close();
		}
	}

	public static void interval(double n) {
		if (n >= 0 && n - 100d <= 0) {
			if (n >= 0 && n - 25d <= 0) {
				System.out.print("Intervalo [0,25]\n");
			} else if (n - 25d > 0 && n - 50d <= 0) {
				System.out.print("Intervalo (25,50]\n");
			} else if (n - 50d > 0 && n - 75d <= 0) {
				System.out.print("Intervalo (50,75]\n");
			} else if (n - 75 > 0 && n - 100d <= 0) {
				System.out.print("Intervalo (75,100]\n");
			}

		} else {
			System.out.print("Fora do intervalo\n");
		}
	}

}

package Basicos;

import java.util.Scanner;

public class DividindoXPorY {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroDeVezes = entrada.nextInt();
		double subtracao[] = new double[numeroDeVezes];
		double x [] = new double[numeroDeVezes];
		double y []= new double[numeroDeVezes];
		for (int i = 0; i < numeroDeVezes; i++) {
			x[i] = entrada.nextInt();
			y[i] = entrada.nextInt();

			subtracao[i] = x[i]/y[i];
		}

		for (int i = 0; i < numeroDeVezes; i++) {
			if (x[i] != 0 && y[i] == 0) {
				System.out.print("divisao impossivel\n");
			} else {
				System.out.print(subtracao[i] + "\n");
			}

		}
		entrada.close();
	}

}

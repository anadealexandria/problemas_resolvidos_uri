package Basicos;

import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double valor = entrada.nextDouble();
		double valor1;
		double valor2;
		double valor3;

		double total;

		if (valor >= 0.00f && valor <= 2000.00f) {
			System.out.print("Isento\n");
		}

		if (valor > 2000.00f && valor <= 3000.00f) {
			valor = valor - 2000.00f;
			valor1 = valor * 0.08f;
			total = valor1;
			System.out.printf("R$ %.2f\n", total);
		}

		if (valor > 3000.00f && valor <= 4500.00f) {
			valor = valor - 3000.00f;
			valor1 = 1000.00f * 0.08f;
			valor2 = valor * 0.18f;
			total = valor1 + valor2;
			System.out.printf("R$ %.2f\n", total);
		}

		if (valor > 4500.00f) {
			valor = valor - 4500.00f;
			valor1 = 1000.00f * 0.08f;
			valor2 = 1500.00f * 0.18f;
			valor3 = valor * 0.28f;
			total = valor1 + valor2 + valor3;
			System.out.printf("R$ %.2f\n", total);
		}

		entrada.close();
	}
}

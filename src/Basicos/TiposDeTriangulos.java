package Basicos;

import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite três números: ");

		double x = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();

		double maior = x;

		if (b > maior) {
			maior = b;
		}
		if (c > maior) {
			maior = c;
		}
		// System.out.println("\n" +maior + "\n");

		double menor = x;

		if (b < menor) {
			menor = b;
		}
		if (c < menor) {
			menor = c;
		}
		// System.out.println(menor + "\n");
		double meio = x;

		if (b > menor && b < maior) {
			meio = b;
		}
		if (c > menor && c < maior) {
			meio = c;
		}
		// System.out.println(meio + "\n");

		if (maior > 0 && menor > 0 && meio > 0) {
			if (maior >= menor + meio) {
				System.out.println("NAO FORMA TRIANGULO\n");
			} else if (Math.pow(maior, 2) == Math.pow(menor, 2) + Math.pow(meio, 2)) {
				System.out.println("TRIANGULO RETANGULO\n");
			} else if (Math.pow(maior, 2) > Math.pow(meio, 2) + Math.pow(menor, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO\n");
				if (menor == meio) {
					System.out.println("TRIANGULO ISOSCELES\n");
				}
			} else if (Math.pow(maior, 2) < Math.pow(meio, 2) + Math.pow(menor, 2)) {
				System.out.println("TRIANGULO ACUTANGULO\n");
				if (maior == menor && maior == meio && menor == meio) {
					System.out.println("TRIANGULO EQUILATERO\n");
				}
				else if (menor == meio || maior==meio) {
					System.out.println("TRIANGULO ISOSCELES\n");
				}
			}
		}
		entrada.close();
	}

}

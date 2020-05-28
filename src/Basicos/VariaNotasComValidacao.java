package Basicos;

import java.util.Scanner;

public class VariaNotasComValidacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		int entra = 0;
		double media = 0;
		int contador = 0;
		do {

			while (true) {
				double nota1 = entrada.nextDouble();
				if (nota1 >= 0 && nota1 <= 10) {
					soma += nota1;
					contador++;
					break;
				} else {
					System.out.print("nota invalida\n");
					break;
				}
			}
			if (contador != 2) {
				continue;
			}
			media = soma / 2;
			System.out.printf("media = %.2f\n", media);
			while (true) {
				System.out.print("novo calculo (1-sim 2-nao)\n");
				entra = entrada.nextInt();
				if (entra != 1 && entra != 2) {
					continue;
				} else {
					break;
				}

			}
			contador = 0;
			soma = 0;
		} while (entra != 2);

		entrada.close();

	}
}

package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1165

import java.util.Scanner;
public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int contador = 0;

		for (int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					contador++;
				}

			}
			if (contador == 0) {
				System.out.printf("%d eh primo\n", x);
			} else {
				System.out.printf("%d nao eh primo\n", x);
			}
			contador = 0;
		}
		entrada.close();

	}
}

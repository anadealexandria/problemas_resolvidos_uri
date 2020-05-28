package Basicos;

import java.util.Scanner;

public class SomaDeImparesConsecutivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int soma[] = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = entrada.nextInt();
			y[i] = entrada.nextInt();

			if (x[i] > y[i]) {
				for (int j = y[i] + 1; j < x[i]; j++) {
					if (j % 2 != 0) {
						soma[i] += j;
					}
				}
			}

			if (x[i] < y[i]) {
				for (int j = x[i] + 1; j < y[i]; j++) {
					if (j % 2 != 0) {
						soma[i] += j;
					}
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(soma[i]);
		}
		entrada.close();
	}

}

package Basicos;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();

		if (n > 2 && n < 1000) {
			for (int i = 1; i <= 10; i++) {
				int resultado = n * i;
				System.out.printf("%d x %d = %d\n", i, n, resultado);
			}
		}
		entrada.close();
	}

}

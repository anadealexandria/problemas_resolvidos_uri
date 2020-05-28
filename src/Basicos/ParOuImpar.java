package Basicos;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = entrada.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (x[i] % 2 == 0 && x[i] > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x[i] % 2 == 0 && x[i] < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x[i] % 2 != 0 && x[i] > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x[i] % 2 != 0 && x[i] < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}

		}
		entrada.close();
	}
}
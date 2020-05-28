package Basicos;

import java.util.Scanner;

public class MultiplosDe13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;

		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();

		if (numero1 < numero2) {
			for (int i = numero1; i <= numero2; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		} 
		else if (numero1>numero2) {
			for (int j = numero2; j >= numero1; j++) {
				if (j % 13 != 0) {
					soma += j;
				}
			}

		}
		System.out.print(soma + "\n");
		entrada.close();
	}
}

package Basicos;

import java.util.Scanner;

public class ParesEntreCincoNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros;
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			numeros = entrada.nextInt();
			if (numeros % 2 == 0) {
				contador++;
			}
		}
		System.out.printf("%d valores pares\n", contador);
		entrada.close();

	}

}

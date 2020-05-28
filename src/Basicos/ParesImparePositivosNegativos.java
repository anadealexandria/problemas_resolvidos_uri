package Basicos;

import java.util.Scanner;

public class ParesImparePositivosNegativos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros;
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < 5; i++) {
			numeros = entrada.nextInt();

			if (numeros % 2 == 0) {
				pares++;
			} else {
				impares++;
		}

			if (numeros > 0) {
				positivos++;
			} else if (numeros <0 && numeros!=0){
				negativos++;
			}
		}

		System.out.printf("%d valor(es) par(es)\n", pares);
		System.out.printf("%d valor(es) impar(es)\n", impares);
		System.out.printf("%d valor(es) positivo(s)\n", positivos);
		System.out.printf("%d valor(es) negativo(s)\n", negativos);
		
		entrada.close();
	}

}

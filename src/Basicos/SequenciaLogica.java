package Basicos;

import java.util.Scanner;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1144
public class SequenciaLogica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroDeLinhas = entrada.nextInt();
		int numeros1[] = new int[numeroDeLinhas * 3];
		int numeros2[] = new int[numeroDeLinhas * 3];

		for (int i = 1, j = 1, n=1, m=1; i < numeroDeLinhas + 1 && j < numeroDeLinhas + 1; i++, j++, n+=2, m+=2) {
			int a= numeros1[n] = i;
			int b=numeros1[n + 1] = i * i;
			int c=numeros1[n + 2] = i * i * i;

			int d=numeros2[m] = a;
			int e=numeros2[m + 1] =b + 1;
			int f=numeros2[m + 2] =c + 1;

			System.out.printf("%d %d %d\n", a, b, c);
			System.out.printf("%d %d %d\n", d, e, f);

		}
		entrada.close();
	}

}

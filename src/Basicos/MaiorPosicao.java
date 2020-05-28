package Basicos;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero[] = new int[6];
		int m=0;
		for (int i = 0; i < numero.length; i++) {
			numero[i] = entrada.nextInt();

		}

		int maior = numero[0];
		for (int i = 0; i < numero.length; i++)
			if (numero[i] > maior) {
				maior = numero[i];
				m=i+1;
			}

		System.out.printf("%d\n",maior);
		System.out.printf("%d\n",m);
		entrada.close();
	}

}

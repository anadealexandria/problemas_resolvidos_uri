package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1177
import java.util.Scanner;

public class PreenchimentoDeVetorII {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int numeros[] = new int[1000];
		int contador = 0;

		if (n >= 2 && n <= 50) {
			for (int i = 0; i < numeros.length; i++) {
				if (contador >= n) {
					contador = 0;
				}
				numeros[i] = contador;
				contador++;
				System.out.printf("N[%d] = %d\n", i, numeros[i]);
			}
		}

		entrada.close();
	}

}

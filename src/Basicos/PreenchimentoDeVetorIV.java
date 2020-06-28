package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1179
import java.util.Scanner;

public class PreenchimentoDeVetorIV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int impares[] = new int[5];
		int pares[] = new int[5];
		int contadorPares = 0;
		int contadorImpares = 0;

		for (int i = 0; i <= 15; i++) {
			int valor = entrada.nextInt();

			if (valor % 2 == 0) {
				for (int p = 0; p < pares.length; p++) {
					pares[p] = valor;
				}
				contadorPares++;

			} else {
				for (int im = 0; im < impares.length; im++) {
					impares[im] = valor;
				}
				contadorImpares++;
			}
			if (contadorPares == 5) {
				for (int par = 0; par < pares.length; par++) {
					System.out.printf("par[%d] = %d", par, pares[par]);
				}
			}
			if (contadorImpares == 5) {
				for (int impar = 0; impar < impares.length; impar++) {
					System.out.printf("impar[%d] = %d", impar, impares[impar]);

				}
			}

		}
		entrada.close();
	}

}

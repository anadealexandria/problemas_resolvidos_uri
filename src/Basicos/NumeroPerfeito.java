package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1164
import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int soma = 0;
		int x = 0;

		for (int i = 0; i < n; i++) {
			x = entrada.nextInt();
			int divisores = 1;
			while (true) {
				if (divisores == x) {
					break;
				}
				if (x % divisores == 0) {
					soma += divisores;
				}

				divisores++;
			}
						
			if (soma == x) {
				System.out.printf("%d eh perfeito\n", x);
			} else {
				System.out.printf("%d nao eh perfeito\n", x);
			}
			soma=0;
			
		}
		entrada.close();
	}

}

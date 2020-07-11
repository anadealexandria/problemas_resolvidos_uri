package Basicos;

//Endereço:https://www.urionlinejudge.com.br/judge/pt/problems/view/1151
import java.util.Scanner;

public class FibonacciFacil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		int valores[] = new int[n];
		if (n < 46) {
			valores[0] = 0;
			valores[1] = 1;
			for (int x = 2; x < n; x++) {
				valores[x] = valores[x - 2] + valores[x - 1];
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(valores[i] + " ");
			
		}
		entrada.close();
	}

}

package Basicos;

import java.util.Scanner;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1149
public class SomandoInteirosConsecutivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		int n;
		int soma = 0;
		int total = 0;
		while (true) {
			a = entrada.nextInt();
			if (a > 0 && a != 0) {
				break;
			} else {
				continue;
			}
		}
		while (true) {
			n = entrada.nextInt();
			if (n > 0 && n != 0) {
				if (n > 0 && n != 0) {
					break;
				} else {
					continue;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			soma = a + i;
			total += soma;
		}
		System.out.print(total + "\n");
		entrada.close();
	}

}

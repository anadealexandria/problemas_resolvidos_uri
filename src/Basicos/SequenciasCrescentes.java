package Basicos;

import java.io.IOException;
//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1146
import java.util.Scanner;

public class SequenciasCrescentes {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		int x = entrada.nextInt();
		while (x != 0) {
			for (int i = 1; i <= x; i++) {
				if (i == x) {
					System.out.print(i + "\n ");
				} else {
					System.out.print(i + " ");

				}
				x = entrada.nextInt();
			}
			entrada.close();
		}

	}
}

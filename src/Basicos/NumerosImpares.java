package Basicos;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();

		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <=x; i++) {
				if (i % 2 != 0)
					System.out.println(i);
			}
		}
		entrada.close();
	}

}

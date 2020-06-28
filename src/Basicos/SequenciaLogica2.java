package Basicos;

import java.util.Scanner;

public class SequenciaLogica2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numerosPorLinha = entrada.nextInt();
		int numeroDeValores = entrada.nextInt();

		int linha[] = new int[numerosPorLinha];

		for (int i = 1, n = 1; i < (numeroDeValores / numerosPorLinha) * numerosPorLinha + 1 ; i += 3, n += 4) {
			int a = linha[n] = i;
			int b = linha[n + 1] = a + 1;
			int c = linha[n + 2] = a + 2;

			System.out.printf("%d %d %d\n", a, b, c);
		}
		entrada.close();
	}

}

package Basicos;

import java.util.Scanner;

public class Lanche {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		float preco[] = new float[6];

		System.out.println("Digite o codigo e a quantidade:");
		int i = entrada.nextInt();
		int qtd = entrada.nextInt();
		preco[1] = 4.00f;
		preco[2] = 4.50f;
		preco[3] = 5.00f;
		preco[4] = 2.00f;
		preco[5] = 1.50f;

		float total = preco[i] * qtd;
		System.out.printf("Total: R$ %.2f\n", total);

		entrada.close();
	}
}
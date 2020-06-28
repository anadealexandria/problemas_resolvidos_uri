package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1181
import java.util.Scanner;

public class LinhaDaMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0.0;
		double media = 0.0;
		double matriz[][] = new double[12][12];
		int n = entrada.nextInt();
		char operacao = entrada.next().charAt(0);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = entrada.nextDouble();
			}
		}

		if (operacao == 'S') {
			for (int i = 0; i < matriz.length; i++) {
				soma += matriz[n][i];
			}
			System.out.print(soma + "\n");
		}
		if (operacao == 'M') {
			for (int i = 0; i < matriz.length; i++) {
				soma += matriz[n][i];
				media = soma / matriz.length;
			}
			System.out.print(media + "\n");
		}
		entrada.close();
	}

}

package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1174
import java.util.Scanner;

public class SelecaoEmVetorI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vetores[] = new double[100];
		double valores;

		for (int i = 0; i < vetores.length; i++) {
			vetores[i] = valores = entrada.nextDouble();
		}

		for (int i = 0; i < vetores.length; i++) {
			if (vetores[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, vetores[i]);
			}
		}
		entrada.close();

	}

}

package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1154
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = entrada.nextInt();
		int aux = idade;
		double soma = 0;
		double contador = 0;

		while (idade > 0) {
			idade = entrada.nextInt();
			if (idade > 0) {
				soma += idade;
				contador++;
			}
		}
		
		double media = (soma + aux) / (contador+1);

		System.out.printf("%.2f\n", media);
		entrada.close();
	}

}

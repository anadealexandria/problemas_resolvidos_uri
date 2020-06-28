package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1180
import java.util.Scanner;

public class MenorEPosicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int numeros[] = new int[n];
		int aux = 0;
		int menor = 0;
		int i = 0;

		for (i = 0; i < numeros.length; i++) {
			
			numeros[i] = entrada.nextInt();
			int contador=0;
			contador++;
			
			if(contador==numeros.length) {
				entrada.nextLine();
			}
		}
		
		
		
		for (i = 0; i < numeros.length; i++) {
			menor = numeros[i];
			if (numeros[i + 1] < numeros[i]) {
				menor = numeros[i + 1];
				aux = i;
			}

		}
		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Posicao: %d", aux);
		entrada.close();
	}

}

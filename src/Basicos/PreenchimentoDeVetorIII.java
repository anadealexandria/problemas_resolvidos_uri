package Basicos;


//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1178
import java.util.Scanner;
public class PreenchimentoDeVetorIII {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x = entrada.nextDouble();
		double numeros [] = new double[100];
		
		numeros[0] = x;
		for(int i=1 ; i<numeros.length ; i++) {
			numeros[i] = numeros[i-1]/2;
		}
		
		for(int i=0 ; i<numeros.length ; i++) {
			System.out.printf("N[%d] = %.4f\n", i, numeros[i]);
		}
		
	 entrada.close();
	}

}

package Basicos;
import java.util.Scanner;
public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numeros;
		int contador=0;
		
		for(int i=0 ; i<6 ; i++) {
			
			numeros=entrada.nextDouble();
			if(numeros>0) {
				contador++;
			}
			
		}
		System.out.printf("%d valores positivos\n", contador);
		
		entrada.close();
	}

}

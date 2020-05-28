package Basicos;
import java.util.Scanner;
public class PositivosEMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numeros=0;
		int contador=0;
		double media;
		double soma=0;
		for(int i=0 ; i<6 ; i++) {
			numeros=entrada.nextDouble();
			if(numeros>0) {
				contador++;
				soma+= numeros;
			}
			
		}
		media=soma/contador;
		System.out.printf("%d valores positivos\n", contador);
		System.out.printf("%.1f\n",media);
		entrada.close();
	}

}

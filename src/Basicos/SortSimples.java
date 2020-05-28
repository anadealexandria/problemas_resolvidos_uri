package Basicos;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[3];
		System.out.println("Digite três números:");
		int i;
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();
		}
		
		int numeros1[]= new int[3];
		for(i = 0 ; i< numeros.length ; i++) {
			numeros1[i]=numeros[i];
		}
		
		for(i = 0; i < numeros.length; i++) {
		Arrays.sort(numeros);
		System.out.println(numeros[i]);
		}
				
		System.out.println("\n");

		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros1[i]);
		}
		entrada.close();
	}

}

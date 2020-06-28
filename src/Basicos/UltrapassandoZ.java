package Basicos;

import java.util.Scanner;

public class UltrapassandoZ {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		int z = entrada.nextInt();
		int contador=0;
		int total=0;
		
		while(z<x) {
			z=entrada.nextInt();			
		}
		
		for(int i= x ; i<=z ; i++) {
			total+=i;
			contador++;
			if(total>z) {
				break;
			}
		}
		System.out.println(contador);
		entrada.close();
	}

}

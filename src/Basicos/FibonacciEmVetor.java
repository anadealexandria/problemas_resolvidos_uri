package Basicos;

import java.util.Scanner;

public class FibonacciEmVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int t = entrada.nextInt();
		int vetor []= new int [61];
		
		for(int i=2 ; i<vetor.length ; i++) {			
			vetor[0]=0;
			vetor[1]=1;
			vetor[i]=vetor[i-1]+vetor[i-2];
		}
		
		for(int i=0; i<t; i++) {
			int a = entrada.nextInt();
			System.out.printf("Fib(%d) = %d\n", a, vetor[a]);
		}
		
		entrada.close();
	}

}

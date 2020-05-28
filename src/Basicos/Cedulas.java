package Basicos;

import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número:");
		int n;
				
		n=entrada.nextInt();
		
		if (0< n && n <1000000) {
			System.out.println(n);
			}				
		System.out.print((n-n%100)/100 + " nota(s) de R$ 100,00\n");
		n=n%100;
		System.out.print((n%100-n%50)/50 + " nota(s) de R$ 50,00\n");
		n=n%50;			
		System.out.print((n%50-n%20)/20 + " nota(s) de R$ 20,00\n");
		n=n%20;
		System.out.print((n%20-n%10)/10 + " nota(s) de R$ 10,00\n");
		n=n%10;;
		System.out.print((n%10-n%5)/5 + " nota(s) de R$ 5,00\n");
		n=n%5;
		System.out.print((n%5-n%2)/2 + " nota(s) de R$ 2,00\n");
		n=n%2;
		System.out.print((n%2-n%1)/1 + " nota(s) de R$ 1,00\n");
		
		entrada.close();
		
	}
}

package Basicos;

import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n;
		System.out.println("Digite um número:");
		n=entrada.nextDouble();
		if(n>=0 || n<=1000000.00) {
			System.out.println("NOTAS:");
			int a= (int) (n/100.00);
			System.out.printf("%d nota(s) de R$ 100.00\n", a);
			n=n%100.00;
			int b= (int)(n/50.00);
			System.out.printf("%d nota(s) de R$ 50.00\n", b);
			n=n%50.00;
			int c= (int)(n/20.00);
			System.out.printf("%d nota(s) de R$ 20.00\n", c);
			n=n%20.00;
			int d= (int)(n/10.00);
			System.out.printf("%d nota(s) de R$ 10.00\n", d);
			n=n%10.00;
			int e= (int)(n/5.00);
			System.out.printf("%d nota(s) de R$ 5.00\n", e);
			n=n%5.00;
			int f= (int)(n/2.00);
			System.out.printf("%d nota(s) de R$ 2.00\n", f);
			n=n%2.00 ;
			System.out.println("MOEDAS:");
			int g=(int)(n/1.00);
			System.out.printf("%d moeda(s) de R$ 1.00\n", g);
			n=n%1.00;
			int h=(int)(n/0.50);
			System.out.printf("%d moeda(s) de R$ 0.50\n", h);
			n=n%0.50;
			int i= (int)(n/0.25);
			System.out.printf("%d nota(s) de R$ 0.25\n", i);
			n=n%0.25;
			int j= (int)(n/0.10);
			System.out.printf("%d nota(s) de R$ 0.10\n", j);
			n=n%0.10;
			int k= (int)(n/0.05);
			System.out.printf("%d nota(s) de R$ 0.05\n", k);
			n=n%0.05;
			int l= (int)(n/0.01);
			System.out.printf("%d nota(s) de R$ 0.01\n", l);
		}

		entrada.close();
	}

}

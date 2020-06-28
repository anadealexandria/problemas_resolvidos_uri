package Basicos;

import java.util.Scanner;

//Endereço:https://www.urionlinejudge.com.br/judge/pt/problems/view/1143
public class QuadradoEAoCubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numDeLinhas = entrada.nextInt();
		int linhas [] = new int [numDeLinhas*3];
		
		if(numDeLinhas>=1 && numDeLinhas<=1000) {
			
			for(int i=1 ; i<=numDeLinhas ; i++) {
				int a=linhas[i]=i;
				int b=linhas[i+1]= i * i;
				int c=linhas[i+2]= i* i *i;
				System.out.printf( "%d %d %d\n", a, b, c);
			}
		}
		entrada.close();
	}

}

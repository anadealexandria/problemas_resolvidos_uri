package Basicos;

import java.util.Scanner;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1142

public class PUM {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n= entrada.nextInt();
		int valores[]=new int[n*4];
		
		for(int i=1; i<n*4; i+=4) {
			
			valores[i]=i;
			valores[i+1]= i+1;
			valores[i+2]= i+2;
		System.out.printf("%d %d %d PUM\n",valores[i] , valores[i+1] , valores [i+2]);
		}
		
	
		entrada.close();
	}

}

package Basicos;

//Endereço:https://www.urionlinejudge.com.br/judge/pt/problems/view/1151
import java.util.Scanner;

public class FibonacciFacil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		int valores [] = new int [n];
		if(n<46) {
			for(int x=0 ; x<=n ; x++) {
				
				valores [0] = 0;
				valores [1] =1 ;
				valores [x+2] = valores [x] + valores[x+1];
				
				System.out.print(valores[x] + " ");
			}
		}
		entrada.close();
	}

}

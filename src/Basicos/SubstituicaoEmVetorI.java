package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1172
import java.util.Scanner;
public class SubstituicaoEmVetorI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [10];
	
		for(int i=0 ; i<10 ; i++) {
			numeros[i] = entrada.nextInt();
			if(numeros[i]==0 || numeros[i]<0) {
				numeros[i]=1;
			}
			System.out.printf("X[%d] = %d\n", i, numeros[i]);
		}
		entrada.close();
	}

}

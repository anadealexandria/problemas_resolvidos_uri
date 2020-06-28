package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1175
import java.util.Scanner;
public class TrocaEmVetorI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor []= new int [20];
				
		for(int i = vetor.length-1; i>=0 ; i--) {
			vetor[i]=entrada.nextInt();
			
		}
		for(int i=0 ; i<vetor.length ; i++) {
			System.out.printf("N[%d] = %d\n", i, vetor[i]);
		}

		entrada.close();
	}

}

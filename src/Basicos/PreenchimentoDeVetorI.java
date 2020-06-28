package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1173
import java.util.Scanner;
public class PreenchimentoDeVetorI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[]=new int[10];
		numeros[0]=entrada.nextInt();
		
		for(int i=1 ; i<10; i++) {
			int aux=i;
			numeros[i]=numeros[i-1] *2;
			i=aux;
		}
		
		for(int i=0 ; i<10 ; i++) {
			System.out.printf("N[%d] = %d\n", i, numeros[i]);
		}
		entrada.close();
	}
	
}

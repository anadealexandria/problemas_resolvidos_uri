package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1153
import java.util.Scanner;

public class FatorialSimples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int aux = n;
		int fator =1;
		int multi = 1;
		
		if(n>0 && n<13) {
			for(int i = 1 ; i<n ; i++) {
				fator=(n-i);
				multi *= fator; 
				n = aux;
			}
		}
		
		System.out.print(multi * aux + "\n");
		entrada.close();
	}

}

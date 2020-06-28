package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158
import java.util.Scanner;

public class SomaDeImparesConsecutivosIII {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int soma[] = new int[n];		
		int quantidade=0;

		for (int i = 0; i < n; i++) {
			
			int x = entrada.nextInt();
			int y = entrada.nextInt();
			
			while(quantidade < y) {
				if (x % 2 != 0) {
					soma[i] += x;
					quantidade++;
				}
				x++;
			}
			System.out.print(soma[i] + "\n");
			quantidade=0;
		}
		
		entrada.close();
	}

}

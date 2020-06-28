package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1159
import java.util.Scanner;

public class SomaDeParesConsecutivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int quantidade = 0;

		while (true) {
			int x = entrada.nextInt();
			if (x != 0) {
				while (quantidade < 5) {
					if (x % 2 == 0) {
						soma += x;
						quantidade++;
					}
					x++;
				}
				System.out.print(soma + "\n");
			} else {
				break;
			}
			quantidade=0;
			soma=0;
			
		}
		entrada.close();
	}

}

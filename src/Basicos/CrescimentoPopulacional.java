package Basicos;

import java.util.Scanner;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1160
public class CrescimentoPopulacional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int pa;
		int pb;
		float g1=0.0f;
		float g2=0.0f;
		int contador = 0;
		for (int i = 0; i < n; i++) {
			pa = entrada.nextInt();
			pb = entrada.nextInt();
			g1 = entrada.nextFloat();
			g2 = entrada.nextFloat();

			while (pb >= pa) {

				pa =(int) (pa * (g1 / 100)) + pa;

				pb = (int) (pb * (g2 / 100)) + pb;

				contador++;
			}
			
			if (contador > 100) {
				System.out.print("Mais de 1 seculo.\n");
			} else {
				System.out.printf("%d anos.\n", contador);
			}
			contador=0;
		}
		entrada.close();
	}

}

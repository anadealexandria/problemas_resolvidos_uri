package Basicos;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		
		while (true) {
			int valor1= entrada.nextInt();
			int valor2 = entrada.nextInt();
			int sum=0;
			if (valor1 <= 0 || valor2 <=0)
				break;
			if (valor2 > valor1) {
				for (int j = valor1; j <= valor2 ; j++) {
					sum += j;
					System.out.printf("%d ",j);
				} 
				System.out.printf("Sum=%d\n", sum);
			}else {
				for (int j = valor2; j <= valor1 ; j++) {
					sum += j;
					System.out.printf("%d ", j);
				}
				System.out.printf("Sum=%d\n", sum);
			}
			
		
		}
		
		entrada.close();

	}

}

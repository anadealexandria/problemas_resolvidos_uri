package Basicos;
import java.util.Scanner;
public class QuadradoPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int potencia;
		
		if(n>5 && n<2000) {
			for(int i=1 ; i<=n ; i++) {
				if(i%2==0) {
					potencia=i*i;
					System.out.printf("%d^2 = %d\n", i, potencia);
				}
			}
		}
		
		entrada.close();
	}

}

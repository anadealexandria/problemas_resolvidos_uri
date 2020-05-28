package Basicos;
import java.util.Scanner;
public class Intervalo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dentro=0;
		int fora=0;
		int x;
		int n=entrada.nextInt();
		
		for(int i=0; i<n;i++) {
			x=entrada.nextInt();
			if(x>=10 && x<=20) {
				dentro++;
			}else {
				fora++;
			}
		}
		System.out.printf("%d in\n", dentro);
		System.out.printf("%d out\n", fora);
		
		entrada.close();
	}

}

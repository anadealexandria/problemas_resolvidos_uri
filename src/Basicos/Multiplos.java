package Basicos;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		int a=entrada.nextInt();
		int b=entrada.nextInt();
		
		if(a<b) {
			if(b%a == 0) {
				System.out.println("Sao Multiplos\n");
			}else {
				System.out.println("Nao sao Multiplos\n");
			}
		}else {
			if(a%b == 0) {
				System.out.println("S�o Multiplos\n");
			}else {
				System.out.println("Nao sao Multiplos\n");
			}
		}
		entrada.close();
	}

}

package Basicos;
import java.util.Scanner;
public class ConversaoDeTempo {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um número:");
		int n, h, m, s;
				
		n=entrada.nextInt();
		
		h=n/3600;
		n=n%3600;
		m=n/60;
		s=n%60;
		
		System.out.printf("%d:%d:%d", h, m, s);
		
		entrada.close();
	}

}

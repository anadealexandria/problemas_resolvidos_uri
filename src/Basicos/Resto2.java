package Basicos;
import java.util.Scanner;
public class Resto2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n=entrada.nextInt();
		
		if(n<10000) {
			for(int i =0;i<10000;i++) {
				if(i%n==2) {
					System.out.print(i + "\n");
				}
			}
		}
		entrada.close();
	}

}

package Basicos;
import java.util.Scanner;
public class Quadrante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;
		int y;
		
		while(true) {
			x=entrada.nextInt();
			y=entrada.nextInt();
			
			if(x==0 || y==0) {				
				break;
			}
			if(x>0 && y>0) {
				System.out.println("primeiro\n");
			}
			else if(x<0 && y>0) {
				System.out.println("segundo\n");
			}
			else if(x<0 && y<0 ) {
				System.out.println("terceiro\n");
			}
			else if(x>0 && y<0) {
				System.out.println("quarto\n");
			}
		}
		entrada.close();
	}

}

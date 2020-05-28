package Basicos;
import java.util.Scanner;
public class CrescenteEDecrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor1=0,valor2=0;
		
		while(true) {
			valor1=entrada.nextInt();
			valor2=entrada.nextInt();
			if(valor1==valor2) {
				break;
			}
			if(valor1>valor2) {
				System.out.print("Decrescente\n");
			}else {
				System.out.print("Cresecente\n");
			}
		}
		entrada.close();
	}

}

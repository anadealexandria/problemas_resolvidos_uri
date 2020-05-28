package Basicos;
import java.util.Scanner;
public class DDD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero=entrada.nextInt();
		
		if(numero==61) {
			System.out.print("Brasilia\n");
		}
		else if(numero==71) {
			System.out.println("Salvador\n");
		}
		else if(numero==11) {
			System.out.println("Sao Paulo\n");
		}
		else if(numero==21) {
			System.out.println("Rio de Janeiro\n");
		}
		else if(numero==32) {
			System.out.println("Juiz de Fora\n");
		}
		else if(numero==19) {
			System.out.println("Campinas\n");
		}
		else if(numero==27) {
			System.out.println("Vitoria\n");
		}
		else if(numero==31) {
			System.out.println("Belo Horizonte\n");
		}
		else {
			System.out.println("DDD nao cadastrado\n");
		}
		entrada.close();
	}

}

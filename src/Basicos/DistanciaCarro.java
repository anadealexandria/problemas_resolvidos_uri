package Basicos;
import java.util.Scanner;
public class DistanciaCarro {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite a distancia:");
		int d;
		int t;
		
		d=entrada.nextInt();
		t=d/30;
		
		System.out.println(t + "  minutos");
		
		entrada.close();
		
	}

}

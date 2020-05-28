package Basicos;
import java.util.Scanner;
import java.util.Locale;
public class CosumoMedio {

	public static void main(String[] args) {
		int dt;
		double cg;
		double cm;
		
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(new Locale ("en-US"));
		dt=entrada.nextInt();
		cg=entrada.nextDouble();
		
		cm=dt/cg;
		
		System.out.printf("%.3f km/l", cm);
		
		entrada.close();
		

	}

}

package Basicos;
import java.util.Scanner;
import java.util.Locale;
public class DistanciaEntrePontos {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(new Locale ("en-US"));
		double[] p1= new double [2];
		double[] p2=new double [2] ;
				
				
		p1[0]=entrada.nextDouble();
		p1[1]=entrada.nextDouble();
		
		p2[0]=entrada.nextDouble();
		p2[1]=entrada.nextDouble();
		
		double distancia=Math.sqrt(Math.pow(p2[0]-p1[0], 2) +
				Math.pow(p2[1]-p1[1], 2));
		
		System.out.printf("%.4f\n", distancia);
		
		entrada.close();
	}

}

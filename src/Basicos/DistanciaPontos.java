package Basicos;
import java.util.Scanner;
public class DistanciaPontos {

	public static void main(String[] args) {
		double x1=0;
		double x2 =0;
		double y1=0;
		double y2=0;
		double r=(x2-x1);
		double s=(y2-y1);
		
		Scanner entrada=new Scanner(System.in);
		
		 x1=entrada.nextInt();
		 x2=entrada.nextInt();
		 y1=entrada.nextInt();
		 y2=entrada.nextInt();
		
		double distancia = Math.sqrt(Math.pow(r, 2)+Math.pow(s, 2));
		
		System.out.printf("%.4f\n", distancia);
		
		entrada.close();
	}
	
;
}

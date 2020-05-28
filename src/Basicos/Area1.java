package Basicos;
import java.util.Scanner;
import java.util.Locale;
public class Area1 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		entrada.useLocale(new Locale("en-US"));
		
		double A;
		double B;
		double C;
		
		A=entrada.nextDouble();
		B=entrada.nextDouble();
		C=entrada.nextDouble();
		
		double areatri;
		double areaci;
		double areatra;
		double areaqua;
		double areare;
		final double pi=3.14159;
		
		areatri=A*C/2;
		areaci= pi* C*C;
		areatra=(A+B)*C/2;
		areaqua=B*B;
		areare=A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", areatri);
		System.out.printf("CIRCULO: %.3f\n", areaci);
		System.out.printf("TRAPEZIO: %.3f\n", areatra);
		System.out.printf("QUADRADO: %.3f\n", areaqua);
		System.out.printf("RETANGULO: %.3f\n", areare);
	
	    entrada.close();
	}

}

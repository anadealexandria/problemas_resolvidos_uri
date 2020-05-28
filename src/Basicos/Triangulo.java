package Basicos;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite três números:");
		float A= entrada.nextFloat();
		float B= entrada.nextFloat();
		float C= entrada.nextFloat();
		
		if((Math.abs(B-C) < A && A < B+C) || (Math.abs(A-C)) < B && B < (A+C) || (Math.abs(A-B) < C && C < (A+B)) ) {
			float perimetro=A+B+C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}else {
			float area=((A+B)*C)/2;
			System.out.printf("Area = %.1f\n", area);
		}
		
		entrada.close();
	}

}

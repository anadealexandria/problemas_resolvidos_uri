package Basicos;
import java.util.Scanner;
public class FormulaDeBhaskara {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite três números:");
		
		double A=entrada.nextDouble();
		double B=entrada.nextDouble();
		double C=entrada.nextDouble();
		
		double delta= Math.pow(B, 2) - 4*A*C;
		double R1= (-B+Math.sqrt(delta))/(2*A);
		double R2= (-B-Math.sqrt(delta))/(2*A);
		
		if(delta>=0 && A!=0) {
			System.out.printf("R1 = %.5f\n", R1, "\n");
			System.out.printf("R2 = %.5f\n", R2, "\n");
		}
		else if(delta<0 || A==0) {
			System.out.println("Impossivel calcular");
		}
		entrada.close();
	}

}

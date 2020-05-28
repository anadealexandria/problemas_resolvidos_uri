package Basicos;
import java.util.Scanner;
import java.util.Locale;
public class CalculoSimples {

	public static void main(String[] args) {
	 
	 Scanner entrada=new Scanner(System.in);
	 entrada.useLocale(new Locale ("en-US"));
	 
	 int np1, np2;
	 double v1, v2; 	 
	 double total;
	 	
	 np1=entrada.nextInt();
	 v1=entrada.nextDouble();	 
	 
	 np2=entrada.nextInt();
	 v2=entrada.nextDouble();
	 
	 total= np1*v1+np2*v2;
	 
	 System.out.printf("VALOR A PAGAR: R$ %.2f", total);
	 
	 entrada.close();
	 

	}

}

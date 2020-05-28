package Basicos;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double raio;
        double n=3.14159;
        double area;
        
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(new Locale("en-US"));
        raio=entrada.nextDouble();
        
        area=n*raio*raio;
        System.out.printf(new Locale("en-US"), "A=%.4f\n", area);
        
        entrada.close();
	}

}

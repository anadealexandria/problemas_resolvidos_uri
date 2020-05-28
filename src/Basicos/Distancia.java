package Basicos;

import java.util.Scanner;
import java.util.Locale;
public class Distancia {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		entrada.useLocale(new Locale ("en-US"));
		int tempo;
		int velocidade;
		tempo=entrada.nextInt();
		velocidade=entrada.nextInt();
		
		double espaco;
		espaco=tempo*velocidade;
		
		double litros;
		litros = espaco/12;
		
		System.out.printf("%.3f\n", litros);
		
		entrada.close();


	}

}

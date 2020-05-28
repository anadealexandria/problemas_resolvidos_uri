package Basicos;

import java.util.Scanner;

public class TipoDeCombustível {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int codigo=0;
		int contadorAlcool=0, contadorGasolina=0, contadorDiesel=0;
		
		while(true) {
			codigo = entrada.nextInt();
			
			if(codigo==1) {
				contadorAlcool++;
			}
			if(codigo==2) {
				contadorGasolina++;
			}
			if(codigo==3) {
				contadorDiesel++;
			}
			if(codigo==4) {
				break;
			}
		}
		System.out.print("MUITO OBRIGADO\n");
		System.out.printf("Alcool: %d\n", contadorAlcool);
		System.out.printf("Gasolina: %d\n", contadorGasolina);
		System.out.printf("Diesel: %d\n", contadorDiesel);
		
		entrada.close();
	}

}

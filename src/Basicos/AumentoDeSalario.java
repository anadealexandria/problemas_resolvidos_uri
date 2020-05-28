package Basicos;
import java.util.Scanner;
public class AumentoDeSalario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do salário:");
		
		double valor=entrada.nextDouble();
			
		
		if(valor>=0f && valor<=400f) {
			double total=valor*0.15f+valor;
			double reajuste=valor*0.15f;
			System.out.printf("Novo salario: %.2f\n", total);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: 15 %");
		}
		if(valor>400.00f && valor<=800.00f) {
			double total1=valor*0.12f+valor;
			double reajuste1=valor*0.12f;
			System.out.printf("Novo salario: %.2f\n", total1);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste1);
			System.out.print("Em percentual: 12 %");
		}
		if(valor>800.00f && valor<=1200.00f) {
			double total2=valor*0.10f+valor;
			double reajuste2=valor*0.10f;
			System.out.printf("Novo salario: %.2f\n", total2);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste2);
			System.out.print("Em percentual: 10 %");
		}
		if(valor>1200.00f && valor<=2000.00f) {
			double total3=valor*0.07f+valor;
			double reajuste3=valor*0.07f;
			System.out.printf("Novo salario: %.2f\n", total3);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste3);
			System.out.print("Em percentual: 7 %");
		}
		if(valor>2000.00f) {
			double total4=valor*0.04f+valor;
			double reajuste4=valor*0.04f;
			System.out.printf("Novo salario: %.2f\n", total4);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste4);
			System.out.print("Em percentual: 4 %");
		}
		
		entrada.close();
		
	}

}

package Basicos;
import java.util.Scanner;
public class SalarioBonus {

	public static void main(String[] args) {
		String nome;
		double salario;
		double totalDeVendas;
		double total;
		
		Scanner entrada=new Scanner(System.in);
		
		nome=entrada.nextLine().toUpperCase();
		
		salario=entrada.nextDouble();
		
		totalDeVendas=entrada.nextDouble();		
		
		total=salario+totalDeVendas*3/20;
		
		System.out.printf("TOTAL = R$ %.2f" , total);
		
		entrada.close();
		
	}

}

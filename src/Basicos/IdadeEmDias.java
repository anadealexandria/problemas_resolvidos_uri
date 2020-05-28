package Basicos;
import java.util.Scanner;
public class IdadeEmDias {

	public static void main(String[] args) {
		
		
		
		int ndias, ano, mes;
		
		Scanner entrada=new Scanner(System.in);
		
		ndias=entrada.nextInt();
		
		ano=ndias/365;
		System.out.println(ano +  " ano(s)");
		ndias=ndias-(ano*365);
				
		mes=ndias/30;
		System.out.println(mes + " mes(es)");
		ndias=ndias-(mes*30);
		
		System.out.println(ndias + " dia(s)");
		
		entrada.close();
		
	}
}

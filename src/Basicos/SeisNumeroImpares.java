package Basicos;
import java.util.Scanner;
public class SeisNumeroImpares {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int x = entrada.nextInt();
		int numerosImpares=0;
		
		while(numerosImpares<6) {
			if(x%2!=0) {
				System.out.println(x);	
				numerosImpares++;
			}
			x++;			
		}
		
		entrada.close();
	}

}

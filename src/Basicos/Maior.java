package Basicos;
import java.util.Scanner;
public class Maior {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		int c;
		int maiorAB;
		
		
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		
		maiorAB=(a+b+a*b*(a-b))/2;
		
		maiorAB=a;
		if(b>maiorAB){
			maiorAB=b;
			
		}
		if (c>maiorAB) {
			maiorAB=c;
			
		}
		System.out.println(maiorAB + " eh o maior");
		
		
				
		entrada.close();
		}
		
	}



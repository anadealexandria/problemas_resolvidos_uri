package Basicos;
import java.util.Scanner;
public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Digite os números:");
		float x= entrada.nextFloat();
		float y= entrada.nextFloat();
		
		if(x==0.0f && y==0.0f) {
			System.out.println("Origem\n");
		}
		else if(y>0.0f && x>0.0f) {
			System.out.println("Q1\n");
		}
		else if(y>0.0f && x<0.0f) {
			System.out.println("Q2\n");
		}
		else if(y<0.0f && x<0.0f) {
			System.out.println("Q3\n");
		}
		else if(y<0.0f && x>0.0f) {
			System.out.println("Q4\n");
		}
		else if((y<0.0f || y>0.0) && x==0.0f) {
			System.out.println("Eixo Y\n");
		}
		else if((x<0.0f || x>0.0f) && y==0.0f) {
			System.out.println("Eixo X\n");
		}
		entrada.close();
	}

}

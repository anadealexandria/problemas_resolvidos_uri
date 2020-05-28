package Basicos;
import java.util.Scanner;
public class SomaDeImparesConsecutivosI {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		int soma=0;
		
		for(int i=y+1 ; i<x ; i++) {
			if(i%2!=0) {
				soma+=i;
			}
			
		}
		
		System.out.print(soma+"\n");
		entrada.close();

	}

}

package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1157
import java.util.Scanner;
public class DivisoresI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		for(int i=1 ; i<=n ; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		entrada.close();
	}

}

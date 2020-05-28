package Basicos;
import java.util.Scanner;
public class Experiencias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total=0;
		int rato=0;
		int coelhos=0;
		int sapo=0;
		
			
		int n=entrada.nextInt();
		entrada.nextLine();
		
		for(int i=0; i<n ; i++) {
			
			String numero=entrada.nextLine();
			String valores[] = numero.split(" ");
			int v=Integer.parseInt(valores[0]);
			if(valores[1].equals("C")) {
				coelhos+=v;
			}
			if(valores[1].equals("R")) {
				rato+=v;
			}
			if(valores[1].equals("S")) {
				sapo+=v;
			}
			total+=v;
		}
		double percentualC = (coelhos*100.00)/total;
		double percentualR = (rato*100.00)/total;
		double percentualS = (sapo*100.00)/total;
		System.out.printf("Total: %d cobaias\n",total);
		System.out.printf("Total de coelhos: %d\n",coelhos);
		System.out.printf("Total de ratos: %d\n",rato);
		System.out.printf("Total de sapos: %d\n",sapo);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);
		
		entrada.close();
	}

}

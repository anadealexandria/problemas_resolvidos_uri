package Basicos;
import java.util.Scanner;
public class Grenais {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int contadorGrenais=0;		
		int sairOuNao=0;
		int contadorEmpates=0;
		int venceuMaisInter=0;
		int venceuMaisGremio=0;
		do {
			int inter = entrada.nextInt();
			
			int gremio = entrada.nextInt();
									
			if(inter>gremio) {
					venceuMaisInter++;
			}else {
					venceuMaisGremio++;
				}
			if(inter==gremio) {
				contadorEmpates++;
			}
			
			contadorGrenais++;
			System.out.print("Novo grenal (1-sim 2-nao)\n");
			sairOuNao = entrada.nextInt();
		}while(sairOuNao==1);
		
		System.out.printf("%d grenais\n", contadorGrenais);
		System.out.printf("Inter: %d\n", venceuMaisInter);
		System.out.printf("Gremio: %d\n", venceuMaisGremio);
		System.out.printf("Empates: %d\n", contadorEmpates);
		
		if(venceuMaisInter>venceuMaisGremio) {
			System.out.print("Inter venceu mais\n");
			
		}else {
			System.out.print("Gremio venceu mais\n");
		}
		entrada.close();
	}

}

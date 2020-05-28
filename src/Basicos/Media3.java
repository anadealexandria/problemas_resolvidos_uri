package Basicos;
import java.util.Scanner;
public class Media3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		System.out.println("Digite 4 notas:");
		n1=entrada.nextFloat();
		n2=entrada.nextFloat();
		n3=entrada.nextFloat();
		n4=entrada.nextFloat();
		float media1=0;
		float media =((n1*2)+(n2*3)+(n3*4)+(n4*1))/(10);
		System.out.printf("Media: %.1f\n", media);
		if(media>=7.0f) {
			System.out.print("Aluno aprovado.\n");
		}
		else if(media<5.0f) {
			System.out.print("Aluno reprovado.\n");
		}
		else if(media>=5.0f && media <=6.9f) {
			System.out.print("Aluno em exame.\n");
			System.out.println("Digite a nota do exame:");
			float nota=entrada.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", nota);
			media1=(media+nota)/2;
				if(media1>=5.0f) {
					System.out.print("Aluno aprovado.\n");
				}
				else if(media1<=4.9f) {
					System.out.print("Aluno reprovado.\n");
				}
				System.out.printf("Media final: %.1f\n", media1);
			}
		entrada.close();
	}

}

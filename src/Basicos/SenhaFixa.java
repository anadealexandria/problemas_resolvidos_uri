package Basicos;
import java.util.Scanner;
public class SenhaFixa {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int senha;
		while(true) {
			senha = entrada.nextInt();
			if(senha!=2002) {
				System.out.print("Senha Invalida\n");
			}else {
				System.out.print("Acesso Permitido\n");
				break;
			}
		}

		entrada.close();
	}

}

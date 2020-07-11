package Basicos;

//Endereço:https://www.urionlinejudge.com.br/judge/pt/problems/view/1155
public class SequenciaS {

	public static void main(String[] args) {
		
		double fracao;
		double soma =0.0;	
		
		for (double i = 1.00; i <= 100.00; i++) {			
			fracao= 1.00/i;
			soma +=fracao;
		}
		System.out.printf("%.2f\n", soma);
	}

}

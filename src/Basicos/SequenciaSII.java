package Basicos;

//Endereço: https://www.urionlinejudge.com.br/judge/pt/problems/view/1156
public class SequenciaSII {

	public static void main(String[] args) {
		double fracao;
		double soma=0.0;
		for(double i=1.00, j=1.00 ; i<=39.00 ; i+=2.00, j*=2.00) {
			fracao=i/j;
			soma +=fracao;
		}
		System.out.printf("%.2f",soma);

	}

}

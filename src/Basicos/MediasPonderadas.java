package Basicos;

public class MediasPonderadas {

	public static void main(String[] args) {
		java.util.Scanner entrada=new java.util.Scanner(System.in);
		int n=entrada.nextInt();
				
		double media []=new double [n];

		double soma1=0;
		double soma2=0;
		double soma3=0;
		for (int i = 0; i < n; i++) {
			
					double numero1= entrada.nextDouble();
					soma1=numero1*2;
					double numero2=entrada.nextDouble();
					soma2=numero2*3;
					double numero3=entrada.nextDouble();
					soma3=numero3*5;					
					media[i]=(soma1+soma2+soma3)/10;
				}			
					
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f\n",media[i]);
			
		}

		entrada.close();
	}

}

package Basicos;

import java.io.IOException;
import java.util.Scanner; 
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double A;
        double B;
        double MEDIA; 
        
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(new Locale("en-US"));
        A=entrada.nextDouble();
        B=entrada.nextDouble();
        
        MEDIA = (A*3.5 + B*7.5)/11;
        
        System.out.printf(new Locale("en-US"),"MEDIA = %.5f" , MEDIA);
        
        entrada.close();
 
    }
 
}
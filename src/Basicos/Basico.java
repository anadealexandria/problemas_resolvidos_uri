package Basicos;
import java.util.Locale; 
import java.io.IOException;
import java.util.Scanner; 
public class Basico {
 
    public static void main(String[] args) throws IOException {
    	 int NUMBER;
         int HT;
         double H;
         double SALARY;
         
         Scanner entrada= new Scanner(System.in);
         entrada.useLocale(new Locale("en-US"));
         NUMBER=entrada.nextInt();
         HT=entrada.nextInt();
         H=entrada.nextDouble();
         
         SALARY = HT*H;
         
         System.out.println("NUMBER = " + NUMBER);
         System.out.printf(new Locale("en-US") ,"SALARY = U$ %.2f", SALARY);
         
         entrada.close();
        
        
        
    }
 
}

package primerpunto;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class clase1 {
    public static void main(String[] args){
    int num, cifra = 0, totalsum = 0, i = 0, r = 0;
    Scanner s = new Scanner(System.in);
    
    do{
        System.out.println("ingrese un numero");
        num = s.nextInt();
        
    }while(num <= 0);
        while(i < 15){
        while(num != 0){
            
            cifra = num % 10;
            totalsum = totalsum + (int)Math.pow(cifra, 2);
            num /= 10;
        }
        if(totalsum == 1){
        r = 1;
        i = 15;
        }else{
            num = totalsum;
            totalsum = 0;
            i = i + 1;
           }
        }
        if(r == 1){
        System.out.println("el numero ingresado es un numero feliz");
        }else{
            System.out.println("el numero ingresado es un numero triste");
        }
    }
}        
    

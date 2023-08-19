
package tercerpunto;
import java.util.Scanner;
public class clase3 {
    public static void main(String[] args){
        int n, num, cifra, inv = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("ingrese un numero positivo");
            n = s.nextInt();
        }while(n <= 0);
        num = n;
        while(num != 0){
            cifra = num % 10;
            inv = inv * 10 + cifra;
            num /= 10; 
        }
        if(n == inv){
            System.out.println(""+n+" es un numero palindromico");
        }else{
             System.out.println(""+n+" no es un numero palindromico");
        }
    }
}

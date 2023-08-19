
package quintopunto;
import java.util.Scanner;
public class clase5 {
    public static void main(String [] args){
        int lim;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese el limite de impresion");
        lim = s.nextInt();
        System.out.println("                "+1+"/"+1);
        for(int den = 1; den <= lim; den++){
            System.out.println(""+1+"/"+(1+den));
            
            
        }
        
    }
}

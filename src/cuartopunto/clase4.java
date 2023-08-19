
package cuartopunto;

import java.util.Scanner;
public class clase4 {
    public static void main(String[] args){
        int num, pa = 0, pac = 1, ps;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un numero de impresion");
        num = s.nextInt();
        for(int i = 0; i <= num-1; i++){
            ps = 2*(pac) + (pa);
            pa = pac;
            pac = ps;
         System.out.println(""+pa);
        }
    }
}

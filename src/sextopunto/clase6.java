
package sextopunto;
import java.util.Scanner;
public class clase6 {
    public static void main( String[] args){
        int n1, n2, cant, r = 0, suma;
        Scanner s = new Scanner(System.in);
        do{
        System.out.println("ingrese cuantos ejercicos quiere realizar");
        cant = s.nextInt();
        }while(cant <= 0);
        for(int i = 1; i <= cant; i++){
          n1 = (int) (Math.random()*999);
          n2 = (int) (Math.random()*999);
            System.out.print(""+n1+" + "+n2+" = ");
            r = s.nextInt();
            suma = n1 + n2;
            if(r == suma){
                System.out.println("correcto, el resultado es: "+suma);
            }else{
                System.out.println("incorrecto, el resultado de la suma era "+suma);
            }
        }
        
    }
}

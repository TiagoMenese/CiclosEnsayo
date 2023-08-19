
package segundopunto;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class clase2 {
    public static void main(String[] args){
        int tope, pri1 = 0,pri2 = 0, n,cont = 0;
        boolean primo;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("ingrese un numero positivo");
            tope = s.nextInt();
        }while(tope <= 0);
        
        for(int i = 3;i <= tope; i++ ){
            n = 2;
            primo = true; 
            
            while(primo == true && n < i){
                if(i % n == 0){
                    primo = false;
                }else{
                    n++;
                }
            }
            if(primo == true){
            cont = cont + 1;
            if(cont % 2 != 0){
                pri1 = i;
            }else if(cont % 2 == 0){
                pri2 = i;
            }
            if(Math.abs(pri1 - pri2)== 2){
                System.out.println("("+pri1+","+pri2+")");
                
            }
            
            
            
            }
           
        }
        
        
    
    }
        
}


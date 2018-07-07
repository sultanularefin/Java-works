/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mathwork;
import java.util.Scanner;
/**
 *
 * @author lab3pc18
 */
public class Mathwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  a;
        double b,Degree;
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        b=Math.sqrt(a);
        
        System.out.println(b);
        
        System.out.println(Math.ceil(b));
        System.out.println(Math.floor(b));    
        System.out.println(Math.round(b));
        Degree=sc.nextInt();
        System.out.println((Degree*Math.PI)/180.00);
        
        
        
        
    }

}

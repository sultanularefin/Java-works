/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package back_to_the_high_school;
import java.util.Scanner;
/**
 *
 * @author DREAM
 */
public class Back_To_the_High_school {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a,b,c;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()==true){
        a=sc.nextInt();
        b=sc.nextInt();
        c=2*(a*b);
       System.out.println(c);
    
    }

    }
}
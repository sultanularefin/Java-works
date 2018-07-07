/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package relationaloperators;
import java.util.Scanner;
/**
 *
 * @author DREAM
 */
public class Relationaloperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a,b,c,i;
    Scanner sc= new Scanner(System.in);
    c=sc.nextInt();
    for(i=0;i<c;i++)
    {
        a=sc.nextInt();
        b=sc.nextInt();
    if(a<b)System.out.println("<");
    else if(a>b)System.out.println(">");
    else if (a==b)System.out.println("=");
    }
  }
}
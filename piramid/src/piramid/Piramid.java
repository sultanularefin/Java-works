

package piramid;
import java.util.Scanner;
public class Piramid {
static int p,space;

static void a1()
{
  for(p=1;p<space;p++)   
   System.out.print(" ");
      space--;

}

 public static void main(String[] args) {
    
 int j,i,space;
       
Scanner sc=new Scanner(System.in);
        
i=sc.nextInt();
  
a1();
  for(j=1;j<=i;j++)
  {
      for(int k=0;k<j ;k++)
       	System.out.print(" *");
      	 System.out.print("\n");    
      	a1();
        
	}
     }
   }

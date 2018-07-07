
package matrix___multi;
import java.util.Scanner;
public class Matrix___MULTI {
    
    public static void main(String[] args) {
        
        int i,j;
        int [][] a=new int[5][3];
        int [][] b=new int[5][3];
        int [][] c=new int[5][3];
        Scanner sc=new Scanner(System.in);
    
     //1st matrix
        int r1, c1;
        System.out.println("1st matrix      =>");
        System.out.println("Enter number of rows: ");
       r1=sc.nextInt();
       System.out.println("Enter number of columns: ");
        c1=sc.nextInt();
       System.out.println("Now Enter 1st matrix: ");
        
        for( i=0;i<r1;i++){
         for ( j=0;j<c1;j++)
           a[i][j]=sc.nextInt();
         
        }
   // 2nd matrix
   int r2, c2;
      System.out.println("2nd matrix    => ");  
      System.out.println("Enter number of rows: ");
      r2=sc.nextInt();
      System.out.println("Enter number of columns: ");
      c2=sc.nextInt();
    System.out.println("Now Enter 2nd matrix: ");
     for( i=0;i<r2;i++){
         for ( j=0;j<c2;j++)
           b[i][j]=sc.nextInt();
    }
     
 System.out.println("Enter row and columb of 3rd matrix: ");  
   int r3,c3;  /* row collumn ulta-palta dile exception ..accha 0 kore dawa jai ki?
    *          
    */
   r3=sc.nextInt();
   c3=sc.nextInt();
  
  if(c1!=r2) {
      System.out.println("Cannot be multiplied");
    return ;
  }

 /* for( i=0;i<r3;i++){
        for( j=0;j<c3;j++)c[i][j]=0;
      }
   */
   System.out.println("Now Multiplying  these 2 matrix: ");
       for( i=0;i<r3;i++){
        for( j=0;j<c3;j++){        
           for(int k=0;k<r1;k++) 
              c[i][j]+=a[i][k]*b[k][j];
                            
           // c[i][j]+=a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0]; 
        }
       } 
               
  System.out.println("Here is the 3rd: ");
     for( i=0;i<r3;i++){
        for( j=0;j<c3;j++)
          System.out.print(c[i][j] +" ");
           System.out.print("\n");
   }
     
    }

}

        
      
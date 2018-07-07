

package matrix_2d;
import java.util.Scanner;

public class Matrix_2d {

    public static void main(String[] args) {
        
        int b,c;
        int [][] a=new int[5][3];
     
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter number of rows: ");
     b=sc.nextInt() ;
     System.out.println("Enter number of columns: ");
     c=sc.nextInt();   
     System.out.println("Now Enter the matrix");
     for(int i=0;i<b;i++){
         for (int j=0;j<c;j++)
           a[i][j]=sc.nextInt();
         
        }
   for(int i=0;i<b;i++){
        for(int j=0;j<c;j++)
            System.out.print(a[i][j] +" ");
            System.out.print("\n");
   }
     
    }

}

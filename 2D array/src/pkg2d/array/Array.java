package pkg2d.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        
        int tmp[][] = new int[3][3];
		int i,j;
		
		Scanner test=new Scanner(System.in);
		
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				System.out.print("Enter Input:");
				if(test.hasNextInt())
					tmp[i][j]=test.nextInt();	
			}
			
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(tmp[i][j] + " ");
				
			System.out.println();
		}

        
        
    }

}

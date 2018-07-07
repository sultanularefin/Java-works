package array.in.java;
import java.util.Scanner;
public class ArrayInJava {

      public static void main(String[] args) {
      
                int i,sum=0;
		float avg;
		
		int a[] = new int[5];
		
		Scanner test=new Scanner(System.in);
		
		System.out.println("Enter the input:");
		
		for(i=0;i<5;i++)
		{
			if(test.hasNextInt())
			{
				a[i]=test.nextInt();
				sum=sum+a[i];
			}
		}
		avg=sum/5;
		
		System.out.println("The average value is: " + avg);
         
    }

}

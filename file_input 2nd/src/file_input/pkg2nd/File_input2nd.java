package file_input.pkg2nd;
import java.io.*;
import java.util.*;

public class File_input2nd {

       public static void main(String[] args)throws IOException {
        
                 double i;
		 String str;
		 
	         FileReader fin = new FileReader("H:\\f_input.txt");
		
		 Scanner test = new Scanner(fin);
		
		 while(test.hasNext())
		 {
			if(test.hasNextDouble())
			{
				i=test.nextDouble();
				System.out.println("The number is:" + i);		
			}
			else
			{
			        str = test.next();
				System.out.println(str);
			}
		}
                fin.close();
                test.close(); 
    }

}



	
		
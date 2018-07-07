
package take.an.input.from.the.keyboard.pkg1;

import java.util.*;

public class TakeAnInputFromTheKeyboard1 {

   
    public static void main(String args[]) {
       
	int value;
   System.out.println("Enter an Integer number:"); 	
	Scanner tmp = new Scanner(System.in);
	if(tmp.hasNextInt())
    {
		value=tmp.nextInt();	
	       System.out.println("You have entered: "+value);
    }
	else
		System.out.println("Not an Integer");
        }	

    }



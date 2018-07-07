package taking.input.from.the.keyboard.pkg2;
import java.util.*;

public class TakingInputFromTheKeyBoard2 {

        public static void main(String[] args) {
        
            Scanner tmp = new Scanner(System.in);
		float i;
		
		while(tmp.hasNextFloat())
		{
                    i=tmp.nextFloat();
                    System.out.println("The Number: " + i);

                     }

        }
}

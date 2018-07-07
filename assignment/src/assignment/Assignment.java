

package assignment;
import java.util.Random;

public class Assignment {

      public static void main(String[] args) {
       
        double a=56.34,b=6.58334,c=-34.4265;
        
                Random r = new Random();
                
                float v;
                v=r.nextFloat();
                System.out.println(v);
                System.out.println(Math.abs(c));
                System.out.println(Math.sqrt(a));    
                System.out.println((a>b)?a:b);    
                System.out.println(Math.max(a, b));
                System.out.println(Math.pow(a, b)); 
                //336045152154.06580219748460775157
                System.out.println(Math.round(a));
                System.out.println(Math.sqrt((a*a+b*b)));
                System.out.println("floor  & Ceil & round of b and c");
                System.out.println(Math.floor(b));
                System.out.println(Math.ceil(b));
                System.out.println(Math.round(b)); 
                System.out.println(Math.floor(c));
                System.out.println(Math.ceil(c));
                System.out.println(Math.round(c));
                System.out.println((a*Math.PI)/180.00);
                System.out.println(Math.sin(a));
    }
}

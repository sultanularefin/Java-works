package modifiing.strings;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class ModifiingStrings {
enum Apple {
        Jonathan, GoldenDel, RedDel, Winesap, Cortland
        }
    
    public static void main(String[] args) {
        
        
        char chars[]={'a','b','c'};
        char pars[] = {'a','b','c','d','e','f'};
        String p=new String (pars,2-2,3+3);
        System.out.println(p);
        String s=new String(chars);
        System.out.println(s);
        char c[] = {'j', 'a', 'v', 'a'};
        String s1 = new String (c);
        String s2 = new String (s1);
        System.out.println (s1);
        System.out.println(s2);
        byte ascii [] = {65, 66, 67, 68, 69, 70};
        String s3 = new String (ascii);
        System.out.println ( s3);
        String s4 = new String ( ascii, 2, 3);
        System.out.println ( s4);
        char st [] = {'a', 'b', 'c'};
        String a = new String (st);
        System.out.println ( a.length());
        String s5 = "abcd";
        
        System.out.println ("RPG". length());
        System.out.println (s5. length());
        String age = "9";
	String s6 = "He is "  + age + " years old.";
	System.out.println (s6);
        int years=9;
        System.out.println("He is " + years + " year old.");
        Apple ap;
        System.out.println("Here are all Apple constants:");
        // use values()
        Apple allapples[] = Apple.values();
        for(Apple A : allapples)
        System.out.println(A);
        System.out.println();
        // use valueOf()
        
        ap = Apple.valueOf("Winesap");
        System.out.println(ap);
        System.out.println("ap contains " + ap);
        
                        }
   }



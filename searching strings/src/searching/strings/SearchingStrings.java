package searching.strings;

public class SearchingStrings {

        public static void main(String[] args) {
        
            
            String s = "This is a Java program. isn't it a easy program ? ";
	System.out.println(s.indexOf( 'J')); 
        System.out.println(s.indexOf( 'a'));
        System.out.println(s.lastIndexOf( 'm'));
        System.out.println(s.lastIndexOf( ""));
        System.out.println(s.lastIndexOf( " "));
	System.out.println(s.indexOf( "Program"));
        System.out.println(s.indexOf( "is"));
	System.out.println(s.indexOf( 'a', 5));
        System.out.println(s.indexOf( 'a', 9));
        System.out.println(s.indexOf( 'J'));
        System.out.println(s.indexOf( "program", 4));
        System.out.println(s.indexOf( "program", 14));
        System.out.println(s.indexOf( 'p'));
        System.out.println(s.indexOf( "program", 16));
        System.out.println(s.lastIndexOf( "program", 40));
        System.out.println(s.substring(04,40));
        
    }

}

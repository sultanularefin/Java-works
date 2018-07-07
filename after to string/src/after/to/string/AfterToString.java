package after.to.string;
class tt				
	{
		int a;
		tt() { a=100;}
		public String toString()
		{
			return "a= "+a;
		}
	}

public class AfterToString {

    
    public static void main(String[] args) {
        tt b = new tt();
       System.out.println(b);
        char ch;
        ch = "abc".charAt(1);	
        System.out.println(ch);
        System.out.println(ch+0);
        System.out.println(--ch);
        System.out.println(ch+5);
        String s = "abcdefghijklmnop";
        int start =1, end = 14;
        char st [] = new char [end-start];
        s.getChars (start, end, st, 0);
        System.out.println(st);
        String a1="abc";
        String a2="def";
        System.out.println(a1.equals(a2));
        String s1 = "HELLO Dunya";
        String s2 = "HELLO Dunya";
        String s3 = "hello";
	String s4 = new String(s3);
	System.out.println(s1 + " equals "+s2 + "  "+ s1.equals(s2));
	System.out.println(s1 + " equals "+s2 + " "+ (s1==s2));

        System.out.println ( s1 + " equals  " + s2  +": "+ s1.equals(s2));
        System.out.println ( s1 + " equals  " + s2  +": "+ s1.equalsIgnoreCase(s2));
        System.out.println(s1.regionMatches(true,0, s2, 0, 10));
        System.out.println("Football". endsWith ( "ball"));   
	System.out.println("Football". startsWith ("wood"));
        System.out.println(s1.compareTo(s2));

    }

}

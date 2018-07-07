package tyepconversion;

public class Tyepconversion {

       public static void main(String[] args) {
          
		byte b;
		int i = 257;
		double d = 323.142;
		b=(byte)i;
		System.out.println ("Conversion of int to byte: " + i +" "+ b);
		i = (int)d;
		System.out.println("Conversion of double to int: " +d+" "+i);
		b=(byte)d;
		System.out.println("Conversion of double to byte: " +d+" "+b);
                 byte a =40;
                 b= 50;
                 byte c =100;
                 int de;
                 de = a * b /c;
                 System.out.println(" de: =>   " + de);
                 byte byt =50 ;
                 byt = (byte)(byt * 6);
                 System.out.println(" byt   =>" +byt);
                 
                 
                       }
}

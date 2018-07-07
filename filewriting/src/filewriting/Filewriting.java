
package filewriting;
import java.util.Scanner;
import java.io.*;
public class Filewriting {

      public static void main(String[] args)throws IOException{
       FileWriter fout = new FileWriter("H:\\test1.txt");
	fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
	fout.close();

    }

}

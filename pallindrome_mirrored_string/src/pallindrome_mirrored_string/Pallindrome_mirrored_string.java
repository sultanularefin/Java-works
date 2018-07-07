
package pallindrome_mirrored_string;
import java.util.Scanner;

public class Pallindrome_mirrored_string {
    
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String mir1="AEHIJLMOSTUVWXYZ12358";
        String mir2="A3HILJMO2TUVWXY51SEZ8";
        boolean NP,RP,MP,MS; //NP=Not Poly RP=Regular Poly
        //MP=Mirror Poly  MS=Mirror String
        String hasil;
        while(s.hasNext()){
            //if(s.hasNextLine()) System.out.println("Pindah baris");
            String asli=s.nextLine();         
            String kata=asli;
            kata.replaceAll("0", "0");
            int i=0,k,N=kata.length();
            k=N/2;
            int l=-1,m=-1;
            if(N%2==0) k++;
            MP=true;
            RP=true;
            NP=true;
            MS=true;
            while((i<=k)){
                l=mir1.indexOf(kata.charAt(i));
                m=mir2.indexOf(kata.charAt(N-i-1));
                if(((kata.charAt(i)==kata.charAt(N-i-1)))&&((MP==true)||(RP==true))){                   
                    MP=false;
                    RP=true;
                    if((l>=0)&&(m>=0)){
                        if(mir1.charAt(l)==mir2.charAt(m)){
                            MP=true;                       
                        }
                    }                       
                }else{
                    MP=false;
                    RP=false;
                    if((l>=0)&&(m>=0)){
                        if((mir1.charAt(l)==mir2.charAt(m))&&(MS==true)){
                            MS=true;                       
                        }
                    }else{
                        MS=false;
                    }
                }
                i++;
            }
            System.out.print(asli+" -- ");
            if(MP==true){
                System.out.println("is a mirrored palindrome");
            }else if(RP==true){
                System.out.println("is a regular palindrome");
            }else if(MS==true){
                System.out.println("is a mirrored string");
            }else{
                System.out.println("is not a palindrome");
            }
        }
    }
}
            
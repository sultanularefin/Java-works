/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pallindrome.and.shiplu.sir;

/**
 *
    * @author DREAM
 */
public class PALLINDROMEANDSHIPLUSIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String s="abcddcEba";
    int k=s.length()-1;
    int f=0;    
    for(int i=0;i<s.length()/2;) { 
    if(s.charAt(i)==s.charAt(k))
    {
        i++;
        k--;
    }
    else {
            System.out.println("No");
            f=1;
            break;
        }
    }
    if(f==0)System.out.println("Yes");
 }
} 



    



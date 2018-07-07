/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author DREAM
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s="abcdefghijjjihgfedcba";
      int j=0;
      int k=s.length()-1;
      int f=0;
      for(int i=0;i<s.length()/2;i++)
      {    
          if(s.charAt(j)==s.charAt(k))
                {
                    j++;
                    k--;
                }
          else{
              System.out.print("NO\n");
              f=1;
              break;
              }
      
      }   
          
          if(f==0)System.out.print("Yes\n");
      
              
                
        
        
        // TODO code application logic here
    }

}

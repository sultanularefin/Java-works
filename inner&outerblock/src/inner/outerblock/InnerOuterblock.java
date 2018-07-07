/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inner.outerblock;

/**
 *
 * @author DREAM
 */
public class InnerOuterblock {

    /**
     * @param args the command line arguments
     */
   public static void main( String args[])
{
	int x =10;
	if ( x == 10)
	{
		int y =20;
		System.out.println("x and y: " +x + "  "+y);
		x= y * 2;
	}
	y= 100;
	System.out.println ("x is "+x);
  }
}
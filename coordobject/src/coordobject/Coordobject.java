/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coordobject;

/**
 *
 * @author DREAM
 */
 class Point {
	int xCoord;
	int yCoord;
	Point( ) {
		xCoord = 0;
		yCoord = 0;
	}
	int currentX( ) {
		return xCoord;
	}
	int currentY( ) {
		return yCoord;
	}
	void move (int newXCoord, int newYCoord) {
                xCoord = newXCoord;
		yCoord = newYCoord;

	}
}

public class Coordobject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Point ob=new Point();
       ob.move(4,5);
       System.out.println(ob.currentX());
       System.out.println(ob.currentY());
    }

}



package boxdemo;
class Box
{
	double width;
	double height;
	double depth;
}

public class BoxDemo {

    
    public static void main(String[] args) {
                Box mybox, mybox1;
		mybox = new Box();
		mybox1 = new Box();
		
		mybox.width=10;
		mybox.height = 20;
		mybox. depth = 15;

		mybox1.width = 10;
		mybox1.height = 25;
		mybox1.depth=5;
System.out.println(mybox);
System.out.println(mybox1);            
    }

}

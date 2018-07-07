/* 

Open it with Notepad ++ 

or codeblocks 
*/



package hello_but;
import javax.swing.*;

        public class Hello_but {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
        {
                JFrame frame = new JFrame("First Swing Program");
                JPanel panel = new JPanel();
                JButton button = new JButton("Hello World");

                frame.setContentPane(panel);
                panel.add(button);

                frame.setSize(500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
        }

}

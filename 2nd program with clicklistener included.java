/* 

Open it with Notepad ++ or codeblocks */
package jframe.pkg2;
import javax.swing.*;
import  java.awt.event.*;


class clicklistener implements ActionListener
{
        public void actionPerformed(ActionEvent e)
        {
                System.out.println("I was clicked.");
        }
}

public class Jframe2 {

      public static void main(String[] args) {
        // TODO code application logic here
       
        JFrame frame=new JFrame("Test Window");
        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        JButton button = new JButton("Hello World");
        frame.setContentPane(panel);
        panel.add(button);
                      
        ActionListener listener = new clicklistener(); 
        button.addActionListener(listener);
        JLabel label=new JLabel();
        label.setSize(200,200);
        label.setText("My label");
        panel.add(label);
        frame.setContentPane(panel);
       // panel.add(arefin.add(frame));
        frame.setVisible(true);
        

        
    }

}

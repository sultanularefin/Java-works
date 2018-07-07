/* 

Open it with Notepad ++ or codeblocks */

package jlabel.pkg3;

import javax.swing.*;
import  java.awt.event.*;
import java.awt.*;

public class Jlabel3 {

    
    public static void main(String[] args) {
           
         
        JFrame frame=new JFrame("Test Window");
        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        JButton button = new JButton("Hello World");
        frame.setContentPane(panel);
        panel.add(button,BorderLayout.SOUTH);
        final JLabel label=new JLabel();
                      
                      label.setSize(200,200);
        label.setText("My label");
        panel.add(label,BorderLayout.NORTH);
       final JTextField txt=new JTextField();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicke!!");
                String s=txt.getText();
                label.setText(s);
            }
        
        });
        
        panel.add(txt,BorderLayout.CENTER);
        
        
        
        frame.setContentPane(panel);
        frame.setVisible(true);
        

        
    }

}

        
        
    



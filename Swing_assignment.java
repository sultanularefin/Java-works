/* Roll 11 20 10 31 
	swing assignment 
	open it with notepad ++.
	*/

package swing_assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swing_assignment {
 
        JLabel label=new JLabel();
           
    public JMenuBar createmenubar(){         
  
  JMenuBar menubar=new JMenuBar();   
  JMenu File=new JMenu("File");
  JMenu Tools=new JMenu("Tools");
  File.setMnemonic(KeyEvent.VK_F);
  Tools.setMnemonic(KeyEvent.VK_T);
 // File.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
  menubar.add(File);
  menubar.add(Tools);
  JMenuItem save_as=new JMenuItem("Save as",KeyEvent.VK_S);
  JMenuItem save =new JMenuItem("Save",KeyEvent.VK_V);
  JMenuItem Exit =new JMenuItem("Exit",KeyEvent.VK_E);
  
  save_as.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae) {
          label.setText("save_as was pressed");
      }
    
  });
  save.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae) {
          label.setText("save was pressed");
      }
    
  });
  Exit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae) {
          label.setText("Exit was pressed");
      }
    
  });
  File.add(save_as);
  File.addSeparator();
  File.add(save);
  File.addSeparator();
  File.add(Exit);
  return menubar;
   
    }
   
    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true); 
        
        //Add the text area to the content pane.
     
        contentPane.add(label,BorderLayout.EAST);
        return contentPane;
    }
  private static void createAndShowGUI() {
       JFrame frm=new JFrame("Arefin");
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Swing_assignment demo = new Swing_assignment ();
        frm.setJMenuBar(demo.createmenubar());
        frm.setContentPane(demo.createContentPane());

        //Display the window.
        frm.setSize(450, 260);
        frm.setVisible(true);
     
  }
   
public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
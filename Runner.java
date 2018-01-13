import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
 
public class Runner { 
 
    public static void main(String args[]){
 
        JFrame frame = new JFrame("Contact Manager");


		
        Screen sc = new Screen();
        frame.add(sc);
		
          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		
        Phone canvas = new Phone();
        frame.add(canvas);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		


 

          
    }
}  
//END OF RUNNER

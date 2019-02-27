package gui;

//import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * This class is the graphical user interface for the system
 */
public class Gui extends JFrame 
{
	/**
     * This constructor accepts as arguments the other panels and 
     * initializes the frame
     */
    public Gui(JPanel panel1)
    {
    	JFrame window = new JFrame();
        window.setTitle("HMS");
        //window.addKeyListener(listener);
        window.setResizable(true);
        window.setSize(1920, 1080);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add panels
        window.getContentPane().add(panel1);
       
       
        //set visibility
        panel1.setVisible(true);
       
            
        window.setVisible(true);
        
    }
}
     
    
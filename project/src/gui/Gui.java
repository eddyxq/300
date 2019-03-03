package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * This class is the graphical user interface for the system.
 */
public class Gui extends JFrame 
{
	/**
     * This constructor accepts as arguments the other panels and 
     * initializes the frame
     */
    public Gui(JPanel loginP, JPanel amP, JPanel avaP, JPanel pmP, JPanel addPP,
    		JPanel piP, JPanel plP)
    {
    	JFrame window = new JFrame();
        window.setTitle("HMS");
        window.setResizable(true);
        window.setSize(1920, 1080);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add panels
        window.getContentPane().add(loginP);
        window.getContentPane().add(amP);
        window.getContentPane().add(avaP);
        window.getContentPane().add(pmP);
        window.getContentPane().add(addPP);
        window.getContentPane().add(piP);
        window.getContentPane().add(plP);
       
        //set visibility
        loginP.setVisible(false);
        amP.setVisible(false);
        avaP.setVisible(false);
        pmP.setVisible(false);
        addPP.setVisible(false);
        piP.setVisible(false);
        plP.setVisible(false);
         //For if want to start Full-Screen
//       window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//       window.setUndecorated(true);    
        
        window.setVisible(true);
        
    }
}
     
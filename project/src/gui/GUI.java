package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * This class is the graphical user interface for the system.
 */
public class GUI extends JFrame 
{
	private static final long serialVersionUID = 1L;

	/**
     * This constructor accepts as arguments the other panels and 
     * initializes the frame
     */
    public GUI(JPanel loginP, JPanel amP, JPanel avaP, JPanel pmP, 
    		   JPanel addPP, JPanel piP, JPanel plP, JPanel aaP, JPanel asP,
    		   JPanel smP, JPanel slP, JPanel uNpP, JPanel uNpAP, JPanel salP)
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
        window.getContentPane().add(aaP);
        window.getContentPane().add(asP);
        window.getContentPane().add(smP);
        window.getContentPane().add(slP);
        window.getContentPane().add(uNpP);
        window.getContentPane().add(uNpAP);
        window.getContentPane().add(salP);
        //set visibility
        loginP.setVisible(false);
        amP.setVisible(false);
        avaP.setVisible(false);
        pmP.setVisible(false);
        addPP.setVisible(false);
        piP.setVisible(false);
        plP.setVisible(false);
        aaP.setVisible(false);
        asP.setVisible(false);
        smP.setVisible(false);
        slP.setVisible(false);
        uNpP.setVisible(false);
        uNpAP.setVisible(false);
        salP.setVisible(false);
        //if want to start Full-Screen uncomment below
		//window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//window.setUndecorated(true);    
        
        window.setVisible(true);
    }
}
     
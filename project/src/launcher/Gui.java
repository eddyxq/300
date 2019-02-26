package launcher;

import java.awt.event.KeyListener;
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
    public Gui(JPanel addPatientPanel)
    {
    	JFrame window = new JFrame();
        window.setTitle("HMS");
        //window.addKeyListener(listener);
        window.setResizable(true);
        window.setSize(1920, 1080);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add panels
        window.getContentPane().add(addPatientPanel);
        /*
        window.getContentPane().add(startingScene);
        window.getContentPane().add(gameInterface);
        window.getContentPane().add(battleInterface);
        window.getContentPane().add(inventoryInterface);
        window.getContentPane().add(endingScene);
        window.getContentPane().add(victoryScene);
        window.getContentPane().add(textBox);
        */
        
        //textBox.setLocation(5,650);
        
        addPatientPanel.setVisible(true);
        //set visibility
        /*
        gameInterface.setVisible(false);
        battleInterface.setVisible(false);
        inventoryInterface.setVisible(false);
        endingScene.setVisible(false);
        victoryScene.setVisible(false);
        textBox.setVisible(false);
        */
                       
        window.setVisible(true);
        
    }
}
     
    
package display;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TempAddPatient extends JPanel {
	
	private ImageIcon BG_Icon = new ImageIcon(new ImageIcon("src/graphics/background.png").getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
	private JLabel background;
	
	/**
	 * Create the panel.
	 */
	public TempAddPatient() {
		
		JPanel addPatient = new JPanel();
		addPatient.setLayout(null);
		addPatient.setSize(1920, 1080);
		
		setBackground();
		
	}
	
	
	private void setBackground() 
	{
		background.setIcon(BG_Icon);
		background.setBounds(0,0,1920,1080);
	}

}

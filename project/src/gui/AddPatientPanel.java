package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * This class is a test panel
 */
public class AddPatientPanel 
{
	private JLabel background;
	
	private ImageIcon BG_Icon = new ImageIcon(new ImageIcon("src/graphics/background.png").getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel()
	{
		JPanel addPatients = new JPanel();
		addPatients.setLayout(null);
		addPatients.setBounds(0, 0, 1920, 1080);

		addPatients.add(getBackground());
		
		return addPatients;
	}
	
	
	private JLabel getBackground() 
	{
		background = new JLabel();
		background.setIcon(BG_Icon);
		background.setBounds(0,0,1920,1080);
		return background;
	}
}

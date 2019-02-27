package gui;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel {
	private JLabel background;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private ImageIcon BG_Icon = new ImageIcon(new ImageIcon("src/graphics/login_background.png").getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT));
	
	
	public JPanel createPanel()
	{
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBounds(0, 0, 1920, 1080);
		
		
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(bArial);
		btnAdmin.setBounds(500, 847, 211, 111);
		
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.setFont(bArial);
		btnPatient.setBounds(1137, 847, 211, 111);
		
		
		//Adding Components 
		loginPanel.add(btnAdmin);
		loginPanel.add(btnPatient);
		loginPanel.add(getBackground());
		
		return loginPanel;
	}
	
	private JLabel getBackground()
	{
		background = new JLabel();
		background.setIcon(BG_Icon);
		background.setBounds(0, 0, 1920, 1080);
		return background;
	}
	
	
}

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
public class TestPanel 
{
	private JLabel testlabel = new JLabel();
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel()
	{
		JPanel battlePanel = new JPanel();
		battlePanel.setLayout(null);
		battlePanel.setBackground(Color.BLACK);
		battlePanel.setBounds(0, 0, 1920, 1080);

		
		testlabel.setBounds(400,350,300,100);
		testlabel.setFont(new Font("info", Font.PLAIN, 18));
		testlabel.setForeground(Color.RED);
		
		
		battlePanel.add(testlabel);
		
		return battlePanel;
	}
}

package launcher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddPatientPanel 
{
	
//	private JLabel enemyStatistics = new JLabel();
//	private JLabel playerStatistics = new JLabel();
//	private JLabel battleResults = new JLabel();
//	private JLabel background;
//	private JLabel playerLB = new JLabel();
//	private JLabel enemyLB = new JLabel();
//	private ImageIcon player_Icon = new ImageIcon(new ImageIcon("src/graphics/player.gif").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
//	private ImageIcon BG_Icon = new ImageIcon(new ImageIcon("src/graphics/backgroundPH.gif").getImage().getScaledInstance(700, 350, Image.SCALE_DEFAULT));
//	private ImageIcon enemy_Icon;
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel()
	{
		
		JPanel addPatient = new JPanel();
		addPatient.setLayout(null);
		addPatient.setBackground(Color.BLACK);
		addPatient.setBounds(0, 0, 1920, 1080);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCancel.setBounds(586, 267, 89, 23);
		addPatient.add(btnCancel);
		/*
		enemyStatistics.setBounds(400,350,300,100);
		enemyStatistics.setFont(new Font("info", Font.PLAIN, 18));
		enemyStatistics.setForeground(Color.RED);
		
		playerStatistics.setBounds(50,350,300,100);
		playerStatistics.setFont(new Font("info", Font.PLAIN, 18));
		playerStatistics.setForeground(Color.RED);
		
		battleResults.setBounds(50,400,300,200);
		battleResults.setFont(new Font("info", Font.PLAIN, 18));
		battleResults.setForeground(Color.RED);
		battleResults.setVisible(false);
		
		battlePanel.add(enemyLB);
		battlePanel.add(playerLB);
		battlePanel.add(getBackground());
		battlePanel.add(playerStatistics);
		battlePanel.add(enemyStatistics);
		battlePanel.add(battleResults);
		*/
		return addPatient;
	}

}

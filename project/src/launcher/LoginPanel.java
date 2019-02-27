package launcher;

import java.awt.Color;

import javax.swing.JPanel;

public class LoginPanel {

	public JPanel createPanel()
	{
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBackground(Color.BLACK);
		loginPanel.setBounds(0, 0, 1920, 1080);
		
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
		return loginPanel;
	}
	
}

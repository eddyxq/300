package launcher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * This class is a panel that displays the battle scenes
 */
public class AddPatientPanel 
{
	private JLabel enemyStatistics = new JLabel();
	private JLabel playerStatistics = new JLabel();
	private JLabel battleResults = new JLabel();
	private JLabel background;
	private JLabel playerLB = new JLabel();
	private JLabel enemyLB = new JLabel();
	private ImageIcon player_Icon = new ImageIcon(new ImageIcon("src/graphics/player.gif").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
	private ImageIcon BG_Icon = new ImageIcon(new ImageIcon("src/graphics/backgroundPH.gif").getImage().getScaledInstance(700, 350, Image.SCALE_DEFAULT));
	private ImageIcon enemy_Icon;
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel()
	{
		JPanel battlePanel = new JPanel();
		battlePanel.setLayout(null);
		battlePanel.setBackground(Color.BLACK);
		battlePanel.setBounds(0, 0, 1920, 1080);

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
		return battlePanel;
	}

}

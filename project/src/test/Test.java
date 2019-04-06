package test;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JPanel {

	/**
	 * Create the panel.
	 */
	public Test() {
		setBounds(0, 0, 1920, 1080);
		setLayout(null);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(70, 980, 169, 59);
		add(btnReturn);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1920, 1080);
		label.setIcon(new ImageIcon(Test.class.getResource("/graphics/departmentStats_backgrounds.png")));
		add(label);
	}
}

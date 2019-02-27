package gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * This class is a test panel
 */
public class EmployeeManagementMenu
{
	//private JLabel testlabel = new JLabel();
	/**
	 * This method creates and returns a JPanel
	 * @wbp.parser.entryPoint
	 */
	public JPanel createPanel()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(12, 5, 720, 480);
		
		//add(panel);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		JButton btnNewButton = new JButton("Add a New Employee");
		btnNewButton.setBounds(125, 21, 200, 50);
		panel.add(btnNewButton, gbc);
		
		JButton btnNewButton_1 = new JButton("View Employee");
		btnNewButton_1.setBounds(125, 58, 200, 50);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1, gbc);
		
		JButton button = new JButton("Edit Employee");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(125, 95, 200, 50);
		panel.add(button, gbc);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		return panel;
	}
}

package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import system.Hospital_Management_System;
import testing.TestPanel;

public class UsernameNPasswordPanel
{
	/*
	 * This class is a panel which allows the user to login to the system.
	 */
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTextField tfUsername;
	private JTextField tfPassword;
	
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel uNPAPanel = new JPanel();
		uNPAPanel.setLayout(null);
		uNPAPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(UsernameNPasswordPanel.class.getResource("/graphics/UnP_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		JLabel lbUsername = new JLabel("Username:");
		lbUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbUsername.setBounds(711, 423, 280, 32);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbPassword.setBounds(711, 534, 280, 32);
		/*
		 * LOGIN BUTTON
		 */
		JButton btnLogin = new JButton("Login as staff");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogin.setBounds(854, 675, 225, 71);
		/*
		 * USERNAME TEXTFIELD
		 */
		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tfUsername.setBounds(711, 466, 518, 38);
		tfUsername.setColumns(10);
		/*
		 * PASSWORD TEXTFIELD
		 */
		tfPassword = new JTextField();
		tfPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tfPassword.setColumns(10);
		tfPassword.setBounds(711, 577, 518, 38);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Cancel");
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				hms.displayLoginPage();
			}
		});
		btnReturn.setBounds(854, 928, 225, 71);
		//add all the components to panel
		uNPAPanel.add(lbUsername);
		uNPAPanel.add(lbPassword);
		uNPAPanel.add(btnReturn);
		uNPAPanel.add(btnLogin);
		uNPAPanel.add(tfUsername);
		uNPAPanel.add(tfPassword);
		uNPAPanel.add(lblBackground);
		
		return uNPAPanel;
	}
}

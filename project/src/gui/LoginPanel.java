package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.TextReader;
import system.Hospital_Management_System;

public class LoginPanel
{
	/*
	 * This class is a panel which allows the user to login to the system.
	 */
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTextField tfUsername;
	private JPasswordField passwordField;
	
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel uNPAPanel = new JPanel();
		uNPAPanel.setLayout(null);
		uNPAPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(LoginPanel.class.getResource("/graphics/UnP_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		JLabel lbUsername = new JLabel("Username:");
		lbUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbUsername.setBounds(711, 423, 280, 32);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbPassword.setBounds(711, 534, 280, 32);
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
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passwordField.setColumns(10);
		passwordField.setBounds(711, 577, 518, 38);
		/*
		 * LOGIN BUTTON
		 */
		JButton btnLogin = new JButton("Login as staff");
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String response = new TextReader().checkCredentials(tfUsername.getText(), new String(passwordField.getPassword()));
				
				if(response == "valid_a")
				{
					hms.displayAdminMainPage();
				}
				else if (response == "valid_e")
				{
					hms.displayEmployeeMainPage();
				}
				else
				{
					Object[] options = {"Close"};
					JOptionPane.showOptionDialog(null, "You have entered incorrect username or password.", "Error",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
					null, options, options[0]);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogin.setBounds(854, 675, 225, 71);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Cancel");
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				hms.displayHomePage();
			}
		});
		btnReturn.setBounds(854, 928, 225, 71);
		//add all the components to panel
		uNPAPanel.add(lbUsername);
		uNPAPanel.add(lbPassword);
		uNPAPanel.add(btnReturn);
		uNPAPanel.add(btnLogin);
		uNPAPanel.add(tfUsername);
		uNPAPanel.add(passwordField);
		uNPAPanel.add(lblBackground);
		
		return uNPAPanel;
	}
}

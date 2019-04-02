import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Test extends JPanel {

	/**
	 * Create the panel.
	 */
	public Test() {
		setBounds(0, 0, 1920, 1080);
		setLayout(null);
		
		JButton btnManagePatient = new JButton("Manage Patient Records");
		btnManagePatient.setBounds(785, 394, 400, 59);
		btnManagePatient.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnManagePatient);
		
		JButton button = new JButton("Manage Patient Records");
		button.setFont(new Font("Arial", Font.BOLD, 16));
		button.setBounds(785, 588, 400, 59);
		add(button);
		
		JButton button_1 = new JButton("Manage Patient Records");
		button_1.setFont(new Font("Arial", Font.BOLD, 16));
		button_1.setBounds(785, 770, 400, 59);
		add(button_1);
		
		JButton button_2 = new JButton("Manage Patient Records");
		button_2.setFont(new Font("Arial", Font.BOLD, 16));
		button_2.setBounds(785, 944, 400, 59);
		add(button_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		lblNewLabel.setIcon(new ImageIcon(Test.class.getResource("/graphics/Admin_background.png")));
		add(lblNewLabel);
	}
}

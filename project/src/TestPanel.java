import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestPanel extends JPanel {
	private String[] departmentList = {"General Pracitioner", "Operation Staff", "Physician", "Surgeon"};
	private String[] practioners = {"Doctor Strange", "Doctor Who"};
	private String[] surgeons = {"surgeon1, surgeon2"};
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		textField = new JTextField();
		textField.setBounds(841, 454, 438, 50);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(841, 578, 438, 50);
		add(textField_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/patientID_background.png")));
		label.setBounds(0, 0, 1920, 1080);
		add(label);

	}
}

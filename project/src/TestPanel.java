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
	private JComboBox comboBox_doc = new JComboBox(practioners);
	JLabel label_1 = new JLabel("1");
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit");
				label_1.setText("Submit");
				updateComponent();
			}
		});
		btnNewButton.setBounds(383, 942, 400, 59);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(1133, 942, 400, 59);
		add(btnNewButton_1);
		
		JComboBox comboBox_dep = new JComboBox(departmentList);
		comboBox_dep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = (String)comboBox_dep.getSelectedItem();
				if (selected.equals("Surgeon")) {
					System.out.println("Surgeon Selected");
					updateComponent();
				}
			}
		});
		comboBox_dep.setBounds(581, 540, 202, 20);
		add(comboBox_dep);
		comboBox_doc.setBounds(1060, 540, 172, 20);
		add(comboBox_doc);
		
		
		label_1.setBounds(920, 410, 46, 80);
		add(label_1);
		
		JLabel lblDoctors = new JLabel("Doctors");
		lblDoctors.setBounds(1060, 505, 152, 21);
		add(lblDoctors);
		
		JLabel lbDepartment = new JLabel("Department");
		lbDepartment.setBounds(581, 505, 306, 24);
		lbDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbDepartment);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/addDepartment_background.png")));
		label.setBounds(0, 0, 1920, 1080);
		add(label);

	}
	
	public void updateComponent(){
		add(comboBox_doc);
		add(label_1);
	}
}

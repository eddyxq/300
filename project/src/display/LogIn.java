package display;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import system.Hospital_Management_System;

public class LogIn {

	private JFrame frame;
	Hospital_Management_System hms;

	/**
	 * Launch the application.
	 */
	public void start(Hospital_Management_System h) {
		this.hms = h;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn(h);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public LogIn(Hospital_Management_System h) {
		this.hms = h;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 406);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
		    	hms.start();
		    }
			
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 478, 80);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Hospital Manegment System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 80, 478, 278);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.setCurrentPage("Admin Portal");
				frame.dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Patient");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.setCurrentPage("Patient Portal");
				frame.dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Employee");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.setCurrentPage("Employee Portal");
				frame.dispose();
			}
		});
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(238)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addComponent(btnNewButton)
					.addGap(50)
					.addComponent(btnNewButton_2)
					.addGap(42)
					.addComponent(btnNewButton_1)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}

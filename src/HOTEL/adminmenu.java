package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class adminmenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminmenu window = new adminmenu();
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
	public adminmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 904, 394);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminMenu = new JLabel("Admin Menu");
		lblAdminMenu.setForeground(Color.WHITE);
		lblAdminMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAdminMenu.setBounds(126, 114, 172, 37);
		frame.getContentPane().add(lblAdminMenu);
		
		JButton btnFoodBilling = new JButton("FOOD BILLING");
		btnFoodBilling.setBackground(Color.YELLOW);
		btnFoodBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				foodbilling.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnFoodBilling.setBounds(35, 174, 157, 31);
		frame.getContentPane().add(btnFoodBilling);
		
		JButton btnNewButton = new JButton("CUSTOMER FEEDBACK");
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				cstfeedback.setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 233, 157, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCustomerDetails = new JButton("CUSTOMER DETAILS");
		btnCustomerDetails.setBackground(new Color(0, 255, 255));
		btnCustomerDetails.setForeground(new Color(0, 0, 0));
		btnCustomerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				customerdetails.setVisible(true);
			}
		});
		btnCustomerDetails.setBounds(230, 174, 157, 31);
		frame.getContentPane().add(btnCustomerDetails);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(230, 291, 157, 31);
		frame.getContentPane().add(btnBack);
		
		JButton btnDeleteRooms = new JButton("DELETE ROOMS");
		btnDeleteRooms.setBackground(new Color(124, 252, 0));
		btnDeleteRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				deleteroom.setVisible(true);
			}
		});
		btnDeleteRooms.setBounds(35, 291, 157, 31);
		frame.getContentPane().add(btnDeleteRooms);
		
		JButton btnAddRooms = new JButton("ADD ROOMS");
		btnAddRooms.setBackground(new Color(255, 165, 0));
		btnAddRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addrooms.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAddRooms.setBounds(230, 233, 157, 31);
		frame.getContentPane().add(btnAddRooms);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));
		label.setBounds(57, -23, 330, 171);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\h2.jpeg"));
		label_1.setForeground(new Color(248, 248, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(400, -22, 488, 407);
		frame.getContentPane().add(label_1);
		
	}
}

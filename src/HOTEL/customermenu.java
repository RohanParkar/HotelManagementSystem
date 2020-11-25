package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Color;

public class customermenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customermenu window = new customermenu();
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
	public customermenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 819, 378);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCustomerMenu = new JLabel("CUSTOMER MENU");
		lblCustomerMenu.setForeground(Color.WHITE);
		lblCustomerMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerMenu.setBounds(136, 83, 170, 37);
		frame.getContentPane().add(lblCustomerMenu);
		
		JButton btnNewButton = new JButton("ROOM BOOKING");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				frame.setVisible(false);
				RoomBooking rb=new RoomBooking();
				rb.setVisible(true);
			
			}
		});
		btnNewButton.setBounds(31, 140, 151, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("FEEDBACK");
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				feedback f=new feedback();
				f.setVisible(true);
			}
		});
		button.setBounds(241, 140, 151, 37);
		frame.getContentPane().add(button);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(Color.RED);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(241, 200, 151, 37);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancelBooking = new JButton("CANCEL BOOKING");
		btnCancelBooking.setBackground(Color.GREEN);
		btnCancelBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			cancelbooking.setVisible(true);
			}
		});
		btnCancelBooking.setBounds(31, 200, 151, 37);
		frame.getContentPane().add(btnCancelBooking);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(58, -42, 330, 171);
		frame.getContentPane().add(label);
		
		JButton button_1 = new JButton("HELP!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
help.setVisible(true);
			}});
		button_1.setIcon(new ImageIcon("C:\\1.png"));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(136, 256, 134, 37);
		frame.getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\hotel1.jpg"));
		label_1.setForeground(new Color(248, 248, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(410, -12, 426, 354);
		frame.getContentPane().add(label_1);
	}
}

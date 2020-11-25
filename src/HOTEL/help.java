package HOTEL;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class help {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					help window = new help();
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
	public help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 456, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("For any help contact us at:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(62, 99, 251, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmailHotelrainbowgmailcom = new JLabel("EMAIL: hotelrainbow24@gmail.com");
		lblEmailHotelrainbowgmailcom.setForeground(Color.WHITE);
		lblEmailHotelrainbowgmailcom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailHotelrainbowgmailcom.setBounds(62, 136, 251, 34);
		frame.getContentPane().add(lblEmailHotelrainbowgmailcom);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO: +91 9819739033");
		lblMobileNo.setForeground(Color.WHITE);
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMobileNo.setBounds(62, 172, 251, 34);
		frame.getContentPane().add(lblMobileNo);
		
		JLabel label = new JLabel(" +91 7045727144");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(146, 203, 251, 34);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(223, 248, 174, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\logosmall.png"));
		label_1.setBounds(51, -30, 330, 171);
		frame.getContentPane().add(label_1);
		
		JButton btnMoreInfo = new JButton("MORE INFO");
		btnMoreInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try {
				     if (Desktop.isDesktopSupported()) {
				       Desktop.getDesktop().open(new File("C:\\HOTEL MANAGEMENT REPORT.pdf"));
				     }
				   } catch (IOException ioe) {
				     ioe.printStackTrace();
				  }
				
			}});
		btnMoreInfo.setBackground(Color.YELLOW);
		btnMoreInfo.setBounds(26, 248, 174, 34);
		frame.getContentPane().add(btnMoreInfo);
	}
}

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
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;

public class start {

	private JFrame frmH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
					window.frmH.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmH = new JFrame();
		frmH.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmH.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmH.getContentPane().setForeground(new Color(0, 0, 0));
		frmH.getContentPane().setBackground(new Color(0, 0, 0));
		frmH.setBackground(Color.BLACK);
		frmH.setBounds(100, 100, 907, 480);
		frmH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmH.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADMIN LOGIN");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminlogin adm = new adminlogin();
				adm.setVisible(true);
				
			}

		
		});
		btnNewButton.setBounds(35, 191, 139, 37);
		frmH.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CUSTOMER LOGIN");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				login.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(237, 191, 139, 37);
		frmH.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(148, 302, 121, 37);
		frmH.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		
		 lblNewLabel.setIcon(new ImageIcon("C:\\logosmall.png"));
		 lblNewLabel.setBounds(50, -14, 330, 194);
		frmH.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\hotel.jpg"));

		lblNewLabel_1.setBounds(390, 0, 501, 442);
		frmH.getContentPane().add(lblNewLabel_1);
		
		
		validate();
	}

	private void validate() {
		// TODO Auto-generated method stub
		
	}
}

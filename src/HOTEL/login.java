package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class login {

	protected static final String RoomBooking = null;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 842, 361);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(new Color(255, 255, 240));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(50, 67, 109, 39);
		frame.getContentPane().add(lblUsername);
		
		final JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(50, 117, 109, 39);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(190, 78, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 128, 138, 20);
		frame.getContentPane().add(passwordField);
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usnme=textField.getText();
				@SuppressWarnings("deprecation")
				String pasword=passwordField.getText();
								
				
				try{Connection conn = null;
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "myrohan";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root"; 
				String password = "root";	 
					try{
						Class.forName(driver).newInstance();}
					catch(ClassNotFoundException e1)
					{
						System.err.println(e1);
					}
					conn = DriverManager.getConnection(url+dbName,userName,password);
				
					String query="SELECT * FROM l0ginregister WHERE usernme = '"+usnme+"'AND password = '"+pasword+"' ";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					JOptionPane.showMessageDialog(null,"login successsfully");
					frame.setVisible(false);
					customermenu.setVisible(true);
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"incorrect usernme or pssword");	
					frame.setVisible(false);
					login.setVisible(true);
				
				}
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
			}
		});
		btnLogin.setBounds(38, 191, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBackground(new Color(100, 149, 237));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				register.setVisible(true);
			}
		});
		btnRegister.setBounds(159, 191, 109, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnExit = new JButton("BACK");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(297, 191, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("FORGOT PASSWORD");
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				forgotpassword.setVisible(true);
			}
		});
		btnNewButton.setBounds(26, 241, 169, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnForgotUdername = new JButton("FORGOT USERNAME");
		btnForgotUdername.setBackground(new Color(255, 255, 0));
		btnForgotUdername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				forgotusername.setVisible(true);
			}
		});
		btnForgotUdername.setBounds(228, 241, 173, 23);
		frame.getContentPane().add(btnForgotUdername);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(38, -32, 330, 130);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\h3.jpg"));

		label_1.setForeground(new Color(248, 248, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(402, -19, 442, 342);
		frame.getContentPane().add(label_1);
		
		
	}
}

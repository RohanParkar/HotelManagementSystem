package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import HOTEL.SendEmail.SMTPAuthenticator;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class forgotusername {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotusername window = new forgotusername();
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
	public forgotusername() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterPassword = new JLabel("PLEASE ENTER PASSWORD");
		lblPleaseEnterPassword.setForeground(new Color(255, 255, 240));
		lblPleaseEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPleaseEnterPassword.setBounds(108, 96, 214, 33);
		frame.getContentPane().add(lblPleaseEnterPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 139, 186, 20);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("LOGIN PAGE");
		button.setBackground(new Color(0, 255, 0));
		button.setForeground(new Color(0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				login.setVisible(true);
			}
		});
		button.setBounds(58, 202, 132, 33);
		frame.getContentPane().add(button);
		
		JButton btnGetUsername = new JButton("GET USERNAME");
		btnGetUsername.setBackground(new Color(255, 69, 0));
		btnGetUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//**********************************************************************	
				
				String pasword=textField.getText();
								
				
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
				
					String query="SELECT * FROM l0ginregister WHERE password = '"+pasword+"' ";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					String email= rs.getString("email");
					
					SendEmail e1=new SendEmail(email, "FORGOT USERNAME", "YOUR USERNAME IS "+ rs.getString("usernme")+"");
					 		
					JOptionPane.showMessageDialog(null,"YOUR USERNAME HAS BEEN SENT TO REGISTERED EMAIL.");
					
					login.setVisible(true);
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"incorrect  password");	
					
					
				
				}
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				//**********************************************************************	
		
			}	
				
				
				
			
		});
		btnGetUsername.setBounds(254, 202, 132, 33);
		frame.getContentPane().add(btnGetUsername);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(56, -40, 330, 171);
		frame.getContentPane().add(label);
		
	}

	

}

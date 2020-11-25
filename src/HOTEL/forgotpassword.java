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

public class forgotpassword {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotpassword window = new forgotpassword();
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
	public forgotpassword() {
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
		
		JLabel lblEnterUsername = new JLabel("PLEASE ENTER USERNAME");
		lblEnterUsername.setForeground(new Color(255, 255, 224));
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterUsername.setBounds(99, 94, 214, 33);
		frame.getContentPane().add(lblEnterUsername);
		
		textField = new JTextField();
		textField.setBounds(99, 137, 186, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GET PASSWORD");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usnme=textField.getText();
				
								
				//**************************************************
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
				int x=1;
					String query="SELECT * FROM l0ginregister WHERE usernme = '"+usnme+"' ";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					String email= rs.getString("email");
	
					SendEmail e1=new SendEmail(email, "FORGOT PASSWORD", "YOUR PASSWORD IS "+ rs.getString("password")+"");
					 x=0;
					 	
					JOptionPane.showMessageDialog(null,"YOUR PASSWORD HAS BEEN SENT TO REGISTERED EMAIL.");
					
					login.setVisible(true);
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"incorrect usernme ");	
					
					login.setVisible(true);
				
				}
				if(x==1)
				JOptionPane.showMessageDialog(null,"Please register again with valid email");
				
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
				//**************************************************
		
				
				
			}});
		btnNewButton.setBounds(245, 200, 132, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN PAGE");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(49, 200, 132, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(47, -44, 330, 171);
		frame.getContentPane().add(label);
	}

	
}

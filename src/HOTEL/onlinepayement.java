package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

 class SendEmail {

   final static String senderEmailID = "hotelrainbow24@gmail.com";
final String senderPassword = "rainbow@1999";
final static String emailSMTPserver = "smtp.gmail.com";
final static String emailServerPort = "465";
static String receiverEmailID ;
static String emailSubject ;
static String emailBody ;
  public SendEmail(String receiverEmailID,String Subject,
  String Body){
   
  // Receiver Email Address
	 SendEmail.receiverEmailID=receiverEmailID; 
  // Subject
  SendEmail.emailSubject=Subject;
  // Body
  SendEmail.emailBody=Body;
  Properties props = new Properties();
  props.put("mail.smtp.user",senderEmailID);
  props.put("mail.smtp.host", emailSMTPserver);
  props.put("mail.smtp.port", emailServerPort);
  props.put("mail.smtp.starttls.enable", "true");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.socketFactory.port", emailServerPort);
  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.socketFactory.fallback", "false");
  @SuppressWarnings("unused")
SecurityManager security = System.getSecurityManager();
  try{  
  Authenticator auth = new SMTPAuthenticator();
  Session session = Session.getInstance(props, auth);
  MimeMessage msg = new MimeMessage(session);
  msg.setText(emailBody);
  msg.setSubject(emailSubject);
  msg.setFrom(new InternetAddress(senderEmailID));
  msg.addRecipient(Message.RecipientType.TO,
  new InternetAddress(receiverEmailID));
  Transport.send(msg);
  }
  
  catch (Exception mex){
  mex.printStackTrace();}
  
  
  }
  public class SMTPAuthenticator extends javax.mail.Authenticator
  {
  public PasswordAuthentication getPasswordAuthentication()
  {
  return new PasswordAuthentication(senderEmailID, senderPassword);
  }
  }
     }
public class onlinepayement {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					onlinepayement window = new onlinepayement();
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
	public onlinepayement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 538, 476);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE PAYMENT");
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(130, 57, 283, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("CREDIT CARD");
		rdbtnCreditCard.setBackground(new Color(0, 0, 0));
		rdbtnCreditCard.setForeground(new Color(255, 255, 224));
		buttonGroup.add(rdbtnCreditCard);
		rdbtnCreditCard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnCreditCard.setBounds(55, 131, 128, 31);
		frame.getContentPane().add(rdbtnCreditCard);
		
		JRadioButton rdbtnDebitCard = new JRadioButton("DEBIT CARD");
		rdbtnDebitCard.setBackground(new Color(0, 0, 0));
		rdbtnDebitCard.setForeground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnDebitCard);
		rdbtnDebitCard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnDebitCard.setBounds(217, 131, 128, 31);
		frame.getContentPane().add(rdbtnDebitCard);
		
		JLabel lblNewLabel_1 = new JLabel("CARD HOLDER NAME :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(55, 186, 113, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCardNo = new JLabel("CARD NO :");
		lblCardNo.setForeground(new Color(255, 255, 255));
		lblCardNo.setBounds(55, 222, 96, 25);
		frame.getContentPane().add(lblCardNo);
		
		JLabel lblExpiry = new JLabel("EXPIRY  :");
		lblExpiry.setForeground(new Color(255, 255, 255));
		lblExpiry.setBounds(55, 265, 96, 25);
		frame.getContentPane().add(lblExpiry);
		
		JLabel lblMonth = new JLabel("MONTH :");
		lblMonth.setForeground(new Color(255, 255, 255));
		lblMonth.setBounds(203, 265, 48, 25);
		frame.getContentPane().add(lblMonth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT BANK", "ICICI", "ANDHRA BANK", "HDFC", "SBI", "BOM"}));
		comboBox.setBounds(398, 137, 122, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblYear = new JLabel("YEAR :");
		lblYear.setForeground(new Color(255, 255, 255));
		lblYear.setBounds(335, 265, 48, 25);
		frame.getContentPane().add(lblYear);
		
		JLabel lblCvv = new JLabel("CVV :");
		lblCvv.setForeground(new Color(255, 255, 255));
		lblCvv.setBounds(55, 301, 96, 25);
		frame.getContentPane().add(lblCvv);
		
		textField = new JTextField();
		textField.setBounds(203, 188, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 224, 191, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(261, 267, 38, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(398, 267, 38, 20);
		frame.getContentPane().add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 303, 48, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(76, 368, 138, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMakePayment = new JButton("MAKE PAYMENT");
		btnMakePayment.setBackground(new Color(255, 255, 0));
		btnMakePayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				

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
				
   String query1="SELECT * FROM roombook WHERE username = '"+textField_4.getText()+"' ";
				    
					PreparedStatement stmt1=conn.prepareStatement(query1);
					
					ResultSet rs1=stmt1.executeQuery(query1);
				if (rs1.next())
				{
					
					
					
					String query="SELECT * FROM payement WHERE cardno = '"+textField_1.getText()+"'AND month = '"+textField_2.getText()+"'AND year = '"+textField_3.getText()+"'AND cvv = '"+passwordField.getText()+"' ";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					
					

					   String query11="SELECT * FROM l0ginregister WHERE usernme = '"+textField_4.getText()+"' ";
									    
										PreparedStatement stmt11=conn.prepareStatement(query11);
										
										ResultSet rs11=stmt11.executeQuery(query11);
									if (rs11.next())
									{
										String mail=rs11.getString("email");
										String name=rs11.getString("name");
										 
										 String query2="SELECT * FROM roombook WHERE username = '"+textField_4.getText()+"' ";
										    
											PreparedStatement stmt2=conn.prepareStatement(query2);
											
											ResultSet rs2=stmt2.executeQuery(query2);
										if (rs2.next())
										{
											String in=rs2.getString("checkin");
											String out=rs2.getString("checkout");
											String no=rs2.getString("roomno");
											String type=rs2.getString("roomtype");
											String paid=rs2.getString("totalch");

										   SendEmail e=new SendEmail(mail, "CONFIRMATION EMAIL", ""
										 		+ ""+name+" your payement is successfull you have successfully booked your room.\n"
										 				+ "Your Booking Details are:\n"
										 				+ "ROOM NO:"+no+"\n"
										 				+ "CHECK IN:"+in+"\n"
										 				+ "CHECKOUT:"+out+"\n"
										 				+ "ROOM TYPE:"+type+"\n"
										 				+ "AMOUNT PAID:"+paid+"\n"
										 				+ "THANK YOU!!! FOR BOOKING IN OUR RAINBOW HOTEL");
										   JOptionPane.showMessageDialog(null,"PAYEMENT SUCCESSFULL");
										   frame.setVisible(false);
										}
										else
										{
											JOptionPane.showMessageDialog(null,"PAYEMENT UNSUCCESSFULL\n");
										}
									}
									else
									{
										JOptionPane.showMessageDialog(null,"PAYEMENT UNSUCCESSFULL");
									}	
					
					
					customermenu.setVisible(true);
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"INVALID DETAILS");	
					
				
				
				}
				
				}
				else
				{

					JOptionPane.showMessageDialog(null,"Room Not booked");	
						
				}
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
				
				
			}
		});
		btnMakePayment.setBounds(256, 368, 138, 31);
		frame.getContentPane().add(btnMakePayment);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(55, 99, 113, 25);
		frame.getContentPane().add(lblUsername);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(203, 104, 191, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(100, -37, 330, 130);
		frame.getContentPane().add(label);
	}
}


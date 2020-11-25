package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import java.awt.Color;

public class register {

	private JFrame frame;
	private JTextField textField;
	private  JTextField textField_1 ;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 662, 533);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION FORM");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(126, 94, 310, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME*");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(46, 137, 95, 32);
		frame.getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("GENDER*");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(46, 180, 95, 32);
		frame.getContentPane().add(lblGender);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO*");
		lblMobileNo.setForeground(new Color(255, 255, 255));
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMobileNo.setBounds(46, 266, 95, 32);
		frame.getContentPane().add(lblMobileNo);
		
		JLabel lblEmail = new JLabel("EMAIL*");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(46, 309, 95, 32);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblUsername = new JLabel("USERNAME*");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(46, 352, 95, 32);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD*");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(46, 395, 95, 32);
		frame.getContentPane().add(lblPassword);
		
		
		
		textField = new JTextField();
		textField.setBounds(224, 141, 176, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 270, 176, 28);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(224, 317, 176, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(224, 356, 176, 28);
		frame.getContentPane().add(textField_3);
		
		
		JLabel lblDob = new JLabel("DOB*");
		lblDob.setForeground(new Color(255, 255, 255));
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDob.setBounds(46, 223, 95, 32);
		frame.getContentPane().add(lblDob);
		
		final JRadioButton rdbtnmale = new JRadioButton("MALE");
		rdbtnmale.setBackground(new Color(0, 0, 0));
		rdbtnmale.setForeground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnmale);
		rdbtnmale.setBounds(224, 187, 109, 23);
		frame.getContentPane().add(rdbtnmale);
		
		final JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBackground(new Color(0, 0, 0));
		rdbtnFemale.setForeground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(349, 187, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		

		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(224, 223, 176, 20);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblConfirmpassword = new JLabel("CONFIRM PASSWORD*");
		lblConfirmpassword.setForeground(new Color(255, 255, 255));
		lblConfirmpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmpassword.setBounds(20, 448, 159, 32);
		frame.getContentPane().add(lblConfirmpassword);
		JButton btnSubmit = new JButton("SIGN UP");
		btnSubmit.setBackground(new Color(127, 255, 0));
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)throws NullPointerException {
				//validation***********************************************************************************************	
				int i=1;
				
				
				
				
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
				
					 
					
					
					String query="SELECT * FROM l0ginregister WHERE usernme = '"+textField_3.getText()+"' ";
				
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					JOptionPane.showMessageDialog(null,"username already exist");	
					
					i++;
				}
				else
				{
					
					
					if(textField.getText().isEmpty()==true||textField_1.getText().isEmpty()==true||textField_2.getText().isEmpty()==true||textField_3.getText().isEmpty()==true||passwordField.getText().isEmpty()==true||passwordField_1.getText().isEmpty()==true)
					{
						JOptionPane.showMessageDialog(null,"ENTER ALL DETAILS ");	
		                 i++;
					}
					
					if (rdbtnmale.isSelected()||rdbtnFemale.isSelected())
					{
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"SELECT GENDER");	
						   i++;	
					}
					if(textField_1.getText().length()!=10)
					{
						JOptionPane.showMessageDialog(null,"ENTER VALID MOBILENO ");	
						   i++;
					}
					if(textField_1.getText().contains("1")==true||textField_1.getText().contains("2")==true||textField_1.getText().contains("3")==true||textField_1.getText().contains("4")==true||textField_1.getText().contains("5")==true||textField_1.getText().contains("6")==true||textField_1.getText().contains("7")==true||textField_1.getText().contains("8")==true||textField_1.getText().contains("9")==true||textField_1.getText().contains("0")==true)
					{
					
					}
					else
					{
						JOptionPane.showMessageDialog(null,"ENTER VALID MOBILENO ");	
						   i++;
		
					}
					if(textField_2.getText().contains("@")&&textField_2.getText().contains(".com"))
					{
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"ENTER VALID EMAIL");	
						   i++;
					}
					if((passwordField.getText().length())<7)
					{
						JOptionPane.showMessageDialog(null,"PASSWORD MUST CONTAIN AT LEAST 7 CHARACTERS ");	
						   i++;	
					}
					else{
					
					}
					if(passwordField.getText().contains("@")==true||passwordField.getText().contains("$")==true||passwordField.getText().contains("&")==true)
					{
						
					}
					else{
						JOptionPane.showMessageDialog(null,"PASSWORD MUST ATLEAST CONTAIN ONE SPECIAL CHARACTER\n @,$,&,#");	
						   i++;
					}
					
					if(passwordField.getText().contains("1")==true||passwordField.getText().contains("2")==true||passwordField.getText().contains("3")==true||passwordField.getText().contains("4")==true||passwordField.getText().contains("5")==true||passwordField.getText().contains("6")==true||passwordField.getText().contains("7")==true||passwordField.getText().contains("8")==true||passwordField.getText().contains("9")==true||passwordField.getText().contains("0")==true)
					{
					
					}
					else{
						JOptionPane.showMessageDialog(null,"PASSWORD MUST ATLEAST CONTAIN ONE NUMBER");	
						   i++;
					}
					if(passwordField.getText().equals(passwordField_1.getText())==true)
					{
					
					}
					else
					{
						JOptionPane.showMessageDialog(null,"PASSWORD NOT MATCHING");	
						   i++;
					}
					
				
				
				
				
				
				}
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
				
				
				//***********************************************************************************************	
	if(i==1){
				try{Connection conn = null;
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "myrohan";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root"; 
				String password = "root";	 
				String gender1 = null;
				if (rdbtnmale.isSelected())
				{
					gender1="male";
				}
				else 
				{
					gender1="female";
				}
				try{
						Class.forName(driver).newInstance();}
					catch(ClassNotFoundException e1)
					{
						System.err.println(e1);
					}
					conn = DriverManager.getConnection(url+dbName,userName,password);
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					 String sd = dateFormat.format(dateChooser.getDate());
					 
					
					String query="insert into l0ginregister values(?,?,?,?,?,?,?)";	
					
					//Step1 :  Get PreparedStatement 
					PreparedStatement pstmt=conn.prepareStatement(query);
					//Step2 :  Set parameters
					pstmt.setString(1,textField.getText());
					pstmt.setString(2,gender1);
					pstmt.setString(3,sd);
					pstmt.setString(4,textField_1.getText());
					pstmt.setString(5,textField_2.getText());
					pstmt.setString(6,textField_3.getText());
					pstmt.setString(7,passwordField.getText());
					pstmt.executeUpdate();
					conn.close();
					JOptionPane.showMessageDialog(null,"Registered Successfully  ");	
					frame.setVisible(false);
					login.setVisible(true);
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
	}
				}
				
				});
		btnSubmit.setBounds(463, 171, 149, 43);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				login.setVisible(true);
			}
		});
		btnBack.setBounds(463, 257, 149, 43);
		frame.getContentPane().add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 399, 177, 28);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(224, 448, 177, 23);
		frame.getContentPane().add(passwordField_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(145, -20, 330, 130);
		frame.getContentPane().add(label);
		
	
	
	
	}
}

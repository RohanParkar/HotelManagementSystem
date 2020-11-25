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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class cstfeedback {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cstfeedback window = new cstfeedback();
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
	public cstfeedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 375);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCustomerReview = new JLabel("CUSTOMER REVIEW");
		lblCustomerReview.setForeground(new Color(248, 248, 255));
		lblCustomerReview.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCustomerReview.setBounds(67, 101, 257, 38);
		frame.getContentPane().add(lblCustomerReview);
		
		JLabel label_1 = new JLabel("ENTER CUSTOMER'S USERNAME");
		label_1.setForeground(new Color(248, 248, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(67, 164, 273, 28);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 203, 158, 20);
		frame.getContentPane().add(textField);
		
		JButton btnGetReview = new JButton("GET REVIEW");
		btnGetReview.setBackground(new Color(255, 255, 0));
		btnGetReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
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
				
					
					
					String query="SELECT * FROM feedback WHERE username = '"+textField.getText()+"' ";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					JOptionPane.showMessageDialog(null,"REVIEW: "+ rs.getString("review")+"\n WOULD THE CUSTOMER LIKE TO VISIT AGAIN ? : "+ rs.getString("x")+"\n RATING: "+ rs.getString("rating"));
					
								
				}
				else
				{
					JOptionPane.showMessageDialog(null,"incorrect usernme ");	
					
					
				
				}
				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
				
				
			}
		});
		btnGetReview.setBounds(233, 264, 158, 38);
		frame.getContentPane().add(btnGetReview);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(0, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);adminmenu.setVisible(false);
			}
		});
		btnBack.setBounds(51, 264, 127, 38);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(44, -32, 330, 171);
		frame.getContentPane().add(label);
	}

	

}

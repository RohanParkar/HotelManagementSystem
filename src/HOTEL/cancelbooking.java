package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class cancelbooking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnBack;
	@SuppressWarnings("unused")
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancelbooking window = new cancelbooking();
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
	public cancelbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(181, 90, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ROOM NO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(40, 83, 100, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRoomType = new JLabel("ROOM TYPE");
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoomType.setBounds(40, 121, 100, 30);
		frame.getContentPane().add(lblRoomType);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 128, 122, 20);
		frame.getContentPane().add(textField_1);
		
		btnNewButton = new JButton("CANCEL BOOKING");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				try{
					Connection conn = null;
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
					
					 
					
					
				
				        
                           String s="booked";
				    
					 String query1="SELECT * FROM roomdata WHERE no='"+textField.getText()+"'AND type='"+textField_1.getText()+"'AND avail='"+s+"'  ";
				    
					PreparedStatement stmt=conn.prepareStatement(query1);
					
					ResultSet rs=stmt.executeQuery(query1);
				if (rs.next())
				{
					
					String query3= "UPDATE roomdata SET avail = ? WHERE no='"+textField.getText()+"'AND type='"+textField_1.getText()+"'  ";
					 PreparedStatement psmt = conn.prepareStatement(query3);
                        psmt.setString(1,"available");

                        psmt.executeUpdate();
					
					
					
					conn.close();
					JOptionPane.showMessageDialog(null,"Successfully Cancelled ");	
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Roon Not Found ");	

				}
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
			}
		});
		btnNewButton.setBounds(62, 195, 122, 30);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("BACK");
		btnBack.setBackground(Color.RED);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			customermenu.setVisible(true);
			}
			
		});
		btnBack.setBounds(240, 195, 122, 30);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));
		label.setBounds(60, -41, 330, 171);
		frame.getContentPane().add(label);
	}

}

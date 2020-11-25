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
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class deleteroom {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteroom window = new deleteroom();
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
	public deleteroom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 357);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeleteRoom = new JLabel("DELETE ROOM");
		lblDeleteRoom.setForeground(Color.WHITE);
		lblDeleteRoom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDeleteRoom.setBounds(150, 101, 140, 25);
		frame.getContentPane().add(lblDeleteRoom);
		
		JLabel lblEnterRoomNo = new JLabel("ENTER ROOM NO");
		lblEnterRoomNo.setForeground(Color.WHITE);
		lblEnterRoomNo.setBackground(Color.WHITE);
		lblEnterRoomNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterRoomNo.setBounds(46, 154, 149, 31);
		frame.getContentPane().add(lblEnterRoomNo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(242, 161, 120, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblEnterRoomType = new JLabel("ENTER ROOM TYPE");
		lblEnterRoomType.setForeground(new Color(248, 248, 255));
		lblEnterRoomType.setBackground(Color.WHITE);
		lblEnterRoomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterRoomType.setBounds(46, 201, 149, 31);
		frame.getContentPane().add(lblEnterRoomType);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 208, 120, 20);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("DELETE");
		button.setBackground(new Color(0, 255, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
		
				try{
					Connection conn = null;
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "myrohan";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root"; 
				String password = "root";	 
				
				try{
						Class.forName(driver).newInstance();
						}
					catch(ClassNotFoundException e1)
					{
						System.err.println(e1);
					}
					conn = DriverManager.getConnection(url+dbName,userName,password);
					
					String query="SELECT * FROM roomdata WHERE no='"+textField.getText()+"'AND type='"+textField_1.getText()+"' ";	
                    PreparedStatement stmt=conn.prepareStatement(query);
                    ResultSet rs=stmt.executeQuery(query);
					if(rs.next()){
					
					String query1="DELETE FROM roomdata WHERE no='"+textField.getText()+"'AND type='"+textField_1.getText()+"' ";	
					
                 Statement stmt1=conn.createStatement();
                 stmt1.executeUpdate(query1);
					
				 JOptionPane.showMessageDialog(null,"Room Deleted successsfully");
					}
					else
					{
						 JOptionPane.showMessageDialog(null,"Room not found");

					}
				
			
					conn.close();
					
					
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
			}
		});
		button.setBounds(65, 261, 140, 36);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("BACK");
		button_1.setBackground(new Color(255, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				adminmenu.setVisible(true);
			}
			
		});
		button_1.setBounds(240, 261, 140, 36);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));
		label.setBounds(50, -48, 330, 171);
		frame.getContentPane().add(label);
		
		
	}

}

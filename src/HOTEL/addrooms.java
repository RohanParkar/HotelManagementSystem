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
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addrooms {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addrooms window = new addrooms();
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
	public addrooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.YELLOW);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 351);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Room No");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(38, 108, 111, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRoomType.setBounds(38, 146, 111, 27);
		frame.getContentPane().add(lblRoomType);
		
		JLabel lblRoomCost = new JLabel("Room cost");
		lblRoomCost.setForeground(Color.WHITE);
		lblRoomCost.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRoomCost.setBounds(38, 184, 111, 27);
		frame.getContentPane().add(lblRoomCost);
		
		textField = new JTextField();
		textField.setBounds(183, 114, 111, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 152, 111, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 190, 111, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnAddRoom = new JButton("Add Room");
		btnAddRoom.setBackground(Color.YELLOW);
		btnAddRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try{Connection conn = null;
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "myrohan";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root"; 
				String password = "root";	 
				String avail="available";
				double cost=Double.parseDouble(textField_2.getText());
				
				try{
						Class.forName(driver).newInstance();}
					catch(ClassNotFoundException e1)
					{
						System.err.println(e1);
					}
					conn = DriverManager.getConnection(url+dbName,userName,password);
					String query="insert into roomdata values(?,?,?,?)";	
					
					
					PreparedStatement pstmt=conn.prepareStatement(query);
					
					pstmt.setString(1,textField.getText());
					pstmt.setString(2,textField_1.getText());
					pstmt.setInt(3,(int) cost);
					pstmt.setString(4,avail);

					pstmt.executeUpdate();
					conn.close();
					JOptionPane.showMessageDialog(null,"Room added sucessfully ");	
					
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
				
			}
			
		});
		btnAddRoom.setBounds(73, 252, 111, 34);
		frame.getContentPane().add(btnAddRoom);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(Color.RED);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				adminmenu.setVisible(true);
			}
		});
		btnBack.setBounds(245, 252, 111, 34);
		frame.getContentPane().add(btnBack);
		
		JLabel lblAddRooms = new JLabel("ADD ROOMS");
		lblAddRooms.setForeground(Color.WHITE);
		lblAddRooms.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblAddRooms.setBounds(119, 70, 134, 27);
		frame.getContentPane().add(lblAddRooms);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));
		label.setBounds(38, -52, 330, 171);
		frame.getContentPane().add(label);
	}
}

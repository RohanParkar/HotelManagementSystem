package HOTEL;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;


import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class showrooms {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showrooms window = new showrooms();
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
	public showrooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 617, 414);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 581, 242);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ROOM DETAILS");
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(212, 11, 177, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SHOW DETAILS");
		btnNewButton.setBackground(new Color(0, 255, 255));
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
						Class.forName(driver).newInstance();
						}
					catch(ClassNotFoundException e1)
					{
						System.err.println(e1);
					}
					conn = DriverManager.getConnection(url+dbName,userName,password);
					String query="SELECT * FROM roomdata";	
PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				
					table.setModel(DbUtils.resultSetToTableModel(rs));
				    
			
			
					conn.close();
					
					
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
			
			
			
			}
		});
		btnNewButton.setBounds(92, 323, 158, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.setBounds(354, 323, 158, 42);
		frame.getContentPane().add(btnBack);
	}

	

}

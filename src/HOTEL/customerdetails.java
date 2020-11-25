package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class customerdetails {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerdetails window = new customerdetails();
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
	public customerdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 923, 529);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCustomerDetails = new JLabel("CUSTOMER DETAILS");
		lblCustomerDetails.setForeground(Color.WHITE);
		lblCustomerDetails.setBackground(Color.WHITE);
		lblCustomerDetails.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCustomerDetails.setBounds(356, 87, 257, 38);
		frame.getContentPane().add(lblCustomerDetails);
		
		JButton btnNewButton = new JButton("GET DETAILS");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//*******************************************************************************
				
				
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
				
					String query="SELECT * FROM l0ginregister";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));

				conn.close();
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
			//***********************************************************************************	
			}
		});
		btnNewButton.setBounds(595, 442, 158, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("BACK");
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				adminmenu.setVisible(false);
			}
		});
		button.setBounds(260, 442, 142, 38);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		scrollPane.setBounds(10, 132, 887, 288);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(319, -46, 330, 171);
		frame.getContentPane().add(label);
	}
}

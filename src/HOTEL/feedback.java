package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.print.DocFlavor.STRING;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class feedback {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public void setVisible(boolean b)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feedback window = new feedback();
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
	public feedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 712, 626);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final TextArea textArea = new TextArea();
		textArea.setBounds(146, 224, 408, 120);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("FEEDBACK");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setBounds(251, 89, 206, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblReview = new JLabel("USERNAME:");
		lblReview.setForeground(new Color(248, 248, 255));
		lblReview.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblReview.setBounds(10, 160, 129, 26);
		frame.getContentPane().add(lblReview);
		
		JLabel lblReview_1 = new JLabel("REVIEW:");
		lblReview_1.setForeground(new Color(248, 248, 255));
		lblReview_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblReview_1.setBounds(10, 224, 129, 26);
		frame.getContentPane().add(lblReview_1);
		
		textField = new JTextField();
		textField.setBounds(146, 163, 173, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWouldYouLike = new JLabel("WOULD YOU LIKE TO VISIT OUR HOTEL AGAIN?");
		lblWouldYouLike.setForeground(new Color(248, 248, 255));
		lblWouldYouLike.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWouldYouLike.setBounds(10, 361, 581, 26);
		frame.getContentPane().add(lblWouldYouLike);
		
		final JRadioButton rdbtnyes = new JRadioButton("YES");
		rdbtnyes.setBackground(new Color(0, 0, 0));
		rdbtnyes.setForeground(new Color(248, 248, 255));
		buttonGroup.add(rdbtnyes);
		rdbtnyes.setBounds(48, 406, 109, 23);
		frame.getContentPane().add(rdbtnyes);
		
		final JRadioButton rdbtnno = new JRadioButton("NO");
		rdbtnno.setBackground(new Color(0, 0, 0));
		rdbtnno.setForeground(new Color(255, 250, 250));
		buttonGroup.add(rdbtnno);
		rdbtnno.setBounds(210, 406, 109, 23);
		frame.getContentPane().add(rdbtnno);
		
		//************************************************
		

		JLabel lblRating = new JLabel("RATING");
		lblRating.setForeground(new Color(248, 248, 255));
		lblRating.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRating.setBounds(10, 453, 94, 26);
		frame.getContentPane().add(lblRating);
		
		final JRadioButton radioButton = new JRadioButton("5");
		radioButton.setBackground(new Color(0, 0, 0));
		radioButton.setForeground(new Color(248, 248, 255));
		buttonGroup_1.add(radioButton);
		radioButton.setBounds(119, 458, 39, 23);
		frame.getContentPane().add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("4");
		radioButton_1.setBackground(new Color(0, 0, 0));
		radioButton_1.setForeground(new Color(255, 250, 250));
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setBounds(162, 458, 39, 23);
		frame.getContentPane().add(radioButton_1);
		
		final JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(new Color(0, 0, 0));
		radioButton_2.setForeground(new Color(255, 250, 250));
		buttonGroup_1.add(radioButton_2);
		radioButton_2.setBounds(210, 458, 39, 23);
		frame.getContentPane().add(radioButton_2);
		
		final JRadioButton radioButton_3 = new JRadioButton("2");
		radioButton_3.setBackground(new Color(0, 0, 0));
		radioButton_3.setForeground(new Color(255, 255, 255));
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(251, 458, 39, 23);
		frame.getContentPane().add(radioButton_3);
		
		final JRadioButton radioButton_4 = new JRadioButton("1");
		radioButton_4.setBackground(new Color(0, 0, 0));
		radioButton_4.setForeground(new Color(248, 248, 255));
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(292, 458, 39, 23);
		frame.getContentPane().add(radioButton_4);
		
	

	
		//***************************************************
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int i=1;	
			if(textArea.getText().isEmpty()==true)	
			{
				i++;
				JOptionPane.showMessageDialog(null,"PLEASE WRITE REVIEW ");	
			}
				
			if(radioButton.isSelected()||radioButton_1.isSelected()||radioButton_2.isSelected()||radioButton_3.isSelected()||radioButton_4.isSelected() )	
			{
				
			}
			else{
				i++;
				JOptionPane.showMessageDialog(null,"PLEASE GIVE RATING ");	
			}
			
				
				
				
				
				
			if(i==1){	
				
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
					
					PreparedStatement pstmt1=conn.prepareStatement("SELECT * FROM feedback WHERE username = '"+textField.getText()+"' ");
					ResultSet rs=pstmt1.executeQuery("SELECT * FROM feedback WHERE username = '"+textField.getText()+"' ");
					if (rs.next())
					{
						JOptionPane.showMessageDialog(null,"FEEDBACK ALREADY GIVEN");		
					}
					else{
					
					      String query="insert into feedback values(?,?,?,?)";	
				      		PreparedStatement pstmt=conn.prepareStatement(query);
							
							pstmt.setString(1,textField.getText());
							pstmt.setString(2,textArea.getText());
							if(rdbtnyes.isSelected())
							{
								pstmt.setString(3,"yes");	
							}
							else if(rdbtnno.isSelected())
							{
								pstmt.setString(3,"no");
							}
							else
							{
								JOptionPane.showMessageDialog(null,"SELECT YES OR NO");		
							}
							 if(radioButton.isSelected() )
								{
									pstmt.setString(4,"5");
								}
							
								if(radioButton_1.isSelected() )
								{
									pstmt.setString(4,"4");
								}
								if(radioButton_2.isSelected() )
								{
									pstmt.setString(4,"3");
								}
								if(radioButton_3.isSelected() )
								{
									pstmt.setString(4,"2");
								}
								if(radioButton_4.isSelected() )
								{
									pstmt.setString(4,"1");
								}
							
							
							pstmt.executeUpdate();
							
							conn.close();
							JOptionPane.showMessageDialog(null,"THANK YOU FOR YOUR FEED BACK ");	
							frame.setVisible(false);   
							customermenu.setVisible(true);
					
				           
					}}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
			}
				
				
			}
			
		
		});
		btnNewButton.setBounds(381, 519, 173, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(0, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				customermenu.setVisible(true);
			}
		});
		btnBack.setBounds(127, 519, 173, 39);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(196, -57, 330, 171);
		frame.getContentPane().add(label);
			}
}

package HOTEL;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class RoomBooking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBooking frame = new RoomBooking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RoomBooking() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 729, 579);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRoomBooking = new JLabel("ROOM BOOKING");
		lblRoomBooking.setForeground(new Color(255, 255, 255));
		lblRoomBooking.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRoomBooking.setBounds(261, 89, 297, 34);
		contentPane.add(lblRoomBooking);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 134, 350, 396);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JCheckBox chckbxBrekfast = new JCheckBox("BREKFAST");
		chckbxBrekfast.setForeground(new Color(255, 255, 255));
		chckbxBrekfast.setBackground(new Color(0, 0, 0));
		chckbxBrekfast.setBounds(24, 220, 97, 23);
		panel.add(chckbxBrekfast);
		
		final JCheckBox chckbxLunch = new JCheckBox("LUNCH");
		chckbxLunch.setForeground(new Color(255, 255, 255));
		chckbxLunch.setBackground(new Color(0, 0, 0));
		chckbxLunch.setBounds(24, 276, 97, 23);
		panel.add(chckbxLunch);
		
		final JCheckBox chckbxDinner = new JCheckBox("DINNER");
		chckbxDinner.setForeground(new Color(255, 255, 255));
		chckbxDinner.setBackground(new Color(0, 0, 0));
		chckbxDinner.setBounds(24, 250, 97, 23);
		panel.add(chckbxDinner);
		
		final JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(199, 188, 126, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblRoomType = new JLabel("ROOM TYPE");
		lblRoomType.setForeground(new Color(255, 255, 255));
		lblRoomType.setBounds(29, 188, 112, 25);
		panel.add(lblRoomType);
		
		JLabel lblEnterRoomNo = new JLabel("ENTER ROOM NO");
		lblEnterRoomNo.setForeground(new Color(255, 255, 255));
		lblEnterRoomNo.setBounds(24, 152, 112, 25);
		panel.add(lblEnterRoomNo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(199, 154, 126, 20);
		panel.add(textField_2);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(199, 69, 126, 20);
		panel.add(dateChooser);
		
		textField = new JTextField();
		textField.setBounds(199, 29, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		final JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(199, 108, 126, 20);
		panel.add(dateChooser_1);
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 240));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(370, 134, 333, 396);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRoomCharges = new JLabel("ROOM CHARGES");
		lblRoomCharges.setForeground(new Color(255, 255, 255));
		lblRoomCharges.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRoomCharges.setBounds(10, 28, 112, 34);
		panel_1.add(lblRoomCharges);
		
		JLabel lblFoodCharges = new JLabel("FOOD CHARGES");
		lblFoodCharges.setForeground(new Color(255, 255, 255));
		lblFoodCharges.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFoodCharges.setBounds(10, 80, 112, 25);
		panel_1.add(lblFoodCharges);
		
		JLabel lblServiceCharge = new JLabel("SERVICE CHARGE");
		lblServiceCharge.setForeground(new Color(255, 255, 255));
		lblServiceCharge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblServiceCharge.setBounds(10, 131, 112, 25);
		panel_1.add(lblServiceCharge);
		
		JLabel lblGst = new JLabel("GST");
		lblGst.setForeground(new Color(255, 255, 255));
		lblGst.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGst.setBounds(10, 180, 112, 25);
		panel_1.add(lblGst);
		
		JLabel lblTotalCharge = new JLabel("TOTAL CHARGE");
		lblTotalCharge.setForeground(new Color(255, 255, 255));
		lblTotalCharge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotalCharge.setBounds(10, 216, 112, 44);
		panel_1.add(lblTotalCharge);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 240));
		lblNewLabel_1.setBounds(171, 28, 97, 25);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0),2));
		panel_1.add(lblNewLabel_1);
		
		final JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(0, 0, 0));
		label_5.setForeground(new Color(255, 255, 240));
		label_5.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label_5.setBounds(171, 80, 97, 25);
		panel_1.add(label_5);
		
		final JLabel label_6 = new JLabel("");
		label_6.setBackground(new Color(0, 0, 0));
		label_6.setForeground(new Color(255, 255, 240));
		label_6.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label_6.setBounds(171, 131, 97, 25);
		panel_1.add(label_6);
		
		final JLabel label_7 = new JLabel("");
		label_7.setBackground(new Color(0, 0, 0));
		label_7.setForeground(new Color(255, 255, 240));
		label_7.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label_7.setBounds(171, 180, 97, 25);
		panel_1.add(label_7);
		
		final JLabel label_8 = new JLabel("");
		label_8.setBackground(new Color(0, 0, 0));
		label_8.setForeground(new Color(255, 255, 240));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label_8.setBounds(171, 235, 97, 25);
		panel_1.add(label_8);
		
		
	
		JButton button = new JButton("TOTAL");
		button.setBackground(new Color(255, 0, 255));
		button.setBounds(34, 301, 112, 32);
		panel_1.add(button);
		button.addActionListener(new ActionListener() {
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

					 String query1="SELECT * FROM l0ginregister WHERE usernme = '"+textField.getText()+"' ";
					    
						PreparedStatement stmt1=conn.prepareStatement(query1);
						
						ResultSet rs1=stmt1.executeQuery(query1);
					if (rs1.next())
					{
					
				    
					
					
					String query="SELECT * FROM roomdata WHERE no ='"+textField_2.getText()+"'AND avail='"+"available"+"'";
				    
					PreparedStatement stmt=conn.prepareStatement(query);
					
					ResultSet rs=stmt.executeQuery(query);
				if (rs.next())
				{
					String roomtype =rs.getString("type");
					String cost=rs.getString("cost");
					
					 lblNewLabel_2.setText(roomtype);
					 lblNewLabel_1.setText(cost);
					
				double c=Double.parseDouble(cost) ;        
				
				
			    
				
			    double totalcharge=c ;
				
				
				
				
			    
			   
			    double bf=0.0;
			    if(chckbxBrekfast.isSelected())
				{
					totalcharge=totalcharge+100.0;
			      bf=100.0;
				}
			    if( chckbxLunch.isSelected())
				{
					totalcharge=totalcharge+200.0;
					bf=bf+200.0;
				}
			    if(chckbxDinner.isSelected())
				{
					totalcharge=totalcharge+200.0;
					bf=bf+200.0;
				}
			    String fc=String.format("%.2f",bf);
			    label_5.setText(fc);
			   
			    

			    double sercharge=100.0;
			   String sc=String.format("%.2f",sercharge);
			    label_6.setText(sc);
			   
			   double gst=(totalcharge*18)/100 ; 
			   String g=String.format("%.2f",gst);
			    label_7.setText(g);
			    
			    totalcharge=totalcharge+gst+sercharge;
			    String tc=String.format("%.2f",totalcharge);
			    label_8.setText(tc);

				
				/*DateFormat f = DateFormat.getDateInstance();
			    Date date1 = f.parse(sd); 
			    Date date2 = f.parse(sd1);
			    Calendar day1 = Calendar.getInstance();
			    Calendar day2 = Calendar.getInstance(); 
			    day1.setTime(date1);
			    day2.setTime(date2);
			    int days = day1.get(Calendar.DAY_OF_YEAR) - day2.get(Calendar.DAY_OF_YEAR); */
			    
			   // String  day=""+days+"";
			    //label.setText(day);
				}
			    else
			      {
				JOptionPane.showMessageDialog(null,"Room not Found Or Not Available");	
				
			  
			      }
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter Right username");
					}
			    conn.close();
			     }
			    catch(Exception ae)
			    {
				System.err.println(ae);
			     }
			
			}
		});
	
		JButton btnNewButton1 = new JButton("RESET");
		btnNewButton1.setBackground(new Color(0, 255, 0));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
				label_6.setText(null);
				label_7.setText(null);
				label_8.setText(null);
				lblNewLabel_1.setText(null);
				label_5.setText(null);
				lblNewLabel_2.setText(null);
				

			}
		});
		btnNewButton1.setBounds(197, 300, 126, 34);
		panel_1.add(btnNewButton1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.setBounds(105, 344, 126, 34);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
          contentPane.setVisible(false);
			customermenu.setVisible(true);	
			
		 }
		});
		
		JButton btnConfirmBooking = new JButton("CONFIRM BOOKING");
		btnConfirmBooking.setBackground(new Color(0, 255, 255));
		btnConfirmBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				
				
				
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
					
					 
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					 String sd = dateFormat.format(dateChooser.getDate());
					 
					 SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
					String sd1 = dateFormat1.format(dateChooser_1.getDate());
					
         
				        

				    
					 String query1="SELECT * FROM roomdata ";
				    
					PreparedStatement stmt=conn.prepareStatement(query1);
					
					ResultSet rs=stmt.executeQuery(query1);
				if (rs.next())
				{
					String roomtype =rs.getString("type");
					String cost=rs.getString("cost");
					
				
			
					
					String query="insert into roombook values(?,?,?,?,?,?,?,?,?,?)";	
					
				
					PreparedStatement pstmt=conn.prepareStatement(query);
					
					pstmt.setString(1,textField.getText());
					pstmt.setString(2,sd);
					pstmt.setString(3,sd1);
					pstmt.setString(4,textField_2.getText());
					pstmt.setString(5,roomtype);
					pstmt.setString(6,cost);
					pstmt.setString(7,label_5.getText());
					pstmt.setString(8,label_6.getText());
					pstmt.setString(9,label_7.getText());
					pstmt.setString(10,label_8.getText());
					pstmt.executeUpdate();
					
					String query3= "UPDATE roomdata SET avail = ? WHERE no = '"+textField_2.getText()+"' ";
					 PreparedStatement psmt = conn.prepareStatement(query3);
                        psmt.setString(1,"booked");

                        psmt.executeUpdate();
					
					
					
					conn.close();
					JOptionPane.showMessageDialog(null,"Successfully Booked ");	
					contentPane.setVisible(false);
					payementportal p=new payementportal();
					p.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ERROR ");	

				}
				}
				catch(Exception ae)
				{
					System.err.println(ae);
				}
				
				
				
			}
		});
		btnConfirmBooking.setBounds(24, 341, 129, 32);
		panel.add(btnConfirmBooking);	
		
		JButton btnShowRooms = new JButton("SHOW ROOMS");
		btnShowRooms.setBackground(new Color(255, 215, 0));
		btnShowRooms.setBounds(199, 340, 126, 35);
		panel.add(btnShowRooms);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(29, 29, 112, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblCheckIn = new JLabel("CHECK IN");
		lblCheckIn.setBounds(24, 69, 112, 25);
		panel.add(lblCheckIn);
		lblCheckIn.setForeground(new Color(255, 255, 255));
		
		JLabel lblCheckOut = new JLabel("CHECK OUT");
		lblCheckOut.setBounds(24, 108, 112, 25);
		panel.add(lblCheckOut);
		lblCheckOut.setForeground(new Color(255, 255, 255));
		
		final JLabel label = new JLabel("");
		label.setBounds(204, 28, 312, 51);
		contentPane.add(label);
		label.setIcon(new ImageIcon("C:\\logosmall.png"));
		btnShowRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showrooms.setVisible(true);
			}
		});
		

		
		
	}
}

package HOTEL;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class foodbilling {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	public static void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					foodbilling window =  new foodbilling();
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
	public foodbilling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1304, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBorder(new LineBorder(new Color(248, 248, 255), 8));
		panel_1.setBounds(25, 437, 589, 145);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JLabel label_3 = new JLabel("COST OF DRINKS");
		label_3.setForeground(new Color(248, 248, 255));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_3.setBounds(38, 21, 215, 26);
		panel_1.add(label_3);
		
		final JLabel label_4 = new JLabel("COST OF MEAL");
		label_4.setForeground(new Color(248, 248, 255));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_4.setBounds(38, 58, 185, 26);
		panel_1.add(label_4);
		
		final JLabel label_5 = new JLabel("COST OF DELIVERY");
		label_5.setForeground(new Color(248, 248, 255));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_5.setBounds(38, 95, 215, 26);
		panel_1.add(label_5);
		
		final JLabel label_6 = new JLabel("");
		label_6.setBackground(new Color(240, 240, 240));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_6.setBounds(332, 21, 185, 26);
		label_6.setBorder(new LineBorder(new Color(0, 0, 0),2));
		panel_1.add(label_6);
		
		final JLabel label7 = new JLabel("");
		label7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label7.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label7.setBounds(332, 58, 185, 26);
		panel_1.add(label7);
		
		final JLabel label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0),2));
		label_8.setBounds(332, 95, 185, 26);
		panel_1.add(label_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setForeground(new Color(248, 248, 255));
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 8));
		panel_2.setBounds(664, 162, 247, 264);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTotl = new JButton("TOTAL");
		btnTotl.setBackground(new Color(0, 255, 255));
		btnTotl.setBounds(59, 26, 117, 47);
		panel_2.add(btnTotl);
		
		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBorder(new LineBorder(new Color(248, 248, 255), 8));
		panel_3.setBounds(661, 435, 247, 145);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		final JLabel label_9 = new JLabel("");
		label_9.setBounds(113, 22, 124, 26);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_9.setBorder(new LineBorder(new Color(0, 0, 0),2));
		panel_3.add(label_9);
		
		final JLabel label_10 = new JLabel("");
		label_10.setBounds(113, 59, 124, 26);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0),2));
		panel_3.add(label_10);
		
		final JLabel label_11 = new JLabel("");
		label_11.setBounds(113, 96, 124, 26);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_11.setBorder(new LineBorder(new Color(0, 0, 0),2));
		panel_3.add(label_11);
		
		final JLabel label_12 = new JLabel("TAX");
		label_12.setForeground(new Color(248, 248, 255));
		label_12.setBounds(16, 22, 85, 26);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_3.add(label_12);
		
		final JLabel label_13 = new JLabel("SUBTOTAL");
		label_13.setForeground(new Color(248, 248, 255));
		label_13.setBounds(16, 59, 85, 26);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_3.add(label_13);
		
		final JLabel label_14 = new JLabel("TOTAL");
		label_14.setForeground(new Color(248, 248, 255));
		label_14.setBounds(18, 97, 85, 26);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_3.add(label_14);
		final JLabel lblNewLabel = new JLabel("                 FOOD BILLING SYSTEM");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 50));
		lblNewLabel.setBounds(-52, 71, 1253, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(248, 248, 255));
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 8));
		panel.setBounds(25, 162, 589, 264);
		frame.getContentPane().add(panel);
		
		final JLabel lblChikenMe = new JLabel("VEG MEAL");
		lblChikenMe.setForeground(new Color(248, 248, 255));
		lblChikenMe.setBackground(new Color(248, 248, 255));
		lblChikenMe.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChikenMe.setBounds(34, 40, 185, 26);
		panel.add(lblChikenMe);
		
		final JLabel lblChikenMeal = new JLabel("CHIKEN  MEAL");
		lblChikenMeal.setForeground(new Color(248, 248, 255));
		lblChikenMeal.setBackground(new Color(248, 248, 255));
		lblChikenMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChikenMeal.setBounds(34, 77, 259, 25);
		panel.add(lblChikenMeal);
		
		final JLabel lblFishMeal = new JLabel("FISH MEAL");
		lblFishMeal.setForeground(new Color(248, 248, 255));
		lblFishMeal.setBackground(new Color(248, 248, 255));
		lblFishMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblFishMeal.setBounds(34, 113, 204, 26);
		panel.add(lblFishMeal);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setColumns(10);
		textField.setBounds(336, 40, 167, 26);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(336, 77, 167, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(336, 113, 167, 26);
		panel.add(textField_2);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT A DRINK", "COKE", "MIRINDA", "APPLE SHAKE", "MANGO SHAKE", "TEA", "COFFEE", "ORANGE JUICE", "LEMONADE"}));
		comboBox.setBounds(46, 197, 148, 32);
		panel.add(comboBox);
		
		final JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setForeground(new Color(248, 248, 255));
		lblDrinks.setBackground(new Color(248, 248, 255));
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrinks.setBounds(44, 160, 167, 26);
		panel.add(lblDrinks);
		
		final JLabel lblNo = new JLabel("NO");
		lblNo.setForeground(new Color(248, 248, 255));
		lblNo.setBackground(new Color(248, 248, 255));
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNo.setBounds(229, 160, 156, 26);
		panel.add(lblNo);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(229, 197, 167, 26);
		panel.add(textField_3);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("TAX");
		chckbxNewCheckBox.setBackground(new Color(0, 0, 0));
		chckbxNewCheckBox.setForeground(new Color(248, 248, 255));
		chckbxNewCheckBox.setBounds(440, 168, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		final JCheckBox chckbxDelivery = new JCheckBox("DELIVERY");
		chckbxDelivery.setForeground(new Color(248, 248, 255));
		chckbxDelivery.setBackground(new Color(0, 0, 0));
		chckbxDelivery.setBounds(440, 202, 97, 23);
		panel.add(chckbxDelivery);
		
		
		final JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(248, 248, 255));
		textArea.setBorder(new LineBorder(new Color(255, 255, 255), 8));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setBounds(960, 162, 279, 359);
		frame.getContentPane().add(textArea);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(59, 196, 117, 42);
		panel_2.add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(255, 0, 255));
		btnReset.setBounds(59, 112, 117, 47);
		panel_2.add(btnReset);
		
	
	
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textArea.setText(null);
				label_6.setText(null);
				label7.setText(null);
				label_8.setText(null);
				label_9.setText(null);
				label_10.setText(null);
				label_11.setText(null);
				
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminmenu.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnTotl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText()!=null ||textField_1.getText()!=null ||textField_2.getText()!=null )
				{
				double vegml=Double.parseDouble(textField.getText());
				double i=30;
				double vml;
				vml=( vegml*i);
				String v=String.format("%.2f",vml);
				label7.setText(v);
				
				double chiml=Double.parseDouble(textField_1.getText());
				double j=40;
				double cml;
				cml=( chiml*j);
				String c=String.format("%.2f",cml+vml);
				label7.setText(c);
				
				double fhml=Double.parseDouble(textField_2.getText());
				double k=40;
				double fml;
				fml=( fhml*k);
				String f=String.format("%.2f",fml+cml+vml);
				label7.setText(f);
				

				double l=0;
				
				if(chckbxDelivery.isSelected())
				{
					String pDelivery1=String.format("%.2f",l);
					label_8.setText(pDelivery1);
					l=20;
				}
				else
				{
					label_8.setText("0");
					
				}
				double drinks=Double.parseDouble(textField_3.getText());
				double d1= 20.0 * drinks;
				double d2= 20.0 * drinks;
				double d3= 30.0 * drinks;
				double d4= 40.0 * drinks;
				double d5= 9.0 * drinks;
				double d6= 9.0 * drinks;
				double d7= 25.0 * drinks;
				double d8= 25.0 * drinks;
				String drin;
				if(comboBox.getSelectedItem().equals("COKE"));
			    {
					String d11=String.format("%.2f",d1);
					label_6.setText(d11);
					drin=d11;
				}
			    if(comboBox.getSelectedItem().equals("MIRINDA"));
			    {
					String d22=String.format("%.2f",d2);
					label_6.setText(d22);
					drin=d22;

				}
			    if(comboBox.getSelectedItem().equals("APPLE SHAKE"));
			    {
					String d33=String.format("%.2f",d3);
					label_6.setText(d33);
					drin=d33;

				}
			    if(comboBox.getSelectedItem().equals("MANGO SHAKE"));
			    {
					String d44=String.format("%.2f",d4);
					label_6.setText(d44);
					drin=d44;

				}
			    if(comboBox.getSelectedItem().equals("TEA"));
			    {
					String d55=String.format("%.2f",d5);
					label_6.setText(d55);
					drin=d55;

				}
			    if(comboBox.getSelectedItem().equals("COFFEE"));
			    {
					String d66=String.format("%.2f",d6);
					label_6.setText(d66);
					drin=d66;

				}
			    if(comboBox.getSelectedItem().equals("ORANGE JUICE"));
			    {
					String d77=String.format("%.2f",d7);
					label_6.setText(d77);
					drin=d77;

				}
			    if(comboBox.getSelectedItem().equals("LEMONADE"));
			    {
					String d88=String.format("%.2f",d8);
					label_6.setText(d88);
					drin=d88;

				}
			    
			    double t1=Double.parseDouble(label_6.getText());
			    double t2=Double.parseDouble(label7.getText());
			    double t3=Double.parseDouble(label_8.getText());
			    double ttl=(t1+t2+t3)/100;
			    String tl;
			    if(chckbxNewCheckBox.isSelected())
			    {
			    	 tl=String.format("%.2f",ttl);
			    	label_9.setText(tl);
			    	
			    }
			    else
			    {
			    	tl="0";
			    	label_9.setText(tl);
			    }
			    
			    
			    double t4=Double.parseDouble(label_9.getText());
			    
			    double subt=(t1+t2+t3);
			    String sbt=String.format("%.2f",subt);
			    label_10.setText(sbt);
			    
			    double t=(t1+t2+t3+t4);
			    String st=String.format("%.2f",t);
			    label_11.setText(st);
				textArea.setText( "***********************************************************"
                        + "\n\tRAINBOW HOTEL\t\n"
       + " ********************************************************"
       + "                                                         \n"
       + "                                                         \n"
       + "COST OF MEAL                                        "+f+"\n"
       + "COST OF DRINKS                                   "+drin+"\n"
       + "COST OF DELIVERY                                    "+l+"\n"
       + "COST OF TAX                                        "+tl+"\n"
       		+ "********************************************************\n"
       + "COST OF TOTAL                                      "+st+"\n"
       		+ "********************************************************\n");
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER QUANTITY FOR MEAL ");	

				}		
			
			}
		});
		JButton btnReciept = new JButton("reciept");
		btnReciept.setBackground(new Color(255, 215, 0));
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try{
				textArea.print();
			
			}catch(java.awt.print.PrinterException e)
			{
			System.err.format("NO PRINTER FOUND", e.getMessage())	;
			}
			
			
			}
		});
		btnReciept.setBounds(1019, 545, 147, 37);
		frame.getContentPane().add(btnReciept);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\logosmall.png"));

		label.setBounds(334, -54, 330, 171);
		frame.getContentPane().add(label);

		
	}

}

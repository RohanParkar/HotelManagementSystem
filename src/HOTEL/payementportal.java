package HOTEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payementportal {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public void setVisible(boolean b)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payementportal window = new payementportal();
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
	public payementportal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 291, 308);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPayement = new JLabel("PAYEMENT");
		lblPayement.setForeground(new Color(255, 255, 224));
		lblPayement.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPayement.setBounds(63, 11, 151, 41);
		frame.getContentPane().add(lblPayement);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("CASH");
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(63, 82, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnDebitCard = new JRadioButton("ONLINE");
		rdbtnDebitCard.setBackground(new Color(0, 0, 0));
		rdbtnDebitCard.setForeground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnDebitCard);
		rdbtnDebitCard.setBounds(63, 120, 109, 23);
		frame.getContentPane().add(rdbtnDebitCard);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.setBackground(new Color(127, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					JOptionPane.showMessageDialog(null,"Pay at the time of CheckOut");
					frame.setVisible(false);
				}
				else if(rdbtnDebitCard.isSelected())
				{
				onlinepayement op=new onlinepayement();
				op.setVisible(true);
				frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"SELECT ONLINE OR CASH");	
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(63, 180, 151, 41);
		frame.getContentPane().add(btnNewButton);
	}
	@SuppressWarnings("unused")
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	
}

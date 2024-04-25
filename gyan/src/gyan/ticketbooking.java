package gyan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticketbooking {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(200, 200, 681, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 24));
		lblNewLabel.setBounds(127, 10, 376, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_1.setBounds(67, 111, 108, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tb1.setBounds(299, 110, 245, 33);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(67, 196, 154, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "SAHOO", "SALAR"}));
		cb1.setBounds(299, 194, 133, 27);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER TCKS");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 22));
		lblNewLabel_3.setBounds(67, 297, 200, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(299, 294, 133, 28);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("Salar"))
				{
					bill=bill+nt*200;
				}
				if(movie.equals("Sahoo"))
				{
					bill=bill+nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME :"+name+"\n MOVIE NAME :"+movie+"\n NUMBER TICKETS :"+nt+"\n AMOUNT :"+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showConfirmDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else
				{
					JOptionPane.showConfirmDialog(btnNewButton, "BOOKING CANCELLED");
				}
				
					
			}
		});
		btnNewButton.setBackground(new Color(64, 0, 64));
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnNewButton.setBounds(267, 377, 108, 33);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 363, 563, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(64, 0, 64));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\S.Gyanjoth Singh\\Downloads\\Cinema-680x500.jpg"));
		lblNewLabel_4.setBounds(0, 0, 680, 496);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 70, 563, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(67, 82, 541, 2);
		frame.getContentPane().add(separator_2);
	}

}

package gyan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticketbooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
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
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING ");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(122, 10, 369, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(71, 112, 90, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(71, 176, 90, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(71, 243, 135, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER TCKS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(71, 306, 136, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "AMEERPET", "LB NAGAR", "NAGOLE", "UPPAL"}));
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cb1.setBounds(267, 166, 106, 31);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "AMEERPET", "LB NAGAR", "NAGOLE", "UPPAL"}));
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cb2.setBounds(267, 236, 106, 31);
		frame.getContentPane().add(cb2);
		
		JSpinner jsp1 = new JSpinner();
		jsp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		jsp1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jsp1.setBounds(267, 306, 74, 28);
		frame.getContentPane().add(jsp1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String s= (String) cb1.getSelectedItem();
				String d= (String) cb2.getSelectedItem();
				int nt=(int) jsp1.getValue();
				int bill=0;
				if(s.equals(d))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please cheack stations");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "name : "+name+"\n source : "+s+"\n Destination : "+d+
							                      "\n Number of Tickets : "+nt+"\n AMoount ; "+bill+
							                      "\n 😊😊!!!......HAPPY JOURNEY......!!!😊😊");
				}
				
			}	
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(233, 393, 94, 27);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(255, 255, 128));
		tb1.setBounds(267, 101, 145, 31);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\S.Gyanjoth Singh\\Downloads\\RAIL"));
		lblNewLabel_5.setBounds(0, 10, 586, 453);
		frame.getContentPane().add(lblNewLabel_5);
	}

	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
}

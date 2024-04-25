package gyan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class LOGINPAGE {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPAGE window = new LOGINPAGE();
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
	public LOGINPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 0, 64));
		frame.setBounds(100, 100, 651, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(196, 10, 274, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME ");
		lblNewLabel_1.setForeground(new Color(242, 242, 242));
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel_1.setBounds(106, 135, 194, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(213, 213, 213));
		lblNewLabel_2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel_2.setBounds(106, 225, 121, 31);
		frame.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		t1.setBounds(321, 134, 149, 37);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1.setBounds(321, 224, 149, 34);
		frame.getContentPane().add(p1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(579, 306, -444, 9);
		frame.getContentPane().add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 128));
		separator.setBounds(35, 306, 562, 2);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=t1.getText();
				String password=p1.getText();
				if(username.contains("gyan singh") && password.contains("6969"))
				{
					t1.setText(null);
					p1.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid User","Login Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(252, 341, 121, 34);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}

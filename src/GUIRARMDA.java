import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRARMDA {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRARMDA window = new GUIRARMDA();
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
	public GUIRARMDA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRarmdaLogin = new JLabel("RARMDA Login");
		lblRarmdaLogin.setBounds(215, 21, 85, 31);
		frame.getContentPane().add(lblRarmdaLogin);
		
		textField = new JTextField();
		textField.setBounds(167, 80, 233, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 128, 233, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(164, 222, 89, 31);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New here? Register");
		btnNewButton_1.setBounds(348, 287, 141, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(60, 83, 65, 14);
		frame.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(60, 131, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 171, 233, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblId = new JLabel("ID #");
		lblId.setBounds(60, 174, 46, 14);
		frame.getContentPane().add(lblId);
	}
}

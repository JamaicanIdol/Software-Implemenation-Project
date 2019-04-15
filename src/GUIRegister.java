import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;



public class GUIRegister {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRegister window = new GUIRegister();
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
	public GUIRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 455, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setBounds(192, 11, 82, 14);
		frame.getContentPane().add(lblRegistration);
		
		textField = new JTextField();
		textField.setBounds(134, 64, 199, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 95, 199, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 126, 199, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(39, 67, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(39, 98, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setBounds(27, 129, 86, 14);
		frame.getContentPane().add(lblConfirmPassword);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(134, 195, 109, 23);
		frame.getContentPane().add(rdbtnStudent);
		
		JRadioButton rdbtnRenter = new JRadioButton("Renter");
		rdbtnRenter.setBounds(134, 221, 109, 23);
		frame.getContentPane().add(rdbtnRenter);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the following:");
		lblSelectOneOf.setBounds(134, 174, 140, 14);
		frame.getContentPane().add(lblSelectOneOf);
		
		JButton btnSubmit = new JButton("Submit");			
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String insert_data = "insert into"
			}
		});
		btnSubmit.setBounds(134, 293, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		
		JButton btnAlreadyHaveAn = new JButton("Already have an account? Login");
		btnAlreadyHaveAn.setBounds(212, 367, 212, 23);
		frame.getContentPane().add(btnAlreadyHaveAn);
		
		JLabel lblIdIs = new JLabel("ID # is automatically generated.");
		lblIdIs.setBounds(134, 267, 199, 14);
		frame.getContentPane().add(lblIdIs);
	}

	
		
	}


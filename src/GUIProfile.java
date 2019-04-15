import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GUIProfile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIProfile window = new GUIProfile();
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
	public GUIProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("Image");
		lblImage.setBounds(130, 11, 122, 97);
		frame.getContentPane().add(lblImage);
		
		JButton btnBrowseForImage = new JButton("Browse for image");
		btnBrowseForImage.setBounds(130, 119, 122, 23);
		frame.getContentPane().add(btnBrowseForImage);
		
		textField = new JTextField();
		textField.setBounds(105, 170, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 203, 202, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 237, 202, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(105, 268, 202, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(25, 173, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmailAddress = new JLabel("Email address");
		lblEmailAddress.setBounds(10, 206, 74, 14);
		frame.getContentPane().add(lblEmailAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setBounds(10, 240, 74, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 274, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JButton btnMakeChanges = new JButton("Make changes");
		btnMakeChanges.setBounds(105, 325, 114, 23);
		frame.getContentPane().add(btnMakeChanges);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(218, 325, 89, 23);
		frame.getContentPane().add(btnMainMenu);
		
		JLabel lblId = new JLabel("ID#: ");
		lblId.setBounds(105, 299, 46, 14);
		frame.getContentPane().add(lblId);
	}

}

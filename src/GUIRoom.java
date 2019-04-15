import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIRoom {

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
					GUIRoom window = new GUIRoom();
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
	public GUIRoom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddRoom = new JButton("Add Room");
		btnAddRoom.setBounds(148, 212, 89, 23);
		frame.getContentPane().add(btnAddRoom);
		
		JLabel lblImage = new JLabel("Image");
		lblImage.setBounds(36, 23, 152, 135);
		frame.getContentPane().add(lblImage);
		
		JButton btnBrowseForImage = new JButton("Browse for image");
		btnBrowseForImage.setBounds(46, 168, 152, 23);
		frame.getContentPane().add(btnBrowseForImage);
		
		textField = new JTextField();
		textField.setBounds(262, 23, 162, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 54, 162, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOwner = new JButton("Owner");
		btnOwner.setBounds(259, 85, 89, 23);
		frame.getContentPane().add(btnOwner);
		
		textField_2 = new JTextField();
		textField_2.setBounds(262, 119, 162, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(262, 150, 162, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(206, 26, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(206, 57, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(206, 122, 46, 14);
		frame.getContentPane().add(lblContact);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(206, 153, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JButton btnRemoveARoom = new JButton("Remove a room");
		btnRemoveARoom.setBounds(247, 212, 127, 23);
		frame.getContentPane().add(btnRemoveARoom);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(49, 212, 89, 23);
		frame.getContentPane().add(btnMainMenu);
	}

}

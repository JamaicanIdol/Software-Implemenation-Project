import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUIProfileStudent {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIProfileStudent window = new GUIProfileStudent();
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
	public GUIProfileStudent() {
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
		
		JButton button = new JButton("Browse for image");
		button.setBounds(130, 79, 122, 23);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(99, 139, 202, 20);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("Name");
		label.setBounds(43, 142, 46, 14);
		frame.getContentPane().add(label);
		
		JButton button_1 = new JButton("Make changes");
		button_1.setBounds(127, 227, 114, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Main menu");
		button_2.setBounds(240, 227, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("ID#: ");
		label_1.setBounds(99, 170, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnCancelDate = new JButton("Cancel date");
		btnCancelDate.setBounds(39, 227, 89, 23);
		frame.getContentPane().add(btnCancelDate);
	}

}

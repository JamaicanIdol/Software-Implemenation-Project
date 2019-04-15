import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUISchedule {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISchedule window = new GUISchedule();
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
	public GUISchedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 11, 249, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchNameid = new JLabel("Search name/ID#");
		lblSearchNameid.setBounds(10, 14, 88, 14);
		frame.getContentPane().add(lblSearchNameid);
		
		JLabel lblAvailaleDates = new JLabel("Availale dates");
		lblAvailaleDates.setBounds(10, 42, 88, 14);
		frame.getContentPane().add(lblAvailaleDates);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 42, 249, 99);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 158, 221, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTypeDateYou = new JLabel("Type date you want");
		lblTypeDateYou.setBounds(10, 161, 103, 14);
		frame.getContentPane().add(lblTypeDateYou);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 189, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTimeYouWant = new JLabel("Time you want");
		lblTimeYouWant.setBounds(10, 193, 97, 14);
		frame.getContentPane().add(lblTimeYouWant);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 220, 221, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblContactInformation = new JLabel("Contact information");
		lblContactInformation.setBounds(10, 223, 103, 14);
		frame.getContentPane().add(lblContactInformation);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(139, 273, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(230, 273, 89, 23);
		frame.getContentPane().add(btnMainMenu);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUISearch {

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
					GUISearch window = new GUISearch();
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
	public GUISearch() {
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
		
		textField = new JTextField();
		textField.setBounds(10, 35, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 35, 122, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 35, 111, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblName = new JLabel("Name/ID#:");
		lblName.setBounds(43, 11, 63, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPriceRange = new JLabel("Price range:");
		lblPriceRange.setBounds(189, 11, 63, 14);
		frame.getContentPane().add(lblPriceRange);
		
		JLabel lblOccupancy = new JLabel("Occupancy:");
		lblOccupancy.setBounds(329, 11, 63, 14);
		frame.getContentPane().add(lblOccupancy);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(166, 66, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(265, 66, 89, 23);
		frame.getContentPane().add(btnMainMenu);
	}

}

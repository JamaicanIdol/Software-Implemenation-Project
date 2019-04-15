import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GUIHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIHome window = new GUIHome();
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
	public GUIHome() {
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
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(27, 31, 119, 23);
		frame.getContentPane().add(btnProfile);
		
		JButton btnRoom = new JButton("Room");
		btnRoom.setBounds(27, 82, 119, 23);
		frame.getContentPane().add(btnRoom);
		
		JButton btnSearchForRenter = new JButton("Search for Renter");
		btnSearchForRenter.setBounds(27, 137, 119, 23);
		frame.getContentPane().add(btnSearchForRenter);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBounds(27, 189, 119, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.setBounds(191, 31, 119, 23);
		frame.getContentPane().add(btnAboutUs);
		
		JButton btnContact = new JButton("Contact");
		btnContact.setBounds(191, 82, 119, 23);
		frame.getContentPane().add(btnContact);
	}

}

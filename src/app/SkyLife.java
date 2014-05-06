package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SkyLife {

	private JFrame frame;
	private JTextField txtMaster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkyLife window = new SkyLife();
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
	public SkyLife() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtMaster = new JTextField();
		txtMaster.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaster.setText("Master");
		frame.getContentPane().add(txtMaster, BorderLayout.NORTH);
		txtMaster.setColumns(10);
		

		JButton btnTestBranch = new JButton("Test Branch 1");
		frame.getContentPane().add(btnTestBranch, BorderLayout.WEST);

		JButton btnTestBranch2 = new JButton("Test Branch 2");
		frame.getContentPane().add(btnTestBranch2, BorderLayout.EAST);
		
		JButton btnTestManuel = new JButton("test manuel");
		frame.getContentPane().add(btnTestManuel, BorderLayout.SOUTH);
		
		JButton btnTestManuel_1 = new JButton("test manuel 2");
		frame.getContentPane().add(btnTestManuel_1, BorderLayout.CENTER);

	}

}

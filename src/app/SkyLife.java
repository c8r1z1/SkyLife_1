package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class SkyLife {

	private JFrame frame;
	private JTextField txtTest;
	private JTextField txtTest_1;

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
		
		txtTest = new JTextField();
		txtTest.setText("test");
		frame.getContentPane().add(txtTest, BorderLayout.CENTER);
		txtTest.setColumns(10);
		
		txtTest_1 = new JTextField();
		txtTest_1.setText("test2");
		frame.getContentPane().add(txtTest_1, BorderLayout.NORTH);
		txtTest_1.setColumns(10);
	}

}

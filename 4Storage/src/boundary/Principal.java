package boundary;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void TelaPrincipal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @param b
	 * @param btnEntra
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 814, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblPrincipal = new JLabel("principal");
		lblPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblPrincipal.setBounds(147, 111, 418, 268);
		frame.getContentPane().add(lblPrincipal);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
}

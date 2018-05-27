package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin {

	private JFrame frmDiscovirtual;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmDiscovirtual.setLocationRelativeTo(null);
					window.frmDiscovirtual.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiscovirtual = new JFrame();
		frmDiscovirtual.setResizable(false);
		frmDiscovirtual.setTitle("4Storage");
		frmDiscovirtual.setMinimumSize(new Dimension(1000, 700));
		frmDiscovirtual.setMaximumSize(new Dimension(1000, 700));
		frmDiscovirtual.setBounds(new Rectangle(0, 0, 1000, 700));
		frmDiscovirtual.setBounds(100, 100, 450, 300);
		frmDiscovirtual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiscovirtual.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frmDiscovirtual.getContentPane().add(panel);
		panel.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 994, 671);
		desktopPane.setBackground(new Color(0, 0, 0, 0));
		panel.add(desktopPane);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/Images/4Storage.png")));
		label_1.setBounds(376, 112, 270, 82);
		desktopPane.add(label_1);

		JLabel lblNoPossuiConta = new JLabel("N\u00E3o Possui Conta?");
		lblNoPossuiConta.setFont(new Font("SansSerif", Font.PLAIN, 10));
		lblNoPossuiConta.setBounds(417, 375, 89, 16);
		panel.add(lblNoPossuiConta);

		JLabel lblNomeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeUsuario.setBounds(452, 254, 110, 14);
		panel.add(lblNomeUsuario);

		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(407, 279, 200, 25);
		panel.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);

		txtSenha = new JPasswordField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(407, 340, 200, 25);
		panel.add(txtSenha);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setBounds(452, 315, 110, 14);
		panel.add(lblSenha);

		JButton btnEntra = new JButton("");
		btnEntra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkLogin(txtNomeUsuario.getText(), new String(txtSenha.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Bem Vindo!!!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);					
					Principal p = new Principal();
					p.TelaPrincipal();

				}else {
					JOptionPane.showMessageDialog(null, "Dados Inválidos", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEntra.setIcon(new ImageIcon(TelaLogin.class.getResource("/Images/seta.png")));
		btnEntra.setBounds(567, 376, 40, 40);
		panel.add(btnEntra);

		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro cadScreen = new TelaCadastro();
				desktopPane.add(cadScreen);
				cadScreen.setVisible(true);
			}
		});
		btnCriar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCriar.setForeground(Color.RED);
		btnCriar.setBounds(496, 368, 56, 28);
		btnCriar.setBackground(new Color(0, 0, 0, 0));
		panel.add(btnCriar);

		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon(TelaLogin.class.getResource("/Images/back.png")));
		lblBackground.setBounds(0, 0, 994, 671);
		panel.add(lblBackground);

	}

	public boolean checkLogin(String login, String senha) {
		return login.equals("user") && senha.equals("1234");
	}

}

package boundary;

import java.awt.EventQueue;


import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaCadastro extends JInternalFrame {
	private JTextField txtNomeUsuario;
	private JTextField txtEmailUsuario;
	private JPasswordField txtSenhaUsuario;
	private JPasswordField txtConfirmaSenha;

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           System.err.println(ex);
        }
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void LimparCampos() {
		txtConfirmaSenha.setText("");
		txtEmailUsuario.setText("");
		txtNomeUsuario.setText("");
		txtSenhaUsuario.setText("");
	}
	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setClosable(true);
		setBounds(165, 0, 671, 671);
		getContentPane().setLayout(null);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LimparCampos();
				
			}
		});
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});
		btnCancelar.setBackground(new Color(255, 182, 193));
		btnCancelar.setBounds(145, 412, 116, 37);
		getContentPane().add(btnCancelar);
		
		btnLimpar.setBackground(new Color(255, 250, 205));
		btnLimpar.setBounds(264, 412, 116, 37);
		getContentPane().add(btnLimpar);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setBounds(127, 288, 388, 16);
		getContentPane().add(lblSenha);
		
		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setColumns(10);
		txtSenhaUsuario.setBounds(127, 308, 388, 30);
		getContentPane().add(txtSenhaUsuario);
		
		JLabel lblNomeDeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeDeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDeUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNomeDeUsuario.setBounds(127, 184, 388, 16);
		getContentPane().add(lblNomeDeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setName("Nome");
		txtNomeUsuario.setBounds(127, 204, 388, 30);
		getContentPane().add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		txtEmailUsuario = new JTextField();
		txtEmailUsuario.setColumns(10);
		txtEmailUsuario.setBounds(127, 257, 388, 30);
		getContentPane().add(txtEmailUsuario);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(127, 237, 388, 16);
		getContentPane().add(lblEmail);
		
		txtConfirmaSenha = new JPasswordField();
		txtConfirmaSenha.setColumns(10);
		txtConfirmaSenha.setBounds(127, 358, 388, 30);
		getContentPane().add(txtConfirmaSenha);
		
		JLabel lblConfirmaSenha = new JLabel("Confirma Senha");
		lblConfirmaSenha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblConfirmaSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmaSenha.setBounds(127, 338, 388, 16);
		getContentPane().add(lblConfirmaSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar-se");
		btnCadastrar.setBackground(new Color(204, 255, 153));
		btnCadastrar.setBounds(381, 412, 116, 37);
		getContentPane().add(btnCadastrar);
		
		JLabel lblCadastro = new JLabel("CADASTRO DE NOVO USU\u00C1RIO");
		lblCadastro.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblCadastro.setBounds(127, 115, 341, 46);
		getContentPane().add(lblCadastro);
		
		JLabel backCadastro = new JLabel("Nome");
		backCadastro.setBounds(0, 0, 659, 640);
		backCadastro.setMinimumSize(new Dimension(671, 671));
		backCadastro.setMaximumSize(new Dimension(671, 671));
		backCadastro.setIcon(new ImageIcon(TelaCadastro.class.getResource("/Images/backCad.png")));
		getContentPane().add(backCadastro);

	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import boundary.TelaCadastro;
//import static boundary.TelaLogin.nick;
import boundary.TelaPrincipal;
import dao.UsuarioDAO;
import entities.Usuario;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dodo
 */
public class ControleUsuario {
    public static String nick = "";
    
    public static void criaUsuario(JTextField txtNomeUsuario, JTextField txtSenhaUsuario, JTextField txtEmailUsuario){
         Usuario user = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();
		if ((!txtNomeUsuario.getText().isEmpty()) && (!txtEmailUsuario.getText().isEmpty())
				&& (!txtSenhaUsuario.getText().isEmpty())) {
			user.setNomeUsuario(txtNomeUsuario.getText());
			user.setSenha(txtSenhaUsuario.getText());
			user.setEmail(txtEmailUsuario.getText());
			user.setEspacoMax(15000);
			user.setEspacoUsado(15000);

			dao.criaUsuario(user);
			new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + user.getNomeUsuario()
					+ "").mkdir();
			
		} else {
			JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos", "ERRO",
					JOptionPane.ERROR_MESSAGE);
		}
    }
    public static void checaUsuario(JTextField txtNomeUsuario, JTextField txtSenhaUsuario){
        UsuarioDAO dao = new UsuarioDAO();

        if (dao.checkLogin(txtNomeUsuario.getText(), txtSenhaUsuario.getText())) {
            nick = txtNomeUsuario.getText();
            
            new TelaPrincipal().setVisible(true);
			
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado ", " ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import entities.Usuario;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UsuarioDAO {

	public static void criaUsuario(Usuario user) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"INSERT INTO usuario (usuario_nome,usuario_email,usuario_senha,usuario_espaco_max,usuario_espaco_usado)VALUES(?,?,?,?,?)");
			stmt.setString(1, user.getNomeUsuario().replace(" ", "")); // SETA NA COLUNA 1 O NOME DE USUARIO
			stmt.setString(2, user.getEmail());// SETA NA COLUNA 2 O EMAIL DO USUARIO
			stmt.setString(3, user.getSenha());// SETA NA COLUNA 3 A SENHA DO USUARIO
			stmt.setDouble(4, user.getEspacoMax());// SETA NA COLUNA 4 O ESPAÇO MAXIMO DO DISCO
			stmt.setDouble(5, user.getEspacoLivre());// SETA NA COLUNA 5 ESPAÇO LIVRE NO DISCO

			stmt.executeUpdate(); // EXECUTA O UPDATE DO STMT SETADO ACIMA

			JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e, " ERRO", JOptionPane.ERROR_MESSAGE);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		criarDiretorioDeUsuario(user);
	}

	public static void criarDiretorioDeUsuario(Usuario user) {

		try {

			File diretorio = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\"
					+ user.getNomeUsuario() + "");
			diretorio.mkdir();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o diret�rio");
			System.out.println(ex);
		}
	}

	// A ROTINA ABAIXO É PARA VALIDAR O LOGIN
	public boolean checkLogin(String login, String senha) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean check = false;

		try {
			// comando para selecionar login e senha do usu�rio
			stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario_nome = ? and usuario_senha = ?");

			stmt.setString(1, login);
			stmt.setString(2, senha);
			rs = stmt.executeQuery(); // result set recebe o statemnt com o comando que libera a consulta

			if (rs.next()) { // condicao para verificar se existe o login e senha do input

				check = true; // se existe retorna checkLogin com true
			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Deu erro!: " + ex, " ERRO!", JOptionPane.ERROR_MESSAGE);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return check; // retorna a lista "usuarios"
	}

}

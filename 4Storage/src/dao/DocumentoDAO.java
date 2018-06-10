/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import entities.Documento;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr.W
 */
public class DocumentoDAO {

    public void uploadDocumento(Documento doc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO documento (documento_nome,documento_tamanho,documento_uploader_nome,documento_data)VALUES(?,?,?,?)");
            stmt.setString(1, doc.getNomeDoc());
            stmt.setDouble(2, doc.getTamanho());
            stmt.setString(3, doc.getUploader());
            stmt.setDate(4, new java.sql.Date(doc.getDataUpload().getTime()));

            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar documento :c --> " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void renomeiaDocumento(Documento doc) { //passa o objeto da classe para utilizacao das variasveis no banco
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("UPDATE documento SET documento_nome = ?, documento_tamanho = ? , documento_uploader_nome = ? , documento_data = ? WHERE documento_id = ?");
            stmt.setString(1, doc.getNomeDoc());
            stmt.setDouble(2, doc.getTamanho());
            stmt.setString(3, doc.getUploader());
            stmt.setDate(4, new java.sql.Date(doc.getDataUpload().getTime()));

            stmt.executeUpdate(); //exexuta a atualizacao da tabela

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex, "EROO", JOptionPane.ERROR_MESSAGE);
        } finally { // etapa necessaria para fechar a conexao CloseConnectionb
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void deletaDocumento(Documento doc) { //passa o objeto da classe para utilizacao das variasveis no banco
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM documento WHERE documento_id = ?"); //essa linha prepara os comandos que serao deletados da tabela documento
            stmt.setInt(1, doc.getIdDoc());//insere id

            stmt.executeUpdate(); //executa a atualizacao da tabela

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally { // etapa necessaria para fechar a conexao CloseConnectionb
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void copiaDocumento(Documento doc) {
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO documento (documento_nome,documento_tamanho,documento_uploader_nome,documento_data)VALUES(?,?,?,?)");
            stmt.setString(1, doc.getNomeDoc());
            stmt.setDouble(2, doc.getTamanho());
            stmt.setString(3, doc.getUploader());
            stmt.setDate(4, new java.sql.Date(doc.getDataUpload().getTime()));

            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar documento :c --> " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Documento> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Documento> documentos = new ArrayList<>(); //cria lista pra colocar os dados *1

        try {
            stmt = con.prepareStatement("SELECT * FROM documento"); //comando para selecionar tabela documento
            rs = stmt.executeQuery(); // result set recebe o statemnt com o comando que libera  consulta

            while (rs.next()) { //enquanto existir valor ele vai passar pro proximo ate lançar tds

                Documento documento = new Documento();
                //*1  
            //    documento.setIdDoc(rs.getInt("documento_id"));
                documento.setNomeDoc(rs.getString("documento_nome"));
                documento.setTamanho(rs.getInt("documento_tamanho"));
                documento.setUploader(rs.getString("documento_uploader_nome"));
                documento.setDataUpload(rs.getDate("documento_data"));

                documentos.add(documento);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro! :" + ex, "ERRO!", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return documentos; //retorna a lista "documentos"
    }
}
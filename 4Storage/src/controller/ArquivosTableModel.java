/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Documento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mr.W
 */
public class ArquivosTableModel extends AbstractTableModel {

    private List<Documento> dados = new ArrayList<>();
    private String[] colunas = {"Nome do Arquivo", "Tamanho", "Uploader", "Data"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; // retorna o nome da coluna correspondente passando o vetor de colunas
    }

    @Override
    public int getRowCount() {
        return dados.size();// retorna a quantidade de linhas (dados)

    }

    @Override
    public int getColumnCount() {
        return colunas.length; //retorna qtd de colunas
    }

    @Override
    public Object getValueAt(int linha, int coluna) {// para retornar o valor a partir de uma linha e uma coluna
        switch (coluna) {
            case 0:
                return dados.get(linha).getNomeDoc();
            case 1:
                return dados.get(linha).getTamanho();
            case 2:
                return dados.get(linha).getUploader();
            case 3:
                return dados.get(linha).getDataUpload();
        }
        return null;
    }
    public void setValueAt(Object valor, int linha, int coluna){
        switch (coluna) {
            case 0:
                dados.get(linha).setNomeDoc((String) valor);
            case 1:
                dados.get(linha).setTamanho(Double.parseDouble((String) valor));
            case 2:
                dados.get(linha).setUploader((String) valor);
            case 3:
                dados.get(linha).setDataUpload(new java.util.Date((String) valor));
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    public void adicionaLinha(Documento doc) {
       // DocumentoDAO ddao = new DocumentoDAO();
        this.dados.add(doc); //adiciona o Documento
        this.fireTableDataChanged(); // atualiza os dados da tabela quando uma operação é realizada
    }

    public void removeLinha(int linha) {
        this.dados.remove(linha); //remove Documento
        this.fireTableRowsDeleted(linha, linha); //atualiza a tabela para a remoçaõ da linha correspondente
    }
}

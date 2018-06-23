/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import controller.ArquivosTableModel;
import controller.ControleArquivos;
import static controller.ControleUsuario.nick;
//import static controller.ControleArquivos.copiaArquivo;
import dao.DocumentoDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import entities.Documento;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr.W
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArquivosTableModel tableModel = new ArquivosTableModel();

    public TelaPrincipal() {
        initComponents();
        tabelaArquivos.setModel(tableModel);
        carregaTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        opcCopiar = new javax.swing.JMenuItem();
        opcExcluir = new javax.swing.JMenuItem();
        opcRenomear = new javax.swing.JMenuItem();
        painelTopo = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        painelLateral = new javax.swing.JPanel();
        btnMeuArmazenamento = new javax.swing.JButton();
        btnCompartilhados = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaArquivos = new javax.swing.JTable();
        btnUpload = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnRenomear = new javax.swing.JButton();
        btnCriaCopia = new javax.swing.JButton();

        opcCopiar.setText("Copiar");
        opcCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcCopiarMouseReleased(evt);
            }
        });
        jPopupMenu1.add(opcCopiar);

        opcExcluir.setText("Excluir");
        opcExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcExcluirMouseReleased(evt);
            }
        });
        jPopupMenu1.add(opcExcluir);

        opcRenomear.setText("Renomear");
        opcRenomear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcRenomearMouseReleased(evt);
            }
        });
        jPopupMenu1.add(opcRenomear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4 Storage - Meu Armazenamento");
        setPreferredSize(new java.awt.Dimension(800, 550));

        painelTopo.setPreferredSize(new java.awt.Dimension(890, 120));

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTopoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair))
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        painelLateral.setPreferredSize(new java.awt.Dimension(220, 100));

        btnMeuArmazenamento.setBackground(new java.awt.Color(51, 51, 51));
        btnMeuArmazenamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMeuArmazenamento.setForeground(new java.awt.Color(255, 255, 255));
        btnMeuArmazenamento.setText("Meu Armazenamento");

        btnCompartilhados.setBackground(new java.awt.Color(51, 51, 51));
        btnCompartilhados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCompartilhados.setForeground(new java.awt.Color(255, 255, 255));
        btnCompartilhados.setText("Compartilhados");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jButton1.setText("L");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("0 / 15gb");

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLateralLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeuArmazenamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(btnCompartilhados, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addComponent(btnMeuArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompartilhados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tabelaArquivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelaArquivos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        btnUpload.setBackground(new java.awt.Color(51, 51, 51));
        btnUpload.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upload.png"))); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnUpload.setMaximumSize(new java.awt.Dimension(71, 25));
        btnUpload.setMinimumSize(new java.awt.Dimension(71, 25));
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lixeira.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnExcluir.setMaximumSize(new java.awt.Dimension(71, 25));
        btnExcluir.setMinimumSize(new java.awt.Dimension(71, 25));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnRenomear.setBackground(new java.awt.Color(51, 51, 51));
        btnRenomear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRenomear.setForeground(new java.awt.Color(255, 255, 255));
        btnRenomear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/renomear.png"))); // NOI18N
        btnRenomear.setText("Renomear");
        btnRenomear.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRenomear.setMaximumSize(new java.awt.Dimension(71, 25));
        btnRenomear.setMinimumSize(new java.awt.Dimension(71, 25));
        btnRenomear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenomearActionPerformed(evt);
            }
        });

        btnCriaCopia.setBackground(new java.awt.Color(51, 51, 51));
        btnCriaCopia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCriaCopia.setForeground(new java.awt.Color(255, 255, 255));
        btnCriaCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/copiar.png"))); // NOI18N
        btnCriaCopia.setText("Criar Cópia");
        btnCriaCopia.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCriaCopia.setMaximumSize(new java.awt.Dimension(71, 25));
        btnCriaCopia.setMinimumSize(new java.awt.Dimension(71, 25));
        btnCriaCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriaCopiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRenomear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriaCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRenomear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCriaCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregaTabela() { //METODO QUE CARREGA A TABELA COM OS DOCUMENTOS DO USUARIO ASSIM Q ELE LOGA NO SISTEMA

        for (Documento doc : DocumentoDAO.read(nick)) {
            tableModel.adicionaLinha(doc);
        }

    }

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
//UPLOAD DE ARQUIVOS

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Buscar Arquivo");
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int retorno = fileChooser.showOpenDialog(this);

        Documento doc = new Documento();
        //ABAIXO PARA ADICIONAR DADOS DO ARQUIVO NA TABELA
        if (retorno == JFileChooser.APPROVE_OPTION) { //CONDIÇAO SE O BOTAO DE "ABRIR" DO FILECHOOSER COM O DOCUMENTO SLECIONADO FOR APERTADO 
            File file = fileChooser.getSelectedFile(); //PEGA O ARQUIVO SELECIONADO...

            tableModel.adicionaLinha(doc); //Adiciona o arquivo na tabela
//            double tamanhoArquivo = file.length() / 1048726D;// pega tamanho do arquivo em bytes
//            String fileSize = String.format("%.2f", tamanhoArquivo);
            java.util.Date d = new Date();
//            String data = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

            //ABAIXO PARA ADICIONAR DADOS DO ARQUIVO NO BANCO
            DocumentoDAO ddao = new DocumentoDAO(); //CRIA OBJETO DA CLASSE PRODUTODAO

            doc.setNomeDoc(file.getName());
            doc.setTamanho(file.length() / 1048726D);
            doc.setUploader(nick);
            doc.setDataUpload(d);

            ddao.uploadDocumento(doc); // inserir os comandos passados com o metodo uploadDocumento() do DAO
            ControleArquivos.criaArquivo(file);

    }//GEN-LAST:event_btnUploadActionPerformed
    }

    //OPC PARA COPIAR ARQUIVO
    private void opcCopiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcCopiarMouseReleased
    }//GEN-LAST:event_opcCopiarMouseReleased

    //OPC PARA EXCLUIR ARQUIVO
    private void opcExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcExcluirMouseReleased
    }//GEN-LAST:event_opcExcluirMouseReleased

    //OPC PARA RENOMEAR ARQUIVO
    private void opcRenomearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcRenomearMouseReleased
    }//GEN-LAST:event_opcRenomearMouseReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaArquivos.getSelectedRow() != -1) {
            Documento doc = new Documento();
            DocumentoDAO ddao = new DocumentoDAO();
            tableModel.removeLinha(tabelaArquivos.getSelectedRow());

           doc.setNomeDoc(tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString());
            
            ddao.deletaDocumento(doc);
            
            //PARA MOVER O ARQUIVO PARA LIXEIRA
            File origem = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + nick + "\\" + tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString() + "");
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\LIXEIRA\\");
            
//            try {
//                FileInputStream fis = new FileInputStream(origem);
//                InputStreamReader isr = new InputStreamReader(fis);
//                BufferedReader br = new BufferedReader(isr);
//                String linha = br.readLine();
//                StringBuffer sb = new StringBuffer();
//                while (linha != null){
//                    sb.append(linha);
//                    linha = br.readLine();
//                }
//                br.close();
//                isr.close();
//                fis.close();
//                FileWriter fw = new FileWriter(destino);
//                PrintWriter pw = new PrintWriter(fw);
//                pw.write(sb.toString());
//                pw.flush();
//                pw.close();
//                fw.close();
//                origem.delete();
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
            origem.renameTo(new File(destino, origem.getName()));

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenomearActionPerformed
    }//GEN-LAST:event_btnRenomearActionPerformed

    private void btnCriaCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriaCopiaActionPerformed
    }//GEN-LAST:event_btnCriaCopiaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompartilhados;
    private javax.swing.JButton btnCriaCopia;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMeuArmazenamento;
    private javax.swing.JButton btnRenomear;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem opcCopiar;
    private javax.swing.JMenuItem opcExcluir;
    private javax.swing.JMenuItem opcRenomear;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JTable tabelaArquivos;
    // End of variables declaration//GEN-END:variables
}

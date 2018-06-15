/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import controller.ArquivosTableModel;
import dao.DocumentoDAO;
import entities.Documento;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mr.W
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public String username;
    ArquivosTableModel tableModel = new ArquivosTableModel();
    
    public void recebeNome(String recebe) {
        username = recebe;
    }

    public TelaPrincipal() {
        initComponents();
       tabelaArquivos.setModel(tableModel);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        opcCopiar = new javax.swing.JMenuItem();
        opcExcluir = new javax.swing.JMenuItem();
        opcRenomear = new javax.swing.JMenuItem();
        painelTopo = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
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
        btnUpload2 = new javax.swing.JButton();
        btnUpload3 = new javax.swing.JButton();

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

        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTopoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
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

        btnUpload2.setBackground(new java.awt.Color(51, 51, 51));
        btnUpload2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpload2.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/renomear.png"))); // NOI18N
        btnUpload2.setText("Renomear");
        btnUpload2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnUpload2.setMaximumSize(new java.awt.Dimension(71, 25));
        btnUpload2.setMinimumSize(new java.awt.Dimension(71, 25));
        btnUpload2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpload2ActionPerformed(evt);
            }
        });

        btnUpload3.setBackground(new java.awt.Color(51, 51, 51));
        btnUpload3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpload3.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/copiar.png"))); // NOI18N
        btnUpload3.setText("Criar Cópia");
        btnUpload3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnUpload3.setMaximumSize(new java.awt.Dimension(71, 25));
        btnUpload3.setMinimumSize(new java.awt.Dimension(71, 25));
        btnUpload3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpload3ActionPerformed(evt);
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
                        .addComponent(btnUpload2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
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
                        .addComponent(btnUpload2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpload3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
//UPLOAD DE ARQUIVOS

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Buscar Arquivo");
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int retorno = fileChooser.showOpenDialog(this);

        Documento doc = new Documento();
        DocumentoDAO dao = new DocumentoDAO();
        //ABAIXO PARA ADICIONAR DADOS DO ARQUIVO NA TABELA
        if (retorno == JFileChooser.APPROVE_OPTION) { //CONDIÇAO SE O BOTAO DE "ABRIR" DO FILECHOOSER COM O DOCUMENTO SLECIONADO FOR APERTADO 
            File file = fileChooser.getSelectedFile(); //PEGA O ARQUIVO SELECIONADO...
           
            tableModel.adicionaLinha(doc); //Adiciona o arquivo na tabela
//
//            double tamanhoArquivo = file.length() / 1048726D;// pega tamanho do arquivo em bytes
//            String fileSize = String.format("%.2f", tamanhoArquivo);
            java.util.Date d = new Date();
//            String data = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
//
//            Object[] dados = {file.getName(), fileSize + "MB", username, data};
//            dtm.addRow(dados);

            //ABAIXO PARA ADICIONAR DADOS DO ARQUIVO NO BANCO
            DocumentoDAO ddao = new DocumentoDAO(); //CRIA OBJETO DA CLASSE PRODUTODAO
//
            doc.setNomeDoc(file.getName());
            doc.setTamanho(file.length()/1048726D);
            doc.setUploader(username);
            doc.setDataUpload(d);
//
            ddao.uploadDocumento(doc); // inserir os comandos passados com o metodo uploadDocumento() do DAO

            //PARA ADICIONAR O ARQUIVO NA SUA RESPECTIVA PASTA
            new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\").mkdir();
            File origem = new File(file.getPath());
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\" + origem.getName() + "");

            try { //tenta copiar arquivo passando local de origem e destino
                copy(origem, destino);
            } catch (IOException ex) { //caso nao consiga copiar arquivo, emite mensagem
                System.out.println("Erro> " + ex);
            }
    }//GEN-LAST:event_btnUploadActionPerformed
    }

   //OPC PARA COPIAR ARQUIVO
    private void opcCopiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcCopiarMouseReleased
        if (tabelaArquivos.getSelectedRow() != -1) { //essa linha confere se um item da tabela foi selecionado (se não retorna -1)
            Documento doc = new Documento();
            DocumentoDAO ddao = new DocumentoDAO();

//            doc.setNomeDoc(tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString());
//            doc.setTamanho((double) tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 1));
//            doc.setUploader(tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 2).toString());
//            doc.setDataUpload((Date) tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 3));
//            
//            ddao.copiaDocumento(doc); // inserir os comandos passados com o metodo copiarDocumentos() do DAO
//
//            readJTable();

            //PARA ADICIONAR O ARQUIVO NA SUA RESPECTIVA PASTA
            File origem = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\" + tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString() + "");
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\" + origem.getName() + "(1)");

            try { //tenta copiar arquivo passando local de origem e destino
                copy(origem, destino);
            } catch (IOException ex) { //caso nao consiga copiar arquivo, emite mensagem
                System.out.println("Erro> " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um arquivo");
        }

    }//GEN-LAST:event_opcCopiarMouseReleased

    //OPC PARA EXCLUIR ARQUIVO
    private void opcExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcExcluirMouseReleased
        if (tabelaArquivos.getSelectedRow() != -1) {
            Documento doc = new Documento();
            DocumentoDAO ddao = new DocumentoDAO();
            
//            doc.setNomeDoc(tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString());
//            
//            ddao.deletaDocumento(doc);
//            
//            readJTable();
//            
            //PARA MOVER O ARQUIVO PARA LIXEIRA
            File origem = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\" + tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString() + "");
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\LIXEIRA\\");
            origem.renameTo(new File(destino,origem.getName()));
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_opcExcluirMouseReleased

    //OPC PARA RENOMEAR ARQUIVO
    private void opcRenomearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcRenomearMouseReleased

    }//GEN-LAST:event_opcRenomearMouseReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaArquivos.getSelectedRow() != -1) {
            Documento doc = new Documento();
            DocumentoDAO ddao = new DocumentoDAO();
            tableModel.removeLinha(tabelaArquivos.getSelectedRow());
            
//            doc.setNomeDoc(tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString());
//            
//            ddao.deletaDocumento(doc);
//            
//            readJTable();
//            
            //PARA MOVER O ARQUIVO PARA LIXEIRA
            File origem = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + username + "\\" + tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString() + "");
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\LIXEIRA\\");
            origem.renameTo(new File(destino,origem.getName()));
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnUpload2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpload2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpload2ActionPerformed

    private void btnUpload3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpload3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpload3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       new TelaLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    public static void copy(File origem, File destino) throws IOException {//ROTINA DE UPLOAD DE ARQUIVOS
        if (destino.exists()) {
            return;
        }
        FileInputStream source = new FileInputStream(origem);   //atribui ao source "busca" o caminho do arquivo como input
        FileOutputStream destination = new FileOutputStream(destino); // atribui a destination o destino do arquivo como output
        FileChannel sourceFileChannel = source.getChannel();
        FileChannel destinationFileChannel = destination.getChannel();
        long size = sourceFileChannel.size();
        sourceFileChannel.transferTo(0, size, destinationFileChannel);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompartilhados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMeuArmazenamento;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnUpload2;
    private javax.swing.JButton btnUpload3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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

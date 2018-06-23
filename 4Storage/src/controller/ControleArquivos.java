/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import static controller.ControleUsuario.nick;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *
 * @author Dodo
 */
public class ControleArquivos {
    
    public static void criaArquivo(File file){
            //PARA ADICIONAR O ARQUIVO NA SUA RESPECTIVA PASTA
            new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + nick + "\\").mkdir();
            File origem = new File(file.getPath());
            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + nick + "\\" + origem.getName() + "");

            try { //tenta copiar arquivo passando local de origem e destino
                copy(origem, destino);
             } catch (IOException ex) { //caso nao consiga copiar arquivo, emite mensagem
                System.out.println("Erro> " + ex);
            }
            
           
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
//    public static void copiaArquivo(){
//               //PARA ADICIONAR O ARQUIVO NA SUA RESPECTIVA PASTA
//            File origem = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + nick + "\\" + tabelaArquivos.getValueAt(tabelaArquivos.getSelectedRow(), 0).toString() + "");
//            File destino = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\" + nick + "\\" + origem.getName() + "(1)");
//
//            try { //tenta copiar arquivo passando local de origem e destino
//                copy(origem, destino);
//            } catch (IOException ex) { //caso nao consiga copiar arquivo, emite mensagem
//                System.out.println("Erro> " + ex);
//            }
//         }
}

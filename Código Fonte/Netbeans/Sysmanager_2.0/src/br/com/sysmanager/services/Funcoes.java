/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.services;

import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osenias
 */
public class Funcoes {


    public static int getCodigo(String texto){
        int iCodigo = Integer.parseInt(texto.substring(texto.indexOf("(") +1, texto.indexOf(")")));
        return iCodigo;
    }

    public static void limpaComboBox(JComboBox jComboBox){

        DefaultComboBoxModel modelJcomboBox = (DefaultComboBoxModel) jComboBox.getModel();

        modelJcomboBox.removeAllElements();
    }

    public static void limpaLinhasTable(JTable jTable){

        DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();

        int linhas = jTable.getRowCount();
            if(linhas > 0){
                for(int i = linhas-1; i >= 0; --i){
                    dtm.removeRow(i);
                }
            }
    }

    public static void removeLinhaTable(JTable tbl){
        int[] linha = tbl.getSelectedRows();
        
        DefaultTableModel remover = (DefaultTableModel)tbl.getModel();

        for(int i = (linha.length - 1); i>=0; --i){
            remover.removeRow(linha[i]);
        }
    }

    public static void limpaTela(JPanel panel) {

        Component c;

        for (int i = 0; i < panel.getComponents().length; i++){
            c = panel.getComponent(i);

            if (c instanceof JTextField){
                ((JTextField)c).setText("");
            } else if (c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setValue("");
            } else if (c instanceof JTextArea){
                ((JTextArea)c).setText("");
            } else if (c instanceof JPasswordField){
                ((JPasswordField)c).setText("");
            /* } else if (c instanceof JComboBox) {
                ((JComboBox)c).setSelectedIndex(0);  */
            } else if (c instanceof JLabel){
                if (((JLabel)c).getName() != null){
                    String sAux = ((JLabel)c).getName();
                    if (sAux.equals("jlblCodigo"))
                        ((JLabel)c).setText("");
                }
            }
        }
    }


    public static void desabilitaCampos(JPanel panel) {

        Component c;

        for (int i = 0; i < panel.getComponents().length; i++){
            c = panel.getComponent(i);

            if (c instanceof JTextField){
                ((JTextField)c).setEditable(false);
            } else if (c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setEditable(false);
            } else if (c instanceof JTextArea){
                ((JTextArea)c).setEditable(false);
            } else if (c instanceof JPasswordField){
                ((JPasswordField)c).setEditable(false);
            } else if (c instanceof JComboBox) {
                ((JComboBox)c).setEnabled(false);
            } else if(c instanceof JTable){
                ((JTable)c).setEnabled(false);
            } else if(c instanceof JButton){
                ((JButton)c).setEnabled(false);
            }
        }
    }


    public static void habilitaCampos(JPanel panel) {

        Component c;

        for (int i = 0; i < panel.getComponents().length; i++){
            c = panel.getComponent(i);

            if (c instanceof JTextField){
                ((JTextField)c).setEditable(true);
            } else if (c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setEditable(true);
            } else if (c instanceof JTextArea){
                ((JTextArea)c).setEditable(true);
            } else if (c instanceof JPasswordField){
                ((JPasswordField)c).setEditable(true);
            } else if (c instanceof JComboBox) {
                ((JComboBox)c).setEnabled(true);
            } else if(c instanceof JTable){
                ((JTable)c).setEnabled(true);
            } else if(c instanceof JButton){
                ((JButton)c).setEnabled(true);
            }
        }
    }

    public static DefaultTableModel getModel(JTable jTable){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        return model;
    }

    public static void mensagemInforma(String sMensagem){
        JOptionPane.showMessageDialog(null, sMensagem, "Sysmanager - Mensagem de Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mensagemErro(String sMensagem){
    	JOptionPane.showMessageDialog(null, sMensagem, "Sysmanager - Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void mensagemAviso(String sMensagem){
    	JOptionPane.showMessageDialog(null, sMensagem, "Sysmanager - Mensagem de Aviso", JOptionPane.WARNING_MESSAGE);
    }

    public static boolean mensagemConfirma(String sMensagem){
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, sMensagem, "Sysmanager - Mensagem de Confirmação",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        return (i == 0);
    }
}

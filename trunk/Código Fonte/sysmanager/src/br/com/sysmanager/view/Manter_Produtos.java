/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Produtos.java
 *
 * Created on 26/08/2009, 14:40:05
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.FacadeProduto;
import br.com.sysmanager.facades.FacadeUnidadeMedida;
import javax.swing.JInternalFrame;

/**
 *
 * @author Osenias
 */
public class Manter_Produtos extends javax.swing.JInternalFrame {

    private FacadeProduto facadeProduto = new FacadeProduto();

    public Manter_Produtos() {
        initComponents();
        facadeProduto.montarTable(produtosTable);
        pack();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        ScrollPane = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        botoesPanel = new javax.swing.JPanel();
        fecharButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        incluirButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Produtos");

        pesquisaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Descrição:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(427, 427, 427)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        produtosTable.setFont(new java.awt.Font("Tahoma", 0, 14));
        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "ESTOQUE", "PREÇO", "UNIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        produtosTable.setRowHeight(20);
        produtosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ScrollPane.setViewportView(produtosTable);
        produtosTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        produtosTable.getColumnModel().getColumn(1).setPreferredWidth(400);
        produtosTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        produtosTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        produtosTable.getColumnModel().getColumn(4).setPreferredWidth(80);

        botoesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fecharButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        fecharButton.setText("Fechar");

        excluirButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        excluirButton.setText("Excluir");

        alterarButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        alterarButton.setText("Alterar");

        incluirButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        incluirButton.setText("Incluir");
        incluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesPanelLayout = new javax.swing.GroupLayout(botoesPanel);
        botoesPanel.setLayout(botoesPanelLayout);
        botoesPanelLayout.setHorizontalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPanelLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botoesPanelLayout.setVerticalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirButtonActionPerformed

        JInternalFrame produtos = new Incluir_Produtos();
        Frame_Principal.desktopPane.add(produtos);
        produtos.setVisible(true);
        
    }//GEN-LAST:event_incluirButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton fecharButton;
    private javax.swing.JButton incluirButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTable produtosTable;
    // End of variables declaration//GEN-END:variables

}

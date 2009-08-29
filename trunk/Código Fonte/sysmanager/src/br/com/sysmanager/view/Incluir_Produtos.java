/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Produtos.java
 *
 * Created on 26/08/2009, 14:23:50
 */

package br.com.sysmanager.view;

import br.com.sysmanager.beans.UnidadeMedida;
import br.com.sysmanager.facades.FacadeProduto;
import br.com.sysmanager.facades.FacadeUnidadeMedida;

/**
 *
 * @author Osenias
 */
public class Incluir_Produtos extends javax.swing.JInternalFrame {

    private FacadeUnidadeMedida facadeUnidadeMedida = new FacadeUnidadeMedida();
    private FacadeProduto facadeProduto = new FacadeProduto();
    
    public Incluir_Produtos() {
        initComponents();
        listUnidades();
        pack();
    }

    public void listUnidades()
    {
        for(UnidadeMedida unidade : facadeUnidadeMedida.getListaUnidades()){
            unidadeMedidaComboBox.addItem(unidade.getDescricao());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unidadeMedidaComboBox = new javax.swing.JComboBox();
        botoesPanel = new javax.swing.JPanel();
        fecharButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Incluir Produto");

        dadosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Descrição:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Estoque:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Unidade de Medida");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("Preço (R$):");

        unidadeMedidaComboBox.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(unidadeMedidaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unidadeMedidaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        botoesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fecharButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        fecharButton.setText("Fechar");

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesPanelLayout = new javax.swing.GroupLayout(botoesPanel);
        botoesPanel.setLayout(botoesPanelLayout);
        botoesPanelLayout.setHorizontalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPanelLayout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        facadeUnidadeMedida.getUnidadeMedida().setCodigo(1);

        facadeProduto.getProduto().setDescricao("produto 01");
        facadeProduto.getProduto().setPreco(12.50);
        facadeProduto.getProduto().setQuantidadeEstoque(50);

        facadeProduto.getProduto().setUnidadeMedida(facadeUnidadeMedida.getUnidadeMedida());
        
        facadeProduto.adicionarProduto(facadeProduto.getProduto());

    }//GEN-LAST:event_salvarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JPanel dadosPanel;
    private javax.swing.JButton fecharButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox unidadeMedidaComboBox;
    // End of variables declaration//GEN-END:variables

}

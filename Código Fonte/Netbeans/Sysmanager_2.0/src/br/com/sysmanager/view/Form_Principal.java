/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frame_Principal.java
 *
 * Created on 26/08/2009, 14:22:41
 */
package br.com.sysmanager.view;

import javax.swing.JFrame;

/**
 *
 * @author Manoel
 */
public class Form_Principal extends javax.swing.JFrame {

    /** Creates new form Frame_Principal */
    public Form_Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jXStatusBar1 = new org.jdesktop.swingx.JXStatusBar();
        jXBusyLabel1 = new org.jdesktop.swingx.JXBusyLabel();
        jXBusyLabel2 = new org.jdesktop.swingx.JXBusyLabel();
        menuBar = new javax.swing.JMenuBar();
        cadastrosMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        produtosMenuItem = new javax.swing.JMenuItem();
        produtosMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuItemCargo1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        menuItemCargo = new javax.swing.JMenuItem();
        menuItemCargo2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        menuItemCargo4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        sairMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sysmanager - Sistema Comercial");

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/clientes.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jXTaskPane1.setTitle("Cadastros");
        jXTaskPane1.setFont(new java.awt.Font("Arial", 1, 12));

        jXHyperlink1.setText("Produtos");
        jXHyperlink1.setFont(new java.awt.Font("Arial", 0, 12));
        jXTaskPane1.getContentPane().add(jXHyperlink1);

        jXTaskPaneContainer1.add(jXTaskPane1);

        jXBusyLabel1.setText("Usuário");
        jXBusyLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jXStatusBar1.add(jXBusyLabel1);

        jXBusyLabel2.setText("Data");
        jXBusyLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jXStatusBar1.add(jXBusyLabel2);

        cadastrosMenu.setText("Cadastros");
        cadastrosMenu.setFont(new java.awt.Font("Arial", 0, 12));

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem2.setText("Clientes");
        cadastrosMenu.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem5.setText("Fornecedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        cadastrosMenu.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem6.setText("Funcionários");
        cadastrosMenu.add(jMenuItem6);
        cadastrosMenu.add(jSeparator3);

        produtosMenuItem.setFont(new java.awt.Font("Arial", 0, 12));
        produtosMenuItem.setText("Produtos");
        produtosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosMenuItemActionPerformed(evt);
            }
        });
        cadastrosMenu.add(produtosMenuItem);

        produtosMenuItem1.setFont(new java.awt.Font("Arial", 0, 12));
        produtosMenuItem1.setText("Kits");
        produtosMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosMenuItem1ActionPerformed(evt);
            }
        });
        cadastrosMenu.add(produtosMenuItem1);
        cadastrosMenu.add(jSeparator2);

        jMenu5.setText("Tabelas");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 12));

        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem3.setText("Grupos de Produtos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem4.setText("Unidades de Medidas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        menuItemCargo1.setFont(new java.awt.Font("Arial", 0, 12));
        menuItemCargo1.setText("Marcas");
        menuItemCargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargo1ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemCargo1);
        jMenu5.add(jSeparator4);

        menuItemCargo.setFont(new java.awt.Font("Arial", 0, 12));
        menuItemCargo.setText("Cargos");
        menuItemCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargoActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemCargo);

        menuItemCargo2.setFont(new java.awt.Font("Arial", 0, 12));
        menuItemCargo2.setText("Departamentos");
        menuItemCargo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargo2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemCargo2);
        jMenu5.add(jSeparator5);

        menuItemCargo4.setFont(new java.awt.Font("Arial", 0, 12));
        menuItemCargo4.setText("Cartões");
        menuItemCargo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargo4ActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemCargo4);

        cadastrosMenu.add(jMenu5);
        cadastrosMenu.add(jSeparator1);

        sairMenuItem.setFont(new java.awt.Font("Arial", 0, 12));
        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        cadastrosMenu.add(sairMenuItem);

        menuBar.add(cadastrosMenu);

        jMenu1.setText("Vendas");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12));
        menuBar.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 12));
        menuBar.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 12));
        menuBar.add(jMenu3);

        jMenu4.setText("Ajuda");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 12));

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXStatusBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(624, 624, 624))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXStatusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-874)/2, (screenSize.height-580)/2, 874, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        new Form_Sobre_Aplicacao(this, rootPaneCheckingEnabled).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void produtosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosMenuItemActionPerformed
        new Form_Manter_Produto(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_produtosMenuItemActionPerformed

    private void produtosMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosMenuItem1ActionPerformed
        new Form_Manter_Kit(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_produtosMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Form_Manter_Grupo_Produto(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuItemCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargoActionPerformed
        new Form_Manter_Cargo(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemCargoActionPerformed

    private void menuItemCargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargo1ActionPerformed
        new Form_Manter_Marca(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemCargo1ActionPerformed

    private void menuItemCargo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargo2ActionPerformed
        new Form_Manter_Departamento(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemCargo2ActionPerformed

    private void menuItemCargo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargo4ActionPerformed
        new Form_Manter_Cartao(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemCargo4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Form_Manter_Unidade_Medida(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Form_Manter_Fornecedor(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrosMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXBusyLabel jXBusyLabel1;
    private org.jdesktop.swingx.JXBusyLabel jXBusyLabel2;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemCargo;
    private javax.swing.JMenuItem menuItemCargo1;
    private javax.swing.JMenuItem menuItemCargo2;
    private javax.swing.JMenuItem menuItemCargo4;
    private javax.swing.JMenuItem produtosMenuItem;
    private javax.swing.JMenuItem produtosMenuItem1;
    private javax.swing.JMenuItem sairMenuItem;
    // End of variables declaration//GEN-END:variables
}

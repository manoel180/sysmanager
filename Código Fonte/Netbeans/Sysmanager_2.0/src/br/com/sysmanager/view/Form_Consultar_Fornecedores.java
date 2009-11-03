/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Form_Consultar_Fornecedores.java
 *
 * Created on 08/10/2009, 00:27:30
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.Facade_Fornecedor;

/**
 *
 * @author Júnior
 */
public class Form_Consultar_Fornecedores extends javax.swing.JDialog {

    private Facade_Fornecedor facade_fornecedor = new Facade_Fornecedor();

    public Form_Consultar_Fornecedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pack();
        openForm();
    }

    public void openForm(){
        facade_fornecedor.preencher_jtable_fornecedor(1, "", null, null, table_fornecedores);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonSair = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        manterProdutosTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        pesquisaTextField = new javax.swing.JTextField();
        tipoPesquisaLabel = new javax.swing.JLabel();
        dadosProdutoPanel = new javax.swing.JPanel();
        produtosScrollPane2 = new javax.swing.JScrollPane();
        table_fornecedores = new javax.swing.JTable();
        produtosPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        produtosPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Fornecedor");
        setIconImage(null);
        setModalityType(null);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        buttonSair.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/sair.png"))); // NOI18N
        buttonSair.setFocusable(false);
        buttonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair.setPreferredSize(new java.awt.Dimension(45, 57));
        buttonSair.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buttonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonSair);

        buttonAtualizar.setFont(new java.awt.Font("Arial", 0, 12));
        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/refresh.png"))); // NOI18N
        buttonAtualizar.setFocusable(false);
        buttonAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonAtualizar);

        manterProdutosTabbedPane.setFont(new java.awt.Font("Arial", 0, 12));

        pesquisaPanel.setFont(new java.awt.Font("Arial", 0, 12));

        pesquisaTextField.setFont(new java.awt.Font("Arial", 0, 12));

        tipoPesquisaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        tipoPesquisaLabel.setText("Informe o nome do Fornecedor:");

        dadosProdutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        table_fornecedores.setFont(new java.awt.Font("Arial", 0, 12));
        table_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_fornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_fornecedores.setRowHeight(20);
        produtosScrollPane2.setViewportView(table_fornecedores);
        table_fornecedores.getColumnModel().getColumn(0).setPreferredWidth(80);
        table_fornecedores.getColumnModel().getColumn(1).setPreferredWidth(230);
        table_fornecedores.getColumnModel().getColumn(2).setPreferredWidth(80);
        table_fornecedores.getColumnModel().getColumn(3).setPreferredWidth(200);

        javax.swing.GroupLayout dadosProdutoPanelLayout = new javax.swing.GroupLayout(dadosProdutoPanel);
        dadosProdutoPanel.setLayout(dadosProdutoPanelLayout);
        dadosProdutoPanelLayout.setHorizontalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtosScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        dadosProdutoPanelLayout.setVerticalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                .addComponent(produtosScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoPesquisaLabel)
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPesquisaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manterProdutosTabbedPane.addTab("Consulta", pesquisaPanel);

        produtosPanel.setFont(new java.awt.Font("Arial", 0, 12));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo do Documento", "Número do Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setRowHeight(20);
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(0).setHeaderValue("Tipo do Documento");
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTable3.getColumnModel().getColumn(1).setHeaderValue("Número do Documento");

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Documentos do Fornecedor", produtosPanel);

        produtosPanel1.setFont(new java.awt.Font("Arial", 0, 12));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo do Telefone", "(DD)", "Número do Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setRowHeight(20);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(200);

        javax.swing.GroupLayout produtosPanel1Layout = new javax.swing.GroupLayout(produtosPanel1);
        produtosPanel1.setLayout(produtosPanel1Layout);
        produtosPanel1Layout.setHorizontalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        produtosPanel1Layout.setVerticalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Telefones do Fornecedor", produtosPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(manterProdutosTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manterProdutosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(null);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-683)/2, (screenSize.height-446)/2, 683, 446);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
}//GEN-LAST:event_buttonSairActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPanel dadosProdutoPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane manterProdutosTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JPanel produtosPanel1;
    private javax.swing.JScrollPane produtosScrollPane2;
    private javax.swing.JTable table_fornecedores;
    private javax.swing.JLabel tipoPesquisaLabel;
    // End of variables declaration//GEN-END:variables

}

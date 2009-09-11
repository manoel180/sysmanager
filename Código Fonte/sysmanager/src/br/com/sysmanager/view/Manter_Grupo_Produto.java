/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Grupo_Produto.java
 *
 * Created on 04/09/2009, 02:02:36
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.FacadeGrupoProduto;
import br.com.sysmanager.services.Funcoes;

/**
 *
 * @author Júnior
 */
public class Manter_Grupo_Produto extends javax.swing.JDialog {

    private FacadeGrupoProduto facade_grupo_produto = new FacadeGrupoProduto();

    // 0 - incluir
    // 1 - alterar
    private static int BUTTON = 0;

    public Manter_Grupo_Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        facade_grupo_produto.preecherTableGrupoProduto(1, "", null, grupoTable);
        Funcoes.desabilitaCampos(dadosGrupoProdutoPanel);
        salvarButton.setEnabled(false);
        pack();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manterGruposProdutosTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        grupoTable = new javax.swing.JTable();
        tipoPesquisaComboBox = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        pesquisaTextField = new javax.swing.JTextField();
        incluirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        produtosPanel = new javax.swing.JPanel();
        salvarButton = new javax.swing.JButton();
        sairProdutoButton = new javax.swing.JButton();
        dadosGrupoProdutoPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(null);

        manterGruposProdutosTabbedPane.setFont(new java.awt.Font("Arial", 0, 12));
        manterGruposProdutosTabbedPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manterGruposProdutosTabbedPaneFocusGained(evt);
            }
        });

        pesquisaPanel.setFont(new java.awt.Font("Arial", 0, 12));

        grupoTable.setFont(new java.awt.Font("Arial", 0, 12));
        grupoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        grupoTable.setRowHeight(20);
        grupoTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        produtosScrollPane.setViewportView(grupoTable);
        grupoTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        grupoTable.getColumnModel().getColumn(1).setPreferredWidth(300);

        tipoPesquisaComboBox.setFont(new java.awt.Font("Arial", 0, 12));
        tipoPesquisaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Descrição" }));

        tipoPesquisaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        tipoPesquisaLabel.setText("Selecione o modo da pesquisa:");

        pesquisaTextField.setFont(new java.awt.Font("Arial", 0, 12));
        pesquisaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaTextFieldKeyReleased(evt);
            }
        });

        incluirButton.setFont(new java.awt.Font("Arial", 0, 12));
        incluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/incluir.png"))); // NOI18N
        incluirButton.setText("Incluir");
        incluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirButtonActionPerformed(evt);
            }
        });

        alterarButton.setFont(new java.awt.Font("Arial", 0, 12));
        alterarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/alterar.png"))); // NOI18N
        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });

        excluirButton.setFont(new java.awt.Font("Arial", 0, 12));
        excluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/excluir.png"))); // NOI18N
        excluirButton.setText("Excluir");

        sairButton.setFont(new java.awt.Font("Arial", 0, 12));
        sairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/sair.gif"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoPesquisaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pesquisaPanelLayout.createSequentialGroup()
                        .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produtosScrollPane)
                    .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPesquisaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manterGruposProdutosTabbedPane.addTab("Pesquisa", pesquisaPanel);

        produtosPanel.setFont(new java.awt.Font("Arial", 0, 12));

        salvarButton.setFont(new java.awt.Font("Arial", 0, 12));
        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/salvar.png"))); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        sairProdutoButton.setFont(new java.awt.Font("Arial", 0, 12));
        sairProdutoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/sair.gif"))); // NOI18N
        sairProdutoButton.setText("Sair");
        sairProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairProdutoButtonActionPerformed(evt);
            }
        });

        dadosGrupoProdutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");

        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");

        codigoTextField.setEditable(false);
        codigoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        javax.swing.GroupLayout dadosGrupoProdutoPanelLayout = new javax.swing.GroupLayout(dadosGrupoProdutoPanel);
        dadosGrupoProdutoPanel.setLayout(dadosGrupoProdutoPanelLayout);
        dadosGrupoProdutoPanelLayout.setHorizontalGroup(
            dadosGrupoProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosGrupoProdutoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosGrupoProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        dadosGrupoProdutoPanelLayout.setVerticalGroup(
            dadosGrupoProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosGrupoProdutoPanelLayout.createSequentialGroup()
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dadosGrupoProdutoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(produtosPanelLayout.createSequentialGroup()
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosGrupoProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manterGruposProdutosTabbedPane.addTab("Grupo de Produto", produtosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterGruposProdutosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterGruposProdutosTabbedPane)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-596)/2, (screenSize.height-455)/2, 596, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed

        // fecha a janela
        dispose();
}//GEN-LAST:event_sairButtonActionPerformed

    private void sairProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairProdutoButtonActionPerformed

        // fecha a janela
        dispose();
}//GEN-LAST:event_sairProdutoButtonActionPerformed

    private void incluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirButtonActionPerformed
        BUTTON = 0;

        manterGruposProdutosTabbedPane.setSelectedIndex(1);
        Funcoes.habilitaCampos(dadosGrupoProdutoPanel);
        codigoTextField.setEditable(false);
        descricaoTextField.requestFocus();
        salvarButton.setEnabled(true);
        
    }//GEN-LAST:event_incluirButtonActionPerformed

    private void manterGruposProdutosTabbedPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manterGruposProdutosTabbedPaneFocusGained

        if(manterGruposProdutosTabbedPane.getSelectedIndex() == 0){
            Funcoes.desabilitaCampos(dadosGrupoProdutoPanel);
            Funcoes.limpaTela(dadosGrupoProdutoPanel);
            salvarButton.setEnabled(false);
        }
    }//GEN-LAST:event_manterGruposProdutosTabbedPaneFocusGained

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // verifica os campos obrigatórios
        if(descricaoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do produto !");
        }

        else{
            // se o botão for incluir cria uma nova instância
            if(BUTTON == 0){
                facade_grupo_produto.setGrupoProduto(facade_grupo_produto.newInstance());
            }

            facade_grupo_produto.getGrupoProduto().setDescricao(descricaoTextField.getText());
            
            facade_grupo_produto.getGrupoProdutoDAO().salvar(facade_grupo_produto.getGrupoProduto());

            facade_grupo_produto.preecherTableGrupoProduto(1, "", null, grupoTable);
            // limpa os campos caso seja inserido um novo produto
            Funcoes.limpaTela(dadosGrupoProdutoPanel);
            pesquisaTextField.setText("");

            // caso seja uma atualização o BUTTON recebe um para realizar uma inclusão
            if(BUTTON == 1){
                BUTTON = 0;
            }
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        // botão alterar pressionado
        BUTTON = 1;

        // verificar se exite registro seleciona na tabela de produtos
        if(grupoTable.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{
            // recupera a linha seleciona da tabela de produtos
            int linhaSelecionada = grupoTable.getSelectedRow();

            // recupera o código do produto
            Integer codigo = Integer.parseInt(String.valueOf(grupoTable.getValueAt(linhaSelecionada, 0)));

            facade_grupo_produto.setGrupoProduto(facade_grupo_produto.getGrupoProdutoDAO().procurar_por_codigo(codigo));

            // redireciona para a aba produto
            manterGruposProdutosTabbedPane.setSelectedIndex(1);

            // habilita os campos
            Funcoes.habilitaCampos(dadosGrupoProdutoPanel);

            // desabilita o código
            codigoTextField.setEditable(false);

            // habilita o botão salvar
            salvarButton.setEnabled(true);

            codigoTextField.setText(String.valueOf(facade_grupo_produto.getGrupoProduto().getCodigo()));
            descricaoTextField.setText(facade_grupo_produto.getGrupoProduto().getDescricao());
        }
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void pesquisaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaTextFieldKeyReleased

        if(tipoPesquisaComboBox.getSelectedItem().equals("Código")){
            facade_grupo_produto.preecherTableGrupoProduto(1, pesquisaTextField.getText(), null, grupoTable);
        }

        else if(tipoPesquisaComboBox.getSelectedItem().equals("Descrição")){
            facade_grupo_produto.preecherTableGrupoProduto(2, null, pesquisaTextField.getText(), grupoTable);
        }
    }//GEN-LAST:event_pesquisaTextFieldKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JPanel dadosGrupoProdutoPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JTable grupoTable;
    private javax.swing.JButton incluirButton;
    private javax.swing.JTabbedPane manterGruposProdutosTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton sairProdutoButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox tipoPesquisaComboBox;
    private javax.swing.JLabel tipoPesquisaLabel;
    // End of variables declaration//GEN-END:variables

}

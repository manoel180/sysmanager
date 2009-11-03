/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Cargo.java
 *
 * Created on 17/09/2009, 23:23:49
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.Facade_Cartao;
import br.com.sysmanager.services.Funcoes;
import java.math.BigDecimal;
import java.text.ParseException;


/**
 *
 * @author Júnior
 */
public class Form_Manter_Cartao extends javax.swing.JDialog {

    private Facade_Cartao facade_cartao = new Facade_Cartao();
    private static int BUTTON = 0;


    public Form_Manter_Cartao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        open_form();
    }

    public void open_form(){
        facade_cartao.preencher_jtable_cartao(1, "", null, table_cartao);
        Funcoes.desabilitaCampos(panel_dados_cartao);
        buttonSalvar.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        buttonSair = new javax.swing.JButton();
        buttonIncluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        tabbedPane_cargo = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_cartao = new javax.swing.JTable();
        comboBox_tipoPesquisa = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        textField_pesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panel_dados_cartao = new javax.swing.JPanel();
        textField_codigo = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        textField_nome = new javax.swing.JTextField();
        textField_taxa = new numeric.textField.NumericTextField();
        descricaoLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cartões");
        setModalityType(null);
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N
        jToolBar1.add(jSeparator1);

        buttonSair.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/sair.png"))); // NOI18N
        buttonSair.setFocusable(false);
        buttonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair.setName("buttonSair"); // NOI18N
        buttonSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonSair);

        buttonIncluir.setFont(new java.awt.Font("Arial", 0, 12));
        buttonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/incluir.gif"))); // NOI18N
        buttonIncluir.setFocusable(false);
        buttonIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonIncluir.setName("buttonIncluir"); // NOI18N
        buttonIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluirActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonIncluir);

        buttonSalvar.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/salvar.png"))); // NOI18N
        buttonSalvar.setFocusable(false);
        buttonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSalvar.setName("buttonSalvar"); // NOI18N
        buttonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonSalvar);

        buttonAlterar.setFont(new java.awt.Font("Arial", 0, 12));
        buttonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/alterar.png"))); // NOI18N
        buttonAlterar.setFocusable(false);
        buttonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAlterar.setName("buttonAlterar"); // NOI18N
        buttonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonAlterar);

        buttonExcluir.setFont(new java.awt.Font("Arial", 0, 12));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/excluir.png"))); // NOI18N
        buttonExcluir.setFocusable(false);
        buttonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExcluir.setName("buttonExcluir"); // NOI18N
        buttonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonExcluir);

        buttonAtualizar.setFont(new java.awt.Font("Arial", 0, 12));
        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/refresh.png"))); // NOI18N
        buttonAtualizar.setFocusable(false);
        buttonAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAtualizar.setName("buttonAtualizar"); // NOI18N
        buttonAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonAtualizar);

        tabbedPane_cargo.setFont(new java.awt.Font("Arial", 0, 12));
        tabbedPane_cargo.setName("tabbedPane_cargo"); // NOI18N
        tabbedPane_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabbedPane_cargoMousePressed(evt);
            }
        });

        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jPanel3.setName("jPanel3"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        table_cartao.setFont(new java.awt.Font("Arial", 0, 12));
        table_cartao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome do Cartão", "Taxa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_cartao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_cartao.setName("table_cartao"); // NOI18N
        table_cartao.setRowHeight(20);
        table_cartao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table_cartao);
        table_cartao.getColumnModel().getColumn(0).setPreferredWidth(80);
        table_cartao.getColumnModel().getColumn(1).setPreferredWidth(300);
        table_cartao.getColumnModel().getColumn(2).setPreferredWidth(70);

        comboBox_tipoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboBox_tipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome" }));
        comboBox_tipoPesquisa.setName("comboBox_tipoPesquisa"); // NOI18N

        tipoPesquisaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        tipoPesquisaLabel.setText("Selecione o modo da pesquisa:");
        tipoPesquisaLabel.setName("tipoPesquisaLabel"); // NOI18N

        textField_pesquisa.setFont(new java.awt.Font("Arial", 0, 12));
        textField_pesquisa.setName("textField_pesquisa"); // NOI18N
        textField_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField_pesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoPesquisaLabel)
                    .addComponent(comboBox_tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPesquisaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(textField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Pesquisa", jPanel3);

        jPanel2.setName("jPanel2"); // NOI18N

        panel_dados_cartao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_cartao.setName("panel_dados_cartao"); // NOI18N

        textField_codigo.setEditable(false);
        textField_codigo.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo.setName("textField_codigo"); // NOI18N

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");
        codigoLabel.setName("codigoLabel"); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");
        descricaoLabel.setName("descricaoLabel"); // NOI18N

        textField_nome.setFont(new java.awt.Font("Arial", 0, 12));
        textField_nome.setName("textField_nome"); // NOI18N

        textField_taxa.setFont(new java.awt.Font("Arial", 0, 12));
        textField_taxa.setName("textField_taxa"); // NOI18N

        descricaoLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel2.setText("Sigla:");
        descricaoLabel2.setName("descricaoLabel2"); // NOI18N

        javax.swing.GroupLayout panel_dados_cartaoLayout = new javax.swing.GroupLayout(panel_dados_cartao);
        panel_dados_cartao.setLayout(panel_dados_cartaoLayout);
        panel_dados_cartaoLayout.setHorizontalGroup(
            panel_dados_cartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_cartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLabel)
                    .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel)
                    .addComponent(textField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_taxa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dados_cartaoLayout.setVerticalGroup(
            panel_dados_cartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cartaoLayout.createSequentialGroup()
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoLabel2)
                .addGap(4, 4, 4)
                .addComponent(textField_taxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_cartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Cartão", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tabbedPane_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-520)/2, (screenSize.height-411)/2, 520, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if(textField_nome.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do cargo !");
            textField_nome.requestFocus();
        }

        else{

            try{
                if(BUTTON == 0){
                    facade_cartao.setCartao(facade_cartao.newInstance());
                }

                facade_cartao.getCartao().setNome(textField_nome.getText());
                facade_cartao.getCartao().setTaxa(BigDecimal.valueOf(textField_taxa.getDoubleValue()));

                facade_cartao.getCartao_dao().salvar(facade_cartao.getCartao());

                facade_cartao.preencher_jtable_cartao(1, "", null, table_cartao);
                Funcoes.limpaTela(panel_dados_cartao);

                // caso seja uma atualização o BUTTON recebe 0 para realizar uma inclusão
                if(BUTTON == 1){
                    BUTTON = 0;
                }

            } catch(ParseException ex){
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirActionPerformed

        BUTTON = 0;

        tabbedPane_cargo.setSelectedIndex(1);
        textField_nome.requestFocus();
        Funcoes.habilitaCampos(panel_dados_cartao);
        Funcoes.limpaTela(panel_dados_cartao);
        textField_codigo.setEditable(false);
        buttonSalvar.setEnabled(true);
//        menu_salvar.setEnabled(true);

    }//GEN-LAST:event_buttonIncluirActionPerformed

    private void tabbedPane_cargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPane_cargoMousePressed

        if(tabbedPane_cargo.getSelectedIndex() == 0){
            Funcoes.desabilitaCampos(panel_dados_cartao);
            Funcoes.limpaTela(panel_dados_cartao);
            buttonSalvar.setEnabled(false);
          //  menu_salvar.setEnabled(false);
        }

    }//GEN-LAST:event_tabbedPane_cargoMousePressed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        BUTTON = 1;

        if(table_cartao.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            int linhaSelecionada = table_cartao.getSelectedRow();

            Integer codigo = Integer.parseInt(String.valueOf(table_cartao.getValueAt(linhaSelecionada, 0)));

            facade_cartao.setCartao(facade_cartao.getCartao_dao().procurar_por_codigo(codigo));

            tabbedPane_cargo.setSelectedIndex(1);

            Funcoes.habilitaCampos(panel_dados_cartao);

            textField_codigo.setEditable(false);

            buttonSalvar.setEnabled(true);

            textField_codigo.setText(facade_cartao.getCartao().getCodigo().toString());
            textField_nome.setText(facade_cartao.getCartao().getNome());
            textField_taxa.setValue(facade_cartao.getCartao().getTaxa());
            
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void textField_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_pesquisaKeyReleased

        if(comboBox_tipoPesquisa.getSelectedIndex() == 0){
            facade_cartao.preencher_jtable_cartao(1, textField_pesquisa.getText(), null, table_cartao);
        }

        else if(comboBox_tipoPesquisa.getSelectedIndex() == 1){
            facade_cartao.preencher_jtable_cartao(2, null, textField_pesquisa.getText(), table_cartao);
        }
}//GEN-LAST:event_textField_pesquisaKeyReleased

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        facade_cartao.preencher_jtable_cartao(1, "", null, table_cartao);
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonIncluir;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JComboBox comboBox_tipoPesquisa;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel descricaoLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel_dados_cartao;
    private javax.swing.JTabbedPane tabbedPane_cargo;
    private javax.swing.JTable table_cartao;
    private javax.swing.JTextField textField_codigo;
    private javax.swing.JTextField textField_nome;
    private javax.swing.JTextField textField_pesquisa;
    private numeric.textField.NumericTextField textField_taxa;
    private javax.swing.JLabel tipoPesquisaLabel;
    // End of variables declaration//GEN-END:variables

}

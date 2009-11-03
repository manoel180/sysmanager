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

import br.com.sysmanager.facades.Facade_Marca;
import br.com.sysmanager.services.Funcoes;

/**
 *
 * @author Júnior
 */
public class Form_Manter_Marca extends javax.swing.JDialog {

    private Facade_Marca facade_marca = new Facade_Marca();
    private static int BUTTON = 0;

    public Form_Manter_Marca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        open_form();
    }

    public void open_form(){
        facade_marca.preencher_jtable_marca(1, "", null, tableMarca);
        Funcoes.desabilitaCampos(panel_dados_marca);
        buttonSalvar.setEnabled(false);
        menu_salvar.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu_cargo = new javax.swing.JPopupMenu();
        menu_incluir = new javax.swing.JMenuItem();
        menu_salvar = new javax.swing.JMenuItem();
        menu_alterar = new javax.swing.JMenuItem();
        menu_excluir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        menu_sair = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonSair = new javax.swing.JButton();
        buttonIncluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        tabbedPane_cargo = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMarca = new javax.swing.JTable();
        comboBox_tipoPesquisa = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        textField_pesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panel_dados_marca = new javax.swing.JPanel();
        textField_codigo = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        textField_descricao = new javax.swing.JTextField();

        popupMenu_cargo.setName("popupMenu_cargo"); // NOI18N

        menu_incluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menu_incluir.setFont(new java.awt.Font("Arial", 0, 12));
        menu_incluir.setText("Incluir");
        menu_incluir.setName("menu_incluir"); // NOI18N
        menu_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_incluirActionPerformed(evt);
            }
        });
        popupMenu_cargo.add(menu_incluir);

        menu_salvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menu_salvar.setFont(new java.awt.Font("Arial", 0, 12));
        menu_salvar.setText("Salvar");
        menu_salvar.setName("menu_salvar"); // NOI18N
        menu_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salvarActionPerformed(evt);
            }
        });
        popupMenu_cargo.add(menu_salvar);

        menu_alterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menu_alterar.setFont(new java.awt.Font("Arial", 0, 12));
        menu_alterar.setText("Alterar");
        menu_alterar.setName("menu_alterar"); // NOI18N
        menu_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_alterarActionPerformed(evt);
            }
        });
        popupMenu_cargo.add(menu_alterar);

        menu_excluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        menu_excluir.setFont(new java.awt.Font("Arial", 0, 12));
        menu_excluir.setText("Excluir");
        menu_excluir.setName("menu_excluir"); // NOI18N
        popupMenu_cargo.add(menu_excluir);

        jSeparator1.setName("jSeparator1"); // NOI18N
        popupMenu_cargo.add(jSeparator1);

        menu_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menu_sair.setFont(new java.awt.Font("Arial", 0, 12));
        menu_sair.setText("Sair");
        menu_sair.setName("menu_sair"); // NOI18N
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        popupMenu_cargo.add(menu_sair);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marcas");
        setModalityType(null);
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setComponentPopupMenu(popupMenu_cargo);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jSeparator2.setName("jSeparator2"); // NOI18N
        jToolBar1.add(jSeparator2);

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

        tabbedPane_cargo.setComponentPopupMenu(popupMenu_cargo);
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

        tableMarca.setFont(new java.awt.Font("Arial", 0, 12));
        tableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição da Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMarca.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableMarca.setComponentPopupMenu(popupMenu_cargo);
        tableMarca.setName("tableMarca"); // NOI18N
        tableMarca.setRowHeight(20);
        tableMarca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableMarca);
        tableMarca.getColumnModel().getColumn(0).setPreferredWidth(80);
        tableMarca.getColumnModel().getColumn(1).setPreferredWidth(350);

        comboBox_tipoPesquisa.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_tipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Descrição" }));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Pesquisa", jPanel3);

        jPanel2.setName("jPanel2"); // NOI18N

        panel_dados_marca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_marca.setName("panel_dados_marca"); // NOI18N

        textField_codigo.setEditable(false);
        textField_codigo.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo.setName("textField_codigo"); // NOI18N

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");
        codigoLabel.setName("codigoLabel"); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");
        descricaoLabel.setName("descricaoLabel"); // NOI18N

        textField_descricao.setFont(new java.awt.Font("Arial", 0, 12));
        textField_descricao.setName("textField_descricao"); // NOI18N

        javax.swing.GroupLayout panel_dados_marcaLayout = new javax.swing.GroupLayout(panel_dados_marca);
        panel_dados_marca.setLayout(panel_dados_marcaLayout);
        panel_dados_marcaLayout.setHorizontalGroup(
            panel_dados_marcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_marcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_marcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoLabel)
                    .addComponent(codigoLabel)
                    .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dados_marcaLayout.setVerticalGroup(
            panel_dados_marcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_marcaLayout.createSequentialGroup()
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Marca", jPanel2);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPane_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-520)/2, (screenSize.height-411)/2, 520, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if(textField_descricao.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do cargo !");
            textField_descricao.requestFocus();
        }

        else{

            if(BUTTON == 0){
                facade_marca.setMarca(facade_marca.newInstance());
            }

            facade_marca.getMarca().setDescricao(textField_descricao.getText());

            facade_marca.getMarca_dao().salvar(facade_marca.getMarca());

            facade_marca.preencher_jtable_marca(1, "", null, tableMarca);
            Funcoes.limpaTela(panel_dados_marca);

            // caso seja uma atualização o BUTTON recebe 0 para realizar uma inclusão
            if(BUTTON == 1){
                BUTTON = 0;
            }
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirActionPerformed

        BUTTON = 0;

        tabbedPane_cargo.setSelectedIndex(1);
        textField_descricao.requestFocus();
        Funcoes.habilitaCampos(panel_dados_marca);
        Funcoes.limpaTela(panel_dados_marca);
        textField_codigo.setEditable(false);
        buttonSalvar.setEnabled(true);
        menu_salvar.setEnabled(true);

    }//GEN-LAST:event_buttonIncluirActionPerformed

    private void tabbedPane_cargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPane_cargoMousePressed

        if(tabbedPane_cargo.getSelectedIndex() == 0){
            Funcoes.desabilitaCampos(panel_dados_marca);
            Funcoes.limpaTela(panel_dados_marca);
            buttonSalvar.setEnabled(false);
            menu_salvar.setEnabled(false);
        }

    }//GEN-LAST:event_tabbedPane_cargoMousePressed

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        buttonSair.doClick();
    }//GEN-LAST:event_menu_sairActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void menu_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_incluirActionPerformed
        buttonIncluir.doClick();
    }//GEN-LAST:event_menu_incluirActionPerformed

    private void menu_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salvarActionPerformed
        buttonSalvar.doClick();
    }//GEN-LAST:event_menu_salvarActionPerformed

    private void menu_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_alterarActionPerformed
        buttonAlterar.doClick();
    }//GEN-LAST:event_menu_alterarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        BUTTON = 1;

        if(tableMarca.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            int linhaSelecionada = tableMarca.getSelectedRow();

            Integer codigo = Integer.parseInt(String.valueOf(tableMarca.getValueAt(linhaSelecionada, 0)));

            facade_marca.setMarca(facade_marca.getMarca_dao().procurar_por_codigo(codigo));

            tabbedPane_cargo.setSelectedIndex(1);

            Funcoes.habilitaCampos(panel_dados_marca);

            textField_codigo.setEditable(false);

            buttonSalvar.setEnabled(true);

            textField_codigo.setText(facade_marca.getMarca().getCodigo().toString());
            textField_descricao.setText(facade_marca.getMarca().getDescricao());
            
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void textField_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_pesquisaKeyReleased

        if(comboBox_tipoPesquisa.getSelectedIndex() == 0){
            facade_marca.preencher_jtable_marca(1, textField_pesquisa.getText(), null, tableMarca);
        }

        else if(comboBox_tipoPesquisa.getSelectedIndex() == 1){
            facade_marca.preencher_jtable_marca(2, null, textField_pesquisa.getText(), tableMarca);
        }
}//GEN-LAST:event_textField_pesquisaKeyReleased

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        facade_marca.preencher_jtable_marca(1, "", null, tableMarca);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menu_alterar;
    private javax.swing.JMenuItem menu_excluir;
    private javax.swing.JMenuItem menu_incluir;
    private javax.swing.JMenuItem menu_sair;
    private javax.swing.JMenuItem menu_salvar;
    private javax.swing.JPanel panel_dados_marca;
    private javax.swing.JPopupMenu popupMenu_cargo;
    private javax.swing.JTabbedPane tabbedPane_cargo;
    private javax.swing.JTable tableMarca;
    private javax.swing.JTextField textField_codigo;
    private javax.swing.JTextField textField_descricao;
    private javax.swing.JTextField textField_pesquisa;
    private javax.swing.JLabel tipoPesquisaLabel;
    // End of variables declaration//GEN-END:variables

}

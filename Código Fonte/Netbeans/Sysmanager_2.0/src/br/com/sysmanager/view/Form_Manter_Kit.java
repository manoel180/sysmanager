/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Kits.java
 *
 * Created on 03/09/2009, 14:16:31
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.Facade_Kit;
import br.com.sysmanager.facades.Facade_KitsProdutos;
import br.com.sysmanager.facades.Facade_Produto;
import br.com.sysmanager.model.KitsProdutos;
import br.com.sysmanager.services.Funcoes;
import java.math.BigDecimal;

/**
 *
 * @author Júnior
 */
public class Form_Manter_Kit extends javax.swing.JDialog {

    private Facade_Kit facade_kit = new Facade_Kit();
    private Facade_KitsProdutos facade_kits_produtos = new Facade_KitsProdutos();
    private Facade_Produto facade_produto = new Facade_Produto();

     // variavel que verifica qual o botão pressionado
    // 0 = incluir
    // 1 = alterar
    private static int BUTTON = 0;
    
    public Form_Manter_Kit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        openForm();
        pack();
    }

    public void openForm(){
        Funcoes.desabilitaCampos(dadosKitPanel);
        Funcoes.desabilitaCampos(produtosKitPanel);
        Funcoes.limpaLinhasTable(produtosKiTable);
        facade_kit.preencher_jtable_kit(1, "", null, kitTable);
        buttonSalvar.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manterKitsTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        kitTable = new javax.swing.JTable();
        tipoPesquisaComboBox = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        pesquisaTextField = new javax.swing.JTextField();
        produtosPanel = new javax.swing.JPanel();
        dadosKitPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        textField_descricao = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        produtosKitPanel = new javax.swing.JPanel();
        codigoProdutoTextField = new javax.swing.JTextField();
        codigoLabel1 = new javax.swing.JLabel();
        descricaoProdutoTextField = new javax.swing.JTextField();
        codigoLabel2 = new javax.swing.JLabel();
        quantidadeProdutoTextField = new javax.swing.JTextField();
        codigoLabel3 = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosKiTable = new javax.swing.JTable();
        removerButton = new javax.swing.JButton();
        adicionarButton = new javax.swing.JButton();
        valorTotalTextField = new javax.swing.JTextField();
        codigoLabel4 = new javax.swing.JLabel();
        precoProdutoTextField = new javax.swing.JTextField();
        codigoLabel5 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonSair = new javax.swing.JButton();
        buttonIncluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kit de Produtos");
        setModalityType(null);

        manterKitsTabbedPane.setFont(new java.awt.Font("Arial", 0, 12));
        manterKitsTabbedPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manterKitsTabbedPaneFocusGained(evt);
            }
        });

        pesquisaPanel.setFont(new java.awt.Font("Arial", 0, 12));

        kitTable.setFont(new java.awt.Font("Arial", 0, 12));
        kitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kitTable.setRowHeight(20);
        kitTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        produtosScrollPane.setViewportView(kitTable);
        kitTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        kitTable.getColumnModel().getColumn(2).setPreferredWidth(100);

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

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produtosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addComponent(tipoPesquisaLabel)
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPesquisaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterKitsTabbedPane.addTab("Pesquisa", pesquisaPanel);

        produtosPanel.setFont(new java.awt.Font("Arial", 0, 12));

        dadosKitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Kit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");

        textField_descricao.setFont(new java.awt.Font("Arial", 0, 12));

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");

        codigoTextField.setEditable(false);
        codigoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        javax.swing.GroupLayout dadosKitPanelLayout = new javax.swing.GroupLayout(dadosKitPanel);
        dadosKitPanel.setLayout(dadosKitPanelLayout);
        dadosKitPanelLayout.setHorizontalGroup(
            dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosKitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoLabel)
                    .addComponent(textField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        dadosKitPanelLayout.setVerticalGroup(
            dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosKitPanelLayout.createSequentialGroup()
                .addGroup(dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosKitPanelLayout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        produtosKitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos do Kit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        codigoProdutoTextField.setFont(new java.awt.Font("Arial", 0, 12));
        codigoProdutoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoProdutoTextFieldFocusLost(evt);
            }
        });

        codigoLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel1.setText("Código:");

        descricaoProdutoTextField.setEditable(false);
        descricaoProdutoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        codigoLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel2.setText("Descrição:");

        quantidadeProdutoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        codigoLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel3.setText("Quantidade:");

        consultarButton.setFont(new java.awt.Font("Arial", 0, 12));
        consultarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/consultar.png"))); // NOI18N

        produtosKiTable.setFont(new java.awt.Font("Arial", 0, 12));
        produtosKiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Preço", "Sub. Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosKiTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        produtosKiTable.setRowHeight(20);
        produtosKiTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(produtosKiTable);
        produtosKiTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        produtosKiTable.getColumnModel().getColumn(1).setPreferredWidth(270);
        produtosKiTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        produtosKiTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        produtosKiTable.getColumnModel().getColumn(4).setPreferredWidth(100);

        removerButton.setFont(new java.awt.Font("Arial", 0, 12));
        removerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N

        adicionarButton.setFont(new java.awt.Font("Arial", 0, 12));
        adicionarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        valorTotalTextField.setEditable(false);
        valorTotalTextField.setFont(new java.awt.Font("Arial", 0, 18));
        valorTotalTextField.setForeground(new java.awt.Color(0, 153, 0));
        valorTotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        codigoLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        codigoLabel4.setText("Valor Total:");

        precoProdutoTextField.setEditable(false);
        precoProdutoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        codigoLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel5.setText("Preço:");

        javax.swing.GroupLayout produtosKitPanelLayout = new javax.swing.GroupLayout(produtosKitPanel);
        produtosKitPanel.setLayout(produtosKitPanelLayout);
        produtosKitPanelLayout.setHorizontalGroup(
            produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosKitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigoLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProdutoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel2)
                            .addComponent(descricaoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel3)
                            .addComponent(quantidadeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addComponent(codigoLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                .addContainerGap())
        );
        produtosKitPanelLayout.setVerticalGroup(
            produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosKitPanelLayout.createSequentialGroup()
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigoLabel2)
                            .addComponent(codigoLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigoLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(produtosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );

        manterKitsTabbedPane.addTab("Kit de Produto", produtosPanel);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        buttonSair.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/sair.png"))); // NOI18N
        buttonSair.setFocusable(false);
        buttonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        buttonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonExcluir);

        buttonAtualizar.setFont(new java.awt.Font("Arial", 0, 12));
        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/refresh.png"))); // NOI18N
        buttonAtualizar.setFocusable(false);
        buttonAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonAtualizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(manterKitsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manterKitsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-721)/2, (screenSize.height-547)/2, 721, 547);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed

        if(codigoProdutoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o produto !");
        }

        else if(quantidadeProdutoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe a quantidade do produto !");
        }

        else{
            
            facade_produto.setProduto(facade_produto.getProduto_dao().procurar_por_codigo(Integer.parseInt(codigoProdutoTextField.getText())));

            if(facade_produto.getProduto() == null){
                Funcoes.mensagemErro("Produto não encontrado !");
            }

            else{

                // variável que armazena a quantidade de linhas de um JTable
                int quantidade_linhas = produtosKiTable.getRowCount();

                // verificar se um produto já existe na lista de produtos do kit
                boolean existeProduto = false;

                for(int linha = 0; linha < quantidade_linhas; linha ++){

                    Integer codigoProduto = Integer.parseInt(String.valueOf(produtosKiTable.getValueAt(linha, 0)));

                    if(codigoProduto == facade_produto.getProduto().getCodigo()){
                        existeProduto = true;
                    }

                }

                if(existeProduto == true){
                    Funcoes.mensagemErro("O produto já existe na lista !");
                }

                else{

                    double quantidade = Double.parseDouble(quantidadeProdutoTextField.getText());

                    Funcoes.getModel(produtosKiTable).addRow(new String[]{
                        String.valueOf(facade_produto.getProduto().getCodigo()),
                        facade_produto.getProduto().getDescricao(),
                        String.format("%.1f", quantidade),
                        String.format("%.2f", facade_produto.getProduto().getPrecoVenda()),
                        String.format("%.2f", facade_produto.getProduto().getPrecoVenda().doubleValue() * quantidade)
                    });

                    codigoProdutoTextField.setText("");
                    descricaoProdutoTextField.setText("");
                    quantidadeProdutoTextField.setText("");

                    double valorTotal = 0.0;

                    quantidade_linhas = produtosKiTable.getRowCount();

                    Funcoes.mensagemAviso("qtd: "+quantidade_linhas);
                    for (int linhas=0; linhas< quantidade_linhas; linhas++) {
                        valorTotal = valorTotal + Double.parseDouble(String.valueOf(produtosKiTable.getValueAt(linhas, 4)).replace(",", "."));
                    }

                    valorTotalTextField.setText(String.format("%.2f", valorTotal));

                }
            }
        }

}//GEN-LAST:event_adicionarButtonActionPerformed

    private void manterKitsTabbedPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manterKitsTabbedPaneFocusGained

        if(manterKitsTabbedPane.getSelectedIndex() == 0){
            Funcoes.desabilitaCampos(dadosKitPanel);
            Funcoes.desabilitaCampos(produtosKitPanel);
            Funcoes.limpaLinhasTable(produtosKiTable);
            Funcoes.limpaTela(dadosKitPanel);
            valorTotalTextField.setText("");
            buttonSalvar.setEnabled(false);
        }

    }//GEN-LAST:event_manterKitsTabbedPaneFocusGained

    private void pesquisaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaTextFieldKeyReleased

        if(tipoPesquisaComboBox.getSelectedItem().equals("Código")){
            facade_kit.preencher_jtable_kit(1, pesquisaTextField.getText(), null, kitTable);
        }

        else if(tipoPesquisaComboBox.getSelectedItem().equals("Descrição")){
            facade_kit.preencher_jtable_kit(2, null, pesquisaTextField.getText(), kitTable);
        }
    }//GEN-LAST:event_pesquisaTextFieldKeyReleased

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
}//GEN-LAST:event_buttonSairActionPerformed

    private void buttonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirActionPerformed
        BUTTON = 0;

        manterKitsTabbedPane.setSelectedIndex(1);
        textField_descricao.requestFocus();
        Funcoes.limpaTela(dadosKitPanel);
        Funcoes.limpaLinhasTable(produtosKiTable);
        Funcoes.habilitaCampos(dadosKitPanel);
        Funcoes.habilitaCampos(produtosKitPanel);
        codigoTextField.setEditable(false);
        descricaoProdutoTextField.setEditable(false);
        valorTotalTextField.setEditable(false);
        precoProdutoTextField.setEditable(false);
        buttonSalvar.setEnabled(true);
    }//GEN-LAST:event_buttonIncluirActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        BUTTON = 1;

        if(kitTable.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            int linhaSelecionada = kitTable.getSelectedRow();

            Integer codigo = Integer.parseInt(String.valueOf(kitTable.getValueAt(linhaSelecionada, 0)));

            facade_kit.setKit(facade_kit.getKit_dao().procurar_por_codigo(codigo));

            manterKitsTabbedPane.setSelectedIndex(1);

            Funcoes.habilitaCampos(dadosKitPanel);
            Funcoes.habilitaCampos(produtosKitPanel);
            codigoTextField.setEditable(false);
            descricaoProdutoTextField.setEditable(false);
            valorTotalTextField.setEditable(false);
            precoProdutoTextField.setEditable(false);
            buttonSalvar.setEnabled(true);

            codigoTextField.setText(String.valueOf(facade_kit.getKit().getCodigo()));
            textField_descricao.setText(facade_kit.getKit().getNome());
            valorTotalTextField.setText(String.format("%.2f", facade_kit.getKit().getPreco()));

            // busca todo os produtos do kit pelo código do kit e adiciona em uma List
            facade_kits_produtos.setListProdutosKit(facade_kits_produtos.getKitsProdutosDAO().buscar_por_codigo(facade_kit.getKit().getCodigo()));

            // percorre o List e prenche a tabela de produtos do kit
            for(KitsProdutos k : facade_kits_produtos.getListProdutosKit()){

                    Funcoes.getModel(produtosKiTable).addRow(new String[]{

                        String.valueOf(k.getProduto().getCodigo()),
                        k.getProduto().getDescricao(),
                        String.format("%.2f", k.getProduto().getPrecoVenda()),
                        String.format("%.1f", k.getQuantidadeProduto()),
                        String.format("%.2f", k.getProduto().getPrecoVenda().doubleValue() * k.getQuantidadeProduto().doubleValue())

                    }
                );
            }
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(textField_descricao.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do Kit !");
        }

        else if(produtosKiTable.getRowCount() == 0){
            Funcoes.mensagemAviso("Adicione os produtos ao Kit");
        }

        else{

                // caso seja uma inclusão cria uma nova instância
                if(BUTTON == 0){
                    facade_kit.setKit(facade_kit.newInstance());
                }

                // set nos atributos do kit
                facade_kit.getKit().setNome(textField_descricao.getText());
                facade_kit.getKit().setPreco(BigDecimal.valueOf(Double.parseDouble(valorTotalTextField.getText().replace(",", "."))));

                // salvando o kit
                facade_kit.getKit_dao().salvar(facade_kit.getKit());

                int quantidade_linhas = produtosKiTable.getRowCount();

                // loop na JTable para salvar os produtos do kit
                for (int linhas=0; linhas< quantidade_linhas; linhas++) {

                    Integer codigo = Integer.parseInt(String.valueOf(produtosKiTable.getValueAt(linhas, 0)));
                    double quantidadeProduto = Double.parseDouble(String.valueOf(produtosKiTable.getValueAt(linhas, 2)).replace(",", "."));

                    // buscando o produto
                    facade_produto.setProduto(facade_produto.getProduto_dao().procurar_por_codigo(codigo));

                    // set na chave primária do kitProdutos
                    facade_kits_produtos.getIdKitsProdutos().setKitCodigo(facade_kit.getKit().getCodigo());
                    facade_kits_produtos.getIdKitsProdutos().setProdutoCodigo(facade_produto.getProduto().getCodigo());

                    // set nos atributos do kitProdutos
                    facade_kits_produtos.getKitsProdutos().setId(facade_kits_produtos.getIdKitsProdutos());
                    facade_kits_produtos.getKitsProdutos().setKit(facade_kit.getKit());
                    facade_kits_produtos.getKitsProdutos().setProduto(facade_produto.getProduto());
                    facade_kits_produtos.getKitsProdutos().setQuantidadeProduto(BigDecimal.valueOf(quantidadeProduto));

                    // salvando os produtos do kit
                    facade_kits_produtos.getKitsProdutosDAO().salvar(facade_kits_produtos.getKitsProdutos());
                }

                Funcoes.mensagemInforma("Dados salvos com sucesso !");

                // atualiza a tabela de kits
                facade_kit.preencher_jtable_kit(1, "", null, kitTable);
                Funcoes.limpaTela(dadosKitPanel);
                Funcoes.limpaLinhasTable(produtosKiTable);
                pesquisaTextField.setText("");
                valorTotalTextField.setText("");

                // caso seja uma atualização o BUTTON recebe um para realizar uma inclusão
                if(BUTTON == 1){
                    BUTTON = 0;
                }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void codigoProdutoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoProdutoTextFieldFocusLost
        if(!(codigoProdutoTextField.getText().equals(""))){

            Integer codigo = Integer.parseInt(codigoProdutoTextField.getText());
            facade_produto.setProduto(facade_produto.getProduto_dao().procurar_por_codigo(codigo));

            if(facade_produto.getProduto() == null){
                Funcoes.mensagemErro("Produto não encontrado !");
            } else{

                descricaoProdutoTextField.setText(facade_produto.getProduto().getDescricao());
                precoProdutoTextField.setText(String.format("%.2f", facade_produto.getProduto().getPrecoVenda()));

            }

        }
    }//GEN-LAST:event_codigoProdutoTextFieldFocusLost

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonIncluir;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel1;
    private javax.swing.JLabel codigoLabel2;
    private javax.swing.JLabel codigoLabel3;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JLabel codigoLabel5;
    private javax.swing.JTextField codigoProdutoTextField;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton consultarButton;
    private javax.swing.JPanel dadosKitPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoProdutoTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable kitTable;
    private javax.swing.JTabbedPane manterKitsTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JTextField precoProdutoTextField;
    private javax.swing.JTable produtosKiTable;
    private javax.swing.JPanel produtosKitPanel;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JTextField quantidadeProdutoTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField textField_descricao;
    private javax.swing.JComboBox tipoPesquisaComboBox;
    private javax.swing.JLabel tipoPesquisaLabel;
    private javax.swing.JTextField valorTotalTextField;
    // End of variables declaration//GEN-END:variables

}

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

import br.com.sysmanager.facades.FacadeKit;
import br.com.sysmanager.facades.FacadeKitsProdutos;
import br.com.sysmanager.facades.FacadeProduto;
import br.com.sysmanager.model.KitsProdutos;
import br.com.sysmanager.services.Funcoes;
import java.math.BigDecimal;

/**
 *
 * @author Júnior
 */
public class Manter_Kit extends javax.swing.JDialog {

    private FacadeKit facade_kit = new FacadeKit();
    private FacadeKitsProdutos facade_kits_produtos = new FacadeKitsProdutos();
    private FacadeProduto facade_produto = new FacadeProduto();

     // variavel que verifica qual o botão pressionado
    // 0 = incluir
    // 1 = alterar
    private static int BUTTON = 0;
    private static int quantidadeLinhasProdutosKiTable = 0;

    public Manter_Kit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Funcoes.desabilitaCampos(dadosKitPanel);
        Funcoes.desabilitaCampos(produtosKitPanel);
        Funcoes.limpaLinhasTable(produtosKiTable);
        facade_kit.preencherTableKits(1, "", null, kitTable);
        salvarButton.setEnabled(false);
        pack();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manterKitsTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        kitTable = new javax.swing.JTable();
        excluirButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        incluirButton = new javax.swing.JButton();
        tipoPesquisaComboBox = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        pesquisaTextField = new javax.swing.JTextField();
        produtosPanel = new javax.swing.JPanel();
        salvarButton = new javax.swing.JButton();
        sairProdutoButton = new javax.swing.JButton();
        dadosKitPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        alterarButton.setFont(new java.awt.Font("Arial", 0, 12));
        alterarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/alterar.png"))); // NOI18N
        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
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
                    .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoPesquisaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                        .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        manterKitsTabbedPane.addTab("Pesquisa", pesquisaPanel);

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

        dadosKitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Kit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");

        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12));

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
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        dadosKitPanelLayout.setVerticalGroup(
            dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosKitPanelLayout.createSequentialGroup()
                .addGroup(dadosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosKitPanelLayout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        produtosKitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos do Kit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        codigoProdutoTextField.setFont(new java.awt.Font("Arial", 0, 12));

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
        consultarButton.setText("Consultar");

        produtosKiTable.setFont(new java.awt.Font("Arial", 0, 12));
        produtosKiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço", "Quantidade", "Sub. Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosKiTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        produtosKiTable.setRowHeight(20);
        produtosKiTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(produtosKiTable);
        produtosKiTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        produtosKiTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        produtosKiTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        produtosKiTable.getColumnModel().getColumn(4).setPreferredWidth(100);

        removerButton.setFont(new java.awt.Font("Arial", 0, 12));
        removerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N
        removerButton.setText("Remover");

        adicionarButton.setFont(new java.awt.Font("Arial", 0, 12));
        adicionarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N
        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout produtosKitPanelLayout = new javax.swing.GroupLayout(produtosKitPanel);
        produtosKitPanel.setLayout(produtosKitPanelLayout);
        produtosKitPanelLayout.setHorizontalGroup(
            produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosKitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigoLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProdutoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel2)
                            .addComponent(descricaoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel3)
                            .addComponent(quantidadeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        produtosKitPanelLayout.setVerticalGroup(
            produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosKitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtosKitPanelLayout.createSequentialGroup()
                        .addComponent(codigoLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(produtosKitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valorTotalTextField.setEditable(false);
        valorTotalTextField.setFont(new java.awt.Font("Arial", 0, 18));
        valorTotalTextField.setForeground(new java.awt.Color(0, 153, 0));
        valorTotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        codigoLabel4.setFont(new java.awt.Font("Arial", 0, 18));
        codigoLabel4.setText("Valor Total");

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(produtosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dadosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtosPanelLayout.createSequentialGroup()
                        .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosKitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel4))
                .addGap(138, 138, 138))
        );

        manterKitsTabbedPane.addTab("Kit de Produto", produtosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterKitsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterKitsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-721)/2, (screenSize.height-572)/2, 721, 572);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        dispose();
}//GEN-LAST:event_sairButtonActionPerformed

    private void sairProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairProdutoButtonActionPerformed
        dispose();
}//GEN-LAST:event_sairProdutoButtonActionPerformed

    private void incluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirButtonActionPerformed
        BUTTON = 0;

        manterKitsTabbedPane.setSelectedIndex(1);
        descricaoTextField.requestFocus();
        Funcoes.limpaTela(dadosKitPanel);
        Funcoes.limpaLinhasTable(produtosKiTable);
        Funcoes.habilitaCampos(dadosKitPanel);
        Funcoes.habilitaCampos(produtosKitPanel);
        codigoTextField.setEditable(false);
        descricaoProdutoTextField.setEditable(false);
        salvarButton.setEnabled(true);
    }//GEN-LAST:event_incluirButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        if(descricaoTextField.getText().equals("")){
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
                facade_kit.getKit().setNome(descricaoTextField.getText());
                facade_kit.getKit().setPreco(BigDecimal.valueOf(Double.parseDouble(valorTotalTextField.getText().replace(",", "."))));

                // salvando o kit
                facade_kit.getKitDAO().salvar(facade_kit.getKit());

                quantidadeLinhasProdutosKiTable = produtosKiTable.getRowCount();

                // loop na JTable para salvar os produtos do kit
                for (int linhas=0; linhas< quantidadeLinhasProdutosKiTable; linhas++) {

                    Integer codigo = Integer.parseInt(String.valueOf(produtosKiTable.getValueAt(linhas, 0)));
                    double quantidadeProduto = Double.parseDouble(String.valueOf(produtosKiTable.getValueAt(linhas, 3)).replace(",", "."));

                    // buscando o produto
                    facade_produto.setProduto(facade_produto.getProdutoDAO().procurar_por_codigo(codigo));

                    // set na chave primária do kitProdutos
                    facade_kits_produtos.getIdKitsProdutos().setKitCodigo(facade_kit.getKit().getCodigo());
                    facade_kits_produtos.getIdKitsProdutos().setProdutoCodigo(facade_produto.getProduto().getCodigo());

                    // set nos atributos do kitProdutos
                    facade_kits_produtos.getKitsProdutos().setId(facade_kits_produtos.getIdKitsProdutos());
                    facade_kits_produtos.getKitsProdutos().setKits(facade_kit.getKit());
                    facade_kits_produtos.getKitsProdutos().setProduto(facade_produto.getProduto());
                    facade_kits_produtos.getKitsProdutos().setQuantidadeProduto(BigDecimal.valueOf(quantidadeProduto));

                    // salvando os produtos do kit
                    facade_kits_produtos.getKitsProdutosDAO().salvar(facade_kits_produtos.getKitsProdutos());
                }

                Funcoes.mensagemInforma("Dados salvos com sucesso !");

                // atualiza a tabela de kits
                facade_kit.preencherTableKits(1, "", null, kitTable);
                Funcoes.limpaTela(dadosKitPanel);
                Funcoes.limpaLinhasTable(produtosKiTable);
                pesquisaTextField.setText("");
                valorTotalTextField.setText("");
                
                // caso seja uma atualização o BUTTON recebe um para realizar uma inclusão
                if(BUTTON == 1){
                    BUTTON = 0;
                }
        }

            
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed

        if(codigoProdutoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o produto !");
        }

        else if(quantidadeProdutoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe a quantidade do produto !");
        }

        else{
            
            facade_produto.setProduto(facade_produto.getProdutoDAO().procurar_por_codigo(Integer.parseInt(codigoProdutoTextField.getText())));

            if(facade_produto.getProduto() == null){
                Funcoes.mensagemErro("Produto não encontrado !");
            }

            else{

                quantidadeLinhasProdutosKiTable = produtosKiTable.getRowCount();
                boolean existeProduto = false;

                for(int linha = 0; linha < quantidadeLinhasProdutosKiTable; linha ++){

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
                        String.format("%.2f", facade_produto.getProduto().getPrecoVenda()),
                        String.format("%.1f", quantidade),
                        String.format("%.2f", facade_produto.getProduto().getPrecoVenda().doubleValue() * quantidade)
                    });

                    codigoProdutoTextField.setText("");
                    descricaoProdutoTextField.setText("");
                    quantidadeProdutoTextField.setText("");

                    double valorTotal = 0.0;

                    quantidadeLinhasProdutosKiTable = produtosKiTable.getRowCount();

                    for (int linhas=0; linhas< quantidadeLinhasProdutosKiTable; linhas++) {
                        valorTotal = valorTotal
                                + Double.parseDouble(String.valueOf(produtosKiTable.getValueAt(
                                linhas, 4)).replace(",", "."));
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
            salvarButton.setEnabled(false);
        }

    }//GEN-LAST:event_manterKitsTabbedPaneFocusGained

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed

        BUTTON = 1;

        if(kitTable.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            int linhaSelecionada = kitTable.getSelectedRow();

            Integer codigo = Integer.parseInt(String.valueOf(kitTable.getValueAt(linhaSelecionada, 0)));

            facade_kit.setKit(facade_kit.getKitDAO().procurar_por_codigo(codigo));

            manterKitsTabbedPane.setSelectedIndex(1);

            Funcoes.habilitaCampos(dadosKitPanel);
            Funcoes.habilitaCampos(produtosKitPanel);
            codigoTextField.setEditable(false);
            descricaoProdutoTextField.setEditable(false);
            salvarButton.setEnabled(true);

            codigoTextField.setText(String.valueOf(facade_kit.getKit().getCodigo()));
            descricaoTextField.setText(facade_kit.getKit().getNome());
            valorTotalTextField.setText(String.format("%.2f", facade_kit.getKit().getPreco()));
            
            // busca todo os produtos do kit pelo código do kit e adiciona em uma List
            facade_kits_produtos.setListProdutosKit(facade_kits_produtos.getKitsProdutosDAO().buscar_por_codigoKit(facade_kit.getKit().getCodigo()));

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
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void pesquisaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaTextFieldKeyReleased

        if(tipoPesquisaComboBox.getSelectedItem().equals("Código")){
            facade_kit.preencherTableKits(1, pesquisaTextField.getText(), null, kitTable);
        }

        else if(tipoPesquisaComboBox.getSelectedItem().equals("Descrição")){
            facade_kit.preencherTableKits(2, null, pesquisaTextField.getText(), kitTable);
        }
    }//GEN-LAST:event_pesquisaTextFieldKeyReleased

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel1;
    private javax.swing.JLabel codigoLabel2;
    private javax.swing.JLabel codigoLabel3;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JTextField codigoProdutoTextField;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton consultarButton;
    private javax.swing.JPanel dadosKitPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoProdutoTextField;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton incluirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kitTable;
    private javax.swing.JTabbedPane manterKitsTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JTable produtosKiTable;
    private javax.swing.JPanel produtosKitPanel;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JTextField quantidadeProdutoTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton sairProdutoButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox tipoPesquisaComboBox;
    private javax.swing.JLabel tipoPesquisaLabel;
    private javax.swing.JTextField valorTotalTextField;
    // End of variables declaration//GEN-END:variables

}

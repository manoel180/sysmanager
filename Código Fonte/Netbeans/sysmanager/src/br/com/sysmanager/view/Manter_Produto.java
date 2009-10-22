/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Produto.java
 *
 * Created on 02/09/2009, 23:04:47
 */
package br.com.sysmanager.view;

import br.com.sysmanager.dao.ProdutoDAO;
import br.com.sysmanager.facades.FacadeGrupoProduto;
import br.com.sysmanager.facades.FacadeProduto;
import br.com.sysmanager.facades.FacadeUnidadeMedida;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.model.Produto;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.math.BigDecimal;

/**
 *
 * @author Júnior
 */
public class Manter_Produto extends javax.swing.JDialog {

    private FacadeProduto facade_produto = new FacadeProduto();
    private FacadeGrupoProduto facade_grupo_produto = new FacadeGrupoProduto();
    private FacadeUnidadeMedida facade_unidade_medida = new FacadeUnidadeMedida();
    private Produto produto = new Produto();
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    // variavel que verifica qual o botão pressionado
    // 0 = incluir
    // 1 = alterar
    private static int BUTTON = 0;

    public Manter_Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        facade_produto.preencherTableProdutos(1, "", null, null, produtosTable);
        facade_grupo_produto.preencherComboGrupo(grupoProdutoComboBox);
        facade_unidade_medida.preencherComboUnidade(unidadeMedidaComboBox);
        Funcoes.desabilitaCampos(dadosProdutoPanel);
        salvarButton.setEnabled(false);
        pack();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manterProdutosTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
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
        dadosProdutoPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        grupoProdutoComboBox = new javax.swing.JComboBox();
        grupoProdutoLabel = new javax.swing.JLabel();
        unidadeMedidaComboBox = new javax.swing.JComboBox();
        unidadeMedidaLabel = new javax.swing.JLabel();
        estoqueLabel = new javax.swing.JLabel();
        estoqueTextField = new javax.swing.JTextField();
        estoqueMinimoTextField = new javax.swing.JTextField();
        estoqueMinimoLabel = new javax.swing.JLabel();
        precoCompraTextField = new javax.swing.JTextField();
        precoCompraLabel = new javax.swing.JLabel();
        precoVendaTextField = new javax.swing.JTextField();
        precoVendaLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setModalityType(null);

        manterProdutosTabbedPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        manterProdutosTabbedPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manterProdutosTabbedPan7eFocusGained(evt);
            }
        });

        pesquisaPanel.setFont(new java.awt.Font("Arial", 0, 12));

        produtosTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Grupo", "Unidade", "Estoque", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        produtosTable.setRowHeight(20);
        produtosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        produtosScrollPane.setViewportView(produtosTable);
        produtosTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        produtosTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        produtosTable.getColumnModel().getColumn(3).setPreferredWidth(100);

        excluirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        excluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/excluir.png"))); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

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

        incluirButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        incluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/incluir.png"))); // NOI18N
        incluirButton.setText("Incluir");
        incluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirButtonActionPerformed(evt);
            }
        });

        tipoPesquisaComboBox.setFont(new java.awt.Font("Arial", 0, 12));
        tipoPesquisaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Descrição", "Grupo" }));

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
                    .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoPesquisaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                        .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(11, 11, 11)
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Pesquisa", pesquisaPanel);

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

        dadosProdutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");

        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        grupoProdutoComboBox.setFont(new java.awt.Font("Arial", 0, 12));

        grupoProdutoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        grupoProdutoLabel.setText("Grupo:");

        unidadeMedidaComboBox.setFont(new java.awt.Font("Arial", 0, 12));

        unidadeMedidaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        unidadeMedidaLabel.setText("Unidade:");

        estoqueLabel.setFont(new java.awt.Font("Arial", 0, 12));
        estoqueLabel.setText("Estoque:");

        estoqueTextField.setFont(new java.awt.Font("Arial", 0, 12));

        estoqueMinimoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        estoqueMinimoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        estoqueMinimoLabel.setText("Estoque Mínimo:");

        precoCompraTextField.setFont(new java.awt.Font("Arial", 0, 12));

        precoCompraLabel.setFont(new java.awt.Font("Arial", 0, 12));
        precoCompraLabel.setText("Preço de Compra:");

        precoVendaTextField.setFont(new java.awt.Font("Arial", 0, 12));

        precoVendaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        precoVendaLabel.setText("Preço de Venda:");

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");

        codigoTextField.setEditable(false);
        codigoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        javax.swing.GroupLayout dadosProdutoPanelLayout = new javax.swing.GroupLayout(dadosProdutoPanel);
        dadosProdutoPanel.setLayout(dadosProdutoPanelLayout);
        dadosProdutoPanelLayout.setHorizontalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupoProdutoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grupoProdutoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unidadeMedidaLabel)
                            .addComponent(unidadeMedidaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estoqueLabel)
                            .addComponent(estoqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estoqueMinimoLabel)
                            .addComponent(estoqueMinimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoCompraLabel)
                            .addComponent(precoCompraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoVendaLabel)
                            .addComponent(precoVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        dadosProdutoPanelLayout.setVerticalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosProdutoPanelLayout.createSequentialGroup()
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(grupoProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grupoProdutoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(unidadeMedidaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadeMedidaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(estoqueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estoqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(estoqueMinimoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estoqueMinimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(precoCompraLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoCompraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(precoVendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Produto", produtosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterProdutosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manterProdutosTabbedPane)
                .addGap(7, 7, 7))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-741)/2, (screenSize.height-451)/2, 741, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void incluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirButtonActionPerformed

        BUTTON = 0;

        manterProdutosTabbedPane.setSelectedIndex(1);
        descricaoTextField.requestFocus();
        Funcoes.limpaTela(dadosProdutoPanel);
        Funcoes.habilitaCampos(dadosProdutoPanel);
        codigoTextField.setEditable(false);
        salvarButton.setEnabled(true);

    }//GEN-LAST:event_incluirButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        // verifica os campos obrigatórios
        if (descricaoTextField.getText().equals("")) {
            Funcoes.mensagemAviso("Informe a descrição do produto !");
        } else if (grupoProdutoComboBox.getSelectedIndex() < 0) {
            Funcoes.mensagemAviso("Informe o grupo do produto !");
        } else if (unidadeMedidaComboBox.getSelectedIndex() < 0) {
            Funcoes.mensagemAviso("Informe a unidade de medida do produto !");
        } else if (estoqueTextField.getText().equals("")) {
            Funcoes.mensagemAviso("Informe o estoque do produto !");
        } else if (estoqueMinimoTextField.getText().equals("")) {
            Funcoes.mensagemAviso("Informe o estoque mínimo do produto !");
        } else if (precoCompraTextField.getText().equals("")) {
            Funcoes.mensagemAviso("Informe o preço de compra do produto !");
        } else if (precoVendaTextField.getText().equals("")) {
            Funcoes.mensagemAviso("Informe o preço de venda do produto !");
        } else {

            // se o botão for incluir cria uma nova instância
       //     if (BUTTON == 0) {
              //  facade_produto.setProduto(facade_produto.newInstance());
         //   }

            // buscando o grupo do produto
//            facade_grupo_produto.setGrupoProduto(facade_grupo_produto.getGrupoProdutoDAO().procurar_por_descricao(grupoProdutoComboBox.getSelectedItem().toString()));
            GrupoProduto grpProduto = new GrupoProduto();
            grpProduto = (GrupoProduto) grupoProdutoComboBox.getSelectedItem();
//            facade_grupo_produto.setGrupoProduto(grpProduto);


            // adicionando o grupo ao produto
            produto.setGrupoProduto(grpProduto);

            // buscando a unidade de medida do produto
            UnidadeMedida unidMedida = new UnidadeMedida();
            unidMedida = (UnidadeMedida) unidadeMedidaComboBox.getSelectedItem();
            //           facade_unidade_medida.setUnidadeMedida(facade_unidade_medida.getUnidadeMedidaDAO().procurar_por_descricao(unidadeMedidaComboBox.getSelectedItem().toString()));

            // adicionando a unidade de medida ao produto
            //facade_unidade_medida.setUnidadeMedida(unidMedida);
            produto.setUnidadeMedida(unidMedida);

            // adicionando os restantes dos atributos de produto
  //          facade_produto.getProduto().setDescricao(descricaoTextField.getText());
    //        facade_produto.getProduto().setQuantidadeEstoque(BigDecimal.valueOf(Double.parseDouble(estoqueTextField.getText().replace(",", "."))));
      //      facade_produto.getProduto().setQuantidadeMinimo(BigDecimal.valueOf(Double.parseDouble(estoqueMinimoTextField.getText().replace(",", "."))));
            //facade_produto.getProduto().setPrecoCompra(BigDecimal.valueOf(Double.parseDouble(precoCompraTextField.getText().replace(",", "."))));
            //facade_produto.getProduto().setPrecoVenda(BigDecimal.valueOf(Double.parseDouble(precoVendaTextField.getText().replace(",", "."))));



             produto.setDescricao(descricaoTextField.getText());
            produto.setQuantidadeEstoque(BigDecimal.valueOf(2));
            produto.setQuantidadeMinimo(BigDecimal.valueOf(2));
            produto.setPrecoCompra(BigDecimal.valueOf(2));
            produto.setPrecoVenda(BigDecimal.valueOf(2));


            System.out.println("Codigo "+produto.getGrupoProduto().getCodigo() +
                                "Unidade de Medida Cod " + produto.getUnidadeMedida().getCodigo()
                    );



            // salva o produto no banco de dados
           produtoDAO.salvar(produto);

            // atualiza a tabela de produtos
            facade_produto.preencherTableProdutos(1, "", null, null, produtosTable);

            // limpa os campos caso seja inserido um novo produto
            Funcoes.limpaTela(dadosProdutoPanel);
            pesquisaTextField.setText("");

            // caso seja uma atualização o BUTTON recebe um para realizar uma inclusão
            if (BUTTON == 1) {
                BUTTON = 0;
            }
        }

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void pesquisaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaTextFieldKeyReleased

        // 1 - código
        // 2 - descrição
        // 3 - grupo

        // verifica o modo de pesquisa selecionado case: código
        if (tipoPesquisaComboBox.getSelectedItem().equals("Código")) {
            facade_produto.preencherTableProdutos(1, pesquisaTextField.getText(), null, null, produtosTable);
        } // verifica o modo de pesquisa selecionado case: descrição
        else if (tipoPesquisaComboBox.getSelectedItem().equals("Descrição")) {
            facade_produto.preencherTableProdutos(2, null, pesquisaTextField.getText(), null, produtosTable);
        } // verifica o modo de pesquisa selecionado case: grupo
        else if (tipoPesquisaComboBox.getSelectedItem().equals("Grupo")) {
            facade_produto.preencherTableProdutos(3, null, null, pesquisaTextField.getText(), produtosTable);
        }
    }//GEN-LAST:event_pesquisaTextFieldKeyReleased

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed

        // botão alterar pressionado
        BUTTON = 1;

        // verificar se exite registro seleciona na tabela de produtos
        if (produtosTable.getSelectedRow() < 0) {
            Funcoes.mensagemAviso("Selecione um registro !");
        } else {

            // recupera a linha seleciona da tabela de produtos
            int linhaSelecionada = produtosTable.getSelectedRow();

            // recupera o código do produto
            Integer codigo = Integer.parseInt(String.valueOf(produtosTable.getValueAt(linhaSelecionada, 0)));

            // buscando o objeto produto pelo código
            facade_produto.setProduto(facade_produto.getProdutoDAO().procurar_por_codigo(codigo));

            // redireciona para a aba produto
            manterProdutosTabbedPane.setSelectedIndex(1);

            // habilita os campos
            Funcoes.habilitaCampos(dadosProdutoPanel);

            // desabilita o código
            codigoTextField.setEditable(false);

            // habilita o botão salvar
            salvarButton.setEnabled(true);

            // adiciona o objeto produto nos seus respectivos campos
            codigoTextField.setText(String.valueOf(facade_produto.getProduto().getCodigo()));
            descricaoTextField.setText(facade_produto.getProduto().getDescricao());
            grupoProdutoComboBox.setSelectedItem(facade_produto.getProduto().getGrupoProduto().getDescricao());
            unidadeMedidaComboBox.setSelectedItem(facade_produto.getProduto().getUnidadeMedida().getDescricao());
            estoqueTextField.setText(String.format("%.1f", facade_produto.getProduto().getQuantidadeEstoque()));
            estoqueMinimoTextField.setText(String.format("%.1f", facade_produto.getProduto().getQuantidadeMinimo()));
            precoCompraTextField.setText(String.format("%.2f", facade_produto.getProduto().getPrecoCompra()));
            precoVendaTextField.setText(String.format("%.2f", facade_produto.getProduto().getPrecoVenda()));
        }

    }//GEN-LAST:event_alterarButtonActionPerformed

    private void manterProdutosTabbedPan7eFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manterProdutosTabbedPan7eFocusGained

        // verifica se o foco está na aba pesquisa
        if (manterProdutosTabbedPane.getSelectedIndex() == 0) {

            // limpa a tela da aba produto e limpa os campos
            Funcoes.limpaTela(dadosProdutoPanel);
            Funcoes.desabilitaCampos(dadosProdutoPanel);
            salvarButton.setEnabled(false);
        }
}//GEN-LAST:event_manterProdutosTabbedPan7eFocusGained

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed

        // fecha a janela
        dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void sairProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairProdutoButtonActionPerformed

        // fecha a janela
        dispose();
    }//GEN-LAST:event_sairProdutoButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JPanel dadosProdutoPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JLabel estoqueLabel;
    private javax.swing.JLabel estoqueMinimoLabel;
    private javax.swing.JTextField estoqueMinimoTextField;
    private javax.swing.JTextField estoqueTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JComboBox grupoProdutoComboBox;
    private javax.swing.JLabel grupoProdutoLabel;
    private javax.swing.JButton incluirButton;
    private javax.swing.JTabbedPane manterProdutosTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JLabel precoCompraLabel;
    private javax.swing.JTextField precoCompraTextField;
    private javax.swing.JLabel precoVendaLabel;
    private javax.swing.JTextField precoVendaTextField;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JTable produtosTable;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton sairProdutoButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox tipoPesquisaComboBox;
    private javax.swing.JLabel tipoPesquisaLabel;
    private javax.swing.JComboBox unidadeMedidaComboBox;
    private javax.swing.JLabel unidadeMedidaLabel;
    // End of variables declaration//GEN-END:variables
}

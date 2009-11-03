/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Manter_Produto.java
 *
 * Created on 22/09/2009, 12:47:03
 */

package br.com.sysmanager.view;

import br.com.sysmanager.facades.Facade_Fornecedor;
import br.com.sysmanager.facades.Facade_FornecedoresProdutos;
import br.com.sysmanager.facades.Facade_GrupoProduto;
import br.com.sysmanager.facades.Facade_Marca;
import br.com.sysmanager.facades.Facade_Produto;
import br.com.sysmanager.facades.Facade_UnidadeMedida;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.math.BigDecimal;
import javax.swing.JFrame;

/**
 *
 * @author Júnior
 */
public class Form_Manter_Produto extends javax.swing.JDialog {

    private Facade_Marca facade_marca = new Facade_Marca();
    private Facade_UnidadeMedida facade_unidade = new Facade_UnidadeMedida();
    private Facade_GrupoProduto facade_grupo = new Facade_GrupoProduto();
    private Facade_Produto facade_produto = new Facade_Produto();
    private Facade_FornecedoresProdutos facade_fornecedores_produtos = new Facade_FornecedoresProdutos();
    private Facade_Fornecedor facade_fornecedor = new Facade_Fornecedor();

    private static int BUTTON;

    public Form_Manter_Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        openForm();
        pack();
    }


    private void openForm(){
       facade_produto.preencher_jtable_produto(1, "", null, null, produtosTable);
       facade_grupo.preencherComboGrupo(comboBox_grupo);
       facade_marca.preencherComboMarca(comboBox_marca);
       facade_unidade.preencherComboUnidade(comboBox_unidade);
       Funcoes.limpaLinhasTable(table_fornecedores);
       Funcoes.desabilitaCampos(dadosProdutoPanel);
       buttonSalvar.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manterProdutosTabbedPane = new javax.swing.JTabbedPane();
        pesquisaPanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        tipoPesquisaComboBox = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        pesquisaTextField = new javax.swing.JTextField();
        produtosPanel = new javax.swing.JPanel();
        dadosProdutoPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        comboBox_grupo = new javax.swing.JComboBox();
        grupoProdutoLabel = new javax.swing.JLabel();
        comboBox_unidade = new javax.swing.JComboBox();
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
        comboBox_marca = new javax.swing.JComboBox();
        unidadeMedidaLabel1 = new javax.swing.JLabel();
        comboBox_status = new javax.swing.JComboBox();
        unidadeMedidaLabel2 = new javax.swing.JLabel();
        produtosPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        descricaoLabel4 = new javax.swing.JLabel();
        descricaoTextField4 = new javax.swing.JTextField();
        descricaoLabel5 = new javax.swing.JLabel();
        descricaoTextField5 = new javax.swing.JTextField();
        produtosScrollPane2 = new javax.swing.JScrollPane();
        table_fornecedores = new javax.swing.JTable();
        removerButton1 = new javax.swing.JButton();
        adicionarButton1 = new javax.swing.JButton();
        adicionarButton2 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        buttonSair = new javax.swing.JButton();
        buttonIncluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setModalityType(null);
        setResizable(false);

        manterProdutosTabbedPane.setFont(new java.awt.Font("Arial", 0, 12));
        manterProdutosTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manterProdutosTabbedPaneMousePressed(evt);
            }
        });
        manterProdutosTabbedPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manterProdutosTabbedPaneFocusGained(evt);
            }
        });

        pesquisaPanel.setFont(new java.awt.Font("Arial", 0, 12));

        produtosTable.setFont(new java.awt.Font("Arial", 0, 12));
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
        produtosTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        produtosTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        produtosTable.getColumnModel().getColumn(2).setPreferredWidth(120);
        produtosTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        produtosTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        produtosTable.getColumnModel().getColumn(5).setPreferredWidth(100);

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
                    .addComponent(tipoPesquisaLabel)
                    .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoPesquisaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addComponent(produtosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manterProdutosTabbedPane.addTab("Pesquisa", pesquisaPanel);

        produtosPanel.setFont(new java.awt.Font("Arial", 0, 12));

        dadosProdutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Descrição:");

        descricaoTextField.setFont(new java.awt.Font("Arial", 0, 12));

        comboBox_grupo.setFont(new java.awt.Font("Arial", 0, 12));

        grupoProdutoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        grupoProdutoLabel.setText("Grupo:");

        comboBox_unidade.setFont(new java.awt.Font("Arial", 0, 12));

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

        comboBox_marca.setFont(new java.awt.Font("Arial", 0, 12));

        unidadeMedidaLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        unidadeMedidaLabel1.setText("Marca:");

        comboBox_status.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Desativado" }));

        unidadeMedidaLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        unidadeMedidaLabel2.setText("Status:");

        javax.swing.GroupLayout dadosProdutoPanelLayout = new javax.swing.GroupLayout(dadosProdutoPanel);
        dadosProdutoPanel.setLayout(dadosProdutoPanelLayout);
        dadosProdutoPanelLayout.setHorizontalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(descricaoLabel)
                        .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                            .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBox_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(grupoProdutoLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadeMedidaLabel)
                                .addComponent(comboBox_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                            .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadeMedidaLabel1)
                                .addComponent(comboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadeMedidaLabel2)
                                .addComponent(comboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(codigoLabel)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descricaoTextField))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estoqueLabel)
                            .addComponent(estoqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estoqueMinimoLabel)
                            .addComponent(estoqueMinimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoCompraLabel)
                            .addComponent(precoCompraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoVendaLabel)
                            .addComponent(precoVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(412, Short.MAX_VALUE))
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
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(grupoProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(unidadeMedidaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(unidadeMedidaLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addComponent(unidadeMedidaLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Produto", produtosPanel);

        produtosPanel1.setFont(new java.awt.Font("Arial", 0, 12));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fornecedores do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        descricaoLabel4.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel4.setText("Código:");

        descricaoTextField4.setFont(new java.awt.Font("Arial", 0, 12));

        descricaoLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel5.setText("Nome:");

        descricaoTextField5.setEditable(false);
        descricaoTextField5.setFont(new java.awt.Font("Arial", 0, 12));

        table_fornecedores.setFont(new java.awt.Font("Arial", 0, 12));
        table_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_fornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_fornecedores.setRowHeight(20);
        produtosScrollPane2.setViewportView(table_fornecedores);
        table_fornecedores.getColumnModel().getColumn(0).setPreferredWidth(80);
        table_fornecedores.getColumnModel().getColumn(1).setPreferredWidth(400);

        removerButton1.setFont(new java.awt.Font("Arial", 0, 12));
        removerButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N

        adicionarButton1.setFont(new java.awt.Font("Arial", 0, 12));
        adicionarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N

        adicionarButton2.setFont(new java.awt.Font("Arial", 0, 12));
        adicionarButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/consultar.png"))); // NOI18N
        adicionarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adicionarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(descricaoLabel5)
                                .addGap(366, 366, 366))
                            .addComponent(descricaoTextField5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adicionarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produtosScrollPane2))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adicionarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(descricaoLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(descricaoLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtosScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout produtosPanel1Layout = new javax.swing.GroupLayout(produtosPanel1);
        produtosPanel1.setLayout(produtosPanel1Layout);
        produtosPanel1Layout.setHorizontalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        produtosPanel1Layout.setVerticalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterProdutosTabbedPane.addTab("Fornecedores do Produto", produtosPanel1);

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
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonAtualizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(manterProdutosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manterProdutosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-829)/2, (screenSize.height-515)/2, 829, 515);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaTextFieldKeyReleased

        // 1 - código
        // 2 - descrição
        // 3 - grupo

        // verifica o modo de pesquisa selecionado case: código
        if(tipoPesquisaComboBox.getSelectedIndex() == 0){
            facade_produto.preencher_jtable_produto(1, pesquisaTextField.getText(), null, null, produtosTable);
        }

        // verifica o modo de pesquisa selecionado case: descrição
        else if(tipoPesquisaComboBox.getSelectedIndex() == 1){
            facade_produto.preencher_jtable_produto(2, null, pesquisaTextField.getText(), null, produtosTable);
        }

        // verifica o modo de pesquisa selecionado case: grupo
        else if(tipoPesquisaComboBox.getSelectedIndex() == 2){
            facade_produto.preencher_jtable_produto(3, null, null, pesquisaTextField.getText(), produtosTable);
        }
}//GEN-LAST:event_pesquisaTextFieldKeyReleased

    private void manterProdutosTabbedPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manterProdutosTabbedPaneMousePressed
        if(manterProdutosTabbedPane.getSelectedIndex() == 0){
            // limpa a tela da aba produto e limpa os campos
            Funcoes.limpaTela(dadosProdutoPanel);
            Funcoes.desabilitaCampos(dadosProdutoPanel);
            Funcoes.limpaLinhasTable(table_fornecedores);
            buttonSalvar.setEnabled(false);
        }
}//GEN-LAST:event_manterProdutosTabbedPaneMousePressed

    private void manterProdutosTabbedPaneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manterProdutosTabbedPaneFocusGained
        if(manterProdutosTabbedPane.getSelectedIndex() == 0){
            // limpa a tela da aba produto e limpa os campos
            Funcoes.limpaTela(dadosProdutoPanel);
            Funcoes.desabilitaCampos(dadosProdutoPanel);
            Funcoes.limpaLinhasTable(table_fornecedores);
            buttonSalvar.setEnabled(false);

        }
}//GEN-LAST:event_manterProdutosTabbedPaneFocusGained

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
}//GEN-LAST:event_buttonSairActionPerformed

    private void buttonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirActionPerformed

        BUTTON = 0;

        manterProdutosTabbedPane.setSelectedIndex(1);
        descricaoTextField.requestFocus();
        Funcoes.habilitaCampos(dadosProdutoPanel);
        Funcoes.limpaTela(dadosProdutoPanel);
        codigoTextField.setEditable(false);
        buttonSalvar.setEnabled(true);

    }//GEN-LAST:event_buttonIncluirActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // verifica os campos obrigatórios
        if(descricaoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do produto !");
        }

        else if(comboBox_grupo.getSelectedIndex() < 0){
            Funcoes.mensagemAviso("Informe o grupo do produto !");
        }

        else if(comboBox_unidade.getSelectedIndex() < 0){
            Funcoes.mensagemAviso("Informe a unidade de medida do produto !");
        }

        else if(estoqueTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o estoque do produto !");
        }

        else if(estoqueMinimoTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o estoque mínimo do produto !");
        }

        else if(precoCompraTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o preço de compra do produto !");
        }

        else if(precoVendaTextField.getText().equals("")){
            Funcoes.mensagemAviso("Informe o preço de venda do produto !");
        }

        else{

            // se o botão for incluir cria uma nova instância
            if(BUTTON == 0){
                facade_produto.setProduto(facade_produto.newInstance());
            }

            // adionando o grupo do produto selecionado
            facade_grupo.setGrupo((GrupoProduto)comboBox_grupo.getSelectedItem());
            facade_produto.getProduto().setGrupoProduto(facade_grupo.getGrupo());

            // adionando a marca do produto selecionado
            facade_marca.setMarca((Marca)comboBox_marca.getSelectedItem());
            facade_produto.getProduto().setMarca(facade_marca.getMarca());

            // adicionando a unidade de medida selecionada
            facade_unidade.setUnidade((UnidadeMedida)comboBox_unidade.getSelectedItem());
            facade_produto.getProduto().setUnidadeMedida(facade_unidade.getUnidade());

            // adicionando o status
            if(comboBox_status.getSelectedIndex() == 0){
                facade_produto.getProduto().setStatus('A');
            } else{
                facade_produto.getProduto().setStatus('D');
            }

            // adicionando os restantes dos atributos de produto
            facade_produto.getProduto().setDescricao(descricaoTextField.getText());
            facade_produto.getProduto().setQuantidadeEstoque(BigDecimal.valueOf(Double.parseDouble(estoqueTextField.getText().replace(",", "."))));
            facade_produto.getProduto().setQuantidadeMinimo(BigDecimal.valueOf(Double.parseDouble(estoqueMinimoTextField.getText().replace(",", "."))));
            facade_produto.getProduto().setPrecoCompra(BigDecimal.valueOf(Double.parseDouble(precoCompraTextField.getText().replace(",", "."))));
            facade_produto.getProduto().setPrecoVenda(BigDecimal.valueOf(Double.parseDouble(precoVendaTextField.getText().replace(",", "."))));

            // salva o produto no banco de dados
            facade_produto.getProduto_dao().salvar(facade_produto.getProduto());

            int quantidade_linhas = table_fornecedores.getRowCount();

                // loop na JTable para salvar os fornecedores do produto
                for (int linhas=0; linhas< quantidade_linhas; linhas++) {

                    Integer codigoFornecedor = Integer.parseInt(String.valueOf(table_fornecedores.getValueAt(linhas, 0)));

                    // buscando o produto
                    facade_fornecedor.setFornecedor(facade_fornecedor.getFornecedor_dao().procurar_por_codigo(codigoFornecedor));

                    // set na chave primária dos fornecedores do produto
                    facade_fornecedores_produtos.getFornecedores_produtosId().setFornecedorCodigo(facade_fornecedor.getFornecedor().getCodigo());
                    facade_fornecedores_produtos.getFornecedores_produtosId().setProdutoCodigo(facade_produto.getProduto().getCodigo());

                    // set nos atributos do os fornecedores do produto
                    facade_fornecedores_produtos.getFornecedoresProdutos().setId(facade_fornecedores_produtos.getFornecedores_produtosId());
                    facade_fornecedores_produtos.getFornecedoresProdutos().setProduto(facade_produto.getProduto());
                    facade_fornecedores_produtos.getFornecedoresProdutos().setFornecedor(facade_fornecedor.getFornecedor());

                    // salvando os fornecedores do produto
                    facade_fornecedores_produtos.getFornecedoresProdutos_dao().salvar(facade_fornecedores_produtos.getFornecedoresProdutos());
            }

            // atualiza a tabela de produtos
            facade_produto.preencher_jtable_produto(1, "", null, null, produtosTable);

            // limpa os campos caso seja inserido um novo produto
            Funcoes.limpaTela(dadosProdutoPanel);
            pesquisaTextField.setText("");

            // caso seja uma atualização o BUTTON recebe um para realizar uma inclusão
            if(BUTTON == 1){
                BUTTON = 0;
            }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        // botão alterar pressionado
        BUTTON = 1;

        // verificar se exite registro seleciona na tabela de produtos
        if(produtosTable.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            // recupera a linha seleciona da tabela de produtos
            int linhaSelecionada = produtosTable.getSelectedRow();

            // recupera o código do produto
            Integer codigo = Integer.parseInt(String.valueOf(produtosTable.getValueAt(linhaSelecionada, 0)));

            // buscando o objeto produto pelo código
            facade_produto.setProduto(facade_produto.getProduto_dao().procurar_por_codigo(codigo));

            // redireciona para a aba produto
            manterProdutosTabbedPane.setSelectedIndex(1);

            // habilita os campos
            Funcoes.habilitaCampos(dadosProdutoPanel);

            // desabilita o campo código
            codigoTextField.setEditable(false);

            // habilita o botão salvar
            buttonSalvar.setEnabled(true);

            // adiciona o objeto produto nos seus respectivos campos
            codigoTextField.setText(String.valueOf(facade_produto.getProduto().getCodigo()));
            descricaoTextField.setText(facade_produto.getProduto().getDescricao());
            comboBox_grupo.setSelectedItem(facade_produto.getProduto().getGrupoProduto().getDescricao());
            comboBox_unidade.setSelectedItem(facade_produto.getProduto().getUnidadeMedida().getDescricao());
            comboBox_marca.setSelectedItem(facade_produto.getProduto().getMarca().getDescricao());

            if(facade_produto.getProduto().getStatus() == 'A'){
                comboBox_status.setSelectedItem("Ativo");
            } else{
                comboBox_status.setSelectedItem("Desativado");
            }

            estoqueTextField.setText(String.format("%.1f", facade_produto.getProduto().getQuantidadeEstoque()));
            estoqueMinimoTextField.setText(String.format("%.1f", facade_produto.getProduto().getQuantidadeMinimo()));
            precoCompraTextField.setText(String.format("%.2f", facade_produto.getProduto().getPrecoCompra()));
            precoVendaTextField.setText(String.format("%.2f", facade_produto.getProduto().getPrecoVenda()));

            facade_fornecedores_produtos.preencher_jtable_fornecedores_produtos(1, facade_produto.getProduto().getCodigo(), null, table_fornecedores);
        }

}//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        facade_grupo.preencherComboGrupo(comboBox_grupo);
        facade_marca.preencherComboMarca(comboBox_marca);
        facade_unidade.preencherComboUnidade(comboBox_unidade);
        facade_produto.preencher_jtable_produto(1, "", null, null, produtosTable);
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void adicionarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButton2ActionPerformed
        new Form_Consultar_Fornecedores(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_adicionarButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton1;
    private javax.swing.JButton adicionarButton2;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonIncluir;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JComboBox comboBox_grupo;
    private javax.swing.JComboBox comboBox_marca;
    private javax.swing.JComboBox comboBox_status;
    private javax.swing.JComboBox comboBox_unidade;
    private javax.swing.JPanel dadosProdutoPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel descricaoLabel4;
    private javax.swing.JLabel descricaoLabel5;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JTextField descricaoTextField4;
    private javax.swing.JTextField descricaoTextField5;
    private javax.swing.JLabel estoqueLabel;
    private javax.swing.JLabel estoqueMinimoLabel;
    private javax.swing.JTextField estoqueMinimoTextField;
    private javax.swing.JTextField estoqueTextField;
    private javax.swing.JLabel grupoProdutoLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane manterProdutosTabbedPane;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JLabel precoCompraLabel;
    private javax.swing.JTextField precoCompraTextField;
    private javax.swing.JLabel precoVendaLabel;
    private javax.swing.JTextField precoVendaTextField;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JPanel produtosPanel1;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JScrollPane produtosScrollPane2;
    private javax.swing.JTable produtosTable;
    private javax.swing.JButton removerButton1;
    private javax.swing.JTable table_fornecedores;
    private javax.swing.JComboBox tipoPesquisaComboBox;
    private javax.swing.JLabel tipoPesquisaLabel;
    private javax.swing.JLabel unidadeMedidaLabel;
    private javax.swing.JLabel unidadeMedidaLabel1;
    private javax.swing.JLabel unidadeMedidaLabel2;
    // End of variables declaration//GEN-END:variables

}

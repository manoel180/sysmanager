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

import br.com.sysmanager.facades.Facade_Fornecedor;
import br.com.sysmanager.facades.Facade_TipoEndereco;
import br.com.sysmanager.facades.Facade_TipoTelefone;
import br.com.sysmanager.services.Funcoes;


/**
 *
 * @author Júnior
 */
public class Form_Manter_Fornecedor extends javax.swing.JDialog {

    private Facade_Fornecedor facade_fornecedor = new Facade_Fornecedor();
    private Facade_TipoEndereco facade_tipoEndereco = new Facade_TipoEndereco();
    private Facade_TipoTelefone facade_tipotelefone = new Facade_TipoTelefone();
    private char tipoFornecedor = 'F';
    private static int BUTTON = 0;


    public Form_Manter_Fornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        open_form();
    }

    public void open_form(){
        facade_tipoEndereco.preencherComboTipoEndereco(comboBox_tipoEndereco);
        facade_tipotelefone.preencherComboTipoTelefone(comboBox_tipoTelefone);
        facade_fornecedor.preencher_jtable_fornecedor(1, "", null, null, table_fornecedor);
        Funcoes.desabilitaCampos(panel_dados_fornecedor);
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
        table_fornecedor = new javax.swing.JTable();
        comboBox_tipoPesquisa = new javax.swing.JComboBox();
        tipoPesquisaLabel = new javax.swing.JLabel();
        textField_pesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panel_dados_fornecedor = new javax.swing.JPanel();
        textField_codigo = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        textField_nome = new javax.swing.JTextField();
        descricaoLabel1 = new javax.swing.JLabel();
        textField_email = new javax.swing.JTextField();
        comboBox_tipoFornecedor = new javax.swing.JComboBox();
        descricaoLabel2 = new javax.swing.JLabel();
        descricaoLabel3 = new javax.swing.JLabel();
        textField_nomeFantasia = new javax.swing.JTextField();
        produtosPanel1 = new javax.swing.JPanel();
        panel_dados_cargo4 = new javax.swing.JPanel();
        descricaoLabel5 = new javax.swing.JLabel();
        comboBox_tipoPesquisa2 = new javax.swing.JComboBox();
        descricaoTextField4 = new javax.swing.JTextField();
        descricaoLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCargo1 = new javax.swing.JTable();
        buttonSair3 = new javax.swing.JButton();
        buttonIncluir3 = new javax.swing.JButton();
        panel_dados_cargo5 = new javax.swing.JPanel();
        descricaoLabel9 = new javax.swing.JLabel();
        comboBox_tipoTelefone = new javax.swing.JComboBox();
        descricaoLabel10 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        descricaoLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCargo2 = new javax.swing.JTable();
        buttonSair4 = new javax.swing.JButton();
        buttonIncluir4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        panel_dados_cargo3 = new javax.swing.JPanel();
        textField_codigo7 = new javax.swing.JTextField();
        codigoLabel7 = new javax.swing.JLabel();
        descricaoLabel16 = new javax.swing.JLabel();
        textField_descricao7 = new javax.swing.JTextField();
        comboBox_tipoEndereco = new javax.swing.JComboBox();
        descricaoLabel17 = new javax.swing.JLabel();
        textField_codigo8 = new javax.swing.JTextField();
        codigoLabel8 = new javax.swing.JLabel();
        textField_codigo9 = new javax.swing.JTextField();
        codigoLabel9 = new javax.swing.JLabel();
        codigoLabel10 = new javax.swing.JLabel();
        textField_codigo10 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        descricaoLabel18 = new javax.swing.JLabel();
        textField_codigo11 = new javax.swing.JTextField();
        codigoLabel11 = new javax.swing.JLabel();
        adicionarButton4 = new javax.swing.JButton();
        produtosScrollPane4 = new javax.swing.JScrollPane();
        table_fornecedores3 = new javax.swing.JTable();
        buttonSair2 = new javax.swing.JButton();
        buttonIncluir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
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

        table_fornecedor.setFont(new java.awt.Font("Arial", 0, 12));
        table_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome do Fornecedor", "Tipo", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_fornecedor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_fornecedor.setName("table_fornecedor"); // NOI18N
        table_fornecedor.setRowHeight(20);
        table_fornecedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table_fornecedor);
        table_fornecedor.getColumnModel().getColumn(0).setPreferredWidth(80);
        table_fornecedor.getColumnModel().getColumn(1).setPreferredWidth(280);
        table_fornecedor.getColumnModel().getColumn(2).setPreferredWidth(80);
        table_fornecedor.getColumnModel().getColumn(3).setPreferredWidth(200);

        comboBox_tipoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboBox_tipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Email" }));
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(tipoPesquisaLabel)
                    .addComponent(comboBox_tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPesquisaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Pesquisa", jPanel3);

        jPanel2.setName("jPanel2"); // NOI18N

        panel_dados_fornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_fornecedor.setName("panel_dados_fornecedor"); // NOI18N

        textField_codigo.setEditable(false);
        textField_codigo.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo.setName("textField_codigo"); // NOI18N

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel.setText("Código:");
        codigoLabel.setName("codigoLabel"); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel.setText("Nome:");
        descricaoLabel.setName("descricaoLabel"); // NOI18N

        textField_nome.setFont(new java.awt.Font("Arial", 0, 12));
        textField_nome.setName("textField_nome"); // NOI18N

        descricaoLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel1.setText("Email:");
        descricaoLabel1.setName("descricaoLabel1"); // NOI18N

        textField_email.setFont(new java.awt.Font("Arial", 0, 12));
        textField_email.setName("textField_email"); // NOI18N

        comboBox_tipoFornecedor.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_tipoFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Físico", "Jurídico" }));
        comboBox_tipoFornecedor.setName("comboBox_tipoFornecedor"); // NOI18N
        comboBox_tipoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_tipoFornecedorActionPerformed(evt);
            }
        });

        descricaoLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel2.setText("Tipo do Fornecedor:");
        descricaoLabel2.setName("descricaoLabel2"); // NOI18N

        descricaoLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel3.setText("Nome de Fantasia:");
        descricaoLabel3.setName("descricaoLabel3"); // NOI18N

        textField_nomeFantasia.setEditable(false);
        textField_nomeFantasia.setFont(new java.awt.Font("Arial", 0, 12));
        textField_nomeFantasia.setName("textField_nomeFantasia"); // NOI18N

        javax.swing.GroupLayout panel_dados_fornecedorLayout = new javax.swing.GroupLayout(panel_dados_fornecedor);
        panel_dados_fornecedor.setLayout(panel_dados_fornecedorLayout);
        panel_dados_fornecedorLayout.setHorizontalGroup(
            panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_fornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLabel)
                    .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dados_fornecedorLayout.createSequentialGroup()
                        .addGroup(panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descricaoLabel)
                            .addComponent(textField_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_tipoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel2)))
                    .addComponent(descricaoLabel3)
                    .addComponent(descricaoLabel1)
                    .addGroup(panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textField_nomeFantasia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textField_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panel_dados_fornecedorLayout.setVerticalGroup(
            panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_fornecedorLayout.createSequentialGroup()
                .addGroup(panel_dados_fornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_dados_fornecedorLayout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_fornecedorLayout.createSequentialGroup()
                        .addComponent(descricaoLabel2)
                        .addGap(27, 27, 27))
                    .addComponent(comboBox_tipoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Fornecedor", jPanel2);

        produtosPanel1.setFont(new java.awt.Font("Arial", 0, 12));
        produtosPanel1.setName("produtosPanel1"); // NOI18N

        panel_dados_cargo4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_cargo4.setName("panel_dados_cargo4"); // NOI18N

        descricaoLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel5.setText("Tipo do Documento:");
        descricaoLabel5.setName("descricaoLabel5"); // NOI18N

        comboBox_tipoPesquisa2.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_tipoPesquisa2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RG", "CPF", "CNPJ", "Inscrição Estadual" }));
        comboBox_tipoPesquisa2.setName("comboBox_tipoPesquisa2"); // NOI18N

        descricaoTextField4.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoTextField4.setName("descricaoTextField4"); // NOI18N

        descricaoLabel4.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel4.setText("Número do Documento");
        descricaoLabel4.setName("descricaoLabel4"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tableCargo1.setFont(new java.awt.Font("Arial", 0, 12));
        tableCargo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCargo1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableCargo1.setName("tableCargo1"); // NOI18N
        tableCargo1.setRowHeight(20);
        tableCargo1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tableCargo1);
        tableCargo1.getColumnModel().getColumn(0).setPreferredWidth(150);
        tableCargo1.getColumnModel().getColumn(1).setPreferredWidth(170);

        buttonSair3.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N
        buttonSair3.setFocusable(false);
        buttonSair3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair3.setName("buttonSair3"); // NOI18N
        buttonSair3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonSair3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSair3ActionPerformed(evt);
            }
        });

        buttonIncluir3.setFont(new java.awt.Font("Arial", 0, 12));
        buttonIncluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N
        buttonIncluir3.setFocusable(false);
        buttonIncluir3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonIncluir3.setName("buttonIncluir3"); // NOI18N
        buttonIncluir3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonIncluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dados_cargo4Layout = new javax.swing.GroupLayout(panel_dados_cargo4);
        panel_dados_cargo4.setLayout(panel_dados_cargo4Layout);
        panel_dados_cargo4Layout.setHorizontalGroup(
            panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dados_cargo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonIncluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dados_cargo4Layout.createSequentialGroup()
                        .addGroup(panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descricaoLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_tipoPesquisa2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(buttonSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_dados_cargo4Layout.setVerticalGroup(
            panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cargo4Layout.createSequentialGroup()
                .addGroup(panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dados_cargo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dados_cargo4Layout.createSequentialGroup()
                            .addComponent(descricaoLabel5)
                            .addGap(3, 3, 3)
                            .addComponent(comboBox_tipoPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(descricaoLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(descricaoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_dados_cargo4Layout.createSequentialGroup()
                        .addComponent(buttonSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIncluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panel_dados_cargo5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_cargo5.setName("panel_dados_cargo5"); // NOI18N

        descricaoLabel9.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel9.setText("Tipo do Telefone:");
        descricaoLabel9.setName("descricaoLabel9"); // NOI18N

        comboBox_tipoTelefone.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_tipoTelefone.setName("comboBox_tipoTelefone"); // NOI18N

        descricaoLabel10.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel10.setText("(DD):");
        descricaoLabel10.setName("descricaoLabel10"); // NOI18N

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFont(new java.awt.Font("Arial", 0, 12));
        jFormattedTextField3.setName("jFormattedTextField3"); // NOI18N

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField5.setFont(new java.awt.Font("Arial", 0, 12));
        jFormattedTextField5.setName("jFormattedTextField5"); // NOI18N

        descricaoLabel11.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel11.setText("Número:");
        descricaoLabel11.setName("descricaoLabel11"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tableCargo2.setFont(new java.awt.Font("Arial", 0, 12));
        tableCargo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Tipo", "(DD)", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCargo2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableCargo2.setName("tableCargo2"); // NOI18N
        tableCargo2.setRowHeight(20);
        tableCargo2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tableCargo2);
        tableCargo2.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableCargo2.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableCargo2.getColumnModel().getColumn(2).setPreferredWidth(50);
        tableCargo2.getColumnModel().getColumn(3).setPreferredWidth(100);

        buttonSair4.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N
        buttonSair4.setFocusable(false);
        buttonSair4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair4.setName("buttonSair4"); // NOI18N
        buttonSair4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonSair4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSair4ActionPerformed(evt);
            }
        });

        buttonIncluir4.setFont(new java.awt.Font("Arial", 0, 12));
        buttonIncluir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N
        buttonIncluir4.setFocusable(false);
        buttonIncluir4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonIncluir4.setName("buttonIncluir4"); // NOI18N
        buttonIncluir4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonIncluir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dados_cargo5Layout = new javax.swing.GroupLayout(panel_dados_cargo5);
        panel_dados_cargo5.setLayout(panel_dados_cargo5Layout);
        panel_dados_cargo5Layout.setHorizontalGroup(
            panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cargo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoLabel9)
                    .addComponent(comboBox_tipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dados_cargo5Layout.createSequentialGroup()
                        .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonIncluir4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSair4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_dados_cargo5Layout.setVerticalGroup(
            panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cargo5Layout.createSequentialGroup()
                .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dados_cargo5Layout.createSequentialGroup()
                        .addComponent(descricaoLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_tipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoLabel11)
                            .addComponent(descricaoLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dados_cargo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(panel_dados_cargo5Layout.createSequentialGroup()
                        .addComponent(buttonSair4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIncluir4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout produtosPanel1Layout = new javax.swing.GroupLayout(produtosPanel1);
        produtosPanel1.setLayout(produtosPanel1Layout);
        produtosPanel1Layout.setHorizontalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_dados_cargo5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_dados_cargo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        produtosPanel1Layout.setVerticalGroup(
            produtosPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_cargo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_dados_cargo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_dados_cargo5.getAccessibleContext().setAccessibleName("");

        tabbedPane_cargo.addTab("Documentos / Telefones", produtosPanel1);

        jPanel6.setName("jPanel6"); // NOI18N

        panel_dados_cargo3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        panel_dados_cargo3.setName("panel_dados_cargo3"); // NOI18N

        textField_codigo7.setEditable(false);
        textField_codigo7.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo7.setName("textField_codigo7"); // NOI18N

        codigoLabel7.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel7.setText("Bairro:");
        codigoLabel7.setName("codigoLabel7"); // NOI18N

        descricaoLabel16.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel16.setText("Logradouro:");
        descricaoLabel16.setName("descricaoLabel16"); // NOI18N

        textField_descricao7.setFont(new java.awt.Font("Arial", 0, 12));
        textField_descricao7.setName("textField_descricao7"); // NOI18N

        comboBox_tipoEndereco.setFont(new java.awt.Font("Arial", 0, 12));
        comboBox_tipoEndereco.setName("comboBox_tipoEndereco"); // NOI18N

        descricaoLabel17.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel17.setText("Tipo do Endereço:");
        descricaoLabel17.setName("descricaoLabel17"); // NOI18N

        textField_codigo8.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo8.setName("textField_codigo8"); // NOI18N

        codigoLabel8.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel8.setText("Código:");
        codigoLabel8.setName("codigoLabel8"); // NOI18N

        textField_codigo9.setEditable(false);
        textField_codigo9.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo9.setName("textField_codigo9"); // NOI18N

        codigoLabel9.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel9.setText("Cidade:");
        codigoLabel9.setName("codigoLabel9"); // NOI18N

        codigoLabel10.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel10.setText("Estado:");
        codigoLabel10.setName("codigoLabel10"); // NOI18N

        textField_codigo10.setEditable(false);
        textField_codigo10.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo10.setName("textField_codigo10"); // NOI18N

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setFont(new java.awt.Font("Arial", 0, 12));
        jFormattedTextField4.setName("jFormattedTextField4"); // NOI18N

        descricaoLabel18.setFont(new java.awt.Font("Arial", 0, 12));
        descricaoLabel18.setText("CEP:");
        descricaoLabel18.setName("descricaoLabel18"); // NOI18N

        textField_codigo11.setFont(new java.awt.Font("Arial", 0, 12));
        textField_codigo11.setName("textField_codigo11"); // NOI18N

        codigoLabel11.setFont(new java.awt.Font("Arial", 0, 12));
        codigoLabel11.setText("Número:");
        codigoLabel11.setName("codigoLabel11"); // NOI18N

        adicionarButton4.setFont(new java.awt.Font("Arial", 0, 12));
        adicionarButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/consultar.png"))); // NOI18N
        adicionarButton4.setName("adicionarButton4"); // NOI18N

        produtosScrollPane4.setName("produtosScrollPane4"); // NOI18N

        table_fornecedores3.setFont(new java.awt.Font("Arial", 0, 12));
        table_fornecedores3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CEP", "Bairro", "Cidade", "UF", "Tipo", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_fornecedores3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_fornecedores3.setName("table_fornecedores3"); // NOI18N
        table_fornecedores3.setRowHeight(20);
        produtosScrollPane4.setViewportView(table_fornecedores3);
        table_fornecedores3.getColumnModel().getColumn(0).setPreferredWidth(100);
        table_fornecedores3.getColumnModel().getColumn(1).setPreferredWidth(150);
        table_fornecedores3.getColumnModel().getColumn(2).setPreferredWidth(150);
        table_fornecedores3.getColumnModel().getColumn(3).setPreferredWidth(40);
        table_fornecedores3.getColumnModel().getColumn(4).setPreferredWidth(100);
        table_fornecedores3.getColumnModel().getColumn(5).setPreferredWidth(80);

        buttonSair2.setFont(new java.awt.Font("Arial", 0, 12));
        buttonSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/adicionar.png"))); // NOI18N
        buttonSair2.setFocusable(false);
        buttonSair2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSair2.setName("buttonSair2"); // NOI18N
        buttonSair2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonSair2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSair2ActionPerformed(evt);
            }
        });

        buttonIncluir2.setFont(new java.awt.Font("Arial", 0, 12));
        buttonIncluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/remover.png"))); // NOI18N
        buttonIncluir2.setFocusable(false);
        buttonIncluir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonIncluir2.setName("buttonIncluir2"); // NOI18N
        buttonIncluir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonIncluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dados_cargo3Layout = new javax.swing.GroupLayout(panel_dados_cargo3);
        panel_dados_cargo3.setLayout(panel_dados_cargo3Layout);
        panel_dados_cargo3Layout.setHorizontalGroup(
            panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(produtosScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(buttonSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIncluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(568, Short.MAX_VALUE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dados_cargo3Layout.createSequentialGroup()
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox_tipoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descricaoLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricaoLabel18)
                                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dados_cargo3Layout.createSequentialGroup()
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_descricao7, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descricaoLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_codigo11, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(codigoLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dados_cargo3Layout.createSequentialGroup()
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoLabel8)
                                    .addComponent(textField_codigo8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoLabel7)
                                    .addComponent(textField_codigo7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoLabel9)
                                    .addComponent(textField_codigo9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_codigo10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoLabel10))))
                        .addGap(18, 18, 18)
                        .addComponent(adicionarButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        panel_dados_cargo3Layout.setVerticalGroup(
            panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adicionarButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(codigoLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(codigoLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(codigoLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(codigoLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(descricaoLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_descricao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(codigoLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_codigo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(descricaoLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_tipoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_dados_cargo3Layout.createSequentialGroup()
                        .addComponent(descricaoLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_dados_cargo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIncluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_cargo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_dados_cargo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane_cargo.addTab("Endereços", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tabbedPane_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane_cargo)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-753)/2, (screenSize.height-520)/2, 753, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if(textField_nome.getText().equals("")){
            Funcoes.mensagemAviso("Informe a descrição do cargo !");
            textField_nome.requestFocus();
        }

        else{

            if(BUTTON == 0){
                facade_fornecedor.setFornecedor(facade_fornecedor.newInstance());
            }

            facade_fornecedor.getFornecedor().setNome(textField_nome.getText());
            facade_fornecedor.getFornecedor().setEmail(textField_email.getText());
            facade_fornecedor.getFornecedor().setTipoFornecedor(tipoFornecedor);
            
            if(textField_nomeFantasia.getText().equals("")){
                facade_fornecedor.getFornecedor().setNomeFantasia(null);
            
            } else{
                facade_fornecedor.getFornecedor().setNomeFantasia(textField_nomeFantasia.getText());
            }

            facade_fornecedor.getFornecedor_dao().salvar(facade_fornecedor.getFornecedor());
            
            facade_fornecedor.preencher_jtable_fornecedor(1, "", null, null, table_fornecedor);

            Funcoes.limpaTela(panel_dados_fornecedor);

            // caso seja uma atualização o BUTTON recebe 0 para realizar uma inclusão
            if(BUTTON == 1){
                BUTTON = 0;
            }
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirActionPerformed

        BUTTON = 0;

        tabbedPane_cargo.setSelectedIndex(1);
        textField_nome.requestFocus();
        Funcoes.habilitaCampos(panel_dados_fornecedor);
        Funcoes.limpaTela(panel_dados_fornecedor);
        textField_codigo.setEditable(false);
        buttonSalvar.setEnabled(true);
        textField_nomeFantasia.setEditable(false);

    }//GEN-LAST:event_buttonIncluirActionPerformed

    private void tabbedPane_cargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPane_cargoMousePressed

        if(tabbedPane_cargo.getSelectedIndex() == 0){
            Funcoes.desabilitaCampos(panel_dados_fornecedor);
            Funcoes.limpaTela(panel_dados_fornecedor);
            buttonSalvar.setEnabled(false);
          //  menu_salvar.setEnabled(false);
        }

    }//GEN-LAST:event_tabbedPane_cargoMousePressed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        BUTTON = 1;

        if(table_fornecedor.getSelectedRow() < 0){
            Funcoes.mensagemAviso("Selecione um registro !");
        }

        else{

            int linhaSelecionada = table_fornecedor.getSelectedRow();

            Integer codigo = Integer.parseInt(String.valueOf(table_fornecedor.getValueAt(linhaSelecionada, 0)));

            facade_fornecedor.setFornecedor(facade_fornecedor.getFornecedor_dao().procurar_por_codigo(codigo));

            tabbedPane_cargo.setSelectedIndex(1);

            Funcoes.habilitaCampos(panel_dados_fornecedor);

            textField_codigo.setEditable(false);

            buttonSalvar.setEnabled(true);

            textField_codigo.setText(facade_fornecedor.getFornecedor().getCodigo().toString());
            textField_nome.setText(facade_fornecedor.getFornecedor().getNome());
            textField_nomeFantasia.setText(facade_fornecedor.getFornecedor().getNomeFantasia());
            textField_email.setText(facade_fornecedor.getFornecedor().getEmail());

            if(facade_fornecedor.getFornecedor().getTipoFornecedor() == 'F'){
                comboBox_tipoFornecedor.setSelectedIndex(0);
            } else{
                comboBox_tipoFornecedor.setSelectedIndex(1);
            }
            
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void textField_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_pesquisaKeyReleased

        if(comboBox_tipoPesquisa.getSelectedIndex() == 0){
            facade_fornecedor.preencher_jtable_fornecedor(1, textField_pesquisa.getText(), null, null, table_fornecedor);
        }

        else if(comboBox_tipoPesquisa.getSelectedIndex() == 1){
            facade_fornecedor.preencher_jtable_fornecedor(2, null, textField_pesquisa.getText(), null, table_fornecedor);
        }

        else if(comboBox_tipoPesquisa.getSelectedIndex() == 2){
            facade_fornecedor.preencher_jtable_fornecedor(3, null, null, textField_pesquisa.getText(), table_fornecedor);
        }
}//GEN-LAST:event_textField_pesquisaKeyReleased

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        facade_fornecedor.preencher_jtable_fornecedor(1, "", null, null, table_fornecedor);
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void buttonSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSair2ActionPerformed

    private void buttonIncluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIncluir2ActionPerformed

    private void buttonSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSair3ActionPerformed

    private void buttonIncluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluir3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIncluir3ActionPerformed

    private void buttonSair4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSair4ActionPerformed

    private void buttonIncluir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluir4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIncluir4ActionPerformed

    private void comboBox_tipoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_tipoFornecedorActionPerformed
        if(comboBox_tipoFornecedor.getSelectedIndex() == 0){
            textField_nomeFantasia.setEditable(false);
            tipoFornecedor = 'F';
            textField_nomeFantasia.setText("");
        } else{
            textField_nomeFantasia.setEditable(true);
            tipoFornecedor = 'J';
            textField_nomeFantasia.setText("");
        }
    }//GEN-LAST:event_comboBox_tipoFornecedorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton4;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonIncluir;
    private javax.swing.JButton buttonIncluir2;
    private javax.swing.JButton buttonIncluir3;
    private javax.swing.JButton buttonIncluir4;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSair2;
    private javax.swing.JButton buttonSair3;
    private javax.swing.JButton buttonSair4;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel10;
    private javax.swing.JLabel codigoLabel11;
    private javax.swing.JLabel codigoLabel7;
    private javax.swing.JLabel codigoLabel8;
    private javax.swing.JLabel codigoLabel9;
    private javax.swing.JComboBox comboBox_tipoEndereco;
    private javax.swing.JComboBox comboBox_tipoFornecedor;
    private javax.swing.JComboBox comboBox_tipoPesquisa;
    private javax.swing.JComboBox comboBox_tipoPesquisa2;
    private javax.swing.JComboBox comboBox_tipoTelefone;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel descricaoLabel1;
    private javax.swing.JLabel descricaoLabel10;
    private javax.swing.JLabel descricaoLabel11;
    private javax.swing.JLabel descricaoLabel16;
    private javax.swing.JLabel descricaoLabel17;
    private javax.swing.JLabel descricaoLabel18;
    private javax.swing.JLabel descricaoLabel2;
    private javax.swing.JLabel descricaoLabel3;
    private javax.swing.JLabel descricaoLabel4;
    private javax.swing.JLabel descricaoLabel5;
    private javax.swing.JLabel descricaoLabel9;
    private javax.swing.JTextField descricaoTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel_dados_cargo3;
    private javax.swing.JPanel panel_dados_cargo4;
    private javax.swing.JPanel panel_dados_cargo5;
    private javax.swing.JPanel panel_dados_fornecedor;
    private javax.swing.JPanel produtosPanel1;
    private javax.swing.JScrollPane produtosScrollPane4;
    private javax.swing.JTabbedPane tabbedPane_cargo;
    private javax.swing.JTable tableCargo1;
    private javax.swing.JTable tableCargo2;
    private javax.swing.JTable table_fornecedor;
    private javax.swing.JTable table_fornecedores3;
    private javax.swing.JTextField textField_codigo;
    private javax.swing.JTextField textField_codigo10;
    private javax.swing.JTextField textField_codigo11;
    private javax.swing.JTextField textField_codigo7;
    private javax.swing.JTextField textField_codigo8;
    private javax.swing.JTextField textField_codigo9;
    private javax.swing.JTextField textField_descricao7;
    private javax.swing.JTextField textField_email;
    private javax.swing.JTextField textField_nome;
    private javax.swing.JTextField textField_nomeFantasia;
    private javax.swing.JTextField textField_pesquisa;
    private javax.swing.JLabel tipoPesquisaLabel;
    // End of variables declaration//GEN-END:variables

}

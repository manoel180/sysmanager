/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.FornecedoresProdutos_DAO;
import br.com.sysmanager.interfaces.Interface_FornecedoresProdutos;
import br.com.sysmanager.model.Fornecedor;
import br.com.sysmanager.model.FornecedoresProdutos;
import br.com.sysmanager.model.FornecedoresProdutosId;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_FornecedoresProdutos {

    private Interface_FornecedoresProdutos fornecedoresProdutos_dao = new FornecedoresProdutos_DAO();
    private FornecedoresProdutos fornecedoresProdutos = new FornecedoresProdutos();
    private List<FornecedoresProdutos> list_fornecedoresProdutos;
    private FornecedoresProdutosId fornecedores_produtosId = new FornecedoresProdutosId();

    public FornecedoresProdutos newInstance(){
        this.fornecedoresProdutos = new FornecedoresProdutos();

        return this.fornecedoresProdutos;
    }

    public FornecedoresProdutosId getFornecedores_produtosId() {
        return fornecedores_produtosId;
    }

    public void setFornecedores_produtosId(FornecedoresProdutosId fornecedores_produtosId) {
        this.fornecedores_produtosId = fornecedores_produtosId;
    }

    public FornecedoresProdutos getFornecedoresProdutos() {
        return fornecedoresProdutos;
    }

    public void setFornecedoresProdutos(FornecedoresProdutos fornecedoresProdutos) {
        this.fornecedoresProdutos = fornecedoresProdutos;
    }

    public Interface_FornecedoresProdutos getFornecedoresProdutos_dao() {
        return fornecedoresProdutos_dao;
    }

    public void setFornecedoresProdutos_dao(Interface_FornecedoresProdutos fornecedoresProdutos_dao) {
        this.fornecedoresProdutos_dao = fornecedoresProdutos_dao;
    }

    public List<FornecedoresProdutos> getList_fornecedoresProdutos() {
        return list_fornecedoresProdutos;
    }

    public void setList_fornecedoresProdutos(List<FornecedoresProdutos> list_fornecedoresProdutos) {
        this.list_fornecedoresProdutos = list_fornecedoresProdutos;
    }

    public void preencher_jtable_fornecedores_produtos(int opcao, Object codigo_produto, Object codigo_fornecedor, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            this.setList_fornecedoresProdutos(this.getFornecedoresProdutos_dao().buscar_por_codigo_produto(codigo_produto));
        }

        else if(opcao == 2){
            this.setList_fornecedoresProdutos(this.getFornecedoresProdutos_dao().buscar_por_codigo_fornecedor(codigo_fornecedor));
        }

        for(FornecedoresProdutos f : getList_fornecedoresProdutos()){

                Funcoes.getModel(table).addRow(new String[]{
                f.getFornecedor().getCodigo().toString(),
                f.getFornecedor().getNome(),
            });

        }

    }

}

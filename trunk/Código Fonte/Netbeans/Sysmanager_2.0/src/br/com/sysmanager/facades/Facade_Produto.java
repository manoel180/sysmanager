/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Produto_DAO;
import br.com.sysmanager.interfaces.Interface_Produto;
import br.com.sysmanager.model.Produto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Produto {

    private Interface_Produto produto_dao = new Produto_DAO();
    private Produto produto = new Produto();
    private List<Produto> list_produto;

    public Produto newInstance(){
        this.produto = new Produto();

        return this.produto;
    }

    public List<Produto> getList_produto() {
        return list_produto;
    }

    public void setList_produto(List<Produto> list_produto) {
        this.list_produto = list_produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Interface_Produto getProduto_dao() {
        return produto_dao;
    }

    public void setProduto_dao(Interface_Produto produto_dao) {
        this.produto_dao = produto_dao;
    }

    
    public void preencher_jtable_produto(int opcao, Object codigo, String descricao, String grupo, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            this.setList_produto(this.getProduto_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_produto(this.getProduto_dao().buscar_por_descricao(descricao));
        }

        else if(opcao == 3){
            this.setList_produto(this.getProduto_dao().buscar_por_grupo(grupo));
        }

        for(Produto p : getList_produto()){

            Funcoes.getModel(table).addRow(new String[]{

                String.valueOf(p.getCodigo()),
                p.getDescricao(),
                p.getGrupoProduto().getDescricao(),
                p.getUnidadeMedida().getSigla(),
                String.format("%.1f", p.getQuantidadeEstoque()),
                String.format("%.2f", p.getPrecoVenda()),

            });

        }

    }

}

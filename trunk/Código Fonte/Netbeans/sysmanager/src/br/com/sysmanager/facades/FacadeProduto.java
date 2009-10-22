/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;


import br.com.sysmanager.dao.ProdutoDAO;

import br.com.sysmanager.interfaces.InterfaceProduto;
import br.com.sysmanager.model.Produto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;


public class FacadeProduto {

    private Produto produto = new Produto();
    private InterfaceProduto produtoDAO = new ProdutoDAO();
    private List<Produto> list;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto newInstance(){
        produto = new Produto();
        return produto;
    }

    public InterfaceProduto getProdutoDAO() {
        return produtoDAO;
    }

    public void setProdutoDAO(InterfaceProduto produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public List<Produto> getList() {
        return list;
    }

    public void setList(List<Produto> list) {
        this.list = list;
    }

    public void preencherTableProdutos(int opcao, Object codigo, String descricao, String grupo, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            setList(getProdutoDAO().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            setList(getProdutoDAO().buscar_por_descricao(descricao));
        }

        else if(opcao == 3){
            setList(getProdutoDAO().buscar_por_descricaoGrupo(grupo));
        }

        for(Produto p : getList()){

            Funcoes.getModel(table).addRow(new String[]{

                String.valueOf(p.getCodigo()),
                p.getDescricao(),
                p.getGrupoProduto().getDescricao(),
                p.getUnidadeMedida().getDescricao(),
                String.format("%.1f", p.getQuantidadeEstoque()),
                String.format("%.2f", p.getPrecoVenda()),

            });

        }

    }


}

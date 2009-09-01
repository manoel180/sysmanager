/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;


import br.com.sysmanager.dao.ProdutoDao;

import br.com.sysmanager.model.Produto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;


public class FacadeProduto {

    private Produto produto = new Produto();
    private ProdutoDao daoProduto = new ProdutoDao();
    private FacadeUnidadeMedida facadeUnidadeMedida = new FacadeUnidadeMedida();

    public Produto getProduto(){
        return produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void adicionarProduto(Produto produto){
        daoProduto.adiconar(produto);
    }

    public List<Produto> getListaProdutos(){
        return  daoProduto.getList();
    }

    public void montarTable(JTable jTable){

        Funcoes.limpaLinhasTable(jTable);

        for(Produto produto : getListaProdutos()){

            //facadeUnidadeMedida.setUnidadeMedida(facadeUnidadeMedida.procurarUnidade(produto.getUnidadeMedida().getCodigo()));

            Funcoes.getModel(jTable).addRow(new String[]{

                String.valueOf(produto.getId()),
                produto.getDescricao(),
                String.valueOf(produto.getQuantidadeEstoque()),
                String.format("%.2f", produto.getPrecoAtacado()),
                produto.getUnidadeMedida().getSigla()

            });
        }
    }
}

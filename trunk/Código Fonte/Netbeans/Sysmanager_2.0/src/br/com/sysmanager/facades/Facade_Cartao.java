/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Cartao_DAO;
import br.com.sysmanager.interfaces.Interface_Cartao;
import br.com.sysmanager.model.Cartao;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Cartao {

    private Interface_Cartao cartao_dao = new Cartao_DAO();
    private Cartao cartao = new Cartao();
    private List<Cartao> list_cartao;

    public Cartao newInstance(){
        this.cartao = new Cartao();

        return this.cartao;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Interface_Cartao getCartao_dao() {
        return cartao_dao;
    }

    public void setCartao_dao(Interface_Cartao cartao_dao) {
        this.cartao_dao = cartao_dao;
    }

    public List<Cartao> getList_cartao() {
        return list_cartao;
    }

    public void setList_cartao(List<Cartao> list_cartao) {
        this.list_cartao = list_cartao;
    }

    public void preencher_jtable_cartao(int opcao, Object codigo, String nome, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_cartao(this.getCartao_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_cartao(this.getCartao_dao().buscar_por_nome(nome));
        }

        for(Cartao c : this.getList_cartao()){

            Funcoes.getModel(jtable).addRow(new String[]{
                c.getCodigo().toString(),
                c.getNome(),
                String.format("%.2f", c.getTaxa())
            });

        }
    }

}

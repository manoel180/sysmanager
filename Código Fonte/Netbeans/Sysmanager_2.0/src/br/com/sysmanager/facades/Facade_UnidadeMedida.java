/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.UnidadeMedida_DAO;
import br.com.sysmanager.interfaces.Interface_UnidadeMedida;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_UnidadeMedida {

    private Interface_UnidadeMedida unidade_dao = new UnidadeMedida_DAO();
    private UnidadeMedida unidade = new UnidadeMedida();
    private List<UnidadeMedida> list_unidade;

    public UnidadeMedida newInstance(){
        this.unidade = new UnidadeMedida();

        return this.unidade;
    }

    public List<UnidadeMedida> getList_unidade() {
        return list_unidade;
    }

    public void setList_unidade(List<UnidadeMedida> list_unidade) {
        this.list_unidade = list_unidade;
    }

    public UnidadeMedida getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeMedida unidade) {
        this.unidade = unidade;
    }

    public Interface_UnidadeMedida getUnidade_dao() {
        return unidade_dao;
    }

    public void setUnidade_dao(Interface_UnidadeMedida unidade_dao) {
        this.unidade_dao = unidade_dao;
    }

    
    public void preencher_jtable_unidade(int opcao, Object codigo, String descricao, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_unidade(this.getUnidade_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_unidade(this.getUnidade_dao().buscar_por_descricao(descricao));
        }

        for(UnidadeMedida u: this.getList_unidade()){

            Funcoes.getModel(jtable).addRow(new String[]{
                u.getCodigo().toString(),
                u.getDescricao(),
                u.getSigla(),
                String.valueOf(u.getQuantidadeUnidade())
            });

        }
    }


    public void preencherComboUnidade(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        this.setList_unidade(this.getUnidade_dao().buscar_todos());

        for(UnidadeMedida u : this.getList_unidade()){
            combo.addItem(u);
        }

    }

}

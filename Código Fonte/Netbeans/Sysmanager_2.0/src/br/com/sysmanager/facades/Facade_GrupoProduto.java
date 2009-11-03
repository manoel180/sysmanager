/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.GrupoProduto_DAO;
import br.com.sysmanager.interfaces.Interface_GrupoProduto;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_GrupoProduto {

    private Interface_GrupoProduto grupo_dao = new GrupoProduto_DAO();
    private GrupoProduto grupo = new GrupoProduto();
    private List<GrupoProduto> list_grupo;

    public GrupoProduto newInstance(){
        this.grupo = new GrupoProduto();

        return this.grupo;
    }

    public GrupoProduto getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoProduto grupo) {
        this.grupo = grupo;
    }

    public Interface_GrupoProduto getGrupo_dao() {
        return grupo_dao;
    }

    public void setGrupo_dao(Interface_GrupoProduto grupo_dao) {
        this.grupo_dao = grupo_dao;
    }

    public List<GrupoProduto> getList_grupo() {
        return list_grupo;
    }

    public void setList_grupo(List<GrupoProduto> list_grupo) {
        this.list_grupo = list_grupo;
    }

    public void preencher_jtable_grupo(int opcao, Object codigo, String descricao, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_grupo(this.getGrupo_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_grupo(this.getGrupo_dao().buscar_por_descricao(descricao));
        }

        for(GrupoProduto g : this.getList_grupo()){

            Funcoes.getModel(jtable).addRow(new String[]{
                g.getCodigo().toString(),
                g.getDescricao()
            });

        }
    }


    public void preencherComboGrupo(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        this.setList_grupo(this.getGrupo_dao().buscar_todos());

        for(GrupoProduto g : this.getList_grupo()){
            combo.addItem(g);
        }

    }
}

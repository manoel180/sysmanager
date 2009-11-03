/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Kit_DAO;
import br.com.sysmanager.interfaces.Interface_Kit;
import br.com.sysmanager.model.Kit;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Kit {

    private Interface_Kit kit_dao = new Kit_DAO();
    private Kit kit = new Kit();
    private List<Kit> list_kit;

    public Kit newInstance(){

        kit = new Kit();

        return kit;
    }

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public Interface_Kit getKit_dao() {
        return kit_dao;
    }

    public void setKit_dao(Interface_Kit kit_dao) {
        this.kit_dao = kit_dao;
    }

    public List<Kit> getList_kit() {
        return list_kit;
    }

    public void setList_kit(List<Kit> list_kit) {
        this.list_kit = list_kit;
    }

    
    public void preencher_jtable_kit(int opcao, Object codigo, String descricao, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            setList_kit(getKit_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            setList_kit(getKit_dao().buscar_por_descricao(descricao));
        }



        for(Kit k : getList_kit()){

            Funcoes.getModel(table).addRow(new String[]{

                String.valueOf(k.getCodigo()),
                k.getNome(),
                String.format("%.2f", k.getPreco()),
            });

        }

    }
}

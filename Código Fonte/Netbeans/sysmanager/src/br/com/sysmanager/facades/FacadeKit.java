/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.KitDAO;
import br.com.sysmanager.interfaces.InterfaceKit;
import br.com.sysmanager.model.Kit;
import br.com.sysmanager.model.Usuario;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class FacadeKit {

    private InterfaceKit kitDAO = new KitDAO();
    private Kit kit = new Kit();
    private List<Kit> list;

    public Kit newInstance(){

        kit = new Kit();

        return kit;
    }

    public List<Kit> getList() {
        return list;
    }

    public void setList(List<Kit> list) {
        this.list = list;
    }

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public InterfaceKit getKitDAO() {
        return kitDAO;
    }

    public void setKitDAO(InterfaceKit kitDAO) {
        this.kitDAO = kitDAO;
    }

    public void preencherTableKits(int opcao, Object codigo, String descricao, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            setList(getKitDAO().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            setList(getKitDAO().buscar_por_descricao(descricao));
        }



        for(Kit k : getList()){

            Funcoes.getModel(table).addRow(new String[]{

                String.valueOf(k.getCodigo()),
                k.getNome(),
                String.format("%.2f", k.getPreco()),
            });

        }

    }
}

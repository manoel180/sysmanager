/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;


import br.com.sysmanager.dao.UnidadeMedidaDAO;
import br.com.sysmanager.interfaces.InterfaceUnidadeMedida;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Osenias
 */
public class FacadeUnidadeMedida {


    private UnidadeMedida unidadeMedida = new UnidadeMedida();
    private InterfaceUnidadeMedida unidadeMedidaDAO = new UnidadeMedidaDAO();
    private List<UnidadeMedida> list;

    public List<UnidadeMedida> getList() {
        return list;
    }

    public void setList(List<UnidadeMedida> list) {
        this.list = list;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public InterfaceUnidadeMedida getUnidadeMedidaDAO() {
        return unidadeMedidaDAO;
    }

    public void setUnidadeMedidaDAO(InterfaceUnidadeMedida unidadeMedidaDAO) {
        this.unidadeMedidaDAO = unidadeMedidaDAO;
    }

    public void preencherComboUnidade(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        setList(getUnidadeMedidaDAO().buscar_todos());

        for(UnidadeMedida g : getList()){
            combo.addItem(g);
        }
        
    }
}

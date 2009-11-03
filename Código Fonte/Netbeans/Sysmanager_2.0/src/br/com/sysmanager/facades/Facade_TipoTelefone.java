/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.TipoTelefone_DAO;
import br.com.sysmanager.interfaces.Interface_TipoTelefone;
import br.com.sysmanager.model.TipoTelefone;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Júnior
 */
public class Facade_TipoTelefone {

    private Interface_TipoTelefone tipoTelefone_dao = new TipoTelefone_DAO();
    private TipoTelefone tipo_telefone = new TipoTelefone();
    private List<TipoTelefone> list_tipoTelefone;

    public List<TipoTelefone> getList_tipoTelefone() {
        return list_tipoTelefone;
    }

    public void setList_tipoTelefone(List<TipoTelefone> list_tipoTelefone) {
        this.list_tipoTelefone = list_tipoTelefone;
    }

    public Interface_TipoTelefone getTipoTelefone_dao() {
        return tipoTelefone_dao;
    }

    public void setTipoTelefone_dao(Interface_TipoTelefone tipoTelefone_dao) {
        this.tipoTelefone_dao = tipoTelefone_dao;
    }

    public TipoTelefone getTipo_telefone() {
        return tipo_telefone;
    }

    public void setTipo_telefone(TipoTelefone tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }

    public void preencherComboTipoTelefone(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        this.setList_tipoTelefone(this.getTipoTelefone_dao().buscar_todos());

        for(TipoTelefone t : this.getList_tipoTelefone()){
            combo.addItem(t);
        }

    }

}

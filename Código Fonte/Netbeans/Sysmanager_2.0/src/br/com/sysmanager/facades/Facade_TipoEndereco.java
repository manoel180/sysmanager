/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.TipoEndereco_DAO;
import br.com.sysmanager.interfaces.Interface_TipoEndereco;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.model.TipoEndereco;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Júnior
 */
public class Facade_TipoEndereco {

    private Interface_TipoEndereco tipoEndereco_dao = new TipoEndereco_DAO();
    private TipoEndereco tipo_endereco = new TipoEndereco();
    private List<TipoEndereco> list_tipoEndereco;

    public List<TipoEndereco> getList_tipoEndereco() {
        return list_tipoEndereco;
    }

    public void setList_tipoEndereco(List<TipoEndereco> list_tipoEndereco) {
        this.list_tipoEndereco = list_tipoEndereco;
    }

    public Interface_TipoEndereco getTipoEndereco_dao() {
        return tipoEndereco_dao;
    }

    public void setTipoEndereco_dao(Interface_TipoEndereco tipoEndereco_dao) {
        this.tipoEndereco_dao = tipoEndereco_dao;
    }

    public TipoEndereco getTipo_endereco() {
        return tipo_endereco;
    }

    public void setTipo_endereco(TipoEndereco tipo_endereco) {
        this.tipo_endereco = tipo_endereco;
    }

    public void preencherComboTipoEndereco(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        this.setList_tipoEndereco(this.getTipoEndereco_dao().buscar_todos());

        for(TipoEndereco t : this.getList_tipoEndereco()){
            combo.addItem(t);
        }

    }

}

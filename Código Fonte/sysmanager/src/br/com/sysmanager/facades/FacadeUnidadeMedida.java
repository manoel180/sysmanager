/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;


import br.com.sysmanager.dao.UnidadeMedidaDao;
import br.com.sysmanager.model.UnidadeMedida;
import java.util.List;

/**
 *
 * @author Osenias
 */
public class FacadeUnidadeMedida {


    private UnidadeMedida unidadeMedida = new UnidadeMedida();
    private UnidadeMedidaDao daoUnidadeMedida = new UnidadeMedidaDao();

    public UnidadeMedida getUnidadeMedida(){
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }

    public List<UnidadeMedida> getListaUnidades(){
        return  daoUnidadeMedida.getList();
    }

    public UnidadeMedida procurarUnidade(int codigo){
        return daoUnidadeMedida.procurarCodigo(codigo);
    }
}

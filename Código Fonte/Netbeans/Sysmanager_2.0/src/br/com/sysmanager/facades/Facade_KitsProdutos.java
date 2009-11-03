/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.KitsProdutos_DAO;
import br.com.sysmanager.interfaces.Interface_KitsProdutos;
import br.com.sysmanager.model.KitsProdutos;
import br.com.sysmanager.model.KitsProdutosId;
import java.util.List;

/**
 *
 * @author Júnior
 */
public class Facade_KitsProdutos {

    private Interface_KitsProdutos kitsProdutosDAO = new KitsProdutos_DAO();
    private KitsProdutos kitsProdutos = new KitsProdutos();
    private KitsProdutosId idKitsProdutos = new KitsProdutosId();
    private List<KitsProdutos> listProdutosKit;

    public KitsProdutosId getIdKitsProdutos() {
        return idKitsProdutos;
    }

    public void setIdKitsProdutos(KitsProdutosId idKitsProdutos) {
        this.idKitsProdutos = idKitsProdutos;
    }

    public KitsProdutos getKitsProdutos() {
        return kitsProdutos;
    }

    public void setKitsProdutos(KitsProdutos kitsProdutos) {
        this.kitsProdutos = kitsProdutos;
    }

    public Interface_KitsProdutos getKitsProdutosDAO() {
        return kitsProdutosDAO;
    }

    public void setKitsProdutosDAO(Interface_KitsProdutos kitsProdutosDAO) {
        this.kitsProdutosDAO = kitsProdutosDAO;
    }

    public List<KitsProdutos> getListProdutosKit() {
        return listProdutosKit;
    }

    public void setListProdutosKit(List<KitsProdutos> listProdutosKit) {
        this.listProdutosKit = listProdutosKit;
    }

    
}

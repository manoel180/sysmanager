/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.KitsProdutosDAO;
import br.com.sysmanager.interfaces.InterfaceKitsProdutos;
import br.com.sysmanager.model.KitsProdutos;
import br.com.sysmanager.model.KitsProdutosId;
import java.util.List;

/**
 *
 * @author Júnior
 */
public class FacadeKitsProdutos {

    private InterfaceKitsProdutos kitsProdutosDAO = new KitsProdutosDAO();
    private KitsProdutos kitsProdutos = new KitsProdutos();
    private KitsProdutosId idKitsProdutos = new KitsProdutosId();
    private List<KitsProdutos> listProdutosKit;

    public List<KitsProdutos> getListProdutosKit() {
        return listProdutosKit;
    }

    public void setListProdutosKit(List<KitsProdutos> listProdutosKit) {
        this.listProdutosKit = listProdutosKit;
    }

    public KitsProdutosId getIdKitsProdutos() {
        return idKitsProdutos;
    }

    public void setIdKitsProdutos(KitsProdutosId idKitsProdutos) {
        this.idKitsProdutos = idKitsProdutos;
    }

    public KitsProdutos newInstance(){

        kitsProdutos = new KitsProdutos();

        return kitsProdutos;
    }

    public KitsProdutos getKitsProdutos() {
        return kitsProdutos;
    }

    public void setKitsProdutos(KitsProdutos kitsProdutos) {
        this.kitsProdutos = kitsProdutos;
    }

    public InterfaceKitsProdutos getKitsProdutosDAO() {
        return kitsProdutosDAO;
    }

    public void setKitsProdutosDAO(InterfaceKitsProdutos kitsProdutosDAO) {
        this.kitsProdutosDAO = kitsProdutosDAO;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.GrupoProduto;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface InterfaceGrupoProduto {

    public void salvar(GrupoProduto grupoProduto);

    public List<GrupoProduto> buscar_todos();

    public List<GrupoProduto> buscar_por_codigo(Object codigo);

    public List<GrupoProduto> buscar_por_descricao(String descricao);

    public GrupoProduto procurar_por_codigo(Integer codigo);

    public GrupoProduto procurar_por_descricao(String descricao);
    
}

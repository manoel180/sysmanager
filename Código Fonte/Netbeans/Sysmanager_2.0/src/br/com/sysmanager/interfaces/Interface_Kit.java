/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Kit;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Kit {

    public void salvar(Kit kit);
    
    public List<Kit> buscar_por_codigo(Object codigo);

    public List<Kit> buscar_por_descricao(String descricao);

    public Kit procurar_por_codigo(Integer codigo);
}

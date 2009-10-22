/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.UnidadeMedida;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface InterfaceUnidadeMedida {

    public List<UnidadeMedida> buscar_todos();

    public UnidadeMedida procurar_por_codigo(Integer codigo);

    public UnidadeMedida procurar_por_descricao(String descricao);

}

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
public interface Interface_UnidadeMedida {

    public void salvar(UnidadeMedida unidade);

    public List<UnidadeMedida> buscar_todos();

    public List<UnidadeMedida> buscar_por_codigo(Object codigo);

    public List<UnidadeMedida> buscar_por_descricao(String descricao);

    public UnidadeMedida procurar_por_codigo(Integer codigo);

}

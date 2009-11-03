/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Marca;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Marca {

    public void salvar(Marca marca);

    public List<Marca> buscar_todos();

    public List<Marca> buscar_por_codigo(Object codigo);

    public List<Marca> buscar_por_descricao(String descricao);

    public Marca procurar_por_codigo(Integer codigo);

}

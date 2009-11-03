/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Cargo;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Cargo {

    public void salvar(Cargo cargo);

    public List<Cargo> buscar_por_codigo(Object codigo);

    public List<Cargo> buscar_por_descricao(String descricao);

    public Cargo procurar_por_codigo(Integer codigo);

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Departamento;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Departamento {

    public void salvar(Departamento departamento);

    public List<Departamento> buscar_por_codigo(Object codigo);

    public List<Departamento> buscar_por_descricao(String descricao);

    public Departamento procurar_por_codigo(Integer codigo);

}

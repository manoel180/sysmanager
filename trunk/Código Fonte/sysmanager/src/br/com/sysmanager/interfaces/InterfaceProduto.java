/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Produto;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface InterfaceProduto {

    public void salvar(Produto produto);

    public List<Produto> buscar_todos();

    public List<Produto> buscar_por_codigo(Object codigo);

    public List<Produto> buscar_por_descricao(String descricao);

    public List<Produto> buscar_por_descricaoGrupo(String grupo);

    public Produto procurar_por_codigo(Integer codigo);
    
}

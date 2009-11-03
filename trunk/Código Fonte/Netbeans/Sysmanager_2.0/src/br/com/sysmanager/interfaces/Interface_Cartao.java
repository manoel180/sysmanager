/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Cartao;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Cartao {

    public void salvar(Cartao cartao);

    public List<Cartao> buscar_por_codigo(Object codigo);

    public List<Cartao> buscar_por_nome(String nome);

    public Cartao procurar_por_codigo(Integer codigo);

}

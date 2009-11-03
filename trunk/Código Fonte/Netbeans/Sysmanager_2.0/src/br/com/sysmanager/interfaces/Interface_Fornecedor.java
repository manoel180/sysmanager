/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.Fornecedor;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_Fornecedor {

    public void salvar(Fornecedor fornecedor);

    public List<Fornecedor> buscar_por_codigo(Object codigo);

    public List<Fornecedor> buscar_por_nome(String nome);

    public List<Fornecedor> buscar_por_email(String email);

    public Fornecedor procurar_por_codigo(Integer codigo);

}

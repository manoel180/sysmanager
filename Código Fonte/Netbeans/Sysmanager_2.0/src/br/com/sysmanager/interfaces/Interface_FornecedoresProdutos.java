/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.FornecedoresProdutos;
import br.com.sysmanager.model.FornecedoresProdutosId;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_FornecedoresProdutos {

    public void salvar(FornecedoresProdutos fornecedoresProdutos);

    public List<FornecedoresProdutos> buscar_por_codigo_produto(Object codigo);

    public List<FornecedoresProdutos> buscar_por_codigo_fornecedor(Object codigo);

    public List<FornecedoresProdutos> buscar_por_id(FornecedoresProdutosId id);

    public FornecedoresProdutos procurar_por_id(FornecedoresProdutosId id);

}

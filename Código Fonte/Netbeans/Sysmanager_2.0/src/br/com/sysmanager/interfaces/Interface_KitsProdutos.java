/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.interfaces;

import br.com.sysmanager.model.KitsProdutos;
import java.util.List;

/**
 *
 * @author Júnior
 */
public interface Interface_KitsProdutos {

    public void salvar(KitsProdutos kitsProdutos);

    public List<KitsProdutos> buscar_por_codigo(Integer codigoKit);
            
}

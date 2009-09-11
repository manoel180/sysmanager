/**
 * 
 */
package br.com.sysmanager.dao;

import br.com.sysmanager.model.Usuario;
import java.util.List;

public interface IUsuarioDao {
	public void salvar(Usuario usuario);

    public void excluir(Usuario usuario);

	public List<Usuario> listar();

	public List<Usuario> listarPorNome(String nomeStatus);

        public Usuario listarPorCodigo(int Codigo);

	
}

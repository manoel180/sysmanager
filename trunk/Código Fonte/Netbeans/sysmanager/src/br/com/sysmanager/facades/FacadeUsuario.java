/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysmanager.facades;

import br.com.sysmanager.dao.IUsuarioDao;
import br.com.sysmanager.dao.UsuarioDao;


import br.com.sysmanager.model.Usuario;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

public class FacadeUsuario {

    private Usuario usuario = new Usuario();
    private IUsuarioDao usuarioDAO = new UsuarioDao();
    private List<Usuario> list;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario newInstance() {
        usuario = new Usuario();
        return usuario;
    }

    public IUsuarioDao getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(IUsuarioDao usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }

    public void preencherTableUsuarios(int opcao, Object codigo, String descricao, String grupo, JTable table) {

        Funcoes.limpaLinhasTable(table);

        if (opcao == 1) {
            //    setList(getUsuarioDAO().buscar_por_codigo(codigo));
        } else if (opcao == 2) {
            //   setList(getUsuarioDAO().buscar_por_descricao(descricao));
        } else if (opcao == 3) {
            //  setList(getUsuarioDAO().buscar_por_descricaoGrupo(grupo));
        }
        setList(getUsuarioDAO().listar());

        for (Usuario u : getList()) {

            Funcoes.getModel(table).addRow(new String[]{
                        u.getCodigo().toString(),
                        u.getLogin(),
                        null,
                        u.getSenha().toString(),});

        }

    }
}

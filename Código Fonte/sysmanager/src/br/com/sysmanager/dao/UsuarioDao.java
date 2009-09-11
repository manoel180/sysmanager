/**
 * 
 */
package br.com.sysmanager.dao;

import br.com.sysmanager.model.Usuario;
import br.com.sysmanager.connection.HibernateUtil;

import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Manoel
 * 
 */
public class UsuarioDao implements IUsuarioDao {

    private static Session session = null;
    private static Transaction tx = null;

    @Override
    public void salvar(Usuario usuario) {

        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(usuario);
            tx.commit();


            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch (Exception e) {
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: " + e.getMessage());
            tx.rollback();
        } finally {
            session.close();
        }

    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> result = null;

        session = HibernateUtil.getSession();
        tx = session.beginTransaction();
        Query q = session.createQuery(" from Usuario ");

        result = q.list();

        session.close();
        return result;
    }

    @Override
    public List<Usuario> listarPorNome(String login) {
        List<Usuario> result = null;

        session = HibernateUtil.getSession();
        tx = session.beginTransaction();
        // Funcionando mas duplicando linhas
        result = session.createQuery(
                "from Usuario as user" + " where user.tipoUsuario.id = 1 order by user.nome asc").list();

        session.close();
        return result;
    }

    public List<Usuario> listarAlunos() {
        List<Usuario> result = null;

        session = HibernateUtil.getSession();
        tx = session.beginTransaction();
        // Funcionando mas duplicando linhas
        result = session.createQuery(
                "from Usuario as user" + " where user.tipoUsuario.id = 1 order by user.nome asc").list();

        session.close();
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see br.com.gerpro.dao.FacadeUsuario#procurarPorNome(java.lang.String)
     */
    public Usuario procurarPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Usuario> listarProfessoresParaCorrecao() {
        List<Usuario> result = null;

        session = HibernateUtil.getSession();
        tx = session.beginTransaction();

        result = session.createQuery("from Usuario as user" + " where user.tipoUsuario.id = 2" + " or user.tipoUsuario.id = 3" + " order by user.nome asc").list();

        session.close();
        return result;


    }

    @Override
    public void excluir(Usuario usuario) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.delete(usuario);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Sucesso",
                    "SysManager - " + usuario.getLogin() + " Excluido com sucesso", 1);
        } catch (HibernateException e) {
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Erro" + e,
                    "SysManager - Ocorreu um erro", 1);
            e.printStackTrace();
        } catch (PersistenceException e) {
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Erro" + e,
                    "SysManager - Ocorreu um erro", 1);
            e.printStackTrace();
        } catch (Exception e) {
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Erro" + e,
                    "SysManager - Ocorreu um erro", 1);
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Usuario listarPorCodigo(int codigo) {
        Usuario result = null;

        session = HibernateUtil.getSession();

        result = (Usuario) session.get(Usuario.class, codigo);

        session.close();

        return result;
    }
}

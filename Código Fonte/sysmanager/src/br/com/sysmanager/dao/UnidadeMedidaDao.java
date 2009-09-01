/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.model.*;
import br.com.sysmanager.connection.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Osenias
 */
public class UnidadeMedidaDao {


    private Session session = null;
    private Transaction tx = null;
    private List<UnidadeMedida> lista = null;

    public List<UnidadeMedida> getList()
    {
        session =  HibernateUtil.getSession();
        lista = session.createCriteria(UnidadeMedida.class).list();
        session.close();
        return lista;
    }

    public UnidadeMedida procurarCodigo(int codigo) {

        UnidadeMedida result = null;

        session = HibernateUtil.getSession();
        tx = session.beginTransaction();
        result = (UnidadeMedida) session.get(UnidadeMedida.class, codigo);

        session.close();
        return result;
    }
}

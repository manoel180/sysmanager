/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_TipoEndereco;
import br.com.sysmanager.model.TipoEndereco;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class TipoEndereco_DAO implements Interface_TipoEndereco{

    private Session session = null;
    private Transaction tx = null;
    private List<TipoEndereco> list = null;

    public List<TipoEndereco> buscar_todos(){
        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();

        list = session.createCriteria(TipoEndereco.class).list();

        tx.commit();
        session.close();
        return list;
    }

}

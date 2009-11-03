/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_TipoTelefone;
import br.com.sysmanager.model.TipoTelefone;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class TipoTelefone_DAO implements Interface_TipoTelefone{

    private Session session = null;
    private Transaction tx = null;
    private List<TipoTelefone> list = null;

    public List<TipoTelefone> buscar_todos(){
        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();

        list = session.createCriteria(TipoTelefone.class).list();

        tx.commit();
        session.close();
        return list;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.model.*;
import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.InterfaceUnidadeMedida;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Osenias
 */
public class UnidadeMedidaDAO implements InterfaceUnidadeMedida{


    private Session session = null;
    private Transaction tx = null;
    private List<UnidadeMedida> list = null;

    public List<UnidadeMedida> buscar_todos(){
        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();

        list = session.createCriteria(UnidadeMedida.class).list();

        tx.commit();
        session.close();
        return list;
    }

    public UnidadeMedida procurar_por_codigo(Integer codigo) {

        UnidadeMedida result = null;

        session = HibernateUtil.getSession();
        
        result = (UnidadeMedida) session.get(UnidadeMedida.class, codigo);

        session.close();
        return result;
    }

    public UnidadeMedida procurar_por_descricao(String descricao) {

		UnidadeMedida result = null;

		session = HibernateUtil.getSession();
		tx = session.beginTransaction();
		
        Query q = session.createSQLQuery("select * from unidade_medida where descricao = '"+descricao+"'").addEntity(UnidadeMedida.class);

        list = q.list();

        for(UnidadeMedida unidade : list){
            result = unidade;
        }

        tx.commit();
        session.close();
		return result;
	}
}

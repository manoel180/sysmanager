/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.InterfaceKit;
import br.com.sysmanager.model.Kit;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class KitDAO implements InterfaceKit{

    private Session session = null;
    private Transaction tx = null;
    private List<Kit> list = null;

    public void salvar(Kit kit) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(kit);
            tx.commit();
            session.close();

            System.out.print("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: "+e.getMessage());
            tx.rollback();
        }
    }

    public List<Kit> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from kit limit 10 ").addEntity(Kit.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from Kit where codigo = "+codigo);

            list = q.list();
            session.close();
        }

        return list;
    }

    public List<Kit> buscar_por_descricao(String descricao){

        if(descricao.equals("")){
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from kit limit 10 ").addEntity(Kit.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from Kit where nome like '"+descricao+"%'");

            list = q.list();
            session.close();
        }

        return list;
    }

    public Kit procurar_por_codigo(Integer codigo) {

        Kit result = null;

        session = HibernateUtil.getSession();

        result = (Kit) session.get(Kit.class, codigo);

        session.close();

        return result;
    }
}

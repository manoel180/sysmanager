/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Fornecedor;
import br.com.sysmanager.model.Fornecedor;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class Fornecedor_DAO implements Interface_Fornecedor{

    private Session session = null;
    private Transaction tx = null;
    private List<Fornecedor> list = null;

    public void salvar(Fornecedor fornecedor) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(fornecedor);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Fornecedor já cadastrado !");
            tx.rollback();
        }
    }


    public List<Fornecedor> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor order by codigo").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor where codigo like '"+codigo+"%'").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    
    public List<Fornecedor> buscar_por_nome(String nome){

        if(nome.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor order by codigo").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor where nome like '"+nome+"%'").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    public List<Fornecedor> buscar_por_email(String email){

        if(email.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor order by codigo").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from fornecedor where email like '"+email+"%'").addEntity(Fornecedor.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    public Fornecedor procurar_por_codigo(Integer codigo) {

        Fornecedor result = null;

        session = HibernateUtil.getSession();

        result = (Fornecedor) session.get(Fornecedor.class, codigo);

        session.close();

        return result;
    }

}

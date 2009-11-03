/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Cartao;
import br.com.sysmanager.model.Cartao;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class Cartao_DAO implements Interface_Cartao{

    private Session session = null;
    private Transaction tx = null;
    private List<Cartao> list = null;

    public void salvar(Cartao cartao) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(cartao);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Cartão já cadastrado !");
            tx.rollback();
        }
    }


    public List<Cartao> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cartao order by codigo").addEntity(Cartao.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cartao where codigo like '"+codigo+"%'").addEntity(Cartao.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    
    public List<Cartao> buscar_por_nome(String nome){

        if(nome.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cartao order by codigo").addEntity(Cartao.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cartao where nome like '"+nome+"%'").addEntity(Cartao.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    public Cartao procurar_por_codigo(Integer codigo) {

        Cartao result = null;

        session = HibernateUtil.getSession();

        result = (Cartao) session.get(Cartao.class, codigo);

        session.close();

        return result;
    }

}

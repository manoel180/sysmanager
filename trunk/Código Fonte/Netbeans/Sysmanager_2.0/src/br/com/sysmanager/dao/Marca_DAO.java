/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Marca;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class Marca_DAO implements Interface_Marca{

    private Session session = null;
    private Transaction tx = null;
    private List<Marca> list = null;

    public void salvar(Marca marca) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(marca);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Marca já cadastrado !");
            tx.rollback();
        }
    }


    public List<Marca> buscar_todos(){
        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();

        list = session.createCriteria(Marca.class).list();

        tx.commit();
        session.close();
        return list;
    }

    public List<Marca> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from marca order by codigo").addEntity(Marca.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from marca where codigo like '"+codigo+"%'").addEntity(Marca.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    
    public List<Marca> buscar_por_descricao(String descricao){

        if(descricao.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from marca order by codigo").addEntity(Marca.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from marca where descricao like '"+descricao+"%'").addEntity(Marca.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    public Marca procurar_por_codigo(Integer codigo) {

        Marca result = null;

        session = HibernateUtil.getSession();

        result = (Marca) session.get(Marca.class, codigo);

        session.close();

        return result;
    }

}

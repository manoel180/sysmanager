/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Cargo;
import br.com.sysmanager.model.Cargo;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class Cargo_DAO implements Interface_Cargo{

    private Session session = null;
    private Transaction tx = null;
    private List<Cargo> list_cargo = null;

    public void salvar(Cargo cargo) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(cargo);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Cargo já cadastrado !");
            tx.rollback();
        }
    }


    public List<Cargo> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cargo order by codigo").addEntity(Cargo.class);

            list_cargo = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cargo where codigo like '"+codigo+"%'").addEntity(Cargo.class);

            list_cargo = q.list();
            session.close();
        }

        return list_cargo;
    }

    
    public List<Cargo> buscar_por_descricao(String descricao){

        if(descricao.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cargo order by codigo").addEntity(Cargo.class);

            list_cargo = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from cargo where descricao like '"+descricao+"%'").addEntity(Cargo.class);

            list_cargo = q.list();
            session.close();
        }

        return list_cargo;
    }

    public Cargo procurar_por_codigo(Integer codigo) {

        Cargo result = null;

        session = HibernateUtil.getSession();

        result = (Cargo) session.get(Cargo.class, codigo);

        session.close();

        return result;
    }

}

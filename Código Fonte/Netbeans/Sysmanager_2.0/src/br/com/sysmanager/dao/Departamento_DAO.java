/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Cargo;
import br.com.sysmanager.interfaces.Interface_Departamento;
import br.com.sysmanager.model.Cargo;
import br.com.sysmanager.model.Departamento;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class Departamento_DAO implements Interface_Departamento{

    private Session session = null;
    private Transaction tx = null;
    private List<Departamento> list_departamento = null;

    public void salvar(Departamento departamento) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(departamento);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Departamento já cadastrado !");
            tx.rollback();
        }
    }


    public List<Departamento> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from departamento order by codigo").addEntity(Departamento.class);

            list_departamento = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from departamento where codigo like '"+codigo+"%'").addEntity(Departamento.class);

            list_departamento = q.list();
            session.close();
        }

        return list_departamento;
    }

    
    public List<Departamento> buscar_por_descricao(String descricao){

        if(descricao.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from departamento order by codigo").addEntity(Departamento.class);

            list_departamento = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from departamento where descricao like '"+descricao+"%'").addEntity(Departamento.class);

            list_departamento = q.list();
            session.close();
        }

        return list_departamento;
    }

    public Departamento procurar_por_codigo(Integer codigo) {

        Departamento result = null;

        session = HibernateUtil.getSession();

        result = (Departamento) session.get(Departamento.class, codigo);

        session.close();

        return result;
    }

}

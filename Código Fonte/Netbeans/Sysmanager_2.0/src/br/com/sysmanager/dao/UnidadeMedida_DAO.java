/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_UnidadeMedida;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.model.UnidadeMedida;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class UnidadeMedida_DAO implements Interface_UnidadeMedida{

    private Session session = null;
    private Transaction tx = null;
    private List<UnidadeMedida> list = null;

    public void salvar(UnidadeMedida unidade) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(unidade);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Unidade de Medida já cadastrada !");
            tx.rollback();
        }
    }


    public List<UnidadeMedida> buscar_todos(){
        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();

        list = session.createCriteria(UnidadeMedida.class).list();

        tx.commit();
        session.close();
        return list;
    }


    public List<UnidadeMedida> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from unidade_medida order by codigo").addEntity(UnidadeMedida.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from unidade_medida where codigo like '"+codigo+"%'").addEntity(UnidadeMedida.class);

            list = q.list();
            session.close();
        }

        return list;
    }


    public List<UnidadeMedida> buscar_por_descricao(String descricao){

        if(descricao.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from unidade_medida order by codigo").addEntity(UnidadeMedida.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from unidade_medida where descricao like '"+descricao+"%'").addEntity(UnidadeMedida.class);

            list = q.list();
            session.close();
        }

        return list;
    }

    public UnidadeMedida procurar_por_codigo(Integer codigo) {

        UnidadeMedida result = null;

        session = HibernateUtil.getSession();

        result = (UnidadeMedida) session.get(UnidadeMedida.class, codigo);

        session.close();

        return result;
    }

}

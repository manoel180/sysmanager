/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.InterfaceGrupoProduto;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Osenias
 */
public class GrupoProdutoDAO implements InterfaceGrupoProduto{

    private Session session = null;
    private Transaction tx = null;
    private List<GrupoProduto> list = null;

    public void salvar(GrupoProduto grupoProduto) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(grupoProduto);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: "+e.getMessage());
            tx.rollback();
        }
    }

    public List<GrupoProduto> buscar_todos(){

        session =  HibernateUtil.getSession();
        tx = session.beginTransaction();
        list = session.createCriteria(GrupoProduto.class).list();
        tx.commit();
        session.close();
        return list;
    }


    public List<GrupoProduto> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from grupo_produto order by codigo limit 10 ").addEntity(GrupoProduto.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from GrupoProduto where codigo = "+codigo);

            list = q.list();
            session.close();
        }

        return list;
    }


    public List<GrupoProduto> buscar_por_descricao(String descricao){

        if(descricao.equals("")){
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from grupo_produto limit 10 ").addEntity(GrupoProduto.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from GrupoProduto where descricao like '"+descricao+"%'");

            list = q.list();
            session.close();
        }

        return list;
    }

    public GrupoProduto procurar_por_codigo(Integer codigo) {

        GrupoProduto result = null;

        session = HibernateUtil.getSession();

        result = (GrupoProduto) session.get(GrupoProduto.class, codigo);

        session.close();

        return result;
    }

    public GrupoProduto procurar_por_descricao(String Descricao) {

		GrupoProduto result = null;

		session = HibernateUtil.getSession();
		tx = session.beginTransaction();

        //Query q = session.createSQLQuery("select * from grupo_produto where descricao = '"+descricao+"'").uniqueResult();

        result = (GrupoProduto) session.get(GrupoProduto.class, Descricao);

       session.close();

        return result;
	}
}

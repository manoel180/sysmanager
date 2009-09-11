/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.model.*;
import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.InterfaceProduto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Osenias
 */
public class ProdutoDAO implements InterfaceProduto{


    private Session session = null;
    private Transaction tx = null;
    private List<Produto> list = null;


    public void salvar(Produto produto){

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(produto);
            tx.commit();
            

            Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: "+e.getMessage());
            tx.rollback();
        }finally{
            session.close();
        }

    }


    public List<Produto> buscar_todos(){

        session =  HibernateUtil.getSession();
        list = session.createCriteria(Produto.class).list();
        session.close();
        return list;
    }

    public List<Produto> buscar_por_codigo(Object codigo){

        if(codigo.equals("")){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from produto limit 10 ").addEntity(Produto.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from Produto where codigo = "+codigo);

            list = q.list();
            session.close();
        }

        return list;
    }


    public List<Produto> buscar_por_descricao(String descricao){

        if(descricao.equals("")){
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from produto limit 10 ").addEntity(Produto.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createQuery("from Produto where descricao like '"+descricao+"%'");

            list = q.list();
            session.close();
        }

        return list;
    }


    public List<Produto> buscar_por_descricaoGrupo(String grupo){

        if(grupo.equals("")){
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from produto limit 10 ").addEntity(Produto.class);

            list = q.list();
            session.close();
        }

        else{
            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from produto p " +
                    " inner join grupo_produto g on p.grupo_produto_codigo = g.codigo where g.descricao like '"+grupo+"%'").addEntity(Produto.class);

            list = q.list();
            session.close();
        }

        return list;
    }


    public Produto procurar_por_codigo(Integer codigo) {

        Produto result = null;

        session = HibernateUtil.getSession();

        result = (Produto) session.get(Produto.class, codigo);

        session.close();

        return result;
    }

}

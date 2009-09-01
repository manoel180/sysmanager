/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.model.*;
import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Osenias
 */
public class ProdutoDao {


    private Session session = null;
    private Transaction tx = null;
    private List<Produto> lista = null;


    public void adiconar(Produto produto){

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.save(produto);
            tx.commit();
            session.close();

            Funcoes.mensagemInforma("Dados inseridos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: "+e.getMessage());
            tx.rollback();
        }
    }


    public List<Produto> getList()
    {
        session =  HibernateUtil.getSession();
        lista = session.createCriteria(Produto.class).list();
        session.close();
        return lista;
    }

    
}

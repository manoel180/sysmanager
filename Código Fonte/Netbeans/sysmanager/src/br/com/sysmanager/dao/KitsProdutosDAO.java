/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.InterfaceKitsProdutos;
import br.com.sysmanager.model.KitsProdutos;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class KitsProdutosDAO implements InterfaceKitsProdutos{

    private Session session = null;
    private Transaction tx = null;
    private List<KitsProdutos> list = null;

    public void salvar(KitsProdutos kitsProdutos) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(kitsProdutos);
            tx.commit();
            session.close();

            System.out.print("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("Erro: "+e.getMessage());
            tx.rollback();
        }
    }

    
    public List<KitsProdutos> buscar_por_codigoKit(Integer codigoKit){

            session = HibernateUtil.getSession();

            Query q = session.createSQLQuery(" select * from kits_produtos where kit_codigo = "+codigoKit).addEntity(KitsProdutos.class);

            list = q.list();
            session.close();

            return list;
    }
}

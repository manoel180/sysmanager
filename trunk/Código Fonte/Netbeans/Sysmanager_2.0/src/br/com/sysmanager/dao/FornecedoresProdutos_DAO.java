/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.dao;

import br.com.sysmanager.connection.HibernateUtil;
import br.com.sysmanager.interfaces.Interface_Fornecedor;
import br.com.sysmanager.interfaces.Interface_FornecedoresProdutos;
import br.com.sysmanager.model.Fornecedor;
import br.com.sysmanager.model.FornecedoresProdutos;
import br.com.sysmanager.model.FornecedoresProdutosId;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Júnior
 */
public class FornecedoresProdutos_DAO implements Interface_FornecedoresProdutos{

    private Session session = null;
    private Transaction tx = null;
    private List<FornecedoresProdutos> list = null;

    public void salvar(FornecedoresProdutos fornecedoresProdutos) {

        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            session.saveOrUpdate(fornecedoresProdutos);
            tx.commit();
            session.close();

            //Funcoes.mensagemInforma("Dados salvos com sucesso !");

        } catch(Exception e){
            e.printStackTrace();
            Funcoes.mensagemErro("ocorreu o erro: "+e.getMessage());
            tx.rollback();
        }
    }


    public List<FornecedoresProdutos> buscar_por_codigo_produto(Object codigo) {

        session = HibernateUtil.getSession();

        Query q = session.createSQLQuery(" select * from fornecedores_produtos fp "+
                                         " inner join fornecedor f on fp.fornecedor_codigo = f.codigo "+
                                         " where fp.produto_codigo = "+codigo).addEntity(FornecedoresProdutos.class);

        list = q.list();
        session.close();
        
        return list;
    }

    public List<FornecedoresProdutos> buscar_por_codigo_fornecedor(Object codigo) {
        session = HibernateUtil.getSession();

        Query q = session.createSQLQuery(" select * from fornecedores_produtos fp "+
                                         " inner join fornecedor f on fp.fornecedor_codigo = f.codigo "+
                                         " where fp.fornecedor_codigo = "+codigo).addEntity(FornecedoresProdutos.class);

        list = q.list();
        session.close();

        return list;
    }

    public List<FornecedoresProdutos> buscar_por_id(FornecedoresProdutosId id) {
        session = HibernateUtil.getSession();

        Query q = session.createSQLQuery(" select * from fornecedores_produtos fp "+
                                         " inner join fornecedor f on fp.fornecedor_codigo = f.codigo "+
                                         " where fp.fornecedor_codigo = "+id.getFornecedorCodigo()+" and fp.produto_codigo = "+id.getProdutoCodigo()).
                                         addEntity(FornecedoresProdutos.class);

        list = q.list();
        session.close();

        return list;
    }

    public FornecedoresProdutos procurar_por_id(FornecedoresProdutosId id) {
        FornecedoresProdutos result = null;

        session = HibernateUtil.getSession();

        result = (FornecedoresProdutos) session.get(FornecedoresProdutos.class, id);

        session.close();

        return result;
    }
    
}

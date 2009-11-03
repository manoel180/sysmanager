/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.connection;


import br.com.sysmanager.services.Funcoes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author Osenias
 */
public class HibernateUtil {

    private static final SessionFactory session;

    static {
        try {
            session = new Configuration().configure("br/com/sysmanager/connection/hibernate.cfg.xml").buildSessionFactory();
            
        } catch (Throwable ex) {
            Funcoes.mensagemErro("Banco de Dados Indisponível !");
            throw new ExceptionInInitializerError(ex);

        }
    }

    public static Session getSession() {
        return session.openSession();
    }
}

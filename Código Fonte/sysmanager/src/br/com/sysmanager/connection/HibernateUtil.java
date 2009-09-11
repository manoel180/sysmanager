/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.connection;


import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author Osenias
 */
public class HibernateUtil {


	private static final SessionFactory sessionFactory;
    static {
        try {
            // Cria uma sessão a partir do arquivo hibernate.cfg.xml
        	sessionFactory = new Configuration().configure("br/com/sysmanager/connection/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
        	JOptionPane.showMessageDialog(null, "Falha ao conectar com o Banco de Dados");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
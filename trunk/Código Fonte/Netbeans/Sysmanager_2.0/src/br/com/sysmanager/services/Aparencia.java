package br.com.sysmanager.services;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aparencia {

     LookAndFeel lf = UIManager.getLookAndFeel();
     
     // org.fife.plaf.Office2003.Office2003LookAndFeel
     // com.sun.java.swing.plaf.windows.WindowsLookAndFeel

     public void Install(){
        try {
            UIManager.setLookAndFeel("org.fife.plaf.Office2003.Office2003LookAndFeel");
    
        } catch (InstantiationException ex1) {
    
        } catch (ClassNotFoundException ex2) {
    
        } catch (UnsupportedLookAndFeelException ex3) {
    
        } catch (IllegalAccessException ex4) {
    
        }
     }
     
     
}

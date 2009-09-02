package br.com.sysmanager.view;

import br.com.sysmanager.connection.HibernateUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SplashScreenSCI01 extends JWindow {

    private int duracao;

    public SplashScreenSCI01(int d) {
        duracao = d;
    }

    public void showSplash() {
        JLabel label = new JLabel();
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.white);
        int width = 650;
        int height = 360;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysmanager/icons/Logo_SysManager.jpg")));
        JLabel copyrt = new JLabel("CopyRight 2009, Manoel & Osenias",
                JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(0, 255, 0, 255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

        // Display it
        setVisible(true);

        // Wait a little while, maybe while loading resources
        try {
            Thread.sleep(duracao);
            
            HibernateUtil hu = new HibernateUtil();
            hu.getSession();
            new Frame_Principal().show();

        } catch (Exception e) {
        }

        setVisible(false);

    }

    public void showSplashAndExit() {
        showSplash();

    }

    public static void main(String[] args) {
        SplashScreenSCI01 splash = new SplashScreenSCI01(3000);
        splash.showSplashAndExit();
    }
}

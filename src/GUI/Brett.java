/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import root.*;
import java.awt.Color;

/**
 *
 * @author dthma
 */
public class Brett extends GameWindow {
    
    public Brett() {
        initComponents();
        
        getContentPane().removeAll();
        
        boolean schwarz = true;
        for (int z = 0; z<feld.length; z++ ) {
            for (int sp = 0; sp<feld[z].length; sp++ ) {
            Feld f = new Feld ( this, schwarz );
            feld [z][sp]=f;
            f.addActionListener(fl);
            f.setBackground(schwarz ? Color.darkGray : Color.lightGray);
            
            
            
            jPanel1.add(f);
            schwarz = !schwarz;
            }
          schwarz = !schwarz;  
        }
        
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }

       private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }
       
       
    
public static void main(String[] args) {



     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Brett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Brett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Brett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Brett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Brett().setVisible(true);
            }
        });
    }

 private Feld [][] feld = new Feld [8][8];
            
    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

private class FeldListener implements java.awt.event.ActionListener {
    public void actionPerformed ( java.awt.event.ActionEvent evt ) {
        
        for ( int z = 0; z<feld.length; z++ ) {
            for ( int sp = 0; sp<feld.length; sp++ ) {
                if ( evt.getSource() == feld[z][sp]) {
                    System.out.println( "Feld "+ z + ", "+ sp + " geklickt!");
                }
            }
        
     
        }
    }

} FeldListener fl = new FeldListener();

}
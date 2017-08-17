/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import root.*;

/**
 *
 * @author dthma
 */
public class Feld extends javax.swing.JButton {

private Brett brett;
private Stein stein = null;


public Feld ( Brett brett){
    this.brett=brett;
    
}

public void setStein ( Stein stein ) {
    this.stein=stein;
}
    
}

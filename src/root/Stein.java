/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import GUI.*;

/**
 *
 * @author dthma
 */
public abstract class Stein {
    
    private Feld feld;
    private boolean istSchwarz;
    
    public Stein ( Feld feld, boolean schwarz  ) {
        this.feld=feld;
        istSchwarz=schwarz;
    }
    
}

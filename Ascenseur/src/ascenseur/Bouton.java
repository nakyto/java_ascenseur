/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

/**
 *
 * @author Theo
 */

/**
 * On consdère qu'il y a 2 étage , un RDC + un etage 1 ;
 * 
 * a est le Bouton_Externe
 * 
 * b est le Bouton_Interne
 * 
 * S est l'action :
 *                  1 = Monter ou Desendre;
 *                  0 = Même étage 
 * 
 * | a | b | S |
 * |---|---|---|
 * | 0 | 0 | 0 |
 * |---|---|---|
 * | 0 | 1 | 1 |
 * |---|---|---|
 * | 1 | 0 | 1 |
 * |---|---|---|
 * | 1 | 1 | 0 |
 * +-----------+
 * 
 */


public class Bouton {

    protected int etage;
    protected boolean interupteur; // a & b 
    
    protected static final boolean OFF = false;
    protected static final boolean ON = true;
    
    public void setInterupteur(boolean presion){
        this.interupteur = presion;
    }
}

/**
 * 
 * @author Theo
 */
class Bouton_Externe extends Bouton {

    
    /**
     * @param etage_bout etage où le bouton est instaler  
     */
    public Bouton_Externe(int etage_bout) {
        this.etage = etage_bout;
        this.interupteur = OFF;
    }
   
    
    
}

class Bouton_Interieur extends Bouton {

    /**
     * 
     * @param etage_bout_in etage où le bouton est instaler
     */
    public Bouton_Interieur(int etage_bout_in){
        this.etage = etage_bout_in;
        this.interupteur = OFF;
    }
    
    
}


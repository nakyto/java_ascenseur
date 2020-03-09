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
public class Lumiere {
    
    private boolean interupteur;
    
    private static final boolean LIGHT_OFF = false;
    private static final boolean LIGHT_ON = true;
    
    

    Lumiere() {
        this.interupteur = LIGHT_OFF;
    }
    
    /**
     * allume la lumère 
     */
    
    public void light_on(){
        this.interupteur = LIGHT_ON;
        System.out.println("\033[33mLa lumière dans la cabine est allumer ... \n");
    }
    
    /**
     * etint la lumère 
     */
    
    public void light_off(){
        this.interupteur = LIGHT_OFF;
        System.out.println("wait 5s\n\033[33m La lumière dans la cabine est étinte ... \n");

    }
    
    
    
    
}

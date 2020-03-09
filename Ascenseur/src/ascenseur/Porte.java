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
public class Porte {
    
    private boolean etat_port_fermer ;
    private boolean etat_port_ouverte ;
    
    
   /**
    * Constructeur Porte
    * @param void
    */ 
    Porte()
    {
        this.etat_port_fermer = true ;
        this.etat_port_ouverte = false ;
        
    }

    /**
     * getEtat_port_fermer, est un geteur qui retourne l'état de la port  
     * @return etat_port_fermer
     */
    public boolean getEtat_port_fermer() {
        return etat_port_fermer;
    }

    /**
     * setEtat_port_fermer() est un seteur qui change l'état de l'objet Porte
     * @param n_etat_f
     */
    
    public void setEtat_port_fermer(boolean n_etat_f) {
        this.etat_port_fermer = n_etat_f;
    }

    public boolean getEtat_port_ouverte() {
        return etat_port_ouverte;
    }

    public void setEtat_port_ouverte(boolean n_etat_o) {
        this.etat_port_ouverte = n_etat_o;
    }
    
    /**
     * Fonction qui permet d'ouvire la porte
     */
    public void PortOuvert(){
        
        this.setEtat_port_ouverte(true);
        this.setEtat_port_fermer(false);
        
        System.out.println("\033[32m La porte est ouvert ...\nWait 10s");
    }
    
    /**
     * Fonction qui permet de fermer la porte
     */
    public void PortFermer(){
        
        this.setEtat_port_ouverte(false);
        this.setEtat_port_fermer(true);
        
        System.out.println("\033[31m La porte est Fermer ...\n");
    }
    
    
    
    
}

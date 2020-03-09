/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

import java.util.Scanner;

/**
 *
 * @author Theo ;-)
 */
public class Controleur {

   
    public Controleur() {
    
    }
    
    /**
     * Fonction pour faire la simulation d'un acsenseur 
     */
    
    public void sumulation() {
        
        // creation des instance des objets a utiliser pour le fonctionement 
        
        Porte p1 = new Porte(); 
        Moteur m1 = new Moteur(); 
        Lumiere l1 = new Lumiere(); 
        Bouton bexRDC = new Bouton_Externe(0);
        Bouton bex1 = new Bouton_Externe(1);
        Bouton binRDC = new Bouton_Interieur(0);
        Bouton bin1 = new Bouton_Interieur(1);
        
        
        // affichage pour l'utilisateur 
        System.out.println("-------------\n\033[34m A quelle étage êtes-vous ?");
        System.out.println("0 : RDC ");
        System.out.println("1 : etage 1");
       
        
        Scanner ecoute;
        ecoute = new Scanner(System.in);
        
        // création d'une variable globale pour situer la situation de départ 
        
        int etage = ecoute.nextInt();
        
        l1.light_on();
        
        m1.setEtage_actuel(etage);
        
        switch(etage){
            
            
            // cas où on est au RDC 
            case 0  : 
               
                 
                bexRDC.setInterupteur(true);
                
                p1.PortOuvert();
                System.out.print("\033[34m Vous rentré dans l'ascenseur... \n\n");
                p1.PortFermer();
                System.out.print("\033[34m A quelle étage voulez-vous aller ?\n 0 : RDC \n 1 : étage 1\n");
                int etage_Choix = ecoute.nextInt();
                   
                    if(etage_Choix == 0 ){
                        binRDC.setInterupteur(true);
                        System.out.println("Bouton RDC presser");
                        m1.Monter(etage_Choix);
                        
                        p1.PortOuvert();
                        System.out.print("\033[34m Vous etes arriver a l'étage\n");
                        p1.PortFermer();
                    }else{
                        bin1.setInterupteur(true);
                        System.out.println("\033[34m Bouton 1 presser\n");
                        m1.Monter(etage_Choix);
                        
                        p1.PortOuvert();
                        System.out.print("\033[34m Vous etes arriver a l'étage\n");
                        p1.PortFermer();
                        l1.light_off();
                    }
                
                break;
            
            
            // cas où on est a l'étage 1 
            case 1 : 
                
                bex1.setInterupteur(true);
                
                p1.PortOuvert();
                System.out.print("\033[34m Vous rentré dans l'ascenseur... \n\n");
                p1.PortFermer();
                System.out.print("\033[34m A quelle étage voulez-vous aller ?\n 0 : RDC \n 1 : étage 1\n");
                int etage_Choix2 = ecoute.nextInt();
                   
                    if(etage_Choix2 == 0 ){
                        
                        binRDC.setInterupteur(true);
                        System.out.println("Bouton RDC presser");
                        m1.Descendre(etage_Choix2);
                        
                        p1.PortOuvert();
                        System.out.print("\033[34m Vous etes arriver a l'étage\n");
                        p1.PortFermer();
                    }else{
                        bin1.setInterupteur(true);
                        System.out.println("\033[34m Bouton 1 presser\n");
                        m1.Monter(etage_Choix2);
                        
                        p1.PortOuvert();
                        System.out.print("\033[34m Vous etes arriver a l'étage\n");
                        p1.PortFermer();
                    }
                break;
            
            // cas où l'utilisateur a fait un faute de frape ;)
            default :
                this.sumulation();
                
            
                
            
        }
        
        
    }
        
    
}

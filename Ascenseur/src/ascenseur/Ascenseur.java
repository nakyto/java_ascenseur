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
public class Ascenseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Moteur m1 = new Moteur();
       
       //m1.Descendre(-1);
       //System.out.println(m1.getEtage_actuel());
       // m1.Descendre(2);
      
      
       Controleur C1 = new Controleur();
       
       C1.sumulation();
       
    }
    
}

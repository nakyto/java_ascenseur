/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

/**
 * Class Moteur : Pour simulé la monté ou la descente de l'asceseur
 *
 * @author Theo
 */
public class Moteur {

    private boolean en_mouvement;
    private int etage_actuel;
    private int etage_choisi;

    private static final int RDC = 0;

    /**
     * Construceur Moteur
     *
     * @param void
     */
    Moteur() {
        this.etage_actuel = RDC;
        this.etage_choisi = RDC;
        this.en_mouvement = false;
    }

    public void setEn_mouvement(boolean nen_mouvement) {
        this.en_mouvement = nen_mouvement;
    }

    public void setEtage_actuel(int netage_actuel) {
        this.etage_actuel = netage_actuel;
    }

    public void setEtage_choisi(int netage_choisi) {
        this.etage_choisi = netage_choisi;
    }

    public boolean isEn_mouvement() {
        return en_mouvement;
    }

    public int getEtage_actuel() {
        return etage_actuel;
    }

    public int getEtage_choisi() {
        return etage_choisi;
    }

    public static int getRDC() {
        return RDC;
    }

    /**
     * Permet de faire monté l'assensuer à l'étage voulus
     *
     * @param etage_choisi nombre positif
     */
    public void Monter(int etage_choisi) {

        if (getEtage_actuel() < etage_choisi) {

            this.setEn_mouvement(true);
            setEtage_choisi(etage_choisi);
            System.out.println("L\'ascenseur est entrain de monter ... A l'étage : " + getEtage_choisi() + "\n");
            setEtage_actuel(etage_choisi);
            this.setEn_mouvement(false);

        } else if (this.etage_actuel == etage_choisi) {
            this.setEtage_choisi(etage_choisi);
            System.out.println("L\'ascenseur ne peut pas monter, il est a \t l\'étage actuel : " + getEtage_actuel() + "\t l'étage choisi : " + etage_choisi);
        } else {
            System.err.println("Error value function Monter");
        }

    }
    
     /**
     * Permet de faire descendre l'assensuer à l'étage voulus
     *
     * @param etage_choisi nombre positif 
     */
    public void Descendre(int etage_choisi) {

        if (this.etage_actuel > etage_choisi) {
            // cas normale où l'ascenseur est a un etage A pour aller à un étage B : 
            //          
            //         étage A -----> étage B
            
            this.setEn_mouvement(true);
            setEtage_choisi(etage_choisi);
            System.out.println("L\'ascenseur est entrain de descendre ... A l'érage : " + getEtage_choisi() + "\n ");
            setEtage_actuel(etage_choisi);
            this.setEn_mouvement(false);
            
        } else if (this.etage_actuel == etage_choisi & etage_choisi > RDC) {
            // cas où l'ascenseur est au meme étage que l'étage voulut 
            this.setEtage_choisi(etage_choisi);
            System.out.println("L\'ascenseur ne peut pas descendre, il est a \t l\'étage actuel : " + getEtage_actuel() + "\t l'étage choisi : " + etage_choisi);
        
        } else {
            // cas de movais appel de la fonction 
            System.err.println("Error value function Descendre");
        }
    }

    public boolean estArrete() {
        return (this.en_mouvement == false);
    }
}

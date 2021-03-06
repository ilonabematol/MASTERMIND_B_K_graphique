/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_b_k;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ilonabematol
 */
public class CelluleGraphique extends JButton {
    int Pions;
    
    // insertion des images dans le code pour les utiliser dans la fenetre graphique 
    ImageIcon img_blue=new javax.swing.ImageIcon(getClass().getResource("/images/Blue.png"));
    ImageIcon img_green=new javax.swing.ImageIcon(getClass().getResource("/images/Green.png"));
    ImageIcon img_orange=new javax.swing.ImageIcon(getClass().getResource("/images/Orange.png"));
    ImageIcon img_pink=new javax.swing.ImageIcon(getClass().getResource("/images/Pink.png"));
    ImageIcon img_red=new javax.swing.ImageIcon(getClass().getResource("/images/Red.png"));
    ImageIcon img_yellow=new javax.swing.ImageIcon(getClass().getResource("/images/Yellow.png"));
    // images pour les indices 
    ImageIcon img_videbis=new javax.swing.ImageIcon(getClass().getResource("/images/videbis.png"));
    ImageIcon img_white=new javax.swing.ImageIcon(getClass().getResource("/images/White.jpg"));
    ImageIcon img_black=new javax.swing.ImageIcon(getClass().getResource("/images/Black.png"));
    
    /**
     *
     * @param unecellule une cellule de la grille 
     * cette méthode est le constructeur de la class cellule graphique 
     */
    public CelluleGraphique(int unecellule){
       Pions=unecellule;
        
    }
      
   
    
    @Override
    public void paintComponent ( Graphics G){
        
        super.paintComponent(G);
        switch (Pions) {
                case 0:// s'il y aune bonne couleur au bon emplacement ( en rapport avec la console )
                    setIcon(img_white);
                    break;
                case 1:// s'il y a une bonne coueur seulement 
                    setIcon(img_black);
                    break;
                case -1:// si il n'ya rien de bon
                    setIcon(img_videbis);
                
            }
        /*
        if(Pions==0){
            setIcon(img_white);
        }
        else if (Pions==1){
            setIcon(img_black);
        }
       */
        
        
    }


}
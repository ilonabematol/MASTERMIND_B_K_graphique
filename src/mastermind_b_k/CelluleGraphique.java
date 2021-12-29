/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_b_k;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ilonabematol
 */
public class CelluleGraphique extends JButton {
    Grille_principale Pions;
    /*
    ImageIcon img_blue=new javax.swing.ImageIcon(getClass().getResource("/images/Blue.png"));
    ImageIcon img_green=new javax.swing.ImageIcon(getClass().getResource("/images/Green.png"));
    ImageIcon img_orange=new javax.swing.ImageIcon(getClass().getResource("/images/Orange.png"));
    ImageIcon img_pink=new javax.swing.ImageIcon(getClass().getResource("/images/Pink.png"));
    ImageIcon img_red=new javax.swing.ImageIcon(getClass().getResource("/images/Red.png"));
    ImageIcon img_yellow=new javax.swing.ImageIcon(getClass().getResource("/images/Yellow.png"));
    
    */
    ImageIcon img_vide=new javax.swing.ImageIcon(getClass().getResource("/images/vide.png"));
    
    public CelluleGraphique(Grille_principale uneCellule){
        Pions=uneCellule;
        //CelluleGraphique celluleAssociee = new CelluleGraphique();*/
        
    }

    
    @Override
    public void paintComponent ( Graphics G){
        
        super.paintComponent(G);
        setIcon(img_vide);
}
}
/*
        if (Pions.tabCouleur[0]== "R"){
          setIcon(img_red);
      }else if (Pions.tabCouleur[1] == "P"){
          
         setIcon(img_pink);
      }else if(Pions.tabCouleur[2] == "G"){
          setIcon(img_green);
      }else if(Pions.tabCouleur[3] == "Y"){
          setIcon(img_yellow);
      }  else if(Pions.tabCouleur[4] == "0"){
          setIcon(img_orange);
      }else if(Pions.tabCouleur[5] == "B"){
          setIcon(img_blue);
      }
          }
      }
       */ 
    


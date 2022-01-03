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
    
    
    ImageIcon img_blue=new javax.swing.ImageIcon(getClass().getResource("/images/Blue.jpeg"));
    ImageIcon img_green=new javax.swing.ImageIcon(getClass().getResource("/images/Green.jpeg"));
    ImageIcon img_orange=new javax.swing.ImageIcon(getClass().getResource("/images/Orange.jpeg"));
    ImageIcon img_pink=new javax.swing.ImageIcon(getClass().getResource("/images/Pink.jpeg"));
    ImageIcon img_red=new javax.swing.ImageIcon(getClass().getResource("/images/Red.jpeg"));
    ImageIcon img_yellow=new javax.swing.ImageIcon(getClass().getResource("/images/Yellow.jpeg"));
    ImageIcon img_vide=new javax.swing.ImageIcon(getClass().getResource("/images/vide.jpg"));
    ImageIcon img_white=new javax.swing.ImageIcon(getClass().getResource("/images/White.jpg"));
    ImageIcon img_black=new javax.swing.ImageIcon(getClass().getResource("/images/Black.png"));
    
    public CelluleGraphique(int unecellule){
       Pions=unecellule;
        
    }
      
   
    
    @Override
    public void paintComponent ( Graphics G){
        
        super.paintComponent(G);
        switch (Pions) {
                case 0:
                    setIcon(img_white);
                    break;
                case 1:
                    setIcon(img_black);
                    break;
                
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
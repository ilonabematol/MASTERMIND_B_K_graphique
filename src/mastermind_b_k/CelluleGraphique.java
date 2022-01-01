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
    String Pions;
    
    ImageIcon img_blue=new javax.swing.ImageIcon(getClass().getResource("/images/Blue.jpeg"));
    ImageIcon img_green=new javax.swing.ImageIcon(getClass().getResource("/images/Green.jpeg"));
    ImageIcon img_orange=new javax.swing.ImageIcon(getClass().getResource("/images/Orange.jpeg"));
    ImageIcon img_pink=new javax.swing.ImageIcon(getClass().getResource("/images/Pink.jpeg"));
    ImageIcon img_red=new javax.swing.ImageIcon(getClass().getResource("/images/Red.jpeg"));
    ImageIcon img_yellow=new javax.swing.ImageIcon(getClass().getResource("/images/Yellow.jpeg"));
    ImageIcon img_vide=new javax.swing.ImageIcon(getClass().getResource("/images/vide.jpg"));
    ImageIcon img_white=new javax.swing.ImageIcon(getClass().getResource("/images/White.jpg"));
    ImageIcon img_black=new javax.swing.ImageIcon(getClass().getResource("/images/Black.png"));
    
    public CelluleGraphique(String uneCellule){
        Pions=uneCellule;
        
        //CelluleGraphique celluleAssociee = new CelluleGraphique();*/
        
    }

    
    @Override
    public void paintComponent ( Graphics G){
        
        super.paintComponent(G);
       // if(Pions==null){
         //    setIcon(img_vide);      
        //}
        if (Pions== "R"){
          setIcon(img_red);
      }else if (Pions == "P"){
          
         setIcon(img_pink);
      }else if(Pions == "G"){
          
          setIcon(img_green);
      }else if(Pions == "Y"){
          
          setIcon(img_yellow);
      }  else if(Pions == "O"){
          
          setIcon(img_orange);
          
      }else if(Pions== "B"){
          setIcon(img_blue);
      }
          
      
        
        
    }


}
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
    
    ImageIcon img_blue=new javax.swing.ImageIcon(getClass().getResource("/images/Blue.png"));
    ImageIcon img_green=new javax.swing.ImageIcon(getClass().getResource("/images/Green.png"));
    ImageIcon img_orange=new javax.swing.ImageIcon(getClass().getResource("/images/Orange.png"));
    ImageIcon img_pink=new javax.swing.ImageIcon(getClass().getResource("/images/Pink.png"));
    ImageIcon img_red=new javax.swing.ImageIcon(getClass().getResource("/images/Red.png"));
    ImageIcon img_yellow=new javax.swing.ImageIcon(getClass().getResource("/images/Yellow.png"));
    
    
    public CelluleGraphique(Grille_principale uneCellule){
        Pions=uneCellule;
        //CelluleGraphique celluleAssociee = new CelluleGraphique();*/
        
    
}
    
    @Override
    public void paintComponent ( Graphics G){
        
        super.paintComponent(G);
    }
}

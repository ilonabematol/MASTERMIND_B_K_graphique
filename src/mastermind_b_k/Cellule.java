/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_b_k;

/**
 *
 * @author mario
 */
public class Cellule {
    String PionActuel; 
    String couleurAssociée; 
    
    
     
    // Constructeur : initialisant les attributs avec des valeurs par défaut
    public Cellule() {
        PionActuel = null ; // case vide donc pas de jeton dans la case
        couleurAssociée = null;
        
    }
    
}  
   /* 
    public String analyse_coul(){
       
        if (couleurAssociée=="R") {
            return "R";
        }
        if (couleurAssociée=="Y") {
            return "Y";
        }
        if (couleurAssociée=="G") {
            return "G";
        }
        if (couleurAssociée=="B") {
             return "B";
         }
        if (couleurAssociée=="P") {
            return "P";
        }
        if (couleurAssociée=="O") {
            return "O";
        }
           
        
        return null;
        
    }
    public String analyse_ind(){
        if (Indice.get(i)=="W") {
                return "W";
            }
            if (Indice.get(i)=="B") {
                return "B";
            }
    }
}
*/
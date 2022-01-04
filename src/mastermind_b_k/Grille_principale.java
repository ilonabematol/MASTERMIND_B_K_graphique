/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_b_k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author mario
 */
public class Grille_principale {

    //ne pas oublier de créer le constructeur
    // création du tableau de l'ordi
    String[] tabOrdi = new String[4];// tableau comptenant le jeu aléatoire de l'ordinateuer ( celui que le joueur doit deviner)
    Random pions = new Random();// pions aléatoires qui sont généré pour la combinaison de l'ordinateur 
    //String[][] Joueur_combi= new String[12][4];
    // création du tableau de 6 couleur:
    String[] tabCouleur = new String[6];
    //ArrayList<String> Jeu_Joueur = new ArrayList<>();
    ArrayList<Boolean> Verif = new ArrayList<>();// arraylist  de booleans qui permet de comptabiliser quelle case a été analysée ou pas
    ArrayList<Integer> Indice = new ArrayList<>();// arraylist d'entier qui permet de donner des indices pour le joueur 
    String[] tabCoul2 = new String[6];
    String Case;
    //Cellule grilleColors[][]= new Cellule [12][4];

    // création du constructeur de tout le tableau
    //avec différentes cellules qu'on aura besoin de déterminer pour les différents indices des colonnes
    public Grille_principale() {
        tabCouleur[0] = "R";// affection de la couleur rouge
        tabCouleur[1] = "P";// rose/pink
        tabCouleur[2] = "G";//green 
        tabCouleur[3] = "Y";// jaune
        tabCouleur[4] = "O";// orange
        tabCouleur[5] = "B";// blue
        
        
        for (int i = 0; i < 48; i++) {
            //Jeu_Joueur.add(null);
            Verif.add(false);// on rempli le tableau de vérification de false pour commencer le jeu 
            Indice.add(-1);// on rajoute que des -1 correspondant au vide ( soit pas d'indicaion pour le joueur)
        }

    }

    /**
     * cette méthode permet de créer la combinaison aléatoire de l'ordinateur
     * avec 4 couleurs aléatoires parmi les 6 proposées
     *
     * @return *on retourne le tableau aléatoire qui a été généré
     */
    public String[] combinaisonaléatoire() {
        for (int i = 0; i < 4; i++) {
            int couleur = pions.nextInt(6);// on génère 6 numéros alétoires correspondant a des couleurs 
            tabOrdi[i] = tabCouleur[couleur];// on rempli le tableau de l'ordinateur avec les couleurs correspondantes
        }
        System.out.println(Arrays.toString(tabOrdi));// on affiche l'array correspondante
        

        return tabOrdi;
    }

    /**
     *
     * @param nbrecolor le numéro de la couleur proposée
     * @return le tableau des couleurs associé au numéro saisie
     */
    public String creation_Jeu_Joueur(int nbrecolor ){//, int indPion) {

        //Jeu_Joueur.add(tabCouleur[nbrecolor]);
        return tabCouleur[nbrecolor];// on associe les numéros saisie par l'utilisateur aux couleurs pour afficher sa combinaison

    }
    
    /**
     *cette méthode permet d'analyser le jeu du joueur et de lui donner des indices en fonction des différentes combinaisons qu'il a fait  
     * @param line la ligne en cours 
     * @param Jeu_Joueur 
     * @return des booleens en fonction de l'analyse du jeu du joueur  
     */
    public boolean analyse_Jeu_Joueur(int line, ArrayList<String> Jeu_Joueur) {//String[] tabJoueur ,
        // premiere boucle d'analyse concernant si bonne couleur + bon emplacement
        // a chaque passage de niveau(nouvel ligne) clear le tableau d'indice et même tout les autres ArrayList: --> l'affichage restera;
        // on n'a pas besoin de stocker les valeurs des ArrayList(sauf pour réafficher a chaque fois les niveaux du joueur
        //clear ArrayLists

        int col = line * 4;
        int compteur = 0;//on initialise un compteur pour compter les 4 choix de couleur du joueur 
        tabCoul2[0] = "R";// affection de la couleur rouge
        tabCoul2[1] = "P";// rose/pink
        tabCoul2[2] = "G";//green 
        tabCoul2[3] = "Y";// jaune
        tabCoul2[4] = "O";// orange
        tabCoul2[5] = "B";// blue
        for (int i = 0; i < 4; i++ ) {

            if (Jeu_Joueur.get(col+i)==tabOrdi[i]){// on verifie que les combinaisons du joueur sont identiques (en indice et en couleur) avec la cmbinaisn de l'ordinateur 
                if (Verif.get(col+i) != true) {// on verifie que la case n'a pa déja été traitée
                    Verif.set(col+i, true);// o rajoute un true pour que la case soi marquée comme traitée 
                    Indice.set(col+i, 0);// on ajoute un 0 dans le tbleau des indices car il y aune bonne couleur et le bon emplacement 
                    
                    compteur += 1;
                    //compteur pour savoir si 4 indices sont == a 4
                }
            }
        //System.out.println("1"+Verif.subList(col,col+4));
        //System.out.println(Indice.subList(col,col+4));
        }
        if (compteur == 4) {// toutes les couleurs on été saisies 
            //System.out.println("Vous avez Gagné!!!");
            //System.out.println("Le tableau indice de la forme/n" + Indice);
            //System.out.println(Verif);
            return true;
        }
        //deuxième boucle pour déterminer si on place des pions si seulement présence d'une bonne couleur
        
        
        
        for (int k = col; k < col + 4; k++) {
            if (Verif.get(k) != true) {// on verifie que la case n'a pa déja été traitée
                for (int j = 0; j < 4; j++) {// on parcours l'array list de la combinaison du joueur 
                    if (Jeu_Joueur.get(k) == tabOrdi[j]) {  // si on fait ca cela analyse tout le tableau array --> donc pas possible
                        int nb=line*4+j;
                         if (Verif.get(nb) != true){
                            for (int i = 0; i < 6; i++) {// on parcourt le tableau de base des couleurs 
                                if (tabCoul2[i] == tabOrdi[j]) {// on check si la culeur est bien dans le tableau 
                                    tabCoul2[i] = "NOP";// on remplace la couleur par nop pour ne pas la comptabiliser une deuxième fois pour les indices du joueur 
                                    Indice.set(k, 1);// sinon on rentre juste un 1// si identique boom on rajoute un 1 au  tableau des indices 
                                    Verif.set(k, true);// on valide que la case a été traitée 

                                    break;
                                }
                            } 
                         }
                    }
                   
                }//Verif.set(k, true);// on valide que la case a été traitée 
            }
        }
        for (int b=col;b<col+4; b++){
            Verif.set(b, true);// on valide que les cases de la ligne 'line' a été traitée 
        }
        //System.out.println("2"+Verif.subList(col, col+4));
        System.out.println(Indice.subList(col, col+4));
        return false;
    }
}

      
            
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_b_k;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class fenetre_de_jeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetre_de_jeu
     */
    Grille_principale obj1=new Grille_principale();
    ArrayList<Integer> Indice = new ArrayList<>(); 
    ArrayList<String> Jeu_Joueur=new ArrayList<String>();
    int compteurcoul;
    int ligne;
    int colonne;
    //Grille_principale grille= new Grille_principale() ;
    
    
    public fenetre_de_jeu() {
        initComponents();
        compteurcoul=0;
        ligne=-1;
        rappel.setVisible(false);
        pannel_couleurs.setVisible(false);
        panneau_affichage.setVisible(false);
        desactiveButton_col();
        desactiveButton_coul();
        //CelluleGraphique grilleColors[][]= new CelluleGraphique [12][4];
        
        
        /*
        for (int line=0 ; line <12 ; line ++){
            for (int column=0 ; column<4 ; column++){
               //Grille_principale coul=null;
               //
               grilleJeu.add(cellGraph);
               grilleJeu.repaint();
               
            }
        }
        
   */
    }
/*public
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grilleJeu = new javax.swing.JPanel();
        panneau_jeu = new javax.swing.JPanel();
        btn_start = new javax.swing.JButton();
        col4 = new javax.swing.JButton();
        col1 = new javax.swing.JButton();
        col2 = new javax.swing.JButton();
        col3 = new javax.swing.JButton();
        grilleAnalyse = new javax.swing.JPanel();
        panneau_affichage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        annonce = new javax.swing.JTextArea();
        pannel_couleurs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        col_red = new javax.swing.JButton();
        col_pink = new javax.swing.JButton();
        col_green = new javax.swing.JButton();
        col_yellow = new javax.swing.JButton();
        col_blue = new javax.swing.JButton();
        col_orange = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rappel = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleJeu.setBackground(new java.awt.Color(204, 204, 204));
        grilleJeu.setBorder(new javax.swing.border.MatteBorder(null));
        grilleJeu.setLayout(new java.awt.GridLayout(12, 4));
        getContentPane().add(grilleJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 400, 600));

        panneau_jeu.setBackground(new java.awt.Color(255, 204, 204));

        btn_start.setText("Démarrer");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_jeuLayout = new javax.swing.GroupLayout(panneau_jeu);
        panneau_jeu.setLayout(panneau_jeuLayout);
        panneau_jeuLayout.setHorizontalGroup(
            panneau_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_jeuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panneau_jeuLayout.setVerticalGroup(
            panneau_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 300, 50));

        col4.setText("4");
        col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col4ActionPerformed(evt);
            }
        });
        getContentPane().add(col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 40, 30));

        col1.setText("1");
        col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col1ActionPerformed(evt);
            }
        });
        getContentPane().add(col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 40, 30));

        col2.setText("2");
        col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col2ActionPerformed(evt);
            }
        });
        getContentPane().add(col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 30));

        col3.setText("3");
        col3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col3ActionPerformed(evt);
            }
        });
        getContentPane().add(col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 40, 30));

        grilleAnalyse.setBackground(new java.awt.Color(255, 204, 204));
        grilleAnalyse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grilleAnalyse.setToolTipText("");
        grilleAnalyse.setLayout(new java.awt.GridLayout(1, 2));
        getContentPane().add(grilleAnalyse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 150, 600));

        panneau_affichage.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("GAME");

        annonce.setColumns(20);
        annonce.setFont(new java.awt.Font("Vampire Wars", 2, 12)); // NOI18N
        annonce.setForeground(new java.awt.Color(51, 51, 0));
        annonce.setLineWrap(true);
        annonce.setRows(2);
        jScrollPane1.setViewportView(annonce);

        javax.swing.GroupLayout panneau_affichageLayout = new javax.swing.GroupLayout(panneau_affichage);
        panneau_affichage.setLayout(panneau_affichageLayout);
        panneau_affichageLayout.setHorizontalGroup(
            panneau_affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_affichageLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneau_affichageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panneau_affichageLayout.setVerticalGroup(
            panneau_affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_affichageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(panneau_affichage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 300, 120));

        pannel_couleurs.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Choix couleurs");

        col_red.setBackground(new java.awt.Color(255, 0, 51));
        col_red.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_red.setText("Rouge");
        col_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_redActionPerformed(evt);
            }
        });

        col_pink.setBackground(new java.awt.Color(255, 102, 255));
        col_pink.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_pink.setText("Rose");
        col_pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_pinkActionPerformed(evt);
            }
        });

        col_green.setBackground(new java.awt.Color(0, 204, 51));
        col_green.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_green.setText("Vert");
        col_green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_greenActionPerformed(evt);
            }
        });

        col_yellow.setBackground(new java.awt.Color(255, 255, 51));
        col_yellow.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_yellow.setText("Jaune");
        col_yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_yellowActionPerformed(evt);
            }
        });

        col_blue.setBackground(new java.awt.Color(102, 102, 255));
        col_blue.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_blue.setText("Bleu");
        col_blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_blueActionPerformed(evt);
            }
        });

        col_orange.setBackground(new java.awt.Color(255, 153, 0));
        col_orange.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        col_orange.setText("Orange");
        col_orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_orangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pannel_couleursLayout = new javax.swing.GroupLayout(pannel_couleurs);
        pannel_couleurs.setLayout(pannel_couleursLayout);
        pannel_couleursLayout.setHorizontalGroup(
            pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_couleursLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(col_red, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(col_pink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(col_green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(col_yellow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(col_orange, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(col_blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_couleursLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(68, 68, 68))
        );
        pannel_couleursLayout.setVerticalGroup(
            pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_couleursLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col_red)
                    .addComponent(col_yellow))
                .addGap(36, 36, 36)
                .addGroup(pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col_green)
                    .addComponent(col_blue))
                .addGap(38, 38, 38)
                .addGroup(pannel_couleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col_pink)
                    .addComponent(col_orange))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(pannel_couleurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 300, 240));

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel4.setText("MASTERMIND");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 170, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("CASE NOIRE : \n \tvous avez une bonne couleur \nCASE BLANCHE : \n         vous une bonne couleur au bon emplacement\n");
        rappel.setViewportView(jTextArea2);

        getContentPane().add(rappel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 300, 110));

        setBounds(0, 0, 1032, 695);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        rappel.setVisible(true);
        pannel_couleurs.setVisible(true);
        panneau_affichage.setVisible(true);
        initialiserPartie();
        annonce.setText("Le jeu commence: Séléctionnez une colonne");
        activeButton_col();
        for (int k=0;k<48;k++){
            Jeu_Joueur.add(null);
            
        }
        affichageGraph();
        
        grilleJeu.repaint();
        btn_start.setEnabled(false);//pour ne pas que l'on recommence toujours une partie - désactive le bouton
    }//GEN-LAST:event_btn_startActionPerformed

    private void col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col4ActionPerformed
        // TODO add your handling code here:
        placerDansColonne(4);
        desactiveButton_col();
        annonce.setText("Séléctionnez une couleur");
        
        /*
        if(finish==true){
            btn_col_1.setEnabled(false);
        }
        if (grilleJeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        JoueurSuivant();
        */
                 
    }//GEN-LAST:event_col4ActionPerformed

    private void col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col1ActionPerformed
        placerDansColonne(1);
        desactiveButton_col();
        annonce.setText("Séléctionnez une couleur");
    }//GEN-LAST:event_col1ActionPerformed

    private void col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col2ActionPerformed
        placerDansColonne(2);
        desactiveButton_col();
        annonce.setText("Séléctionnez une couleur");
    }//GEN-LAST:event_col2ActionPerformed

    private void col3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col3ActionPerformed
        placerDansColonne(3);
        desactiveButton_col();
        annonce.setText("Séléctionnez une couleur");
    }//GEN-LAST:event_col3ActionPerformed

    private void col_yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_yellowActionPerformed
        choixcoul(3);
    }//GEN-LAST:event_col_yellowActionPerformed

    private void col_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_redActionPerformed
        choixcoul(0);
    }//GEN-LAST:event_col_redActionPerformed

    private void col_greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_greenActionPerformed
        choixcoul(2);
    }//GEN-LAST:event_col_greenActionPerformed

    private void col_pinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_pinkActionPerformed
        choixcoul(1);
    }//GEN-LAST:event_col_pinkActionPerformed

    private void col_blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_blueActionPerformed
        choixcoul(5);
    }//GEN-LAST:event_col_blueActionPerformed

    private void col_orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_orangeActionPerformed
        choixcoul(4);
    }//GEN-LAST:event_col_orangeActionPerformed
    
    public int placerDansColonne(int col){
        colonne=col-1;
        int indplacement=ligneEncours()*4+colonne;
        activeButton_coul();
        return indplacement;
    }
   
        
       
    
    public int ligneEncours(){
        ligne+=1;
        return ligne;
    }
    
    public void affichageGraph(){
        for (int i=0;i<48;i++){
            CelluleGraphique cellGraph = new CelluleGraphique(Jeu_Joueur.get(i));
            grilleJeu.add(cellGraph);
            grilleJeu.repaint();
        }
    }
    
    public void activeButton_col(){
        col1.setEnabled(true);
        col2.setEnabled(true);
        col3.setEnabled(true);
        col4.setEnabled(true);
        
    }
    public void desactiveButton_col(){
        col1.setEnabled(false);
        col2.setEnabled(false);
        col3.setEnabled(false);
        col4.setEnabled(false);
        
    }
    public void activeButton_coul(){
        col_red.setEnabled(true);
        col_yellow.setEnabled(true);
        col_pink.setEnabled(true);
        col_blue.setEnabled(true);
        col_orange.setEnabled(true);
        col_green.setEnabled(true);
        
    }
    public void desactiveButton_coul(){
        col_red.setEnabled(false);
        col_yellow.setEnabled(false);
        col_pink.setEnabled(false);
        col_blue.setEnabled(false);
        col_orange.setEnabled(false);
        col_green.setEnabled(false);
        
        
    }
    public void choixcoul(int indcoul){
        desactiveButton_coul();
        compteurcoul+=1;
        Jeu_Joueur.set(4,"R");//obj1.creation_Jeu_Joueur(indcoul,4));
        affichageGraph();
        grilleJeu.repaint();
        if (compteurcoul==4){
            compteurcoul=0;
            
            if (obj1.analyse_Jeu_Joueur(ligneEncours())==true){
                grilleJeu.setVisible(false);
                grilleAnalyse.setVisible(false);
                annonce.setText("Vous avez gagné!!!");   
                }
            if (Jeu_Joueur.size()==4 ){
                
                grilleJeu.setVisible(false);
                grilleAnalyse.setVisible(false);
                annonce.setText("Vous avez perdu!!!");    
               
            }
            
    
        }
        annonce.setText("Séléctionnez une colonne");
        activeButton_col();
        affichageGraph();
        grilleJeu.repaint();
        

    }
    public void initialiserPartie(){
        obj1.combinaisonaléatoire();
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetre_de_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetre_de_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetre_de_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetre_de_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetre_de_jeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea annonce;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton col1;
    private javax.swing.JButton col2;
    private javax.swing.JButton col3;
    private javax.swing.JButton col4;
    private javax.swing.JButton col_blue;
    private javax.swing.JButton col_green;
    private javax.swing.JButton col_orange;
    private javax.swing.JButton col_pink;
    private javax.swing.JButton col_red;
    private javax.swing.JButton col_yellow;
    private javax.swing.JPanel grilleAnalyse;
    private javax.swing.JPanel grilleJeu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panneau_affichage;
    private javax.swing.JPanel panneau_jeu;
    private javax.swing.JPanel pannel_couleurs;
    private javax.swing.JScrollPane rappel;
    // End of variables declaration//GEN-END:variables
}


package view;

import model.Etudiant;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    //Declaration de laliste 
    public static  ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>();
    //Bonjours soulaymane
     
   
    public NewJFrame() {
        initComponents();
         setTitle("Gerr  Etudiant");
        setSize(1000,700);
        setResizable(false);
       //rendre le bouton modifier inactif
        bt_modifier.setEnabled(false);    
    }
    
    //Aficher La liste 
        public void afficher_Liste(){
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();

        model.setRowCount(0);
        
        for(Etudiant e: etudiant)
        {
            model.addRow(new Object[]{e.getMatricule(), e.getNom() , e.getSexe() , e.getNotemoyenne()});
            
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_moyenne = new javax.swing.JTextField();
        txt_matricule = new javax.swing.JTextField();
        txt_nomEtudiant = new javax.swing.JTextField();
        cb_sexe = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        bt_ajauter = new javax.swing.JButton();
        bt_modifier = new javax.swing.JButton();
        bt_suprimer = new javax.swing.JButton();
        bt_vider = new javax.swing.JButton();
        bt_trouver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        admis = new javax.swing.JButton();
        Echec = new javax.swing.JButton();
        Tous = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Moyenne General");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 220, 140, 20);

        jLabel2.setText("Nom etudiant");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 90, 140, 20);

        jLabel3.setText("Matricule Etudiant ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 40, 140, 20);

        jLabel4.setText("Sexe Etudiant");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 150, 140, 20);

        txt_moyenne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_moyenneActionPerformed(evt);
            }
        });
        getContentPane().add(txt_moyenne);
        txt_moyenne.setBounds(260, 210, 150, 40);

        txt_matricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_matricule);
        txt_matricule.setBounds(260, 30, 150, 40);

        txt_nomEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomEtudiantActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nomEtudiant);
        txt_nomEtudiant.setBounds(260, 80, 150, 40);

        cb_sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cb_sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sexeActionPerformed(evt);
            }
        });
        getContentPane().add(cb_sexe);
        cb_sexe.setBounds(300, 150, 43, 26);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        bt_ajauter.setText("Ajauter");
        bt_ajauter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ajauterMouseClicked(evt);
            }
        });
        bt_ajauter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajauterActionPerformed(evt);
            }
        });
        jPanel1.add(bt_ajauter);
        bt_ajauter.setBounds(20, 50, 120, 29);

        bt_modifier.setText("Modifier");
        bt_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifierMouseClicked(evt);
            }
        });
        bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifierActionPerformed(evt);
            }
        });
        jPanel1.add(bt_modifier);
        bt_modifier.setBounds(20, 110, 120, 29);

        bt_suprimer.setText("Suprimer");
        bt_suprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_suprimerMouseClicked(evt);
            }
        });
        jPanel1.add(bt_suprimer);
        bt_suprimer.setBounds(20, 170, 120, 29);

        bt_vider.setText("Vider");
        bt_vider.setToolTipText("");
        bt_vider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_viderMouseClicked(evt);
            }
        });
        bt_vider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_viderActionPerformed(evt);
            }
        });
        jPanel1.add(bt_vider);
        bt_vider.setBounds(20, 230, 120, 29);

        bt_trouver.setText("Trouver");
        bt_trouver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_trouverMouseClicked(evt);
            }
        });
        jPanel1.add(bt_trouver);
        bt_trouver.setBounds(20, 290, 120, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(610, 20, 160, 380);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        admis.setText("Admis");
        admis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admisMouseClicked(evt);
            }
        });
        admis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admisActionPerformed(evt);
            }
        });
        jPanel2.add(admis);
        admis.setBounds(30, 30, 100, 29);

        Echec.setText("Echec");
        Echec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EchecMouseClicked(evt);
            }
        });
        jPanel2.add(Echec);
        Echec.setBounds(170, 30, 100, 29);

        Tous.setText("Tous");
        Tous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TousMouseClicked(evt);
            }
        });
        Tous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TousActionPerformed(evt);
            }
        });
        jPanel2.add(Tous);
        Tous.setBounds(320, 30, 100, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 450, 450, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Matricule Etudiant", "Nom etudiant", "Sexe Etudiant", "Moyen General"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 500, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_moyenneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_moyenneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_moyenneActionPerformed

    private void txt_matriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculeActionPerformed

    private void txt_nomEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomEtudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomEtudiantActionPerformed

    private void cb_sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_sexeActionPerformed

    private void bt_ajauterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajauterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ajauterActionPerformed

    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modifierActionPerformed

    private void bt_viderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_viderActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_bt_viderActionPerformed

    private void admisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admisActionPerformed

    private void TousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TousActionPerformed

    private void bt_ajauterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ajauterMouseClicked
        // TODO add your handling code here:
        try {
                
         String  Matricule = txt_matricule.getText().trim() ;
         String  Nom       = txt_nomEtudiant.getText().trim();
         float Notemoyenne = Float.parseFloat(txt_moyenne.getText()) ;
             char Sexe = cb_sexe.getSelectedItem().toString().charAt(0);

         
         if(txt_matricule.getText().isEmpty()   == false  && 
            txt_nomEtudiant.getText().isEmpty() == false  &&
             (Sexe=='F' || Sexe =='M' )    &&
             txt_moyenne.getText().isEmpty() == false     &&
                 Notemoyenne >= 0 && Notemoyenne <= 20  )

                
         {   
             
             Etudiant etd = new  Etudiant(Matricule , Nom , Notemoyenne ,Sexe);
             etudiant.add(etd);
         }
         
         
            
        } catch (Exception e) {
        }
        afficher_Liste();
        bt_viderMouseClicked(evt);
        
    }//GEN-LAST:event_bt_ajauterMouseClicked

    private void bt_viderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_viderMouseClicked
        // TODO add your handling code here:
                 
        try {
            for(Etudiant e : etudiant){
                
                txt_matricule.setText(null);
                txt_nomEtudiant.setText(null);
                txt_moyenne.setText(null);
                cb_sexe.setSelectedIndex(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_viderMouseClicked

    private void bt_modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifierMouseClicked
        // TODO add your handling code here:
         try
        {
           for(Etudiant e : etudiant) 
           {
             if(e.getMatricule().equals(txt_matricule.getText()))
               
             {
       if(JOptionPane.showConfirmDialog(this,"Voulez-vous valider la modification","Confirlation",JOptionPane.YES_NO_OPTION)
               == JOptionPane.YES_OPTION) 
                    {
                        e.setNom(txt_nomEtudiant.getText());
                        e.setSexe(cb_sexe.getSelectedItem().toString().charAt(0));
                        e.setNotemoyenne(Float.parseFloat(txt_moyenne.getText()));
                 break;
             }
           }            
           }  
        }catch(Exception ex){ JOptionPane.showMessageDialog(this, "Veuillez verifier les informations");}
        bt_modifier.setEnabled(false);
        afficher_Liste();
         bt_viderMouseClicked(evt);
        
        
    }//GEN-LAST:event_bt_modifierMouseClicked

    private void bt_suprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_suprimerMouseClicked
        // TODO add your handling code here:
        try {
            
          String cd = JOptionPane.showInputDialog(this, "Entrer le code etudiant à supprimer :");
          for(Etudiant e : etudiant)
         {
             
            if(e.getMatricule().equals(cd))
            {
                 if(JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer ce salarié", "Confirmation", JOptionPane.YES_NO_OPTION)
                             == JOptionPane.YES_OPTION)
                    { 
                        etudiant.remove(e);
                        bt_viderMouseClicked(evt);
                    }
                    break;
            }
            }
                        
        }catch(Exception ex){}

        afficher_Liste();
 
        
    }//GEN-LAST:event_bt_suprimerMouseClicked

    private void bt_trouverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_trouverMouseClicked
        // TODO add your handling code here:
         
        try {
            String cd = JOptionPane.showInputDialog(this, "Entrer le matricule Etudiant");
            for(Etudiant e: etudiant){
                if(e.getMatricule().equals(cd))
                {
                    txt_matricule.setText(e.getMatricule());
                    txt_nomEtudiant.setText(e.getNom());
                    txt_moyenne.setText(String.valueOf(e.getNotemoyenne()));
                    cb_sexe.setSelectedItem(e.getSexe());
                    
        
                }
         
            }
            
            
        } catch (Exception e) {
        }
        afficher_Liste();
        
        
        
    }//GEN-LAST:event_bt_trouverMouseClicked

    private void admisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admisMouseClicked
        // TODO add your handling code here:
        
        
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         // Efface les anciennes données
           model.setRowCount(0);
    for (Etudiant etd : etudiant) {
        if (etd.getNotemoyenne()>= 10) { // Filtre les étudiants admis
            model.addRow(new Object[]{
                etd.getMatricule(),
                etd.getNom(),
                etd.getNotemoyenne(),
                etd.getSexe()
            });
        }
    }
    }//GEN-LAST:event_admisMouseClicked

    private void EchecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EchecMouseClicked
        // TODO add your handling code here
            
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         // Efface les anciennes données
           model.setRowCount(0);
    for (Etudiant etd : etudiant) {
        if (etd.getNotemoyenne() <10) {
            model.addRow(new Object[]{
                etd.getMatricule(),
                etd.getNom(),
                etd.getNotemoyenne(),
                etd.getSexe()
            });
        }
    }
    }//GEN-LAST:event_EchecMouseClicked

    private void TousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TousMouseClicked
        // TODO add your handling code here
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
    model.setRowCount(0); // Efface les anciennes données

    for (Etudiant etd : etudiant) {
        model.addRow(new Object[]{
            etd.getMatricule(),
            etd.getNom(),
            etd.getNotemoyenne(),
            etd.getSexe()
        });
    }
    }//GEN-LAST:event_TousMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Echec;
    private javax.swing.JButton Tous;
    private javax.swing.JButton admis;
    private javax.swing.JButton bt_ajauter;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JButton bt_suprimer;
    private javax.swing.JButton bt_trouver;
    private javax.swing.JButton bt_vider;
    private javax.swing.JComboBox<String> cb_sexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_matricule;
    private javax.swing.JTextField txt_moyenne;
    private javax.swing.JTextField txt_nomEtudiant;
    // End of variables declaration//GEN-END:variables
}

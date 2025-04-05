/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswing;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;


import javax.swing.JOptionPane;

/**
 *
 * @author ok_re
 */
public class tablerowsave extends javax.swing.JFrame {

    /**
     * Creates new form sqljava
     */
    public tablerowsave() {
        initComponents();
    }

    ///////////
    Connection con ;
    //String accno = txtAcc.getText();
    //String balance = txtBal.getText();
    PreparedStatement pst ;
    ResultSet rs;
    /// SQL Connection
    public Connection getConnection() {
        System.out.println("Tentative de connexion à la base de données...");
        
        try {
            // Chargement du driver PostgreSQL
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver PostgreSQL chargé avec succès.");

            // Connexion à la base de données
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AUTOSCRIPT", "postgres", "Farid@@0670");
            
            System.out.println("Connexion à la base de données réussie !");

        } catch (Exception e) {
            System.out.println("Erreur lors de la connexion : " + e.getMessage());
            System.out.println("Erreur : Connexion à la base de données échouée !");
        }

        return con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "ID_CLIENT", "NOM_CLIENT", "TEL_CLIENT", "EMAIL", "..." } // Ajuste selon ta table
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("id_client");

        txtAcc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAcc.setText("AH-1046593");
        txtAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Result find");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Blance");

        txtBal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "ID_CLIENT", "NOM_CLIENT", "TEL_CLIENT", "EMAIL", "..." } // Ajuste selon ta table
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String accno = txtAcc.getText().trim();

    if (con == null) {
        con = getConnection();  // Connexion à la base de données
    }

    if (con == null) {
        JOptionPane.showMessageDialog(this, "Connexion à la base de données échouée !");
        return;
    }

    try {
        // Séparer les ID par la virgule
        String[] ids = accno.split(",");
        for (int i = 0; i < ids.length; i++) {
            ids[i] = ids[i].trim().replaceAll("['\"]", ""); // Nettoyage de chaque ID
        }

        // Construire la requête dynamique
        String placeholders = String.join(",", Collections.nCopies(ids.length, "?"));
        String sql = "SELECT * FROM \"AUTO_S\".\"TB_CLIENT\" WHERE \"ID_CLIENT\" IN (" + placeholders + ")";
        pst = con.prepareStatement(sql);

        // Injecter les valeurs dans le PreparedStatement
        for (int i = 0; i < ids.length; i++) {
            pst.setString(i + 1, ids[i]);
        }

        rs = pst.executeQuery();

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Colonnes
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        // Lignes
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        jTable1.setModel(model); // Affichage dans le tableau

    } catch (SQLException ex) {
        Logger.getLogger(tablerowsave.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Erreur lors de l'exécution de la requête SQL : " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String fichierCSV = "clients.csv";
    DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

    if (model1.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Le tableau jTable1 est vide !");
        return;
    }

    // ==== ÉTAPE 1 : Sauvegarder les données dans le fichier CSV ====
    File file = new File(fichierCSV);
    boolean fichierExistant = file.exists() && file.length() > 0;

    try (FileWriter csvWriter = new FileWriter(file, true)) {
        if (!fichierExistant) {
            // Écrire les en-têtes
            for (int i = 0; i < model1.getColumnCount(); i++) {
                csvWriter.append(model1.getColumnName(i));
                if (i < model1.getColumnCount() - 1) csvWriter.append(",");
            }
            csvWriter.append("\n");
        }

        // Écrire les lignes
        for (int i = 0; i < model1.getRowCount(); i++) {
            for (int j = 0; j < model1.getColumnCount(); j++) {
                Object value = model1.getValueAt(i, j);
                csvWriter.append(value != null ? value.toString() : "");
                if (j < model1.getColumnCount() - 1) csvWriter.append(",");
            }
            csvWriter.append("\n");
        }

        csvWriter.flush();
        JOptionPane.showMessageDialog(this, "Données enregistrées dans le fichier CSV.");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de l'écriture dans le fichier : " + ex.getMessage());
        return;
    }

    // ==== ÉTAPE 2 : Vider jTable1 ====
    model1.setRowCount(0);

    // ==== ÉTAPE 3 : Lire le CSV et afficher dans jTable2 ====
    try (BufferedReader br = new BufferedReader(new FileReader(fichierCSV))) {
        String ligne;
        DefaultTableModel model2 = new DefaultTableModel();
        boolean headerAjoute = false;

        while ((ligne = br.readLine()) != null) {
            String[] valeurs = ligne.split(",");

            if (!headerAjoute) {
                model2.setColumnIdentifiers(valeurs);
                headerAjoute = true;
            } else {
                model2.addRow(valeurs);
            }
        }

        jTable2.setModel(model2);
        JOptionPane.showMessageDialog(this, "Données du fichier CSV affichées dans jTable2.");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la lecture du fichier CSV : " + ex.getMessage());
    }    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tablerowsave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablerowsave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablerowsave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablerowsave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablerowsave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAcc;
    private javax.swing.JTextField txtBal;
    // End of variables declaration//GEN-END:variables
}

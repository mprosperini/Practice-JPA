package com.myfirstjava.petgroomingsalon.gui;

import com.myfirstjava.petgroomingsalon.logic.ControllerLogic;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class SubmitData extends javax.swing.JFrame {

    // ---------- added conection between GUI and LOGIC MPC -------------// 
    ControllerLogic controllerLogic = new ControllerLogic();
    // ----------------------------------------------------------------------------------------//
    
    public SubmitData() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPetName = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtRace = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerCellPhone = new javax.swing.JTextField();
        txtClientNumber = new javax.swing.JTextField();
        cmbAlergic = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        btnClean = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setText("SUBMIT DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 250, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Race:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setText("Owner Cell Phone:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel5.setText("Cliente #:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, -1, -1));

        jLabel6.setText("Color:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setText("Alergic:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setText("Owner Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel10.setText("Notes:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txtPetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPetNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtPetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 410, -1));

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 410, -1));

        txtRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaceActionPerformed(evt);
            }
        });
        jPanel2.add(txtRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 410, -1));

        txtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtOwnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 410, -1));

        txtOwnerCellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerCellPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtOwnerCellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 410, -1));

        txtClientNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtClientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 410, -1));

        cmbAlergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "YES", "NO" }));
        jPanel2.add(cmbAlergic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 480, 160));

        btnClean.setIcon(new javax.swing.ImageIcon("/home/lancer5500ryz/NetBeansProjects/PetGroomingSalon/src/main/resources/images/icons8-broom-25.png")); // NOI18N
        btnClean.setText("CLEAN");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel2.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 120, 40));

        btnSave.setIcon(new javax.swing.ImageIcon("/home/lancer5500ryz/NetBeansProjects/PetGroomingSalon/src/main/resources/images/icons8-save-25.png")); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 870, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
       txtClientNumber.setText("");
       txtColor.setText("");
       txtPetName.setText("");
       txtNotes.setText("");
       txtOwnerCellPhone.setText("");
       txtOwnerName.setText("");
       txtRace.setText("");
       cmbAlergic.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtClientNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNumberActionPerformed

    private void txtOwnerCellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerCellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerCellPhoneActionPerformed

    private void txtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameActionPerformed

    private void txtRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaceActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtPetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPetNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String pet_name = txtPetName.getText();
        String pet_race = txtRace.getText();
        String owner_name = txtOwnerName.getText();
        String owner_cell = txtOwnerCellPhone.getText();
        String notes = txtNotes.getText();
        String pet_color = txtColor.getText();
        String client_id = txtClientNumber.getText();
        String alergic = (String) cmbAlergic.getSelectedItem();
        
        controllerLogic.save(pet_name, pet_race, owner_name, owner_cell, notes, pet_color, client_id, alergic);
        
        //Creating Pop Up Dialog when saving//
        JOptionPane optionPane = new JOptionPane("Changes Saved Sucesfully");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Save Sucesfull");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbAlergic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtClientNumber;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtOwnerCellPhone;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtPetName;
    private javax.swing.JTextField txtRace;
    // End of variables declaration//GEN-END:variables
}
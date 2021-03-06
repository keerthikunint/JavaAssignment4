/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPatient;

import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author keerthikeerthi
 */
public class PatientManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerWorkAreaJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public PatientManagerWorkAreaJPanel(JPanel userProcessContainer,
            PersonDirectory personDirectory ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.personDirectory= personDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managePatientsJButton = new javax.swing.JButton();
        manageVitalSignsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        managePatientsJButton.setText("Manage Patients");
        managePatientsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsJButtonActionPerformed(evt);
            }
        });

        manageVitalSignsJButton.setText("Manage Vital Signs");
        manageVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageVitalSignsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePatientsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePatientsJButton)
                .addGap(18, 18, 18)
                .addComponent(manageVitalSignsJButton)
                .addContainerGap(619, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePatientsJPanel mpJPanel= 
                new ManagePatientsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientsJButtonActionPerformed

    private void manageVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsJPanel mvsJPanel= 
                new ManageVitalSignsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mvsJPanel", mvsJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton managePatientsJButton;
    private javax.swing.JButton manageVitalSignsJButton;
    // End of variables declaration//GEN-END:variables
}
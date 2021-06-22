/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.VitalSign;
import Model.VitalSignHistory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rutuja
 */
public class ViewVitalSignPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignPanel
     */
    private JPanel userProcessContainer;
    private VitalSignHistory vitalSignHistory;
    private VitalSign vitalSign;
    private String time;
    
    public ViewVitalSignPanel(VitalSign vitalSign, JPanel userProcessContainer) {
        initComponents();
        this.setSize(2000,2000);
        respRateTextField.setText(String.valueOf(vitalSign.getRespRate()));
        heartRateTextField.setText(String.valueOf(vitalSign.getHeartRate()));
        bpTextField.setText(String.valueOf(vitalSign.getBp()));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        bpTextField = new javax.swing.JTextField();
        heartRateTextField = new javax.swing.JTextField();
        respRateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 199, 199));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Systolic Blood Pressure:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 191, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Heart Rate:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 245, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 245, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Patient VitalSign Record");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 780, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Respiration Rate:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        saveBtn.setBackground(new java.awt.Color(255, 255, 204));
        saveBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 245, -1, -1));

        bpTextField.setEditable(false);
        add(bpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, -1));

        heartRateTextField.setEditable(false);
        add(heartRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 110, -1));

        respRateTextField.setEditable(false);
        respRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respRateTextFieldActionPerformed(evt);
            }
        });
        add(respRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 110, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Time of detail entered:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 304, -1, -1));
        add(timeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 182, 16));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        respRateTextField.setEditable(true);
        heartRateTextField.setEditable(true);
        bpTextField.setEditable(true);

        saveBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length  - 1];
        
        ViewPatientPanel viewPatientPanel = (ViewPatientPanel)component;
        viewPatientPanel.populateTable();
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        vitalSignHistory.getVitalSignList().remove(vitalSign);

        Timestamp timeStamp = new Timestamp(new Date().getTime());
        time = String.valueOf(timeStamp);
        timeTextField.setText(String.valueOf(time));

            if(respRateTextField.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Respiration Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                respRateTextField.setBackground(Color.yellow);
            }
            else if(!respRateTextField.getText().matches( "^(\\d+\\.)? \\d+$"))  {
                JOptionPane.showMessageDialog(this, "Respiration Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                respRateTextField.setBackground(Color.yellow);
            }
            else if(heartRateTextField.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Heart Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                heartRateTextField.setBackground(Color.yellow);
            }
            else if(!heartRateTextField.getText().matches("^(\\d+\\.)?\\d+$"))  {
                JOptionPane.showMessageDialog(this, "Heart Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                heartRateTextField.setBackground(Color.yellow);
            }
            else if(bpTextField.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Blood Pressure cannot be blank!", "Error", JOptionPane.OK_OPTION);
                bpTextField.setBackground(Color.yellow);
            }
            else if(!bpTextField.getText().matches("^(\\d+\\.)?\\d+$"))  {
                JOptionPane.showMessageDialog(this, "Blood Pressure can only have digits!", "Error", JOptionPane.OK_OPTION);
                bpTextField.setBackground(Color.yellow);
            }
            
            else    {

                VitalSign vitalSign = vitalSignHistory.addVitalSign();

                vitalSign.setRespRate(Float.parseFloat(respRateTextField.getText()));
                vitalSign.setHeartRate(Float.parseFloat(heartRateTextField.getText()));
                vitalSign.setBp(Float.parseFloat(bpTextField.getText()));
                vitalSign.setTime(time);

                JOptionPane.showMessageDialog(this, "VitalSign Record is successfully saved!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void respRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respRateTextFieldActionPerformed
        //
    }//GEN-LAST:event_respRateTextFieldActionPerformed
        public void resetFields()   {
     
        respRateTextField.setText("");
        heartRateTextField.setText("");
        bpTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField respRateTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel timeTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

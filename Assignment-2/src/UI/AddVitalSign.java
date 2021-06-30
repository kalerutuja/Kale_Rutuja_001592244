/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Patient;
import Model.VitalSign;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JPanel;
import Model.VitalSignHistory;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author rutuja
 */
public class AddVitalSign extends javax.swing.JPanel {

    /**
     * Creates new form AddVitalSign
     */
    private String time;
    private int AgeGroup;
    private JPanel userProcessContainer;
    private Patient patient;
    private VitalSignHistory vitalSignHistory;
    
    
    public AddVitalSign(Patient patient, JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.setSize(2000,2000);

        
        vitalSignHistory = this.patient.getVitalSignHistory();
        
        AgeGroup = patient.getAgeGroup();
        
        Timestamp timeStamp = new Timestamp(new Date().getTime());
        time = String.valueOf(timeStamp);
        timeTextField.setText(String.valueOf(time));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpatientrecord = new javax.swing.JLabel();
        rratelbl = new javax.swing.JLabel();
        hratelbl = new javax.swing.JLabel();
        bplbl = new javax.swing.JLabel();
        txtRrate = new javax.swing.JTextField();
        txtHrate = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnHint = new javax.swing.JButton();
        lbltimeStamp = new javax.swing.JLabel();
        timeTextField = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        RRatelbl = new javax.swing.JLabel();
        HRatelbl = new javax.swing.JLabel();
        BPlbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 199, 199));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpatientrecord.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblpatientrecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpatientrecord.setText("Patient Vital Sign Record");
        add(lblpatientrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        rratelbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        rratelbl.setText("Respiration rate:");
        add(rratelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, -1));

        hratelbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        hratelbl.setText("Heart rate:");
        add(hratelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        bplbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        bplbl.setText("Blood pressure:");
        add(bplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, -1));

        txtRrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRrateActionPerformed(evt);
            }
        });
        add(txtRrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, -1));
        add(txtHrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, -1));
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        btnHint.setText("Hint");
        btnHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHintActionPerformed(evt);
            }
        });
        add(btnHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        lbltimeStamp.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lbltimeStamp.setText("Time of detail entered:");
        add(lbltimeStamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        add(timeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 200, 20));
        add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 100, 20));
        add(RRatelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 20));
        add(HRatelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, 20));
        add(BPlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 100, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Timestamp timeStamp = new Timestamp(new Date().getTime());
        time = String.valueOf(timeStamp);
        timeTextField.setText(String.valueOf(time));

        if(AgeGroup == 0)    {
            JOptionPane.showMessageDialog(this, "Please Enter Patient details!!", "Error", JOptionPane.OK_OPTION);
            resetFields();
        }
        else    {
            if(txtRrate.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Respiration Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                txtRrate.setBackground(Color.red);
            }
            else if(!txtRrate.getText().matches("^(\\d+\\.)?\\d+$"))  {
                JOptionPane.showMessageDialog(this, "Respiration Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                txtRrate.setBackground(Color.red);
            }
            else if(txtHrate.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Heart Rate cannot be blank!", "Error", JOptionPane.OK_OPTION);
                txtHrate.setBackground(Color.red);
            }
            else if(!txtHrate.getText().matches("^(\\d+\\.)?\\d+$"))  {
                JOptionPane.showMessageDialog(this, "Heart Rate can only have digits!", "Error", JOptionPane.OK_OPTION);
                txtHrate.setBackground(Color.red);
            }
            else if(txtBP.getText().trim().isEmpty())    {
                JOptionPane.showMessageDialog(this, "Blood Pressure cannot be blank!", "Error", JOptionPane.OK_OPTION);
                txtBP.setBackground(Color.red);
            }
            else if(!txtBP.getText().matches("^(\\d+\\.)?\\d+$"))  {
                JOptionPane.showMessageDialog(this, "Blood Pressure can only have digits!", "Error", JOptionPane.OK_OPTION);
                txtBP.setBackground(Color.red);
            }
           
            else    {

                VitalSign vitalSign = vitalSignHistory.addVitalSign();

                vitalSign.setRespRate(Float.parseFloat(txtRrate.getText()));
                vitalSign.setHeartRate(Float.parseFloat(txtHrate.getText()));
                vitalSign.setBp(Float.parseFloat(txtBP.getText()));
                vitalSign.setTime(time);

                JOptionPane.showMessageDialog(this, "VitalSign Record is successfully saved!", "Information", JOptionPane.INFORMATION_MESSAGE);
                resetFields();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHintActionPerformed
        // TODO add your handling code here:
        Status.setText("Normal Status");

        if((AgeGroup >= 1) && (AgeGroup <= 3)) {
            RRatelbl.setText("20-30");
            HRatelbl.setText("80-130");
            BPlbl.setText("80-110");
        }
        else if((AgeGroup >= 4) && (AgeGroup <= 5)) {
            RRatelbl.setText("20-30");
            HRatelbl.setText("80-120");
            BPlbl.setText("80-110");
        }
        else if((AgeGroup >= 6) && (AgeGroup <= 12)) {
            RRatelbl.setText("20-30");
            HRatelbl.setText("70-110");
            BPlbl.setText("80-120");
        }
        else  {
            RRatelbl.setText("12-20");
            HRatelbl.setText("55-105");
            BPlbl.setText("110-120");
        }
    }//GEN-LAST:event_btnHintActionPerformed

    private void txtRrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRrateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPlbl;
    private javax.swing.JLabel HRatelbl;
    private javax.swing.JLabel RRatelbl;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel bplbl;
    private javax.swing.JButton btnHint;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel hratelbl;
    private javax.swing.JLabel lblpatientrecord;
    private javax.swing.JLabel lbltimeStamp;
    private javax.swing.JLabel rratelbl;
    private javax.swing.JLabel timeTextField;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtHrate;
    private javax.swing.JTextField txtRrate;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
        txtRrate.setText("");
            txtRrate.setBackground(Color.white);
            txtHrate.setText("");
            txtHrate.setBackground(Color.white);
            txtBP.setText("");
            txtBP.setBackground(Color.white);
            
    }
}

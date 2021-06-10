/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSignHistory;
import model.VitalSigns;

/**
 *
 * @author rutuja
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    VitalSignHistory vitalhistory;
    public ViewJPanel(VitalSignHistory vitalhistory) {
        initComponents();
        this.vitalhistory= vitalhistory;
        populatetabel();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewpanellbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvitalsign = new javax.swing.JTable();
        ViewVitalbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        viewtemplbl = new javax.swing.JLabel();
        viewbplbl = new javax.swing.JLabel();
        viewpulselbl = new javax.swing.JLabel();
        viewdatelbl = new javax.swing.JLabel();
        viewtemptxt = new javax.swing.JTextField();
        viewbptxt = new javax.swing.JTextField();
        viewpulsetxt = new javax.swing.JTextField();
        viewdatetxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(243, 206, 206));

        viewpanellbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewpanellbl.setText("View Vital Sign");

        tblvitalsign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Tempreture", "Pulse"
            }
        ));
        jScrollPane1.setViewportView(tblvitalsign);

        ViewVitalbtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ViewVitalbtn.setText("View VitalSigns");
        ViewVitalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVitalbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deletebtn.setText("Delete VitalSIgns");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        viewtemplbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewtemplbl.setText("Tempreture:");

        viewbplbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewbplbl.setText("Blood Pressure:");

        viewpulselbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewpulselbl.setText("Pulse:");

        viewdatelbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewdatelbl.setText("Date:");

        viewtemptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtemptxtActionPerformed(evt);
            }
        });

        viewbptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbptxtActionPerformed(evt);
            }
        });

        viewpulsetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpulsetxtActionPerformed(evt);
            }
        });

        viewdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdatetxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewpanellbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(126, Short.MAX_VALUE)
                                .addComponent(ViewVitalbtn)
                                .addGap(31, 31, 31)
                                .addComponent(deletebtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewtemplbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewbplbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewpulselbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewdatelbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewpulsetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(viewdatetxt)
                    .addComponent(viewbptxt)
                    .addComponent(viewtemptxt))
                .addGap(167, 167, 167))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ViewVitalbtn, deletebtn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {viewbptxt, viewdatetxt, viewpulsetxt, viewtemptxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(viewpanellbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewVitalbtn)
                    .addComponent(deletebtn))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtemplbl)
                    .addComponent(viewtemptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewbplbl)
                    .addComponent(viewbptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewpulselbl)
                    .addComponent(viewpulsetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewdatelbl)
                    .addComponent(viewdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ViewVitalbtn, deletebtn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {viewbptxt, viewdatetxt, viewpulsetxt, viewtemptxt});

    }// </editor-fold>//GEN-END:initComponents

    private void ViewVitalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVitalbtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblvitalsign.getSelectedRow();
       
       if (selectedRowIndex<0){
           JOptionPane.showMessageDialog(this, "please select a row to delete.");
           return;
       }
       
      DefaultTableModel model = (DefaultTableModel)tblvitalsign.getModel();
      VitalSigns vitals = (VitalSigns) model.getValueAt(selectedRowIndex, 0);
      viewtemptxt.setText(String.valueOf(vitals.getTemperature()));
      viewbptxt.setText(String.valueOf(vitals.getBloodPressure()));
      viewpulsetxt.setText(String.valueOf(vitals.getPulse()));
      viewdatetxt.setText(String.valueOf(vitals.getDate()));
      
      
    }//GEN-LAST:event_ViewVitalbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblvitalsign.getSelectedRow();
       
       if (selectedRowIndex<0){
           JOptionPane.showMessageDialog(this, "please select a row to delete.");
           return;
    }//GEN-LAST:event_deletebtnActionPerformed
        ((DefaultTableModel)tblvitalsign.getModel()).removeRow(selectedRowIndex);
        vitalhistory.deleteVitals(selectedRowIndex);
        JOptionPane.showMessageDialog(this, "Vital sign deleted.");
    }       
    
    private void viewtemptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtemptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewtemptxtActionPerformed

    private void viewbptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewbptxtActionPerformed

    private void viewpulsetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpulsetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewpulsetxtActionPerformed

    private void viewdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewdatetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewVitalbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvitalsign;
    private javax.swing.JLabel viewbplbl;
    private javax.swing.JTextField viewbptxt;
    private javax.swing.JLabel viewdatelbl;
    private javax.swing.JTextField viewdatetxt;
    private javax.swing.JLabel viewpanellbl;
    private javax.swing.JLabel viewpulselbl;
    private javax.swing.JTextField viewpulsetxt;
    private javax.swing.JLabel viewtemplbl;
    private javax.swing.JTextField viewtemptxt;
    // End of variables declaration//GEN-END:variables

    private void populatetabel() {
        DefaultTableModel model = (DefaultTableModel) tblvitalsign.getModel();
        model.setRowCount(0);
        
        for (VitalSigns vs : vitalhistory.getHistory()){
          
            Object[] row = new Object[3];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getPulse();
            
            
            model.addRow(row);
        }
    }
}
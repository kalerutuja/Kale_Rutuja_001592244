/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.PersonInfo;

/**
 *
 * @author rutuja
 */
public class ViewMedicalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedicalJPanel
     */
    PersonInfo personinfo;
    public ViewMedicalJPanel(PersonInfo personinfo) {
        initComponents();
        this.personinfo= personinfo;
        this.setSize(2000,2000);
        displayperson();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allr2txt = new javax.swing.JTextField();
        allr3lbl = new javax.swing.JLabel();
        allr3txt = new javax.swing.JTextField();
        medicallbl = new javax.swing.JLabel();
        mednumlbl = new javax.swing.JLabel();
        allr1lbl = new javax.swing.JLabel();
        allr2lbl = new javax.swing.JLabel();
        mednumtxt = new javax.swing.JTextField();
        allr1txt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 219, 219));

        allr2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allr2txtActionPerformed(evt);
            }
        });

        allr3lbl.setText("Allergy 3");

        allr3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allr3txtActionPerformed(evt);
            }
        });

        medicallbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        medicallbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicallbl.setText("Medical Record Information");

        mednumlbl.setText("Medical Record Number ");

        allr1lbl.setText("Allergy 1");

        allr2lbl.setText("Allergy 2");

        mednumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mednumtxtActionPerformed(evt);
            }
        });

        allr1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allr1txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allr3lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mednumlbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(allr1lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(allr2lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mednumtxt)
                    .addComponent(allr1txt)
                    .addComponent(allr2txt)
                    .addComponent(allr3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(medicallbl)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mednumlbl)
                    .addComponent(mednumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allr1lbl)
                    .addComponent(allr1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allr2lbl)
                    .addComponent(allr2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allr3lbl)
                    .addComponent(allr3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void allr1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allr1txtActionPerformed
        // TODO add your handling code here:
        allr1txt.setEditable(false);
    }//GEN-LAST:event_allr1txtActionPerformed

    private void allr2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allr2txtActionPerformed
        // TODO add your handling code here:
        allr2txt.setEditable(false);
    }//GEN-LAST:event_allr2txtActionPerformed

    private void allr3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allr3txtActionPerformed
        // TODO add your handling code here:
        allr3txt.setEditable(false);
    }//GEN-LAST:event_allr3txtActionPerformed

    private void mednumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mednumtxtActionPerformed
        // TODO add your handling code here:
        mednumtxt.setEditable(false);
    }//GEN-LAST:event_mednumtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allr1lbl;
    private javax.swing.JTextField allr1txt;
    private javax.swing.JLabel allr2lbl;
    private javax.swing.JTextField allr2txt;
    private javax.swing.JLabel allr3lbl;
    private javax.swing.JTextField allr3txt;
    private javax.swing.JLabel medicallbl;
    private javax.swing.JLabel mednumlbl;
    private javax.swing.JTextField mednumtxt;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        mednumtxt.setText(personinfo.getMedicalRecordNum());
        allr1txt.setText(personinfo.getAlergy1());
        allr2txt.setText(personinfo.getAlergy2());
        allr3txt.setText(personinfo.getAlergy3());
    }
}

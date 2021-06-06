/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.PersonInfo;
import javax.swing.JOptionPane;


/**
 *
 * @author rutuja
 */
public class AddressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddressJPanel
     */
    PersonInfo personinfo;
    public AddressJPanel(PersonInfo personinfo) {
        initComponents();
        this.setSize(2000, 2000);
        this.personinfo = personinfo;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Addrlbl = new javax.swing.JLabel();
        Strlbl = new javax.swing.JLabel();
        Citylbl = new javax.swing.JLabel();
        Statelbl = new javax.swing.JLabel();
        ziplbl = new javax.swing.JLabel();
        streettxt = new javax.swing.JTextField();
        citytxt = new javax.swing.JTextField();
        statetxt = new javax.swing.JTextField();
        ziptxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(255, 219, 219));

        Addrlbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Addrlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addrlbl.setText("Addresss Information");

        Strlbl.setText("Street Address:");

        Citylbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Citylbl.setText("City:");

        Statelbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Statelbl.setText("State:");

        ziplbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ziplbl.setText("Zip:");

        streettxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streettxtActionPerformed(evt);
            }
        });

        citytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citytxtActionPerformed(evt);
            }
        });

        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Addrlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Strlbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Citylbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Statelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ziplbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(savebtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(streettxt)
                    .addComponent(citytxt)
                    .addComponent(statetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(ziptxt))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Citylbl, Statelbl, Strlbl, ziplbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Addrlbl)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Strlbl)
                    .addComponent(streettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Citylbl)
                    .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Statelbl)
                    .addComponent(statetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ziplbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ziptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(savebtn)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Citylbl, Statelbl, Strlbl, ziplbl});

    }// </editor-fold>//GEN-END:initComponents

    private void streettxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streettxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streettxtActionPerformed

    private void citytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citytxtActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        personinfo.setStreetAddress(streettxt.getText());
        personinfo.setCity(citytxt.getText());
        personinfo.setState(statetxt.getText());
        personinfo.setZipCode(ziptxt.getText());
        
        JOptionPane.showMessageDialog(this, "Address information Saved.");
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addrlbl;
    private javax.swing.JLabel Citylbl;
    private javax.swing.JLabel Statelbl;
    private javax.swing.JLabel Strlbl;
    private javax.swing.JTextField citytxt;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField statetxt;
    private javax.swing.JTextField streettxt;
    private javax.swing.JLabel ziplbl;
    private javax.swing.JTextField ziptxt;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ImageIcon;
import model.PersonInfo;

/**
 *
 * @author rutuja
 */
public class ViewLicenceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLicenceJPanel
     */
    PersonInfo personinfo;
    public ViewLicenceJPanel(PersonInfo personinfo) {
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

        bloodtypetxt = new javax.swing.JTextField();
        picturetxt = new javax.swing.JTextField();
        drvlbl = new javax.swing.JLabel();
        drvnumlbl = new javax.swing.JLabel();
        dissuelbl = new javax.swing.JLabel();
        dexpirelbl = new javax.swing.JLabel();
        bloodtypelbl = new javax.swing.JLabel();
        picturelbl = new javax.swing.JLabel();
        drvnumtxt = new javax.swing.JTextField();
        dissuetxt = new javax.swing.JTextField();
        dexpiretxt = new javax.swing.JTextField();
        piclbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 219, 219));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bloodtypetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodtypetxtActionPerformed(evt);
            }
        });
        add(bloodtypetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 191, 104, -1));

        picturetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picturetxtActionPerformed(evt);
            }
        });
        add(picturetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 229, 104, -1));

        drvlbl.setBackground(new java.awt.Color(231, 203, 203));
        drvlbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        drvlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drvlbl.setText("Driver Licence Information");
        add(drvlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 500, -1));

        drvnumlbl.setText("Licence Number:");
        add(drvnumlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 89, -1, -1));

        dissuelbl.setText("Date of Issue:");
        add(dissuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 121, -1, -1));

        dexpirelbl.setText("Date of expiry:");
        add(dexpirelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 158, -1, -1));

        bloodtypelbl.setText("Blood Type:");
        add(bloodtypelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 196, -1, -1));

        picturelbl.setText("Picture:");
        add(picturelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 234, -1, -1));

        drvnumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drvnumtxtActionPerformed(evt);
            }
        });
        add(drvnumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 89, 104, -1));

        dissuetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dissuetxtActionPerformed(evt);
            }
        });
        add(dissuetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 121, 104, -1));

        dexpiretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexpiretxtActionPerformed(evt);
            }
        });
        add(dexpiretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 153, 104, -1));

        piclbl.setBackground(new java.awt.Color(255, 219, 219));
        add(piclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 670, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void drvnumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drvnumtxtActionPerformed
        // TODO add your handling code here:
        drvnumtxt.setEditable(false);
    }//GEN-LAST:event_drvnumtxtActionPerformed

    private void dissuetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dissuetxtActionPerformed
        // TODO add your handling code here:
        dissuetxt.setEditable(false);
    }//GEN-LAST:event_dissuetxtActionPerformed

    private void dexpiretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexpiretxtActionPerformed
        // TODO add your handling code here:
        dexpiretxt.setEditable(false);
    }//GEN-LAST:event_dexpiretxtActionPerformed

    private void bloodtypetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodtypetxtActionPerformed
        // TODO add your handling code here:
        bloodtypetxt.setEditable(false);
    }//GEN-LAST:event_bloodtypetxtActionPerformed

    private void picturetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picturetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_picturetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodtypelbl;
    private javax.swing.JTextField bloodtypetxt;
    private javax.swing.JLabel dexpirelbl;
    private javax.swing.JTextField dexpiretxt;
    private javax.swing.JLabel dissuelbl;
    private javax.swing.JTextField dissuetxt;
    private javax.swing.JLabel drvlbl;
    private javax.swing.JLabel drvnumlbl;
    private javax.swing.JTextField drvnumtxt;
    private javax.swing.JLabel piclbl;
    private javax.swing.JLabel picturelbl;
    private javax.swing.JTextField picturetxt;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        drvnumtxt.setText(personinfo.getlNumber());
        dissuetxt.setText(personinfo.getDateOfIssue());
        dexpiretxt.setText(personinfo.getDateOfExpire());
        bloodtypetxt.setText(personinfo.getBloodTyep());
        picturetxt.setText(personinfo.getPicture());
        String getImagepath = picturetxt.getText();
        ImageIcon myimage = new ImageIcon(getImagepath);
        piclbl.setIcon(myimage);
        
        }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.PersonInfo;

/**
 *
 * @author rutuja
 */
public class DemoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DemoJpanel
     */
    PersonInfo personinfo;
    public DemoJPanel(PersonInfo personinfo) {
        initComponents();
        this.personinfo= personinfo;
        this.setSize(2000,2000);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        demolbl = new javax.swing.JLabel();
        fnamelbl = new javax.swing.JLabel();
        lnamelbl = new javax.swing.JLabel();
        doblbl = new javax.swing.JLabel();
        agelbl = new javax.swing.JLabel();
        hgtlbl = new javax.swing.JLabel();
        wgtlbl = new javax.swing.JLabel();
        ssnlbl = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        dobtxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        hgttxt = new javax.swing.JTextField();
        wgttxt = new javax.swing.JTextField();
        ssntxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 216, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        demolbl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        demolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demolbl.setText("Demographic Information");
        add(demolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        fnamelbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fnamelbl.setText("First Name:");
        fnamelbl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                fnamelblComponentHidden(evt);
            }
        });
        add(fnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 96, 80, 20));

        lnamelbl.setText("Lastname:");
        add(lnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        doblbl.setText("Date Of Birth:");
        add(doblbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 164, -1, -1));

        agelbl.setText("Age:");
        add(agelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        hgtlbl.setText("Height:");
        add(hgtlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        wgtlbl.setText("Weight:");
        add(wgtlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        ssnlbl.setText("SSN:");
        add(ssnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        fnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtActionPerformed(evt);
            }
        });
        add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 230, 30));
        add(lnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 230, 30));
        add(dobtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 230, 30));

        agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agetxtActionPerformed(evt);
            }
        });
        add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, 30));

        hgttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hgttxtActionPerformed(evt);
            }
        });
        add(hgttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 230, 30));
        add(wgttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 30));
        add(ssntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 230, 30));

        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void fnamelblComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fnamelblComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_fnamelblComponentHidden

    private void fnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtActionPerformed

    private void agetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agetxtActionPerformed

    private void hgttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hgttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hgttxtActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        personinfo.setFirstName(fnametxt.getText());
        personinfo.setLastName(lnametxt.getText());
        personinfo.setDOB(dobtxt.getText());
        personinfo.setAge(agetxt.getText());
        personinfo.setHeight(hgttxt.getText());
        personinfo.setWeight(wgttxt.getText());
        personinfo.setSSN(ssntxt.getText());
        
        JOptionPane.showMessageDialog(this, "Demographic Information Saved.");
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelbl;
    private javax.swing.JTextField agetxt;
    private javax.swing.JLabel demolbl;
    private javax.swing.JLabel doblbl;
    private javax.swing.JTextField dobtxt;
    private javax.swing.JLabel fnamelbl;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel hgtlbl;
    private javax.swing.JTextField hgttxt;
    private javax.swing.JLabel lnamelbl;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel ssnlbl;
    private javax.swing.JTextField ssntxt;
    private javax.swing.JLabel wgtlbl;
    private javax.swing.JTextField wgttxt;
    // End of variables declaration//GEN-END:variables
}
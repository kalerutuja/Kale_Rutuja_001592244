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
public class ViewCheckingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCheckingJPanel
     */
    PersonInfo personinfo;
    public ViewCheckingJPanel(PersonInfo personinfo) {
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

        checkinglbl = new javax.swing.JLabel();
        chkbnktxt = new javax.swing.JTextField();
        chkroutingtxt = new javax.swing.JTextField();
        chkaccnumtxt = new javax.swing.JTextField();
        chkaccbaltxt = new javax.swing.JTextField();
        chkacctypetxt = new javax.swing.JTextField();
        chkbnklbl = new javax.swing.JLabel();
        chkroutlbl = new javax.swing.JLabel();
        chkaccnumlbl = new javax.swing.JLabel();
        chkaccblbl = new javax.swing.JLabel();
        chkacctyelbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 187, 187));

        checkinglbl.setBackground(new java.awt.Color(234, 187, 187));
        checkinglbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        checkinglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkinglbl.setText("Checking Account Information");

        chkroutingtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkroutingtxtActionPerformed(evt);
            }
        });

        chkbnklbl.setText("Bank Name:");

        chkroutlbl.setText("Routing Number:");

        chkaccnumlbl.setText("Checking Account Number:");

        chkaccblbl.setText("Account Balance:");

        chkacctyelbl.setText("Account Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkinglbl, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkbnklbl)
                    .addComponent(chkroutlbl)
                    .addComponent(chkaccnumlbl)
                    .addComponent(chkaccblbl)
                    .addComponent(chkacctyelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkaccbaltxt)
                    .addComponent(chkaccnumtxt)
                    .addComponent(chkroutingtxt)
                    .addComponent(chkbnktxt)
                    .addComponent(chkacctypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(checkinglbl)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbnklbl)
                    .addComponent(chkbnktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkroutlbl)
                    .addComponent(chkroutingtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkaccnumlbl)
                    .addComponent(chkaccnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkaccbaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkaccblbl))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkacctyelbl)
                    .addComponent(chkacctypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkroutingtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkroutingtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkroutingtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkinglbl;
    private javax.swing.JTextField chkaccbaltxt;
    private javax.swing.JLabel chkaccblbl;
    private javax.swing.JLabel chkaccnumlbl;
    private javax.swing.JTextField chkaccnumtxt;
    private javax.swing.JLabel chkacctyelbl;
    private javax.swing.JTextField chkacctypetxt;
    private javax.swing.JLabel chkbnklbl;
    private javax.swing.JTextField chkbnktxt;
    private javax.swing.JTextField chkroutingtxt;
    private javax.swing.JLabel chkroutlbl;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        chkbnktxt.setText(personinfo.getcBankName());
        chkroutingtxt.setText(personinfo.getcRoutingNumber());
        chkaccnumtxt.setText(personinfo.getcBankAccountNumber());
        chkaccbaltxt.setText(personinfo.getcAccountBalance());
        chkacctypetxt.setText(personinfo.getcAccountType());
    }


}


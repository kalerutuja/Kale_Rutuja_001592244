/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.OrderItem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author rutuja
 */
public class ViewOrderItemDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
    JPanel userProcessContainer;
    OrderItem orderitems;
    public ViewOrderItemDetailJPanel(JPanel upc, OrderItem order) {
        initComponents();
        this.userProcessContainer = upc;
        this.orderitems = order;
        this.setSize(2000,2000);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProductname = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txtpaidprice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 177, 177));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Order Item Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 499, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Product ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 134, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 177, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 219, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Paid Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 261, -1, -1));
        add(txtProductname, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 88, 111, -1));
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 132, 111, -1));
        add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 175, 111, -1));
        add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 217, 111, -1));
        add(txtpaidprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 259, 111, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 303, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductname;
    private javax.swing.JTextField txtpaidprice;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BrowseProducts browse = (BrowseProducts) component;
        browse.refreshorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}

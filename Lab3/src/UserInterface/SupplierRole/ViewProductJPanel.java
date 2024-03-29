/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author rutuja
 */
public class ViewProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProductJPanel
     */
    private JPanel userProcessContainer;
    private Product product;
    public ViewProductJPanel(JPanel userProcessContainer, Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product =product;
        txtName.setText(product.getProdName());
        txtId.setText(String.valueOf(product.getPrice()));
        txtPrice.setText(String.valueOf(product.getPrice()));
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
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnViewUpdate = new javax.swing.JButton();
        btnViewSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 177, 177));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 400, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Product ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Product Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 163, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 73, 70, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 117, 70, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 161, 70, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 222, -1, -1));

        btnViewUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnViewUpdate.setText("Update");
        btnViewUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateActionPerformed(evt);
            }
        });
        add(btnViewUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 222, -1, -1));

        btnViewSave.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnViewSave.setText("Save");
        btnViewSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSaveActionPerformed(evt);
            }
        });
        add(btnViewSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 222, 88, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnViewSave.setEnabled(true);
    }//GEN-LAST:event_btnViewUpdateActionPerformed

    private void btnViewSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSaveActionPerformed
        // TODO add your handling code here:
        product.setPrice(Integer.parseInt(txtPrice.getText()));
        product.setProdName(txtName.getText());
    }//GEN-LAST:event_btnViewSaveActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewSave;
    private javax.swing.JButton btnViewUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}

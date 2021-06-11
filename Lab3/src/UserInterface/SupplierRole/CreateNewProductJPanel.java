/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rutuja
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewproductJPanel
     */
    JPanel userProcessContainer;
    Supplier supplier;
    public CreateNewProductJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        this.setSize(2000,2000);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateNewProduct = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        lblProductPrice = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddproduct = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 177, 177));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreateNewProduct.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblCreateNewProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateNewProduct.setText("Create New Product");
        add(lblCreateNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 423, -1));

        lblProductName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblProductName.setText("Product Name:");
        add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 95, -1, -1));

        lblProductID.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblProductID.setText("Product ID:");
        add(lblProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 137, -1, -1));

        lblProductPrice.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblProductPrice.setText("Product Price:");
        add(lblProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 179, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 93, 108, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 135, 108, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 177, 108, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 247, 140, -1));

        btnAddproduct.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnAddproduct.setText("Add Product");
        btnAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddproductActionPerformed(evt);
            }
        });
        add(btnAddproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 247, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddproductActionPerformed
        // TODO add your handling code here:
        Product p = supplier.getProductCatalog().addProduct();
        p.setProdName(txtName.getText());
        String stringPrice = txtPrice.getText();
        if(stringPrice.isEmpty()==false){
            int price = Integer.parseInt(stringPrice);
            p.setPrice(price);
        }
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAddproductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddproduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblCreateNewProduct;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}

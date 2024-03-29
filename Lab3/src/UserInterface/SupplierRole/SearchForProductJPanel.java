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
public class SearchForProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchForProductJPanel
     */
    JPanel userProcessContainer;
    Supplier supplier;
    public SearchForProductJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier =supplier;
        this.setSize(2000,2000);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSearchID = new javax.swing.JButton();
        btnBackID = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 177, 177));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 400, -1));

        lblProductID.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblProductID.setText("Product ID");
        add(lblProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 96, 88, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 94, 159, -1));

        btnSearchID.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnSearchID.setText("Search >>");
        btnSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDActionPerformed(evt);
            }
        });
        add(btnSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, -1, -1));

        btnBackID.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBackID.setText("<< Back");
        btnBackID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackIDActionPerformed(evt);
            }
        });
        add(btnBackID, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 171, 127, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDActionPerformed
        // TODO add your handling code here:
        try{
        Product p;
        int productId = Integer.parseInt(txtID.getText());
        p = supplier.getProductCatalog().searchProduct(productId);
        if(p!=null){
        SearchResultJPanel vpdjp = new SearchResultJPanel(userProcessContainer, p);
        userProcessContainer.add("SearchResultJPanel", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nothing found", "No result found matching your criteria!!", JOptionPane.WARNING_MESSAGE);
        }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Nothing found", "No result found matching your criteria!!", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSearchIDActionPerformed

    private void btnBackIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackIDActionPerformed
        // TODO add your handling code here:
        backAction();
       
    }//GEN-LAST:event_btnBackIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackID;
    private javax.swing.JButton btnSearchID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JTextField txtID;
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

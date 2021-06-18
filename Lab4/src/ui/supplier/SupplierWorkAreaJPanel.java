/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.supplier;

/**
 *
 * @author rutuja
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    public SupplierWorkAreaJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnManageProductCatalog = new javax.swing.JButton();
        btnSupplierProfile = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        btnManageProductCatalog.setText("Product Catalog");
        btnManageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalogActionPerformed(evt);
            }
        });

        btnSupplierProfile.setText("Update Profile");
        btnSupplierProfile.setEnabled(false);
        btnSupplierProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierProfileActionPerformed(evt);
            }
        });

        btnManageStaff.setText("Manage Staff");
        btnManageStaff.setEnabled(false);

        Performance.setText("Performance");
        Performance.setEnabled(false);
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(workArea, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuBarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnManageProductCatalog)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupplierProfile)))
                .addGap(18, 18, 18)
                .addComponent(btnManageStaff)
                .addGap(18, 18, 18)
                .addComponent(Performance)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addContainerGap())
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome)
                    .addComponent(btnManageProductCatalog)
                    .addComponent(btnSupplierProfile)
                    .addComponent(Performance)
                    .addComponent(btnManageStaff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workArea, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 573, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:

        mainWorkArea.remove(this);

        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateSupplierCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnManageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalogActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(workArea, supplier);
        workArea.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageProductCatalogActionPerformed

    private void btnSupplierProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierProfileActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        // TODO add your handling code here:
        //        ProductReportJPanel prjp = new workArea(userProcessContainer, supplier);
        //        workArea.add("ProductReportJPanelSupplier", prjp);
        //        CardLayout layout = (CardLayout)workArea.getLayout();
        //        layout.next(userProcessContainer);
    }//GEN-LAST:event_PerformanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Performance;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageProductCatalog;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnSupplierProfile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}

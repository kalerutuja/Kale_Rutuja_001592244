/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuja
 */
public class ManageSuppliers extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliers
     */
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    
    public ManageSuppliers(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnViewSupplier = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();

        setBackground(new java.awt.Color(144, 177, 177));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentHidden(evt);
            }
        });

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Supplier Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 46, 422, 133));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText(">>Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 205, 150, -1));

        btnRemove.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 205, 150, -1));

        btnViewSupplier.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnViewSupplier.setText("View Supplier");
        btnViewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSupplierActionPerformed(evt);
            }
        });
        add(btnViewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 275, -1, -1));

        btnAddSupplier.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnAddSupplier.setText("Add Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 275, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentHidden

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
       CardLayout layout =(CardLayout)userProcessContainer.getLayout();
       layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int row = supplierTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s =(Supplier) supplierTable.getValueAt(row,0);
        supplierDirectory.removeSupplier(s);
        refreshTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnViewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSupplierActionPerformed
        // TODO add your handling code here:
        int row = supplierTable.getSelectedRow();
    if(row<0){
        JOptionPane.showMessageDialog(null, "Pleaase Select row!!","Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
        Supplier s = (Supplier)supplierTable.getValueAt(row,0);
        ViewSupplier vs = new ViewSupplier(userProcessContainer,s);
        userProcessContainer.add("ViewSupplier",vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewSupplierActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        // TODO add your handling code here:
        AddSupplierJPanel as = new AddSupplierJPanel(userProcessContainer, supplierDirectory);
     userProcessContainer.add("AddSupplier",as);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnViewSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables

    void refreshTable() {
        int rowCount = supplierTable.getRowCount();
      DefaultTableModel model =(DefaultTableModel) supplierTable.getModel();
      for (int i=rowCount-1;i>=0;i--){
          model.removeRow(i);
      }
      for(Supplier s : supplierDirectory.getSupplierList()){
          Object row[] = new Object[1];
      row[0]=s;
      model.addRow(row);
    }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DeliveryMan dm;

    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DeliveryMan dm, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.dm = dm;
        this.business = business;
        populateTable();
      
        
       
    }
    
    public void populateTable(){
        System.out.println(this.dm);
        //this.userAccount.getWorkQueue().getWorkRequestList()
       if(this.dm.getWorkQueue().getWorkRequestList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel) deliverOrderTable.getModel();
            dtm.setRowCount(0);
            for (WorkRequest w : this.dm.getWorkQueue().getWorkRequestList()) 
            {
                if(w.getOrder() != null)
                {
                    Object row[] = new Object[5];
                    row[0] = w.getOrder().getOrderId();
                    row[1] = w.getSender().getUsername();
                    row[2] = "TODO add receiver";
//                    if(w.getSender().getCustomer() == null)
//                    {
//                       row[3] = this.restaurant.getName();
//                    }
//                    else
//                    {
//                        row[3] = w.getSender().getCustomer().getName(); 
//                    }
                    row[3] = null;
                    row[4] = w.getStatus();
                    dtm.addRow(row);
                }
  
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        deliverOrderTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnDeliver = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        deliverOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Sender", "Receiver", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliverOrderTable);

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnDeliver.setText("Deliver");
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(refreshJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAssign)
                        .addGap(233, 233, 233)
                        .addComponent(btnDeliver)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(refreshJButton)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssign)
                    .addComponent(btnDeliver))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = deliverOrderTable.getSelectedRow();
        
        if(selectedRow >= 0)
        {
            Integer orderId= (Integer)deliverOrderTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: this.dm.getWorkQueue().getWorkRequestList())
            {
                if(wr.getOrder().getOrderId() == orderId)
                {
                    wr.setStatus("Out for Delivery");
                    JOptionPane.showMessageDialog(null, "The order is out for delivery;.");
                    this.populateTable();
                    break;
                }
            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed

        int selectedRow = deliverOrderTable.getSelectedRow();

        if(selectedRow >= 0)
        {
            Integer orderId= (Integer)deliverOrderTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: this.dm.getWorkQueue().getWorkRequestList())
            {
                if(wr.getOrder().getOrderId() == orderId)
                {
                    wr.setStatus("Delivered");
                    JOptionPane.showMessageDialog(null, "The order is delivered.");
                    this.populateTable();
                    break;
                }
            }

        }

    }//GEN-LAST:event_btnDeliverActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JTable deliverOrderTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}

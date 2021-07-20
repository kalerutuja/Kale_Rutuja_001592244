/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Orders.Order;

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

    private JPanel WorkArea;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    String deliveryManName;
    Order order;

    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel WorkArea, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.WorkArea = WorkArea;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.deliveryManName = userAccount.getUsername();
      
        
        populateTable();
        DeliveryMan dm = ecosystem.getDeliveryManDirectory().findDeliveryMan(userAccount.getUsername());
        jLabel1.setText(String.valueOf(dm.getRatings()));
    }
    
    public void populateTable(){
        DefaultTableModel dm = (DefaultTableModel) DeliveryManTable.getModel();
        dm.setRowCount(0);
        for (Order order: ecosystem.getOrderHistory().getOrderHisotry()){
           if (order.getDeliveryMan()!= null){
               Object row[] = new Object[6];
               row[0]= order.getOrderID();
               row[1]= order.getRestaurant().getName();
               row[2]= order.getUserAccount().getUsername();
               row[3]= order.getComments();
               row[4]= order.getAmount();
               row[5]= order.getOrderStatus();
               dm.addRow(row);
           }
           else{
               System.out.println("Order not Found");
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
        DeliveryManTable = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DeliveryManTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Restaruant Name", "Customer Name", "Comments", "Total Bill", "Order Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryManTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 680, 170));

        btnProcess.setText("Assign to me");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jLabel1.setText("Order Delivery");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel2.setText("DeliveryMan Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 20));

        jLabel4.setText("Ratings");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 50, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow1 = DeliveryManTable.getSelectedRow();
        if(selectedRow1 < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)DeliveryManTable.getValueAt(selectedRow1,3);
        System.out.println("Order "+ order.getOrderStatus());
        order.setOrderStatus("On the way");
              
        
        populateTable();
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeliveryManTable;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

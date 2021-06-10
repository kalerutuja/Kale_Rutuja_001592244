/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.MasterOrderCatalog;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.Supplier;
import Business.SupplierDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rutuja
 */
public class BrowseProducts extends javax.swing.JPanel {

    /**
     * Creates new form BrowseProducts
     */
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private Order order;
    boolean isCheckedOut = false;
    public BrowseProducts(JPanel userProcessContainer,SupplierDirectory supplierDirectory ,MasterOrderCatalog masterOrderCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.masterOrderCatalog = masterOrderCatalog;
        this.setSize(2000,2000);
        
    }
    private void populateSuppCombo(){
        suppComboBox1.removeAll();
        
        for(Supplier supplier : supplierDirectory.getSupplierList()){
           suppComboBox1.addItem(supplier);
        }
        
        popuplateProductTable();
        if(!isCheckedOut){
            order = new Order();
        }
    }

    private void popuplateProductTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
        Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        dtm.setRowCount(0);
        if(supplier != null){
            
            for (Product product : supplier.getProductCatalog().getProductCatalog()){
                
                Object row[] = new Object[4];
                row [0] = product;
                row[1] = product.getModelNumber();
                row[2] =  product.getPrice();
                row[3]=product.getAvail();
                dtm.addRow(row);
                
            }
        }       
    }

    private  void searchProductTable(String prodName){
        
        int rowCount = productTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
        
        for ( int i = rowCount -1; i>0; i--){
            dtm.removeRow(i);
        }
        for(Supplier s: supplierDirectory.getSupplierList()){
            for(Product p:s.getProductCatalog().getProductCatalog()){
                if(prodName.equalsIgnoreCase(p.getProdName())){
                    
                    Object row[] = new Object[4];
                row [0] = p;
                row[1] = p.getModelNumber();
                row[2] =  p.getPrice();
                row[3]=p.getAvail();
                dtm.addRow(row);
                }
            }
        }
    }
    
    void refreshorderTable(){
        
        int rowCount = orderTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
         for ( int i = rowCount -1; i>0; i--){
            dtm.removeRow(i);
        }
         for(OrderItem o : order.getOrderItemList()){
             
            Object[] row = new Object[4];
            row[0] = o;
            row[1] = o.getSaleprice();
            row[2] = o.getQauntiry();
            row[3] =o.getQauntiry() *o.getSaleprice();
            dtm.addRow(row);
            
         }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewProdjButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        btnSearchProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        suppComboBox1 = new javax.swing.JComboBox();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(144, 177, 177));

        viewProdjButton2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        jLabel4.setText("Have a wonderful shopping experience !");
        jLabel4.setIconTextGap(7);

        addtoCartButton6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addtoCartButton6.setText("Add To Cart");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Quantity:");

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        btnSearchProduct.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Sales Price:");

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Supplier");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Item in Cart:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Product Catalog");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewOrderItem.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        btnModifyQuantity.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnModifyQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewOrderItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addtoCartButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewProdjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {suppComboBox1, txtSearchKeyWord});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {quantitySpinner, txtSalesPrice});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnModifyQuantity, btnRemoveOrderItem, btnViewOrderItem});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addtoCartButton6, viewProdjButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct)
                    .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewProdjButton2)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addtoCartButton6)))
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyQuantity)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrderItem)
                    .addComponent(btnRemoveOrderItem))
                .addGap(18, 18, 18)
                .addComponent(btnCheckOut)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addtoCartButton6, viewProdjButton2});

    }// </editor-fold>//GEN-END:initComponents

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        Product selectedProduct;
        int salesPrice = 0;
        //no row selected
        if(selectedRow <0){

            JOptionPane.showMessageDialog(this, "Please select a product","warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            selectedProduct = (Product)productTable.getValueAt(selectedRow,0);

        }
        //sale price validation
        try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());

        } catch(Exception e){

            JOptionPane.showMessageDialog(this,"entered Price should be more thatn actual", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        //sale price getter than actual
        if(salesPrice < selectedProduct.getPrice()){
            JOptionPane.showMessageDialog(this, "entered price should be more than actual","Warning",JOptionPane.WARNING_MESSAGE);
        }
        //qty more than 0
        int fetchedqty = (Integer)quantitySpinner.getValue();
        if(fetchedqty <=0){
            JOptionPane.showMessageDialog(this, "qnty should be greater than zero","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        } else if ( fetchedqty <= selectedProduct.getAvail()){
            boolean alreadyPresent = false;
            for(OrderItem orderItem : order.getOrderItemList()){
                if(orderItem.getProduct()== selectedProduct){
                    int oldAvail = selectedProduct.getAvail();
                    int newAvail = oldAvail-fetchedqty;
                    selectedProduct.setAvail(newAvail);
                    orderItem.setQauntiry(fetchedqty+ orderItem.getQauntiry());
                    alreadyPresent = true;
                    refreshorderTable();
                    popuplateProductTable();
                    break;
                }

            }

            if(!alreadyPresent){

                int oldAvail = selectedProduct.getAvail();
                int newAvail = oldAvail - fetchedqty;
                selectedProduct.setAvail(newAvail);
                order.addOrderItem(selectedProduct,fetchedqty, salesPrice);
                refreshorderTable();
                popuplateProductTable();
            }
        }
            

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed

        String prodName = txtSearchKeyWord.getText();
        searchProductTable(prodName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        // TODO add your handling code here:
        popuplateProductTable();

    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")){
            OrderItem orderItem = (OrderItem) orderTable.getValueAt(selectedRow,0);
            int  currentAvail = orderItem.getProduct().getAvail();
            int oldqty = orderItem.getQauntiry();
            int newqty = Integer.parseInt(txtNewQuantity.getText());

            if(newqty > (currentAvail + oldqty)){
                JOptionPane.showMessageDialog(this, "qty more than availablity");

            }else{
                if (newqty <=0){
                    JOptionPane.showMessageDialog(this, "Invalid qty","warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                orderItem.setQauntiry(newqty);
                orderItem.getProduct().setAvail(currentAvail + (oldqty - newqty));
                refreshorderTable();
                popuplateProductTable();
            }
        }else{
            JOptionPane.showMessageDialog(this, "qty can not be zero","waring",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed

        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow <=0){
            JOptionPane.showMessageDialog(this, "selecte a row","warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem o = (OrderItem)orderTable.getValueAt(selectedRow, 0);
        int oldqty = o.getProduct().getAvail();
        int orderqty = o.getQauntiry();
        int newqty = oldqty + orderqty;
        o.getProduct().setAvail(newqty);

        order.removeOrderItem(o);
        JOptionPane.showMessageDialog(this,"The order item of"+orderqty+"of"+o+"has been remove");
        refreshorderTable();
        popuplateProductTable();

    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if(order.getOrderItemList().size()>0){
            masterOrderCatalog.addorder(order);
            isCheckedOut = true;
            JOptionPane.showMessageDialog(this,"order addedd successfully" );
            order = new Order();
            refreshorderTable();
            popuplateProductTable();

        }else{
            JOptionPane.showMessageDialog(this, "No order exists","Warning",JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_btnCheckOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}
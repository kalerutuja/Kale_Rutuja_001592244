/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rutuja
 */
public class Order {
    private static int count=0;
    private List<OrderItem> orderItemList;
            private int orderNumber;
            
            public Order()
            { count ++;
                    orderNumber = count;
                    orderItemList = new ArrayList<OrderItem>();
                
            }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(Product p, int qty, int sp)
    {
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(p);
        orderItem.setQauntiry(qty);
        orderItem.setSaleprice(sp);
        orderItemList.add(orderItem);
        return orderItem;
        
    }
    
    public void removeOrderItem(OrderItem orderItem)
    {
        orderItemList.remove(orderItem);
    }
}

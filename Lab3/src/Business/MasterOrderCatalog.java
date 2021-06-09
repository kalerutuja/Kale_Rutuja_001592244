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
public class MasterOrderCatalog {
    
    private List<Order> orderCatalog;
    public MasterOrderCatalog(){
        
        orderCatalog = new ArrayList<Order>();
        
    }

    public List<Order> getOrdercatalog() {
        return orderCatalog;
    }

    public void setOrdercatalog(List<Order> ordercatalog) {
        this.orderCatalog = ordercatalog;
    }
    
    public Order addorder(Order o){
        
        orderCatalog.add(o);
        return o;
    }
}

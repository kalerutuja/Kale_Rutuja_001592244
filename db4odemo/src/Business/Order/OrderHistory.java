/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class OrderHistory {
    ArrayList<Order> orderHisotry;

    public ArrayList<Order> getOrderHisotry() {
        return orderHisotry;
    }

    public void setOrderHisotry(ArrayList<Order> orderHisotry) {
        this.orderHisotry = orderHisotry;
    }
}

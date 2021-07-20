/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author rutuja
 */
public class Menu {
    String itemName;
    double itemPrice;
    int quantity;
    boolean Availability;
   
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }
    
    
    
    @Override
    public String toString() {
        return itemName;
    }
}

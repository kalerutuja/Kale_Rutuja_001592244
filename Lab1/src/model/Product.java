/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rutuja
 */
public class Product {
    private String name;
    private String price;
    private String availnumber;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailnum(String availnumber) {
        this.availnumber = availnumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailnum() {
        return availnumber;
    }

    public String getDescription() {
        return description;
    }
    
    
    
}

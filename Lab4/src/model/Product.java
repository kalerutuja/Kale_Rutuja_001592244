/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class Product {
    private String name;
    private int price;
    private int id;

    public Product(){
        int count = 0;
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private ArrayList<Feature> features;
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.Icon;

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

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    private ArrayList<Feature> features;

    public Feature addNewFeature() {
       this.features= null;
               return null;
    
    }

    public Icon getLogoImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
    
    
    
}

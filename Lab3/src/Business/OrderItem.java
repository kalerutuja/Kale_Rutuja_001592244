/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rutuja
 */
public class OrderItem {
    
    private Product product;
    private int qauntiry;
    private int saleprice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQauntiry() {
        return qauntiry;
    }

    public void setQauntiry(int qauntiry) {
        this.qauntiry = qauntiry;
    }

    public int getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }
    @Override
    public String toString()
    {
        return product.getProdName();
        
    }
}

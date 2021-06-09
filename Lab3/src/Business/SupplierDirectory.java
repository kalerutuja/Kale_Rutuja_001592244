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
public class SupplierDirectory {
    
    private List<Supplier> supplierList;
    
    public SupplierDirectory(){
        
        supplierList = new ArrayList<Supplier>();
    }
    
    public List<Supplier> getSupplierList(){
        return supplierList;
    }
    
    public Supplier addSupplier(){
        
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier (Supplier s){
        supplierList.remove(s);
    }
    
    public Supplier serachSupplier(String keyword){
        for(Supplier supplier : supplierList){
            if(supplier.getSupplyName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
    
}

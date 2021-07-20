/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer extends Organization {
    String customerName;
    String customerAddress;
    int customerConatctNo;
    String customerEmail;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getcustomerConatctNo() {
        return customerConatctNo;
    }

    public void setcustomerConatctNo(int customerPhone) {
        this.customerConatctNo = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    
    
       public Customer() {
        super(Organization.Type.Customer.getValue());
       
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }
    
    @Override
    public String toString(){
        return customerName;
    }
    
}

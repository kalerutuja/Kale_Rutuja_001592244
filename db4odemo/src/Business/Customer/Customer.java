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
    private int CustomerID;
    private String CustomerName;
    private String CustomerAddress;
    private int Customer_Phone_no;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public int getCustomer_Phone_no() {
        return Customer_Phone_no;
    }

    public void setCustomer_Phone_no(int Customer_Phone_no) {
        this.Customer_Phone_no = Customer_Phone_no;
    }
    
    public Customer() {
        super(Organization.Type.Customer.getValue());
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }

    @Override
    public String toString() {
        return "Customer{" + "CustomerName=" + CustomerName + '}';
    }
    
}

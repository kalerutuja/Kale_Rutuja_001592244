/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private List<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name,String Username){
         Customer customer = new Customer(name,Username);
         customerList.add(customer);
      if(!customerList.contains(customer)){
          System.out.println("adding ------customer"+name);
      customerList.add(customer);
      }
      System.out.println("using existing ------customer"+name);
      return customer;
    }
    
//    public Customer createCustomer(String name){
//         Customer customer = new Customer(name);
//      if(!customerList.contains(customer)){
//          System.out.println("adding ------customer"+name);
//      customerList.add(customer);
//      }
//      System.out.println("using existing ------customer"+name);
//      return customer;
//    }
//    
    public void deleteCustomer(Customer c) {
        customerList.remove(c);
    }
    }





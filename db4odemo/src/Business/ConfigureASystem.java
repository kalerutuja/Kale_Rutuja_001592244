package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("RRL");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("RR");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("RL");
        Employee employee4 = system.getEmployeeDirectory().createEmployee("SSS");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("Customer","Customer",employee1,new CustomerRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("Delivery","Delivery",employee2,new DeliveryManRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("Manager","Manager",employee3,new AdminRole());
        Restaurant res = system.getRestaurantDirectory().createRestaurant("Shalimar", "sss", "Non veg", "Manager");



        
        
        return system;
    }
    
}

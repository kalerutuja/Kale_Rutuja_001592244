package Business;

import Business.Customer.Customer;
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
    
    static private Organization organization;
    public static EcoSystem configure(){
        
       EcoSystem system = EcoSystem.getInstance(); 
       Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
       UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
       return system;
    }
    
}

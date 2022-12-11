package HMS;

import HMS.Employee.Employee;
import HMS.Role.SystemAdminRole;
import HMS.UserAccount.UserAccount;

/**
 *
 * @author mahes
 */
public class InitialConfig {
    
    public static NetworkDirectory configure(){
        
        NetworkDirectory system = NetworkDirectory.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}

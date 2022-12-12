
package HMS.Organization;

import HMS.Employee.EmployeeDirectory;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Role.Role;
import HMS.UserAccount.UserAccountDirectory;
import HMS.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public FoodInventory foodinventory;
    private ClothInventory clothinventory;
    
    public enum Type{
        Admin("Admin Organization"), Police("Police Organization"), NGO("NGO Organization"), Doctor("Doctor Organization"),Lab("Lab Organization"),Billing("Billing Organization"), Restaurant("Food Organization"),ClothingOutlet("Clothing Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        foodinventory = new FoodInventory();
        clothinventory= new ClothInventory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public FoodInventory getFoodList() {
        return foodinventory;
    }

    public ClothInventory getClothinventory() {
        return clothinventory;
    }


    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

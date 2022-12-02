
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Police("Police"),
        NGOSupervisor("NGO Supervisor"),
        Doctor("Doctor"),
        Lab("Lab"),
        Billing("Billing"),
        Food("Food"),
        Clothing("Clothing"),
        Self("Self");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            HomelessDirectory homelessdirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
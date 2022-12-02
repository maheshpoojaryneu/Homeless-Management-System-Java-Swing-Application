
package Business.Organization;


import Business.Role.LabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class LabOrganization extends Organization {
   LabOrganization() {
        
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    } 
}


package Business.Organization;

import Business.Role.NGOSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class NGOOrganization extends Organization{

    public NGOOrganization() {
        super(Organization.Type.NGO.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOSupervisorRole());
        return roles;
    }
     
   
    
    
}

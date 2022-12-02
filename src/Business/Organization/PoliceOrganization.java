
package Business.Organization;

import Business.Role.PoliceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class PoliceOrganization extends Organization{

    public PoliceOrganization() {
        super(Organization.Type.Police.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceRole());
        return roles;
    }
     
}
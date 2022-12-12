
package HMS.Organization;

import HMS.Role.AdminRole;
import HMS.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}

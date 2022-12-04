
package HMS.Organization;

import HMS.Role.DoctorRole;
import HMS.Role.NGOSupervisorRole;
import HMS.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class DoctorOrganization extends Organization{

    DoctorOrganization() {
        
        super(Organization.Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
    }
    


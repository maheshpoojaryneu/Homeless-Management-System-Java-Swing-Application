
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.NGOSupervisorRole;
import Business.Role.Role;
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
    


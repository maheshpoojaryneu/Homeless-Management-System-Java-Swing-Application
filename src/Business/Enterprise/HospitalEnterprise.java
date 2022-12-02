
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
    }

    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

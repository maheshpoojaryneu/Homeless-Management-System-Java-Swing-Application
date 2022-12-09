
package HMS.Enterprise;

import HMS.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class GovernmentEnterprise extends Enterprise {
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Government);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}


package Business.Organization;


import Business.Role.BillingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class BillingOrganization extends Organization {
   BillingOrganization() {
        
        super(Organization.Type.Billing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BillingRole());
        return roles;
    } 
}

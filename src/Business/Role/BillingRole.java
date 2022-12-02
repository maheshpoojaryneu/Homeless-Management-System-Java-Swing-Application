
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.BillingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Billing.BillingWorkAreaJPanel;

/**
 *
 * @author mahes
 */
public class BillingRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory) {
        return new BillingWorkAreaJPanel(userProcessContainer, account, (BillingOrganization)organization, enterprise, business);
        
    }
}


package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Police.getValue())){
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new BillingOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ClothingOutlet.getValue())){
            organization = new ClothingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization = new FoodOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Self.getValue())){
            organization = new SelfOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}
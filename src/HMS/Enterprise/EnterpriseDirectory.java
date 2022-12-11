
package HMS.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Government){
            enterprise=new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Volunteer){
            enterprise=new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.Food){
            enterprise=new FoodEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.Clothing){
            enterprise=new ClothingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}

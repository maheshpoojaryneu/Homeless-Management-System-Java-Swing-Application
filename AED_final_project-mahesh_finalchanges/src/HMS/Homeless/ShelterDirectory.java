package HMS.Homeless;

import HMS.Homeless.Homeless;
import HMS.Homeless.Shelter;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class ShelterDirectory {
   
   
     private ArrayList<Shelter> shelterList;

    public ShelterDirectory() {
       
        shelterList = new ArrayList<>();
       
       
       
       
//        Shelter Person1 = new Shelter(1,"Smith Singh","tatti");
//        
//        
//        shelterList.add(Person1);    
//        
//        
     
       
    }

   
   
   
    public ArrayList<Shelter> getShelterList() {
        return shelterList;
    }

   
    public Shelter createShelter(){
        Shelter shelter = new Shelter();
        shelterList.add(shelter);
        return shelter;
    }
   
   
   
 
}

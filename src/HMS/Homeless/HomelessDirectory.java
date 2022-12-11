
package HMS.Homeless;

import HMS.Homeless.Homeless;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class HomelessDirectory {
    
    private ArrayList<Homeless> homelessList;

    public HomelessDirectory() {
        homelessList = new ArrayList();
        
        
        
         
        Homeless Person1 = new Homeless(1,"Neeraj Raja",25,"Boylston Street","Male",false,true,true,false);
        Homeless Person2 = new Homeless(2,"Harry Singh",20,"Boylston Street","Male",true,false,true,true);
        Homeless Person3 = new Homeless(3,"Tom Micheal",19,"Quincy","Female",true,true,false,false);
        Homeless Person4 = new Homeless(4,"Lionel Messi",45,"Waltham","Male",true,true,false,false);
        Homeless Person5 = new Homeless(5,"Nemar Jr",26,"Park Drive","Male",false,true,true,true);
        Homeless Person6 = new Homeless(6,"pele",44,"Boylston Street","Male",true,true,true,true);
        Homeless Person7 = new Homeless(7,"MS Dhoni",12,"Quincy","Female",false,true,false,true);
        Homeless Person8 = new Homeless(8,"Mahesh Poojary",23,"Waltham","Male",false,true,true,false);
        Homeless Person9 = new Homeless(9,"Danish Shaikh",35,"Saugus","Male",true,false,true,false);
        
         
        homelessList.add(Person1);                                                  //Adding cab to catalog
        homelessList.add(Person2);
        homelessList.add(Person3);
        homelessList.add(Person4);
        homelessList.add(Person5);
        homelessList.add(Person6);
        homelessList.add(Person7);
        homelessList.add(Person8);
        homelessList.add(Person9);
        
    }

    public ArrayList<Homeless> getHomelessList() {
        return homelessList;
    }

    
    public Homeless createHomeless(){
        Homeless homeless = new Homeless();
        homelessList.add(homeless);
        return homeless;
    }
    
    
    
    public void deleteHomeless(Homeless homeless)
    {
        homelessList.remove(homeless);
    }
    
    
}

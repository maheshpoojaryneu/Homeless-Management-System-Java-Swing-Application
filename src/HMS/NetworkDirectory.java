
package HMS;

import HMS.Network.Network;
import HMS.Organization.Organization;
import HMS.Role.Role;
import HMS.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class NetworkDirectory extends Organization{
    
    private static NetworkDirectory business;
    private ArrayList<Network> networkList;
    public static NetworkDirectory getInstance(){
        if(business==null){
            business=new NetworkDirectory();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private NetworkDirectory(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}

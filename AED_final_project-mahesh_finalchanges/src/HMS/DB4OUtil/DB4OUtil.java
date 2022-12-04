package HMS.DB4OUtil;

import HMS.InitialConfig;
import HMS.NetworkDirectory;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author mahes
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    public ObjectContainer createConnection() {
        try {
            
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(NetworkDirectory.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(NetworkDirectory system, FoodInventory foodinventory, ClothInventory clothinventoy) {
        ObjectContainer conn =  createConnection();
        conn.store(system);
        conn.store(foodinventory);
        conn.store(clothinventoy);
        conn.commit();
        conn.close();
    }
    
    public NetworkDirectory retrieveSystem(){
        
     EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(NetworkDirectory.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            
        ObjectSet<NetworkDirectory> systems = db.query(NetworkDirectory.class); // Change to the object you want to save
       
        
        NetworkDirectory system;
        if (systems.isEmpty()) {
            system = InitialConfig.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        
        
                
        db.close();
    return system;
    

}
    public FoodInventory retrieveFInventory(){
        
     EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(NetworkDirectory.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            
        ObjectSet<FoodInventory> foodinventorys = db.query(FoodInventory.class);
        
        
        FoodInventory foodinventory;
        
         if (foodinventorys.isEmpty()) {
            foodinventory = new FoodInventory();  // If there's no System in the record, create a new one
        } else {
            foodinventory = foodinventorys.get(foodinventorys.size() - 1);
        }
                
        db.close();
  
    return foodinventory;

}

public ClothInventory retrieveCInventory(){
        
     EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(NetworkDirectory.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            
        ObjectSet<ClothInventory> clothinventorys = db.query(ClothInventory.class);
        
        
        ClothInventory clothinventory;
        
         if (clothinventorys.isEmpty()) {
            clothinventory = new ClothInventory();  // If there's no System in the record, create a new one
        } else {
            clothinventory = clothinventorys.get(clothinventorys.size() - 1);
        }
                
        db.close();
  
    return clothinventory;

}

}
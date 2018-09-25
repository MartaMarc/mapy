package mapy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author M
 */
public class Mapy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, String> Europe = new HashMap<>();
        Europe.put("Poland", "Warsaw");
        Europe.put("France", "Paris");
        Europe.put("Germany", "Berlin");
        Europe.put("Finland", "Helsinki");
        
        Map<String, String> Asia = new HashMap<>();
        Asia.put("Japan", "Tokio");
        Asia.put("India","New Delhi");
        Asia.put("Thailand","Bangkok");
  
        
        Map<String, String> Eurasia= new HashMap<>();
        System.out.println("Is map Eurasia empty?: " + Eurasia.isEmpty());
        Eurasia.putAll(Europe);
        System.out.println("Filling countries to Eurasia map");
        Eurasia.putAll(Asia);
        System.out.println("Is map Eurasia empty?: " + Eurasia.isEmpty());
        
        System.out.println("Asia contains key Germany: " + Asia.containsKey("Germany"));
        System.out.println("Asia contains Value Tokio: " + Asia.containsValue("Tokio"));
        System.out.println("Europe map size: " + Europe.size());
        System.out.println("Capital of Finland: " + Europe.get("Finland"));
        System.out.println("Europe remove Finland: " + Europe.remove("Finland"));
        
        System.out.println("Values of map Europe");
        for (String value : Europe.values()){
            System.out.println(value);
        }
                
        System.out.println("Keys of map Europe");
        for (String key : Europe.keySet()){
            System.out.println(key);
        }
        
        System.out.println("Key-Values of map Europe");
        for (Map.Entry<String, String>  pair : Europe.entrySet()){
            System.out.println(pair);
        }
    }
    }
    


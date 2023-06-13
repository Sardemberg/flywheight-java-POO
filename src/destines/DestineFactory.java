package destines;

import javax.naming.NameNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class DestineFactory {
    private DestineFactory(){}
    private static Map<String, Destine> hash_destines = new HashMap<String, Destine>();

    private static String getLocations(){
        return "Amsterdam, Dubai e Acapulco";
    }
    public static Destine get(String key) throws NameNotFoundException {
        if(!hash_destines.containsKey(key)){
            Destine destine = switch (key) {
                case "Amsterdam" -> new Amsterdam();
                case "Dubai" -> new Dubai();
                case "Acapulco" -> new Acapulco();
                default -> throw new NameNotFoundException();
            };

            hash_destines.put(key, destine);
            return destine;
        }

        return hash_destines.get(key);
    }
}

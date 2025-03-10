package FacadePattern;

import java.util.HashMap;
import java.util.Map;

public class Cache {
   private Map<String,Row> cache = new HashMap<>();

    public Row get(String name) {
        if(cache.containsKey(name)){
            return cache.get(name);
        }
        return null;
    }

    public void put(String name,Row row){
        cache.put(name,row);
    }
}

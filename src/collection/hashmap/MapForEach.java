package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapForEach {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put(null,"3");
        map.put("2",null);
        map.put("4","4");

        for(String key:map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        map.forEach((k,v)->System.out.println(k + ":" + v));


        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}

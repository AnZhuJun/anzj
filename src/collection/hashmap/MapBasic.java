package collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasic {
    public static void main(String[] args) {
        Map<String,String> data = new HashMap<>();

        data.put("A","A");
        data.put("B","B");
        data.put("C","C");
        data.put("D","D");
        data.put(null,"A");
        System.out.println(data);

        String str = data.get(null);
        System.out.println(str);

        String cc = data.getOrDefault("DD","gkd");
        System.out.println(cc);

        boolean isExist = data.containsKey("D");
        System.out.println(isExist);

        Set<Map.Entry<String,String>> entrySet = data.entrySet();
        System.out.println(entrySet);
        System.out.println(entrySet.size());

        Map<String,String> back = new HashMap<>(data);
//        back.putAll(data);
        System.out.println(back);

//        String nullValue = data.remove(null);
        System.out.println(data);
//        System.out.println(nullValue);

        Set<String> keySet = data.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = data.values();
        System.out.println(valueSet);
    }
}

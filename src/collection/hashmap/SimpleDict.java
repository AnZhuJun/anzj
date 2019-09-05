package collection.hashmap;

import java.util.*;

public class SimpleDict {
    public static void main(String[] args) {
        Map<String,List<String>> dict = new HashMap<>();

        genericDict(dict);

//        System.out.println(dict);
        loopDictBook(dict);
    }

    private static void loopDictBook(Map<String, List<String>> dict) {
        Iterator<Map.Entry<String,List<String>>> iDict = dict.entrySet().iterator();
        String strDict = "";

        while(iDict.hasNext()){
            Map.Entry<String,List<String>> entryDict = iDict.next();
            String key = entryDict.getKey();
            List<String> valueList = entryDict.getValue();

            strDict  = strDict + "{" + key + ": [";

            for(String word : valueList){
                strDict = strDict + word + " ";
            }
            strDict = strDict + "]} ";

        }

        System.out.println(strDict.toString());
    }

    private static void genericDict(Map<String, List<String>> dict) {
        List<String> listA = new ArrayList<>();
        listA.add("apple");
        listA.add("add");
        listA.add("about");
        listA.add("ajax");
        dict.put("A",listA);

        List<String> listB = new ArrayList<>();
        listB.add("banana");
        listB.add("bat");
        listB.add("bite");
        listB.add("bike");
        dict.put("B",listB);

        List<String> listC = new ArrayList<>();
        listC.add("cat");
        listC.add("circle");
        listC.add("car");
        listC.add("chocolate");
        dict.put("C",listC);
    }
}

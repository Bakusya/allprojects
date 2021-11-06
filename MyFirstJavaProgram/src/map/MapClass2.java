package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass2 {
    public static void main(String[] args) {
        Map<Integer, String> ageNames = new LinkedHashMap<>();
        ageNames.put(15, "Sanira");
        ageNames.put(20, "Jane");
        ageNames.put(6, "Kim");
        ageNames.put(79, "Ann");
        System.out.println(ageNames);
        System.out.println(ageNames.keySet());
        System.out.println(ageNames.containsKey(15));
        System.out.println(ageNames.values());
        System.out.println(ageNames.entrySet());
        // Iterator with Map.Entry
        Iterator<Map.Entry<Integer, String>> iter = ageNames.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer, String> entry = iter.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        String str = "Hello";
        System.out.println(str.toUpperCase());
        // Iterator with keySet()
        Iterator<Integer> iterator = ageNames.keySet().iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i + " " + ageNames.get(i));
        }
        // Iterator with foreach loop
        for (Integer i : ageNames.keySet()) {
            System.out.println(i + " " + ageNames.get(i));
        }
        for (String v : ageNames.values()){
            System.out.println(v);
        }
    }
}


package map;

import java.util.*;

public class MapClass1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<String> setList = new HashSet<>();
        Map<String, String> listOfStudents = new HashMap<>();
        Map<Boolean, Float> map1 = new HashMap<>();

        // Map Methods

        // put()

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(25, "James");
        map2.put(1, "Kate");
        map2.put(9, "Jim");
        map2.put(7, "William");
        System.out.println("HashMap: " + map2);

        // putAll()

        Map<Integer, String> map3 = new LinkedHashMap<>();
        map3.putAll(map2);
        System.out.println("LinkedHashMap: " + map3);
        Map<Integer, String> map4 = new TreeMap<>();
        map4.putAll(map2);
        System.out.println("TreeMap: " + map4);

        //  key     value

        Map<String, String> map5 = new TreeMap<>();
        map5.put("London", "UK");
        map5.put("Ottawa", "Canada");
        map5.put("Nursultan", "Kazakhstan");
        map5.put("Bishkek", "Kyrgyzstan");
        map5.put("Astana", "Kazakhstan");
        System.out.println(map5);

        // Keys mut be unique
        // Values can contains duplicates


        // get(key)  --> return value

        System.out.println(map5.get("Astana"));

        // replace()

        System.out.println(map5.replace("Nursultan", "KZ"));
        System.out.println(map5);
        System.out.println(map5.get("Ottawa"));

        // size()

        System.out.println(map5.size()); // 5

        // containsKey()

        System.out.println(map5.containsKey("Bishkek")); // true
        System.out.println("_______________________________");

        // containsValue()

        System.out.println(map5.containsValue("Kazakhstan")); // true

        // keySet()

        System.out.println(map5.keySet()); // [Astana, Bishkek, London, Nursultan, Ottawa]

        // values()

        System.out.println(map5.values());  // [Kazakhstan, Kyrgyzstan, UK, KZ, Canada]

        // remove()

        map5.remove("Astana");
        System.out.println(map5); // {Bishkek=Kyrgyzstan, London=UK, Nursultan=KZ, Ottawa=Canada}

        // clear()

//        map5.clear();
        System.out.println(map5); // {}

        // isEmpty()

        System.out.println(map5.isEmpty()); // true
        System.out.println("_____________________");
        System.out.println(map5); // {Bishkek=Kyrgyzstan, London=UK, Nursultan=KZ, Ottawa=Canada}
        System.out.println(map5.entrySet()); // [Bishkek=Kyrgyzstan, London=UK, Nursultan=KZ, Ottawa=Canada]
        System.out.println(map5.keySet()); // [Bishkek, London, Nursultan, Ottawa]
        System.out.println(map5.values()); // [Kyrgyzstan, UK, KZ, Canada]

        // TreeMap sorted by keys
        // All values of variables and objects has indexes
        // Only Map doesn't have indexes, but has keys

        List<String> list1 = new ArrayList<>(Arrays.asList("Day", "Week", "Month"));
        System.out.println(list1);
        Map<String, Double> priseOfFruits = new TreeMap<>();
        priseOfFruits.put("Apple", 65.30);
        priseOfFruits.put("Banan", 86.50);
        priseOfFruits.put("Orange", 150.20);
        priseOfFruits.put("Pitch", 130.79);
        Iterator<String> iter = priseOfFruits.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println("Fruit: " + key + "\t Price: " + priseOfFruits.get(key));
        }
        System.out.println("_____________________________________________________________");
        Iterator<Map.Entry<String, Double>> it = priseOfFruits.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,Double> entry = it.next();
            System.out.println("Fruit: " + entry.getKey() + "\t Price: " + entry.getValue());
        }
        System.out.println(priseOfFruits.keySet());
        System.out.println(priseOfFruits.values());
        System.out.println(priseOfFruits.entrySet());
        System.out.println(priseOfFruits.get("Apple"));

    }
}

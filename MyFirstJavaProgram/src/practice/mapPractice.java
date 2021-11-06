package practice;

import java.util.*;

public class mapPractice {
    public static void main(String[] args) {

        Map<Integer, String> map4 = new HashMap<>();
        map4.put(10, "ten");
        map4.put(5, "five"); // duplicate
        map4.put(100, "hundred"); // duplicate
        map4.put(0, "zero");
        map4.put(101, "hundred"); // duplicate
        map4.put(50, "five"); // duplicate
        System.out.println(removeDublicateValue(map4));


    }

    public static Map<Integer, String> removeDublicateValue(Map<Integer, String> map) {
       Iterator <Map.Entry<Integer,String>> itr = map.entrySet().iterator();

       while (itr.hasNext()){
           Map.Entry<Integer,String> entry = itr.next();
           Integer  key = entry.getKey();
           String value = entry.getValue();
          // String nextValue = map.get(key);

           if (map.get(key).equals(value)){
               map.remove(key);
           }
       }return map;

    }

}
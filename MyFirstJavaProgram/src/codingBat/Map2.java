package codingBat;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {
        String [] str = {"salt","tea","soda","toast"};

        System.out.println(word0(str));
        System.out.println(firstChar(str));

    }
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
                map.put(strings[i], 0);

        }return map;

    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
            map.put(strings[i],strings[i].length());
        }return map;


    }
    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++){
            String str = strings[i];
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length() - 1));
            map.put(first,last);

        }return map;

    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i]) + 1);
            }else {
                map.put(strings[i], 1 );
            }
        }return map;

    }
    public String wordAppend(String[] strings) {
        String word = "";
        for (int i = 0; i < strings.length; i++){
            if(strings[i].length() % 2 == 0){
                word += strings[i];
            }
        }return word;


    }
    public static Map<String, String> firstChar(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i].substring(0,1))){
                map.put(strings[i].substring(0,1), map.get(strings[i].substring(0,1)) + strings[i]);
            }else {
                map.put(strings[i].substring(0,1), strings[i]);
            }

        }return map;

    }
}

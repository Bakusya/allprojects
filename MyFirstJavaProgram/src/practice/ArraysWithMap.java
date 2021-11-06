package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArraysWithMap {
    public static void main(String[] args) {

        // TASK: Create a map which will take the indexes of the array as keys and elements as values

        String[] arrCities = {"Bishkek", "Dubai", "Stambul", "Moscow", "Chicago"};

        // TASK: Need to reverse the ArrayList;

        ArrayList<String> list = new ArrayList<>();
        list.add("Akyl");
        list.add("Bakulya");
        list.add("Sanira");
        list.add("Baha");
        list.add("Ilyaz");
        list.add("Meerim");
        System.out.println(list);
        int lastIndex = list.size()-1;
        String example = null;
        List<String> reverseList = new ArrayList<>();
        int last = list.size()-1;
        for (int x = last; x >= 0; x--){
            String name = list.get(x);
            reverseList.add(name);
        }
        System.out.println("1: " + reverseList);
        for (int i = 0; i < lastIndex; i++){
            example = list.remove(lastIndex);
            list.add(i,example);
        }
        System.out.println(list);


//        String str1 = "Cat";
//        String str2 = "Cat";
//        String str3 = new String("Cat");
//        System.out.println(str1==str2); // true
//        System.out.println(str1.equals(str2)); // true
//        System.out.println(str1 == str3); // false
//
//        int [] array = new int[10];
//        int [] arr1 = {1,2,3,4,5,6,7,8,9,0,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
//
//        System.out.println(Arrays.toString(arr1));
//
//        Integer abc = 10;
//        System.out.println();



    }
}

package arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String  cars[] = {"bmv", "volvo","ford"};
        String result = "Ford";
        for ( int i = 0; i < cars.length; i++){
            if (cars[i].equalsIgnoreCase("ford")){
                System.out.println(cars[i]);
            }

        }

        String [] cars2 = {"Volvo","FORD","BMW","FORD","Mazda","Toyota","Mazda","FORD","BMW","Toyota","Volvo","Mercedes","Volvo"};
        int amountOfVolvo = 0;
        for (int i = 0; i < cars2.length; i++) {
            if (cars2[i].substring(0).equalsIgnoreCase("Ford")) {
                System.out.println();
            }

//        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false

//        int number [] = {8,8,6,9};
//        System.out.println(firstLast(number));
//
//        int number1 [] = {2,3,6,2};
//        System.out.println(sameFirstLast(number1));

//    }
//     public static boolean firstLast ( int a []){
//         if (a[0] == 6 || a[a.length - 1] == 6){
//             return true;
//         }return false;
//     }
//     public static boolean sameFirstLast (int x []){
//         if (x[0] == x[x.length - 1]){
//           return true;
//         }return false;
//
//     }


        }
    }}

package set;

import java.util.*;

public class SetClass3 {
    public static void main(String[] args) {
      int number[] = {1,1,1,5,5,5,66,7,9,9,9};
       Integer[] newArray = new Integer[number.length];



        for (int l = 0 ; l < newArray.length; l++) {
            newArray[l] = Integer.valueOf(number[l]);
        }
        System.out.println(Arrays.toString(newArray));
       Set <Integer> mySet = new TreeSet<>(Arrays.asList(newArray));
        System.out.println(mySet);


        int arr [] = {1,2,3,4,5,6,7,8,9};
        for (int i = arr.length-1; i >= 0; i--){

            System.out.print(arr[i]);
        }

    }
















}


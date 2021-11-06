package arrays;

import java.util.Arrays;

public class ArraysClass4 {
    public static void main(String[] args) {
        int arr [] = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));
        int arr1 [] = {1,2};
        System.out.println(arr1[0]); // 1
        System.out.println(Arrays.toString(arr1));
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 0; a < arr1.length; a++){
            System.out.print(arr1[a]);
        }
        System.out.println();
        String names [] = {"Jane", "Kate", "Emily"};
        names[0] = "Jenifer";
        System.out.println(Arrays.toString(names)); // [Jenifer, Kate, Emily]
        if (names[1].equals("Kate")){
            names[1] = "Katerine";
            System.out.println(Arrays.toString(names));
        }
        int arr2 [][] = new int[][]{{12, 67}, {40, 50}};
        System.out.println(Arrays.deepToString(arr2));
        int arr3 [][] = new int[2][3];
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6;
        System.out.println(Arrays.deepToString(arr3));
        arr3[1][2] = 60;
        System.out.println(arr3[1][2]);
        for (int i = 0; i < arr3.length; i++){
//            System.out.println(Arrays.toString(arr3[i]));
            for (int x = 0; x < arr3[i].length; x++){
                System.out.print(arr3[i][x] + ", ");
            }
            System.out.println();
        }
        int arr4[] = {5, 10 ,15};
        System.out.println(Arrays.toString(arr4));
        arr4[2] = 100;
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(new int[]{12, 56, 0}));
        int arr6 [][] = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr6.length; i++){
            for (int j = 0; j < arr6[i].length; j++){
                System.out.print(arr6[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________");
        double arr5[] = {90.5, 12.4, 0.43, 56.1, 67.9};
        // Arrays.toString() ---> convert to String
        System.out.println(Arrays.toString(arr5));
        // Arrays.sort() ---> sorting each items. We can use sort method outside of SOUT. We can call sort method before, and after we can call toString method
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        String cars[] = {"Mercedes", "BMW", "!Bugatti", "Audi", "Toyota"};
        Arrays.sort(cars);  // [Audi, BMW, Bugatti, Mercedes, Toyota]
        System.out.println(Arrays.toString(cars));
        // Arrays.binarySearch() --> find index after sorting
        // binarySearch without sorting --> unpredictable
        // binarySearch always works after Arrays.sort()
        //             0    1  2  3   4  5
        int [] nums = {23, 89, 0, 3, 58, 2};
        System.out.println(nums[4]);
        System.out.println("Before sorting: " + Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums,2)); // -4
        Arrays.sort(nums);
        System.out.println("After sorting" + Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 23)); // 1

    }
}

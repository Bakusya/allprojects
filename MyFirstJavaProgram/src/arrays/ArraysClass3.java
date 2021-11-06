package arrays;

import java.util.Arrays;

public class ArraysClass3 {
    public static void main(String[] args) {

        // Single dimensional arrays

        int nums1 [] = new int[2];
        int nums2 [] = new int[]{9, 6};

        // Multi dimensional arrays

        int arrs [][] = new int[2][2];
        arrs[0][0] = 10;
        arrs[0][1] = 20;
        arrs[1][0] = 30;
        arrs[1][1] = 40;
        System.out.println(Arrays.deepToString(arrs));
        //                               0         1
        int arrs2 [][] = new int[][]{{10, 20}, {30, 40}};
        //                            0    1  |  0    1
        System.out.println(Arrays.deepToString(arrs2));
        int numbers[][] = new int[2][1];
        numbers[0][0] = 5;
        numbers[1][0] = 7;
        System.out.println(Arrays.deepToString(numbers));
        //                               0    1
        int numbers2 [][] = new int[][]{{5}, {7}};
        //                               0    0
        System.out.println(Arrays.deepToString(numbers2));
        int [][] arrays = new int[3][2];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[1][0] = 3;
        arrays[1][1] = 4;
        arrays[2][0] = 5;
        arrays[2][1] = 6;
        System.out.println(Arrays.deepToString(arrays));
        int arrays2 [][] = new int[][]{{1,2}, {3,4}, {5,6}};
        System.out.println(Arrays.deepToString(arrays2));
        arrays2[2][0] = 50;
        System.out.println(Arrays.deepToString(arrays2));
        arrays2[0][1] = 20;
        System.out.println(Arrays.deepToString(arrays2));
        System.out.println( arrays2[1][1]); // 4
        System.out.println(arrays2[2][1]);  // 6
        int digits [][] = new int[3][];
        digits[0] = new int[1];
        digits[1] = new int[4];
        digits[2] = new int[2];
        digits[0][0] = 10;
        digits[1][0] = 20;
        digits[1][1] = 30;
        digits[1][2] = 40;
        digits[1][3] = 50;
        digits[2][0] = 60;
        digits[2][1] = 70;
        System.out.println(Arrays.deepToString(digits));
        //                              i             i           i
        int digits2 [][] = new int[][]{{10}, {20,30, 40, 50}, {60, 70}};
        //                              j   |  j  j   j   j  |  j  j
        System.out.println(Arrays.deepToString(digits2));
        // Use for loop for multi dimensional arrays
        for (int i = 0; i < digits2.length; i++){
            for (int j = 0; j < digits2[i].length; j++){
                System.out.print(digits2[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Length of digits2: " + digits2.length); // 3
        int numms1 [][][] = new int[2][2][1];
        numms1[0][0][0] = 29;
        numms1[0][1][0] = 76;
        numms1[1][0][0] = 45;
        numms1[1][1][0] = 12;
        System.out.println(Arrays.deepToString(numms1));

        int numm2[][][] = new int[][][] {{{29},{76}},{{45},{12}}};
        System.out.println(Arrays.deepToString(numm2));

        for ( int i = 0; i < numm2.length;i++){
            for (int l = 0; l < numm2[i].length; l++){
                for (int m = 0; m < numm2[l][m].length; m++){
                    System.out.print(numm2[i][l][m] + ",");
                }
            }
            System.out.println();
        }
        // to do
        // create numms2 (int numms1 [][][] = new int[2][2][1];) --> int numms1 [][][] = new int[][][]{{....}};
        // print multi dimensional arrays with deepToString
        // print via nested loops
    }
}

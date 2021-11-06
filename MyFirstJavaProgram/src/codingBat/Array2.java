package codingBat;

import javax.swing.*;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2};
        int n = 10;
        System.out.println(countEvens(nums));
        System.out.println(bigDiff(nums));
        System.out.println(sum13(nums));
        System.out.println(has22(nums));
        System.out.println(Arrays.toString(fizzArray(n)));
        System.out.println(Arrays.toString(fizzArray2(n)));
        System.out.println(modThree(nums));


    }

    public static int countEvens(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result++;
            }
        }
        return result;

    }

    public static int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, min);
        }
        return max - min;


    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;

            } else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

//    public static int sum67(int[] nums) {
//    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;

    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;

    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum = sum + nums[i];
            }
            if (sum == 8) {
                return true;
            }

        }
        return false;

    }

    public boolean more14(int[] nums) {
        int number1 = 0;
        int number4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                number1++;
            }
            if (nums[i] == 4) {
                number4++;
            }
        }
        return number1 > number4;

    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;

    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;

    }

    public static String[] fizzArray2(int n) {
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {

        }
        return str;

    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (!(nums[i] == val || nums[i + 1] == val)) {
                return false;
            }
        }
        return true;

    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
        }
        for (int l = 0; l < nums.length - 2; l++) {
            if (nums[l] == 7 && nums[l + 2] == 7) {
                return true;
            }
        }

        return false;


    }
    public static boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i + 1] % 2 == nums[i + 2] % 2) {
                return true;
            }
        }return false;
    }
    public boolean haveThree(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if ( nums[i] == 3){
                count++;
            }
        }if (count != 3){
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 3 && nums[i+1] == 3){
                return false;
            }
        } return true;


    }
    public boolean twoTwo(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i] == nums[i + 1]) {
                i++;
            } else if (nums[i] == 2) {
                return false;
            }
        }
            if(nums.length == 1 && nums[0] == 2){
                return false;
            }if ( nums.length > 1 && nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2){
                return false;

        }return true;

    }
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if((nums[i] + 1 == nums[i+1]) && (nums[i+1] +1 == nums[i+2])){
                return true;
            }
        }return false;

    }
    public int[] fizzArray3(int start, int end) {
        int [] result = new int[end - start];
        for (int i = 0; i < result.length; i++){
            result[i] = start + i;
        }return result;

    }
    public int[] shiftLeft(int[] nums) {
        int result [] = new int[nums.length];
        if (nums.length < 2){
            return nums;
        }
        for (int i = 0; i < result.length - 1; i++){
            result[i] = nums[i+1];
            result[result.length - 1] = nums[0];
        }

        return result;

    }




}







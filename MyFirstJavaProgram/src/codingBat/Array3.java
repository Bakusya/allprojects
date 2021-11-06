package codingBat;

public class Array3 {
    public static void main(String[] args) {

    }
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 3){
                int num1 = nums[i+1];
                nums[i + 1] = 4;
                for (int n = i + 2; n < nums.length; n++){
                    if (nums[n] == 4){
                        nums[n] = num1;
                    }
                }
            }
        }return nums;

    }





}

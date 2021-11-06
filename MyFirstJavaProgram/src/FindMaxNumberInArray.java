import java.util.Arrays;

public class FindMaxNumberInArray {
    public static void main(String[] args) {
        FindMaxNumberInArray obj = new FindMaxNumberInArray();
        int [] arr = {100,200,3000,1000};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        System.out.println(max);

        //System.out.println(obj.findMax(arr));

        String name = "rahat";
        System.out.println(name.substring(name.length()/2));



    }
    public  int  findMax (int nums []){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }

        }return max;
    }

}

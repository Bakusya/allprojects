package sprint1;

public class SumOfCubesArray {
    public static void main(String[] args) {
       SumOfCubesArray obj = new SumOfCubesArray();
       int [] number = {10,10,10};
        System.out.println(obj.sumOfCubes(number));



    }
    public int sumOfCubes (int []  nums){
        int sumCubes = 0;
        for (int i = 0; i < nums.length; i++){
            sumCubes += nums[i] * nums[i] * nums[i];
        }return sumCubes;
    }
}

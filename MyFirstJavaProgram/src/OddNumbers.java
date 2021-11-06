import java.util.Arrays;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        OddNumbers on = new OddNumbers();
        int nums = sc.nextInt();
        System.out.println(on.oodNum(nums));


    }
    public int [] oodNum (int nums){
        int a [] = new int[nums];
        for (int i = 0; i < nums; i++){
            if(a[i] % 2 !=  0){
                a[i] = i;

            }
        }return a;

    }
}

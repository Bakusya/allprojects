package sprint1;

import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array ");
        int size = sc.nextInt();
        int [] myArray = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");


        for (int i = 0; i <size; i++){
            myArray[i]=sc.nextInt();
            sum =sum+myArray[i];

        }
        System.out.println("The sum is "  + sum);

    }
}

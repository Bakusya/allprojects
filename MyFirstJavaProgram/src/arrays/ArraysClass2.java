package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass2 {

    public static void main(String[] args) {
        int years [] = new int [5];
        years [0] = 1;
        years [1] = 2;
        years [2] = 3;
        years [3] = 4;
        years [4] = 5;
        System.out.println(years[4]); // 5
        for (int i: years) {
            System.out.println(i); // 1 2 3 4 5
        }
        for (int x = 0; x < years.length; x++){
            System.out.println(years[x]); // 1 2 3 4 5
        }
        int ages [] = new int[]{12, 7, 89};
        System.out.println(ages);
        int numbers [] = {34, 9, 1};
        System.out.println(sum(5,5));
        printArray(numbers);
        //Anonymous array
        printArray(new int[]{12, 45, 8, 39});
        System.out.println("__________________________");
        int [] myNewArray = arrayFromUser();
        System.out.println("Array created is : " + Arrays.toString(myNewArray));
        System.out.println("__________________________");
    }
    // passing Array to a Method
    // void method
    public static void printArray(int [] arr){
        for (int d : arr) {
            System.out.println(d );
        }
    }
    // return method
    // Enter the size of the array that is to be created:
    // 3
    // Enter the elements of the array:
    // 4
    // 7
    // 1
    // Array created is : 4, 7, 1
    // int [] numbers = new int[3];
    // numbers[0] = 4;
    // numbers[1] = 7;
    // numbers[2] = 1;
    // ...?  --> 4, 7, 1
    public static int[] arrayFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created:");
        int size = scanner.nextInt();  // 3
        int[] elements = new int[size];  // int[] elements = new int[3];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++){
            elements[i] = scanner.nextInt();
        }
        return elements;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static long sum(long a, long b){
        return  a + b;
    }
}






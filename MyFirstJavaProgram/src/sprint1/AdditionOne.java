package sprint1;

import java.util.Scanner;

public class AdditionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        System.out.println(addition(number));

    }
    public static int addition ( int n){
     return n + 1;

    }
}

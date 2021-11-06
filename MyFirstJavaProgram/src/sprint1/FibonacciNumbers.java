package sprint1;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int n;
        int f1 = 0;
        int f2 = 0;
        int f3 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value Of n");
        n = sc.nextInt();
        f1 = 0;
        f2 = 1;
        System.out.print("Fibonacci numbers: ");

        for (int i = 1; i <= n; i++){
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            System.out.print(f1 + " ");
        }
    }
}

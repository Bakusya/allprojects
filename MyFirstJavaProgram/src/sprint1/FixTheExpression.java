package sprint1;

import java.util.Scanner;

public class FixTheExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Введите число семь ");
        number = scan.nextInt();
        System.out.println(challengeIsSeven(number));
    }
    public static boolean challengeIsSeven (int x){
        if (x == 7){
            return true;
        }return false;
    }
}

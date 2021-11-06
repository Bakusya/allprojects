package homework;

import java.util.Scanner;

public class HomeWorkClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to spend? ");
        int buy = scan.nextInt();
        int discount10 = 1000;
        int discount20 = 2000;

        if (buy >= discount10 && buy < discount20) {
            System.out.println(" You have  10 % discount");
        } else if (buy >= discount20) {
            System.out.println("You have  20 % discount");
        } else {
            System.out.println("You have no discount");
        }

    }
}


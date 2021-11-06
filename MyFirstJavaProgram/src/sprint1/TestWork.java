package sprint1;

import java.util.Scanner;

public class TestWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros=0;
        String user;

        do { System.out.println("Enter the number");
            int num = sc.nextInt();

            if (num > positive) {
                positive = num;
            }
            if (num < positive  ) {
                negative = num;
            }
            System.out.println("Do you want continue? ");
            user = sc.next();
        } while (user.equalsIgnoreCase("yes"));

        System.out.println("positive number :" +  positive);
        System.out.println("negative number is:" + negative);
        System.out.println(("Zeros " +  zeros));
    }
}

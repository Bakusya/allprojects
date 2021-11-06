package sprint1;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int max = 0;
        int min = 0;
        String answer;

        do { System.out.println("Enter the number");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < max  ) {
                min = number;
            }
            System.out.println("Do you want continue, yes or no? ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("yes"));


        System.out.println("Largest number :" + max);
        System.out.println("Smallest number is:" + min);
    }
}
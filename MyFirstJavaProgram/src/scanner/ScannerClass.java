package scanner;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        int num = 17;
        int number = 39;
        int kolkln = 67;
        // [new] --> key word, which means creating new object
        Scanner input = new Scanner(System.in);  // We created object of Scanner
//        String login = input.nextLine();   // String name = "Sanira";
//        int password = input.nextInt();    // int password = 2021;
//        double infoAboutProfile = input.nextDouble();
//        System.out.println("Your login is: " + login);
//        System.out.println("Your password is: " + password);
//        System.out.println("Your profile is completed: " + infoAboutProfile + "%");
        System.out.println("Which brand do you prefer?");
        String brandOfPhone = input.nextLine();
        System.out.println("Your favorite brand is " + brandOfPhone);
        System.out.println("Please enter version of phone");
        String versionOfPhone = input.nextLine();
        System.out.println("You choose " + versionOfPhone);
        //Scanner --> is object. get info from user
        // Data Types:
        // 1. Primitive      byte, short, int, long, float, double, char, boolean
        // 2. Non-primitive  String, Scanner,
        // In Java OBJECT is all except Primitive Data Types --> (Non-Primitive data type ==> Object)








    }
}

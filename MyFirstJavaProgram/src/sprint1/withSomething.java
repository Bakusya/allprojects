package sprint1;

import java.util.Scanner;

public class withSomething {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to string");
        String str1 = sc.nextLine();
        System.out.println(giveMeSomething(str1));

    }
    public static String giveMeSomething ( String str){
        String firstWord = "something";
        return firstWord + " " + str;
    }
}

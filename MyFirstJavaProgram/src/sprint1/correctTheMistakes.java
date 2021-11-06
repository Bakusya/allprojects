package sprint1;

import java.util.Scanner;

public class correctTheMistakes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число");
        int squared1 = scan.nextInt();
        squared(squared1);


    }

    public static int squared (int a){

        int result = a * a;
        System.out.println("squared" + "(" + a + ")" + " -> " + result);
        return result;
    }
}

package sprint1;

import java.util.Scanner;

public class CountWordsTest {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String user = obj.nextLine();
        int count = 0;


        for (int i = 0; i < user.length(); i++) {
            if (user.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("you enter " + count + " words");



    }
}

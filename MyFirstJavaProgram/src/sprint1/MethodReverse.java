package sprint1;

import java.util.Scanner;

public class MethodReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        String word = sc.nextLine();
        System.out.println(reverse(word));

    }
    public static String reverse ( String str){
        String newString = "";
        for(int i = str.length() - 1; i >= 0; i--){
            newString += str.charAt(i);

        }return newString;
    }
}

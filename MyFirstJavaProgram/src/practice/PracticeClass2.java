package practice;

import java.util.Scanner;

public class PracticeClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ...");
        String str = input.nextLine();
        System.out.println("Enter");



        System.out.println(sumL("hellohello", 'l'));

    }
    public static int sumL (String str, char ch){
        int sum = 0;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == ch){
                sum ++;
            }
        } return sum;
    }

    }


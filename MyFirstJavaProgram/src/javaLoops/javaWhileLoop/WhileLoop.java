package javaLoops.javaWhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++){
            System.out.println(i);  // 1 2 3
        }
        System.out.println("While loop:");
        int i = 8;
//    8 <= 10
        while(i <= 10){ // true: 8<10; 9<10; false: 10==10
            System.out.println(i);
            ++i;
        }
        String name = "James";
        int b = 3;
        while ( b <= 6){ // 3 4 5 6
            System.out.println(b + " -> " + name);
            b++;
        }
//        System.out.println("____________________");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your number (from 0 to 5)");
//        int numberFromUser = sc.nextInt();
//        int count = 1;
//        while (count <= numberFromUser) {  // 1 <= 3
//            System.out.println(count);
//            count++;
//        }

            int m = 0;
            while (m < 10){
                if (m == 4){
                    m++;
                    continue;
                }
                System.out.println(m);
                m++;
            }
        }
    }


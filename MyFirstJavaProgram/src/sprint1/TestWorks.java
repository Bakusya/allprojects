package sprint1;

import java.util.Scanner;

public class TestWorks {
    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        System.out.println("Hi Baktygul");
        System.out.println("Please enter your numbers");
        int a=obj.nextInt();
        System.out.println("Please enter 2 number");
        int b= obj.nextInt();
        System.out.println(integers(a,b));

    }

    public static boolean integers(int a, int b){
        if(a%b != 0){
            return false;
        }
        else {
            return true;
        }
    }
}




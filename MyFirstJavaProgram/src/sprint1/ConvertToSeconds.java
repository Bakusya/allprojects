package sprint1;

import java.util.Scanner;

public class ConvertToSeconds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your hour  ");
        int hours = sc.nextInt();
        System.out.println("Enter your minute");
        int minutes = sc.nextInt();
        System.out.println(convert(hours,minutes));

    }
    public static double convert (int x, int y){
        int result1 = x * 3600;
        int result2 = y * 60;
        System.out.println("In " + x + "h" + " " + y  + "min");
        return result1 + result2 ;

    }

}

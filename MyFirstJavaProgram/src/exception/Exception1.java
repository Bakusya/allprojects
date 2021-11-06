package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception1 {
    public static void main(String[] args) {
        for (int p = 0; p < 3; p++){
            System.out.println(p + " -- FOR LOOP");
        }
        System.out.println("____________________________________________");
        int num = 29;
        try{
            System.out.println(num/1);
        }
        catch (NullPointerException n){
            System.out.println("in 1-catch");
        }
        catch (ArithmeticException e){
            System.out.println("in 3-catch");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("in 2-catch");
        }
        finally {
            System.out.println("This block always works");
        }
        System.out.println("____________________________________________");
        try {
            System.out.println(78/0);
        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException exception){
            System.out.println("I handle exception for 78/0");
        }
        finally {
            System.out.println("Cool, it work!");
        }
        System.out.println("____________________________________________");
        try {
            System.out.println(90/0);
        } catch (Exception e){
            System.out.println("Keep going...!");
        }
        System.out.println("____________________________________________");
        String str = "Hello";
        System.out.println(str + " world!");
        System.out.println("____________________________________________");
        int [] arr = new int[5];
        arr[1] = 89;
        //                     89   +   0
        System.out.println(arr[1] + arr[3]); // 89  0  0
        int result = arr[1] + arr[3];
        System.out.println(result);
        try {
            arr[20] = 90;
            System.out.println(arr[20]);
        } catch (Exception e){
            System.out.println("Its ok, keep going");
        }
        System.out.println("njckdsnheksafnm");
        try{
            String str1 = "Welcome";
            if (str1.contains("Welcome")){
                str1 = null;
            }
            System.out.println(str1.length());
        } catch (NullPointerException n){
            System.out.println("Work work work");
        }
    }
    File file = new File("Text.txt");
     FileReader reader;
    {
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


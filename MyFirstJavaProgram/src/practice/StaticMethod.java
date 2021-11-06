package practice;

public class StaticMethod {
    public static void main(String[] args) {

//        convert(5) ➞ 300
//        convert(3) ➞ 180
//        convert(2) ➞ 120
       // Write a function that takes an integer minutes and converts it to seconds.

        System.out.println(functionMethod(5));

    }

    public static int functionMethod (int convert) {
        int result = 60 * convert;
        return result;
    }

//    Don't forget to return the result.
//            6:39
//    Create a method that takes two integers as arguments and return their sum.
//    Examples
//    SumOfTwoNumbers(3, 2) ➞ 5
//    SumOfTwoNumbers(-3, -6) ➞ -9
//    SumOfTwoNumbers(7, 3) ➞ 10
//    Notes
//    Don't forget to return the result.


}

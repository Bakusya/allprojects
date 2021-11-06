package practice;

public class TuesdayPractice {
    public static void main(String[] args) {


        System.out.println(front22("abc"));
        System.out.println(front22("ha"));
        System.out.println(front22("kitten"));

        System.out.println(reverseTheString("Hello World"));
        System.out.println("------------------------");;

        System.out.println(startHiIgnoreCase("HI"));
        System.out.println(startHi("HI"));
        System.out.println(startHi("hi hello"));
        System.out.println(startHi("hello"));

        //Create a function that takes two strings as arguments and
        // return either true or false depending on whether the total number
        // of characters in the first string is equal to the total number of characters in the second string.
        //
        //Examples
        //comp("AB", "CD") ➞ true
        //
        //comp("ABC", "DE") ➞ false
        //
        //comp("hello", "edabit") ➞ false
        //Notes
        //Don't forget to return the result.
        System.out.println(comp("AB","TD"));
        System.out.println(comp("abc","ah"));
        System.out.println(length1("apple"));
        System.out.println(length1("hi"));
        System.out.println(isEmpty(" "));
        System.out.println(isEmpty(""));
        System.out.println(divisibleBy(5));
        System.out.println(divisibleBy(6));
        System.out.println(notDivisibleBy(5));
        System.out.println(returnNegative(5));
        System.out.println(returnNegative(-5));
        System.out.println(makesTen(9,9));
        System.out.println(makesTen(9,10));
        System.out.println(makesTen(1,9));
        System.out.println(makesTen(2,8));
        System.out.println(lessThan100(10,10));
        System.out.println(lessThan100(100,1));
        System.out.println(lessThan100(99,0));
        System.out.println(lessThan100(99,1));
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));
    }



        public static boolean comp(String str1, String str2){

            if (str1.length() == str2.length()){
                return true;
            }
            else
                return false;
        }

        // Write a function that returns the length of a string. Make your function recursive.
        //
        //Examples
        //length("apple") ➞ 5
        //
        //length("make") ➞ 4
        //
        //length("a") ➞ 1
        //
        //length("") ➞ 0

        public static int length1(String word){
            int result = word.length();
            return result;
        }

        //Create a function that returns true if a string is empty and false otherwise.
        //
        //Examples
        //isEmpty("") ➞ true
        //
        //isEmpty(" ") ➞ false
        //
        //isEmpty("a") ➞ false
        //Notes
        //A string containing only whitespaces " " does not count as empty.
        //Don't forget to return the result.

        public static boolean isEmpty(String word){
            if (word.isEmpty()){
                return true;
            }
            else
                return false;
        }


        //Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
        //
        //Examples
        //divisibleByFive(5) ➞ true
        //
        //divisibleByFive(-55) ➞ true
        //
        //divisibleByFive(37) ➞ false
        //Notes
        //Don't forget to return the result.


        public static boolean divisibleBy(int num){
            if (num % 5 == 0 ){
                return true;
            }
            else return false;
        }

        public static boolean notDivisibleBy(int num){

            if (num % 5 != 0 ){
                return true;
            }
            else return false;
        }


        //Create a function that takes a number as an argument and returns negative of that number. Return negative numbers without any change.
        //
        //Examples
        //returnNegative(4) ➞ -4
        //
        //returnNegative(15) ➞ -15
        //
        //returnNegative(-4) ➞ -4
        //
        //returnNegative(0) ➞ 0


        public static int returnNegative(int num){

            if (num < 0){
                return num;
            }else {
                return (-num);
            }
        }

        // Create a function that takes two arguments.
        // Both arguments are integers, a and b.
        // Return true if one of them is 10 or if their sum is 10.
        //
        //Examples
        //makesTen(9, 10) ➞ true
        //
        //makesTen(9, 9) ➞ false
        //
        //makesTen(1, 9) ➞ true

     public static boolean makesTen(int a , int b){
            if (a == 10 || b == 10  || a + b == 10 ){
                return true;
            }
            else return false;
        }


        //Given two numbers, return true if the sum of both numbers is less than 100.
        // Otherwise return false.
        //
        //Examples
        //lessThan100(22, 15) ➞ true
        //// 22 + 15 = 37
        //
        //lessThan100(83, 34) ➞ false
        //// 83 + 34 = 117
        //
        //lessThan100(3, 77) ➞ true
        public static boolean lessThan100(int a , int b){

            if (a + b <= 100){
                return true;
            }else return false;
        }


        //Given a string, return true if the string starts with "hi" and false otherwise.
        //
        //
        //startHi("hi there") → true
        //startHi("hi") → true
        //startHi("hello hi") → false

        public static boolean startHi(String word){
            if (word.startsWith("hi")){
                return true;
            }else return false;
        }
        // HI
        public static boolean startHiIgnoreCase(String word){
            String result = "";
            result = word.toLowerCase();
            if (result.startsWith("hi")){
                return true;
            }else return false;
        }

        /// String ("Hello World) ---> "dlroW olleH"

        public static String reverseTheString(String str){

            StringBuilder sb1 = new StringBuilder(str);
            sb1.reverse();
            return sb1.toString();
        }

        //Given a string, take the first 2 chars and return the string
        // with the 2 chars added at both the front and back,
        // so "kitten" yields"kikittenki".
        // If the string length is less than 2, use whatever chars are there.
        //
        //
        //front22("kitten") → "kikittenki"
        //front22("Ha") → "HaHaHa"
        //front22("abc") → "ababcab"

        public static String front22(String word){
            return word.substring(0,2) + word + word.substring(0,2);
        }


        //Given a string of any length, return a new string where the last 2 chars,
        // if present, are swapped, so "coding" yields "codign".
        //
        //
        //lastTwo("coding") → "codign"
        //lastTwo("cat") → "cta"
        //lastTwo("ab") → "ba"

        // return word.subst(0,word.length -2) + word.subst(word.length-1);


     public static String lastTwo(String word){
        if(word.length() < 2){
            return word;
        }else {
            return word.substring(0,word.length() - 2) +
                    word.substring(word.length() - 1) +
                    word.substring(word.length() - 2, word.length()-1);
        }
     }



      }
















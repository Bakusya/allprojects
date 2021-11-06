package practice;

public class PracticeClass1 {

        public static void main(String[] args) {
        /*
        1. Create a function, thar returns true if x equals to 8
   isEight(5) --> false
   isEight(9) --> false
   isEight(8) --> true
   Return Method
         */
            PracticeClass1 object = new PracticeClass1();
            System.out.println(object.isEight(8));
            System.out.println(object.isEight2(8));
            System.out.println(object.isEight3(8));
        /*
        Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
   lessThanOrEqualToZero(5) ➞ false
   lessThanOrEqualToZero(0) ➞ true
   lessThanOrEqualToZero(-2) ➞ true
   x == 0
   x < 0
   Don't forget to return the result.
         */
            System.out.println(object.lessThanOrEqualToZero(9)); // false
        /*
        Write a function that converts hours into seconds.
   howManySeconds(2) ➞ 7200
   howManySeconds(10) ➞ 36000
   howManySeconds(24) ➞ 86400
         */
            System.out.println(object.howManySeconds(24));
        /*
        Create a function that takes the age in years and returns the age in days.
   calcAge(65) ➞ 23725
   calcAge(0) ➞ 0
   calcAge(20) ➞ 7300
         */
            System.out.println(calcAge(20));
        /*
        Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
   nextEdge(8, 10) ➞ 17
   nextEdge(5, 7) ➞ 11
   nextEdge(9, 2) ➞ 10
   (side1 + side2) - 1 = maximum range of third edge.
         */
            System.out.println(nextEdge(9,2));
        /*
        Find the Perimeter of a Rectangle.
   Create a function that takes length and width and finds the perimeter of a rectangle.
   findPerimeter(6, 7) ➞ 26
   findPerimeter(20, 10) ➞ 60
   findPerimeter(2, 9) ➞ 22
   Don't forget to return the result.
         */
            System.out.println(findPerimeter(2, 9));
        /*
        Create a method, which will return one season
        season(1) --> winter
        Use switch
         */
            System.out.println(season(9));
        /*
        (1) --> you are on first floor
        (2) --> you are on second floor
        if-else statement
         */
            System.out.println(elevator(2));
        }
        public static String elevator(int x){
            String answer;
            if (x == 1){
                answer = "you are on the first floor";
            }
            else if (x == 2) {
                answer = "you are on the second floor";
            }
            else if (x == 3) {
                answer = "you are on the third floor";
            }
            else {
                answer = "We have only 3 floors";
            }
            return answer;
        }
        public static String season(int x){
            String nameOfSeason;
            switch (x) {
                case 1: nameOfSeason = "Winter";
                    break;
                case 2:
                    nameOfSeason = "Spring";
                    break;
                case 3:
                    nameOfSeason = "Summer";
                    break;
                case 4:
                    nameOfSeason = "Fall";
                    break;
                default:
                    nameOfSeason = "Please enter 1,2,3 or 4";
            }
            return nameOfSeason;
        }
        public static int findPerimeter(int x, int y){
            int result = (x + y) * 2;
            return result;
        }
        public static int nextEdge(int side1, int side2){
            int result = (side1 + side2) - 1;
            return result;
        }
        public static int calcAge(int years){
            int result = years * 365;
            return result;
        }
        public int howManySeconds(int hour){
            int result = hour * 3600;
            return result;
        }
        public boolean lessThanOrEqualToZero(int x){
            if (x <= 0){
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isEight(int x){
            boolean result;
            if (x == 8){
                result = true;  // x == 8  --> 8 == 8 ==> true
            } else {
                result = false;
            }
            return result;
        }
        public boolean isEight2(int x){
            boolean isTrue = 8 == x ? true : false;
            return isTrue;
        }
        public  boolean isEight3(int x){
            if (x == 8){
                return true;
            }
            else {
                return false;
            }
        }
    }


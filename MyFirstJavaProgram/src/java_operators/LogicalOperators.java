package java_operators;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperators {
    public static void main(String[] args) {

        // The movie starts at 8pm

        int timeNow = 9;
        int tenPM = 10;
        int elevenPM =11;

        boolean answer = timeNow == tenPM;  //9 == 10 --> false
        System.out.println(answer);         //false

        boolean answer2 = timeNow == elevenPM; //9 == 11 --> false
        System.out.println(answer2);           //false

        // || ---> pipeLines < means [OR]

        boolean isCorrectAnswer = timeNow == tenPM || timeNow == elevenPM;  //false || false ---> false\\\\\true ||true ---> true
        System.out.println("1. Is correct answer? " + isCorrectAnswer);

        boolean isCorrectAnswer2 = 12 == 12 || 11==12;                    // true || false
        System.out.println("2. Is correct answer? " + isCorrectAnswer2);  //true

        boolean isCorrectAnswer3 = 12 == 11 || 12 == 12;                  //false || true
        System.out.println("3. Is correct answer? " + isCorrectAnswer3);  //true

        // true || true ===> true
        // false || false ===> false
        // true || false ===> true
        // false || true ===> true
        // || ---> precedence true



        // && ampersand, means [AND]

        //stewardessAge should be between  21 and 65 y.o.

        int stewardessAge = 25;
        boolean isCorrectAge = stewardessAge >= 21 && stewardessAge <= 65 ;    // 25 > 21 && 25 < 65 ---> true && true ==> true
        System.out.println("Is correct age for stewardess? " + isCorrectAge);  //true

        int stewardessAge2 = 21;
        boolean isCorrectAge2 = stewardessAge2 >= 21 && stewardessAge2 <= 65;  //21 = 21 && 21 < 65 ---> true && true ===> true
        System.out.println("Is correct age for stewardess? " + isCorrectAge2); //true

        int stewardessAge3 = 18;
        boolean isCorrectAge3 = stewardessAge3 >= 21 && stewardessAge3 <= 65 ; // false && true ==> false
        System.out.println("Is correct age for stewardess? " + isCorrectAge3); // false

        int stewardessAge4 = 18;
        boolean isCorrectAge4 = stewardessAge4 <= 21 && stewardessAge4 >= 65;  // 18 < 21 && 18 > 65 --> true && false ===>false
        System.out.println("Is correct age for stewardess? " + isCorrectAge4); // false

        // true && true ===> true
        // false && false ===> false
        // true && false ===> false
        // false && true ===> false
        // && ---> precedence false



        // || ---> |
        // && ---> &

        int a = 0;
        int b = 1;
        boolean comparison = a < b & b++ > a;  // 0 < 1 || 1 > 0 ---> true || true
        System.out.println(b);
        System.out.println(comparison); //true


        // You can drive a car from 16y.o. to 70

        int age = 18;
        boolean correctAge = age <= 16 || age >= 70;  // false || false
        boolean correctAge2 = !(age >= 16 || age <= 70); // true || true ==>true
        System.out.println(correctAge2);

        // ! ---> return convert answer. return -> true, ! ---> false;















    }
}

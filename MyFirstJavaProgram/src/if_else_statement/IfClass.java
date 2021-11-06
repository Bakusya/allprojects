package if_else_statement;

import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {

        boolean question = 18 > 90;  // false
        System.out.println(question);
        boolean question2 = 90 > 58;  // true
        System.out.println(question2);
        System.out.println("vjkdbvgjksbnvks`nvklM");
        System.out.println(54726582);
        if (90 <= 10) {      // true
            System.out.println("Yeeeaaah! It works!!!!! Coool!");
        }
        System.out.println("Ends of program!");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __________________");
        int beginningAge = 16, endingAge = 75;
        int alex = 7;
        //      16       <=  55  &&   55 <= 75    ==> true
        if (beginningAge <= alex && alex <= endingAge) {  // 16 >= 15 || 15 <= 75  // true || true
            System.out.println("You can drive a car!");
        } else {
            System.out.println("YOU CAN'T DRIVE A CAR");
        }
//        2 > 0 == true
//        !(2 > 0) == false
        System.out.println("==============================");
        // child    0 --> 15
        // teenager 15 --> 18
        // adult    18 ---> >>>>>>>>>>>
        int age = 100;
        if (age >= 15 && age <= 18) {   // 20 <= 18  ---> false
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are child/adult");
        }
        int digit = 67;
        // if statement works with true/false condition
        // TRUE condition  -->  body of  "if" statement will work     ---> SOUT will work
        // FAlSE condition -->  body of  "if" statement will not work ---> SOUT will not work


    }
}

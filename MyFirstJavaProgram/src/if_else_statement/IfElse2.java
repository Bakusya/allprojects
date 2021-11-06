package if_else_statement;

public class IfElse2 {
    public static void main(String[] args) {
        // child 0 --> 11
        // teenager 12 --> 18
        // adult 18 ---> >>>>>>>

        int age = 78;

        //child 0 ---> 11
        if (age >= 0 && age <= 11) {
            System.out.println("You are a child");

        }

        // child    0 --> 11
        // teenager 12 --> 18
        // adult    18 ---> >>>>>>>>>>>


        // if-else-if ladder statement

        int age1 = -56;
        // child    0 --> 11
        if (age1 >= 0 && age1 <= 11) {   // 100 >= 0 &&  100 <= 11 --> false
            System.out.println("You are a child");
        }
        // teenager 12 --> 17
        else if (age1 >= 12 && age1 < 18) {
            System.out.println("You are a teenager");
        }
        // adult    18 ---> >>>>>>>>>>>
        else if (age1 >= 18) {
            System.out.println("You are an adult");
        } else {
            System.err.println("Error! Please enter your actual age!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
//        if (age >= 0 && age <= 11){
//            System.out.println("You are a child");
//        } else {
//            System.out.println("You are NOT a child");
//        }
//
//
//        if (age >= 12 && age < 18){
//            System.out.println("You are a teenager");
//        } else{
//            System.out.println("You are NOT a teenager");
//        }
//
//
//        if (age >= 18){
//            System.out.println("You are an adult");
//        } else{
//            System.out.println("You are NOT an adult");
//        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        //if age >= 18 && weights > 50 ==> You are eligible to donate blood
        int age2 = 39;
        int weights = 80;

        //nested if


        if (age2 >= 18) {
            if (weights > 50) {
                if (5 < 0) {
                    System.out.println("You are eligible to donate blood");
                } else {
                    System.out.println("You have false condition! Please try again!");
                }
            } else {
                System.out.println("MISTAKE!");
            }
        } else {
            System.out.println("EERRROOORR!!!!!!");
        }
        //1. if
        //2. if -> else
        //3. if -> else if


    }
}

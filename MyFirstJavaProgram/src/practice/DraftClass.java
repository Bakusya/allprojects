package practice;


import java.util.Locale;
import java.util.Scanner;

public class DraftClass {
    public static void main(String[] args) {

        // String methods:
        // indexOf, equals,length, upperCase, lowerCase, concat,charAt,substring-2, trim, replace, replaceAll,




        //Tell user their grade
        //user needs input score
        //program should return A,B,C,D,F

        //100- 90 -> A
        //89-> 80 ->B
        //79-> 70 -> C
        //69-> 60 ->D
        //59 -> 0 -> F
        //for all other inputs
        //print out an error message
        //Wrong Input, please input a score between 0-100


        //-------------------------------------------------------------------------

        //assignment operators
        String str = "Hello World";

        str = "Hello Mars";

        System.out.println(str);





        // Can we use  '>'  for String and boolean?

        String abc = "Hello";
        String abcd = "Hello Me";

        System.out.println(abc.length() > abcd.length());


        // what is keyword final? Give me an example

        final int speed = 90;
        //    speed = 91;
        System.out.println(speed);






        /**
         * Write an expression for all married male,
         * age between 21 and 35,
         * with height above 180,
         * and weight between 70 and 80.
         */


        boolean isMarried = true;
        int age = 35;
        int height = 179;
        int weight = 77;

        boolean isJamesBond = age >= 21 && age <= 35
                && height > 180
                && weight > 70 && weight < 80
                && isMarried;

        System.out.println(isJamesBond);




        // //        //if the vendor brings a product
        ////        and it's green products then set the expiration date for 7 days for all greens
        ////
        ////        except
        ////
        ////        1. if it's cilantro set the expiration date for 10 days.
        ////        2. for dill please make expiration date for 4 days.
        //          3. Rest 20 days
        ////
        ////
        ////
        //////Grocery store
        //////Greens
        ////
        //////Fruits -> Fruits should be expired in 30 days by default
        ////
        ////                except:
        //////rasberries should be expired in 6 days
        //////Bananas should be expired in 15 days by default


//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is the product type?"); // Greens || Fruits
//        String productType = sc.nextLine();
//        System.out.println("What is the product name?"); // Kinza and Ukrop, Malina and banana
//        String productName = sc.nextLine();
//
//        int daysToExpire = 0;
//
//        if (productType.equalsIgnoreCase("Greens")){
//            if (productName.equalsIgnoreCase("Kinza")){ // inner
//                daysToExpire = 10;
//            }else if (productName.equalsIgnoreCase("Ukrop")){
//                daysToExpire = 4;
//            }else {
//                daysToExpire = 20;
//            }
//        } // outer if
//
//        else if (productType.equalsIgnoreCase("Fruits")){
//            if (productName.equalsIgnoreCase("Banana")){
//                System.out.println("Where are the bananas imported from?");
//                String country = sc.next();
//                if (country.equalsIgnoreCase("Peru")){
//                    daysToExpire = 11;
//                }else if (country.equalsIgnoreCase("Brazil")){
//                    daysToExpire = 14;
//                }else {
//                    daysToExpire = 15;
//                }
//            }else if (productName.equalsIgnoreCase("Malina")){
//                daysToExpire = 15;
//            }else {
//                daysToExpire = 20;
//            }
//        }
//
//        System.out.println("This " + productName + " is going to expire in " + daysToExpire);



        String schoolName = " Digital Nomads one love ";

        System.out.println("The length of schoolsName " + schoolName.length());

        System.out.println(schoolName.substring(2,7)); //

        System.out.println(schoolName.charAt(8));

        System.out.println(schoolName.toLowerCase());

        System.out.println(schoolName.toUpperCase());

        System.out.println(schoolName.replace('l','L'));

        System.out.println(schoolName.toUpperCase().charAt(6));

        System.out.println(schoolName.toUpperCase().indexOf(6));

        System.out.println(schoolName.replaceAll("Digital","DigitaL"));

        System.out.println(schoolName.replace('l','L'));

        System.out.println(schoolName.replaceFirst("l","L"));

        // Homework
        // Change Digital Nomands one love  ---> need to change first l to uppercase

        System.out.println(schoolName.trim());

        System.out.println();

        String hi = "Hi";
        String name = "Bob";

        System.out.println(hi.concat(name));



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your First name");
//        String firstName = sc.nextLine().toLowerCase();
//        System.out.println("Please enter your Last Name");
//        String lastName = sc.nextLine().toLowerCase();
//
//
//        if (lastName.endsWith("ov")|| lastName.endsWith("ova") ||
//                lastName.endsWith("ev") || lastName.endsWith("eva")){
//            System.out.println("Your are from USSR");
//        }else if (lastName.endsWith("Lee")){
//            System.out.println("Your are from China");
//        }else if (lastName.endsWith("oglu")){
//            System.out.println("your are from Turkey");
//        }else System.out.println("I don't care");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First name");
        String firstName = sc.nextLine().toLowerCase();

         if (firstName.equalsIgnoreCase ("Natasha") ||
                firstName.equalsIgnoreCase(" Petya") ||
                firstName.equalsIgnoreCase("Sasha")) {
            System.out.println("Your are from Russia");
        }else if (firstName.equalsIgnoreCase("Sanira")||
                  firstName.equalsIgnoreCase("Akyl") ||
                  firstName.equalsIgnoreCase("Atai") ||
                  firstName.equalsIgnoreCase("Manas")){
            System.out.println("Your are from Kyrgyzstan");
        } else if (firstName.equalsIgnoreCase("Mike") ||
                   firstName.equalsIgnoreCase("Nick") ||
                   firstName.equalsIgnoreCase("Alice") ||
                   firstName.equalsIgnoreCase("Nelly")) {
             System.out.println(" You are from USA");
        }  else {
            System.out.println( "You are not right person");
        }




        // Homework need to add equalsIgnoreCase
        // If name nachinaetsya s Sasha , Natasha, Petya === you are from Russia
        // If name nachinaetsya S Sanira, Nursen, Akyl, Atai ... = you are from KG
        // If name nachinaetsya s Mike, Nick, Alice, Nelly, === you are from USA






    }
}

package java_operators;

public class ComparisonOperators {

    //rename of class ---> bar (left side) navigate your mouse on class,
    //right click, choose [refactor], then choose  [rename]

    public static void main(String[] args) {

        //Comparison Operators:  ==, <, >,<=,>=, !=.
        System.out.println(10>5);  //true
        System.out.println(10<5);  //false

        int ten = 10;
        int five = 5;
        boolean bool = ten > five;
        System.out.println(bool);

        int x = 300;
        int y = 0;

        boolean comparison = x > y;  // 300 > 0 --> true
        System.out.println(comparison);

        boolean comparison2 = x >= y;  // 300  >= 0
        System.out.println(comparison2);

        boolean comparison3 = 10 >= 2;  //true
        System.out.println(comparison3);

        boolean comparison4 = 10 >= 10; //true
        System.out.println(comparison4);

        // = ---> 5 = 5

        System.out.println(5==5);    //equal

        System.out.println(5 != 5);  // not equal

        boolean compare = !(34 > 0);  //false
        System.out.println(compare);

        System.out.println(44 != 44);  //false
        System.out.println(44==44);    //true


        String world = "world";
        String world2 = "World";
        System.out.println(world == world2); //false
        //System.out.println(world != world2);  //false













    }




}

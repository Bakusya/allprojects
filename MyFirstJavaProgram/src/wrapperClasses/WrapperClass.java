package wrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {
        // 1. Primitive data types
        // 2. Non-Primitive data types -> object
        // variable --> with primitive data types
        // object --> with objects(String, Scanner, Object, StringBuilder, StringBuffer, Arrays, ClassObjects)
        // OOP
        // 1. objects can work with Primitive data types. Ex.: int [] arr = {23, 89, 45};
        // 2. objects can work with objects
        int num1 = 10;     // primitive variable
        Integer num2 = 10; // object
        System.out.println(num1); // 10
        System.out.println(num2); // 10

        // Autoboxing (small --> big) => (primitive --> object)

        int five1 = 5;
        Integer bigFive = five1;
        System.out.println(bigFive);


        // Unboxing (big --> small) => (object --> primitive)

        Integer seven = 7;
        int smallSeven = seven;
        int smallSeven2 = seven.intValue();
        System.out.println(smallSeven);
        System.out.println(smallSeven2);

    }
}

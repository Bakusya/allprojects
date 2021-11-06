package dataTypes;

import java.sql.SQLOutput;

public class DataTypesOfJava {
    public static void main(String[] args) {

        // [variable ---> peremennaya]
        // [String types always between double quotas (dvoinye kovychki)]
        // String ---> data type
        // two_flower ---> name of variable
        // "Roses" ---> value
        //  String two_flowers = "Roses"; ---> variable
        String two_flowers = "Roses";

        int number = 17;  // int ->integer

        System.out.println(two_flowers);
        System.out.println(number);

        String word = "Hellojnkl84@$%&";

        // Data Types:
        // 1.Primitive data types  ---> 1.byte, 2.short,3.int, 4.long, 5.float, 6.double, 7.char, 8.boolean.
        // 2.Non-Primitive data types ---> 1.String...

        // Primitive data types:

        //numbers:
        //usually we will use [int]
        byte byteNum = 127;        //1bytes ---> -128 to 127
        short shortNum = 32767;     //2bytes ---> -32767 to 32767
        int intNum = 657983;       //4bytes ---> -2147483648 to 2147483647
        long longNum = 578903000;  //8bytes ---> ................
        System.out.println(longNum);

        //Decimal point ---> plavaushaya tochka
        //45,50;  78.9%  ---> in Java 45.50;    78.9;
        float floatNum = 4.64f;   // 4.647891000;  4byte
        double doubleNum = 67.78; //8byte --> "d" or  without  "d"
        System.out.println(floatNum);

        //Character
        // character can hold only one symbols
        // value ---> 'H' ---> types inside of single quotas
        // 2bytes
        char symbol = 'H';
        char symbol2 = '%';
        char symbol3 = '}';
        System.out.println(symbol2);
        char letter = 65;
        System.out.println("65 equals to --->" + letter);


        char gender = 'F';

        char firstletter = 'w';
        char secondletter = 'o';
        char thirdletter = 'r';
        char forthletter = 'l';
        char fifthletter = 'd';

        //Boolean
        boolean isJavaFun = true;
        boolean isSnowIsBlack = false;
        System.out.println(isJavaFun);
        System.out.println("Is Snow is black? How do you think:" + isSnowIsBlack);

        //Concat ---> +      - (concat-eto soedinenie string (strok) c  veriables)
        //"Is Java fun for you: " + isJavaFun

        //Special characters:

        // \t ---> Insert a tab in the text at this point.
        System.out.println("Welcome\tWelcome\tWelcome");

        // \n ---> Insert a newline in the text at this point.
        System.out.println("2*2=4\n2*3=6\n2*4=8");

        // \" ---> Insert a single quote character in the text at this point.
        System.out.println("Gender: \"M\" ");

        // \ ---> Insert a backslash  character in the text at this point.
        System.out.println("Belinskaya\\Ahunbaeva");


        //Declare of variable
        int year;

        // initialized variable / Assign
        year = 2021; // int year = 2021;

        System.out.println(year);
        System.out.println(year);

        //Reassign
        year = 1999;

        System.out.println(year);
        System.out.println(year);

        byte num = 17;    //byte 2
        short num1 = 3;   //short 4
        int num2 = 10;    //int 8
        long num3 = 50;   //long 8

        num3 = 60;
        System.out.println(num3);

        num3 = num;  //num = 17 ---> num3 = 17
        System.out.println(num3);

        num2 = num1; //3
        System.out.println(num2);

        float cost1 = 45.56f;
        double cost2 = 89.65;

        cost2 = cost1;
        System.out.println(cost2);
        System.out.println(cost2 + 1.1);

        String name = "Alex";
        System.out.println(name);
        name = "Bred";
        System.out.println(name);

        //String name = "Julli";
        // Name of variable should ne unique. And we can change only value of Variable.


        // Error:

        //1. Compile error ---> when we have  ability correct the Compile error
        // int digit = "word"; ---> incompatible types
        //System.out.println(digit);


        //2. Run time error ---> when code don't have compile error, and we can see error on console after Run
        //System.out.println(99/0); ---> ArithmeticException

        System.out.println("The end");


        // For readable code:
        // mac users: COMMAND + OPTION + L
        //windows/ubuntu: CTRL + ALT+L


    }
}

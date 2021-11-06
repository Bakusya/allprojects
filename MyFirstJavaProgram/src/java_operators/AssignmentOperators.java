package java_operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // Assignment Operators:  =, +=,-=,*=./=.
        int x = 5;
        x += 3;     //int x = 5 + 3 --->8
        System.out.println(x);
        x -= 2;
        System.out.println(x);  //6
        x *= 5;
        System.out.println(x);    //30

        // 4*4=16
        int num1 = 4;
        int num2 = 4;
        int mult = num1*num2;
        System.out.println(mult);

        int num3 = 4;
        num3 *= 4;  // num3 = num3 * num3  ---> num3 = 4*4
        System.out.println(num3);

        double dNum1 = 56.9;
        dNum1 = 34.08;
        System.out.println(dNum1);

        // mac:       [COMMAND] + click
        // windows:   [CTRL]  + click

        // Casting

        //implicit casting ---> When you convert small value to bigger
        int ten = 10;
        long example = 10;

        //explicit casting   ---> When you convert big value to smaller
        long thousand = 1000;
        byte example2 = (byte) thousand; //-128 +127
        System.out.println(example2);

        long hundred = 100;
        byte longConvertToByte = (byte) hundred;
        System.out.println(longConvertToByte);


















    }
}

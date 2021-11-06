package java_operators;

public class IncrementDecrement {
    public static void main(String[] args) {

        int num = 1;
        num += 1;  //2
        System.out.println(num);

        // Increment: ---> +1
        num++;  //3
        num++;  //4

        System.out.println(num++);  //4
        System.out.println(num);    //5
        System.out.println(num++);  //5
        System.out.println(num);    //6

        //Decrement: ---> -1
        int num2 =  10;
        num2--;
        System.out.println(num2);   //9
        num2--;                     //8
        num2--;                     //7
        num2--;
        System.out.println(num2);   //6
        System.out.println(num2--);
        System.out.println(num2);   //5

        //prefix increment    ++variable ---> sam values right away  --> сразу добавляет

        int num3 = 20;
        ++num3; //21
        ++num3; //22
        System.out.println(num3);   //22
        System.out.println(++num3); //23
        System.out.println(num3);   //23
        System.out.println(++num3); //24
        System.out.println(num3);   //24

        //postfix increment variable++  ---> memorise result, and show that result after call variables without post increment inside of SOUT.
                                            //сначала хранит в уме, затем добавляет
        int num4 = 30;
        num4++;  //31
        num4++;  //32
        System.out.println(num4);   //32
        System.out.println(num4++); //32
        System.out.println(num4);   //33
        num4++;  //34
        System.out.println(num4++);  //34
        System.out.println(num4);   //35
        System.out.println(num4++); //35
        System.out.println(num4++); //36
        System.out.println(num4++); //37
        System.out.println(num4);   //38

        //prefix decrement  --variable;
        int num5 = 40;
        --num5;
        --num5;
        System.out.println(num5);   //38
        System.out.println(--num5); //37
        System.out.println(--num5);
        System.out.println(--num5);
        System.out.println(--num5);
        System.out.println(num5);

        //postfix decrement variable--
        int num6 = 50;
        num6--;
        System.out.println(num6);   //49
        System.out.println(num6--); //49
        System.out.println(num6);   //48
        System.out.println(num6--); //48
        System.out.println(num6--); //47
        System.out.println(num6--); //46
        System.out.println(num6);   //45

        //increment ++
        //decrement --

        //++var / --var  ---> prefix increment / decrement

        //var++ / var--  ---> postfix increment / decrement

        short a = 100;                            //assignment
        byte shortConvertToByte = (byte)a;        //assignment,short-->byte
        System.out.println(shortConvertToByte);




















    }
}

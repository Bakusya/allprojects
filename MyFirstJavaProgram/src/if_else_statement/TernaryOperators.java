package if_else_statement;

public class TernaryOperators {
    public static void main(String[] args) {

        //even numbers === четное число
        //odd numbers  === нечетное число

        int number = 50; //even number
        if (number % 2 == 0){   // 0 == 0 --> true
            System.out.println(number + " - even number");
        } else{
            System.out.println(number + " - odd number");
        }

         // Ternary operators

//                                     true           false
        String output = (number % 2 == 0) ? "evennumber" : "oddnumber";
        System.out.println(output);
        System.out.println("_____________________________");
        System.out.println(13/2);  //6    7
        System.out.println(13%2);  //0    98

    }
}

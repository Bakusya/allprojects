package if_else_statement;

public class IfElseIf {
    public static void main(String[] args) {
        //100 --> A
        //80--> B
        //60--> C

        int a = 100, b = 80, c = 60;
        int score = 90;
        if (score == a) {
            System.out.println("Great job");
        } else if (score < a && score >= b) {
            System.out.println("Good job");
        } else if (score < b && score >= c) {
            System.out.println("Well done");
        } else {
            System.out.println("Fail");
        }


    }
}




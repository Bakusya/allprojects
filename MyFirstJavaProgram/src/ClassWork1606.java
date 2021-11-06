import java.util.Scanner;

public class ClassWork1606 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //do we need to run it at least once?
        String answer = "yes";
        //variable declared in the loop body are not visible on the
        //condition level.

        int allScores = 0;
        int counter = 0;


        //I need validate if the score is in the range of 0-100
        //if not give an error and stop the program
        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Please enter test result");
            int score = sc.nextInt();

            if(score > 100 || score < 0) {
                System.err.println("Invalid range");
                System.exit(1);
            }

            allScores+=score;
            sc.nextLine();
            System.out.println("Do you want to add another score?");
            answer = sc.nextLine().trim();
            ++counter;
        }

        System.out.println("Average: " + allScores/counter);

    }
}

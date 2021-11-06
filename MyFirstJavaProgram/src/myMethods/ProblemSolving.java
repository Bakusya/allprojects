package myMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSolving {
    public static void main(String[] args) {

        // Task: Find the missing number from given array
        // {5,2,7,4,1,9,6,8,10}

        int[] arr = {5, 2000, 700, 4, 1, 3, 6, 8, 9, 11};

        ProblemSolving problemSolving = new ProblemSolving();
        System.out.println(problemSolving.findMax(arr));
        problemSolving.findMissingNumber(arr);


        Scanner scanner = new Scanner(System.in);
//       System.out.println("Enter a sentence");
//        String str = scanner.nextLine();
//
//       System.out.println("Enter a char to see how many times that char appears in the sentence: ");
//       String target = scanner.next();
//
//       System.out.println("Number of times char " + target.charAt(0) + " appeared is: " + problemSolving.findNumberOfChars(str,target));


        System.out.println("Please enter a String ");
        String str1 = scanner.nextLine();
        System.out.println("Enter a char you want to uppercase");
        String target1 = scanner.next();

        System.out.println(problemSolving.convertCharsToUppercase(str1, target1));


    }

    public int findMissingNumber(int[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int max = arr[arr.length - 1];
        int sumOfNatNumber = max * (max + 1) / 2; // 11 * 110 / 2 = 55;
        int sumOfArrNums = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArrNums += arr[i];
        }
        int missingNumber = sumOfNatNumber - sumOfArrNums;
        System.out.println("Here is the missing number: " + missingNumber);
        return missingNumber;
    }


    //TASK:  // hello hello hello , l  (Str str, char ch)
    // You have a given string and target character
    // return the number of times the target character appears in that string
    // number of times target char is 6 --->

    public int findNumberOfChars(String str, String targetChar) {
        int count = 0;
        char c = targetChar.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    //TASK:
    // 1. Get 2 inputs from the user as a string, first input-String, second-character
    // 2. Create a method which will take that both inputs as parameters
    // and convert the characters from the given string
    // to Upper case if they are equal to character input
    //How to compare 2 characters? 'a' == 'b'

                //EX: word = "Menomonee", target = "e" -> Output: "MEnomonEE"


    public String convertCharsToUppercase(String word, String target) {
        String resultString = "";
        for (int i = 0; i < word.length(); i++) {
            String tempString = Character.toString(word.charAt(i));
            if (word.substring(i, i + 1).equals(target)) {
                resultString = resultString + tempString.toUpperCase();
            } else resultString = resultString + tempString;
        }
        return resultString;
    }


    /*
    int arraySize = sc.nextInt();
    (int []){
    10,200,3,42,5
    }
    TASK: 1. Initialize an array by getting the size from the user
    2. Create a method which will take array as a parameter
    and return the max element.
    max
    int arr [] = new arr[5];
    arr[0]
    arr[1]
    arr[5]
     */
    public int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}

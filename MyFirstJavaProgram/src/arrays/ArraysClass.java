package arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // creating of array object
        int [] num1 = new int[4];
        num1[0] = 10;  //1
        num1[1] = 20;  //2
        num1[2] = 30;  //3
        System.out.println(num1[0]); // 10
        System.out.println(num1[2]); // 30
        System.out.println(num1[3]); // 0
        char [] symbol = new char[2];
        symbol[0] = 'O';
        System.out.println(symbol[1]); // 'uoooo'
        double [] doub = new double[1];
        System.out.println(doub[0]); // 0.0
        String str[] = new String[10];
        System.out.println(str[5]);  // null

// redundant code

        int digit;  // declare of variable
        digit = 56;  // initialize of variable
        int dig = 34; // declare and initialize of variable

// Declare an Array

        int [] arr;
        int[] arr1;
        int []arr2;
        int arr3[];

//Instantiation of an Array

        int [] array = new int[2]; // declare and instantiation [2]
        array[0] = 78;  // initialize an Array
        array[1] = 54;  // ...
        String word = "Welcome!"; // pool
        String word1 = new String("Welcome!");  // heap
        System.out.println(word + " " + word1);
        System.out.println(word.equals(word1));
        System.out.println(word == word1);
        int years1[] = new int[4];
//     i           e
        years1[0] = 1998; // 1
        years1[1] = 2005; // 2
        years1[2] = 2000; // 3
        years1[3] = 1971; // 4
        System.out.println(years1[2]);
//               0      1     2     3   --> indexes
        int years2[] = {1998, 2005, 2000, 1971};
//                1     2     3     4   --> items/elements
// declare
// instantiation
// initialize
        System.out.println(years2[2]);

// Arrays with [for each loop]

        String [] names = {"Alex", "John", "Kate", "Lilly"};
        System.out.println(names[3]);
        System.out.println(names[1]);
        System.out.println(names); // [Ljava.lang.String;@5cad8086  --> hashcode
        System.out.println("Printing with [FOR EACH LOOP]");
        for (String i : names) {
            System.out.println(i);
        }
// 1) i --> Alex
// 2) i --> John
// 3) i --> Kate
// 4) i --> Lilly
        System.out.println("Printing with [FOR LOOP]");
//       i = 0;   i < 4;          i++
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
// 1) names[i] --> names[0 ] --> Alex
// 2) names[i] --> names[1 ] --> John
// 3) names[i] --> names[2 ] --> Kate
// 4) names[i] --> names[3 ] --> Lilly
        System.out.println(names[0]);
    }
}

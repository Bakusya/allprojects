package javaLoops.forLoop;

public class PracticeForLoop2 {
    public static void main(String[] args) {
        int n = 3;
        //              i < 3
        //                  3
        for (int i = 1; i <= n; i++){
            System.out.println(i + " -> " + n);
        }
        //3
        //012
        //
        //            01234
        String str = "Hello";
        System.out.println(str.length()); // 5
        //       i = 1; i < 5              i++    ==>     1, 2, 3, 4
        //       i = 1; i < 4              i++    ==>     1, 2, 3
        //       i = 1; i <= 5              i++    ==>     1, 2, 3, 4, 5
        for (int i = 0; i < str.length(); i++){   // str.length() == str.length()-0
            System.out.println(i + " -> " + str.toUpperCase().charAt(i));
        }
        int i;
        for (i = 0; i < 10; i=i+3){
            System.out.print(i + " ");  // 0 3 6 9
        }
        System.out.println();
        for (int k = 0; k <= 15; k=k+5){
            System.out.println(k + " ");  // 0 5 10 15
        }
//           6       10
        for (int m = 10; m >= 6; m--){ // 10 >= 6 -- 10, 9, 8, 7, 6
            System.out.println(m + " Meerim");
        }
        int l = 12;
        for (; l>=6; l=l-3){
            System.out.println(l); // 12 9 6
        }
        // 12 9 6
        // 12 9 6 3
        System.out.println("_____________________");
        // 7 week days
        // 2 times
        int week = 7;
        for (; week >= 3; week=week-5) {  // 7
            System.out.println("Wednesday");
            System.out.println("Sunday");
        }
    }
}

package javaLoops.forLoop;

public class PracticeForLoop {
        public static void main(String[] args) {

            int number = 20;
            for (int i = 1; i <= 20; i++){
//            System.out.println(i);
            }
            int num = 40;

            // print even numbers

            for (int i = 0; i <= num; i+=2) {
//            if (i % 2 == 0){
//            System.out.println("Even numbers " + i);
                //}
            }

            String sayHi5times = "Hi Jack";
            for (int i = 0; i < 5; i++ ){
//            System.out.println(sayHi5times);
            }

            // 5 * 1 = 5;
            // 5 * 2 = 10'
            int num1 = 5;
            // 2  <= 10 true
            for (int l = 1; l <= 10; l++){
//            System.out.println(num1 + " * " + l + " = " + num1 * l);
                // 5     *     2     =     5 * 2 = 10
            }

            String word = "Hello this is Sparta!!!";
//        System.out.println(word.length());
//        for (int i = 0; i <= word.length(); i++){
////            System.out.println(word + " " + i);
//        }

            for (int i = word.length()-1; i >= 0; i--){
//            System.out.println(word.charAt(i));
            }

            String slogan = "Nokia connecting people";
            for (int i = slogan.length()-1; i >= 0; i--){
//            System.out.println(slogan.charAt(i));
            }

            String reverse = "Hello";
            StringBuilder sb = new StringBuilder(reverse);
            System.out.println(sb.reverse());
            for(int i = reverse.length()-1; i >= 0; i--){
//            System.out.print(reverse.charAt(i));
            }
            // print odd numbers 100
            for (int k = 0; k < 100; k++){
                if (k % 2 == 1){ // != 0
//                System.out.println(k);
                }
//            System.out.println(k);
            }
            String a = "aaaaaa";// 6
            // 0     0 < 6
            // 1     1 < 6
            // 2     2 < 6
            for (int i = 0;i < a.length();i++){
                System.out.println(a);   // aaaaaa
                // aaaaaa
                // aaaaaa
            }
//        System.out.println(countHi("Hello hi hiih hwow hi"));
        }
        //Return the number of times that the string "hi" appears anywhere in the given string.
        //
        //
        //countHi("abc hi ho") → 1  abc hi ho -->
        //countHi("ABChi hi") → 2
        //countHi("hihi") → 2
        public static int countHi(String word){
            int count = 0; //
            //4
            for (int i = 0; i < word.length() -2; i++ ){
                if (word.substring(i, i + 3).equals("wow")){
                    count++;
                }
            }
            return count;
        }
    }




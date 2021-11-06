package javaLoops.doWhileLoop;

public class DoWhileLoopClass {
    public static void main(String[] args) {

                int a = 5;
                while (a <= 10){  // 5 <= 10 --> true
                    System.out.println(a + " - Hello");
                    a++;
                }
                int b = 3;
                while (b < 7){  // 3 < 7 --> true
                    System.out.println(b);
                    b++;
                }
                int c = 5;
                while (c > 9){  // false
                    System.out.println(c);
                    c++;
                }
                boolean bool = c > 9; // 5 > 9 == false
                System.out.println(bool);


                // do-while loop


                System.out.println("------do-while loop------");
                // int c = 5;
                do {
                    System.out.println(c);
                    c++;
                } while (c > 9);  // 5 < 9
            }
        }



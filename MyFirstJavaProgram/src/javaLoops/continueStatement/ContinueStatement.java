package javaLoops.continueStatement;

public class ContinueStatement {
    public static void main(String[] args) {

                int  num = 5;
                while (num >= 1){
                    if (num == 4){
                        num--;
                        continue;
                    }
                    System.out.println(num + " ");
                    num--;
                }
                System.out.println("______________________");
                for (int i = 1; i <= 6; ++i){
                    if (i == 3){
                        continue;
                    }
                    System.out.println(i + " ");
                }
                System.out.println("______________________");
                for (int b = 1; b <= 10; b++){
                    if (b > 6 && b < 9){  // 1 2 3 4 5 6 [ 7 8 ] 9 10
                        continue;
                    }
                    System.out.print(b + " ");
                }
                System.out.println();
                // Logical operators:    &&, ||, !
                // Comparison operators: >, <, >=, <=, ==, !=
                System.out.println(3 != 7);
                System.out.println(!(3 == 7));
            }
        }



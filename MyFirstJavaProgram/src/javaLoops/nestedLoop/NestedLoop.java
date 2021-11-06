package javaLoops.nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
                //nested if
                int weigth = 75;
                int hight = 190;
                if (weigth >= 70){
                    if (hight >= 180){
                        System.out.println("YOU are allowed to participate");
                    }else {
                        System.out.println("Eat more carrot");
                    }
                }else {
                    System.out.println("You are not allowed participated");
                }


                System.out.println("____________ Nested Loop_____________");


                //nested loop
                for (int i = 1; i <= 4; i++){    // outer loop
                    for (int j = 1; j <= 5; j++){  // inner loop
                        System.out.print(" * ");
                    }
                    System.out.println("===============");
                }
                for (int k = 0; k <= 3; k++){
                    System.out.println(" ========================= ");
                }
        /*
 * * * * * ===============
 * * * * * ===============
 * * * * * ===============
 * * * * * ===============
 =========================
 =========================
 =========================
 =========================
 */
            }
        }




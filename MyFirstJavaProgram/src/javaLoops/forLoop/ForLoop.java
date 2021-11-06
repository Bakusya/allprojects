package javaLoops.forLoop;

public class ForLoop {
    public static void main(String[] args) {
        int num = 17;
        if (12 < 9){
            System.out.println("bvsdkv");
        } else {
            System.out.println("Error, please try again");
        }
        switch(num){
            case 12:
                System.out.println("Seventeen");
                break;
            default:
                System.out.println("We have only number 12");
        }
        System.out.println("______________________");


        // 1way of for loop

        //           0  4    4
        for (int i = 0; i < 5; i++){
            System.out.println(i + " Hello!");
        }
        System.out.println("______________________");


        // 2way of for loop


        int k;
        for (k = 0; k < 3; k++){
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("______________________");


        // 3way of for loop


        int u = 1;
        for( ; u <= 5; ){
            System.out.print(u + " ");
            u++;
        }

        // 4way of for loop --> Warning! --> Infinite loop

//        int p = 987;
//        for(;;){  //  --> Infinite loop
//            System.out.println(p);
//        }
        System.out.println();
        System.out.println("______________________");
        for (int m = 0; m < 4; m++){
            System.out.println(m);
        }
        System.out.println("______________________");
        int l;
        for (l = 0; l < 5; l++){
            System.out.println(l);
        }
        System.out.println(l);
        System.out.println("______________________");
        for (int m = 1; m < 3; m++){
            System.out.println(m);
        }
        System.out.println("______________________");
        for (int m = 0; m < 3; m++){
            System.out.println(m);
        }
        System.out.println("______________________");
        for (int i = 1; i <= 4; i++){
            System.out.println(i);
        }
        System.out.println("______________________");
        for (int i = 3; i < 6; ++i){  // 3 4 5
            System.out.println(i + " Aloha");
        }
        System.out.println("______________________");
        for ( int i = 5; i >= 0; i--) {  // 5,
            System.out.println(i);
        }
        // int i = 0; ++
        // int i = 5; --
        System.out.println("______________________");
        String word = "Welcome";
        //                      7
        for (int i = 0; i < word.length(); i++){
            System.out.println(i);
        }
    }
}





package sprint1;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int n = sc.nextInt();
        FactorialNum obj = new FactorialNum();
        System.out.println(obj.factorialNum(n));

    }
    public int factorialNum (int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;

        }return fact;

    }
}
// 1 2 3
// 1*2*3=6
// 1 2 3 4 5
 // 1*2=2
// 2*3 =6
//6*4=24
// 24 * 5 = 120


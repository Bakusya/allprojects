package sprint1;

import java.util.Scanner;

public class VolumeOfABox {
    public static void main(String[] args) {
        int width;
        int length;
        int heigth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину ящика");
        width = sc.nextInt();
        System.out.println("Введите длину ящика");
        length = sc.nextInt();
        System.out.println("Введите высоту ящика");
        heigth = sc.nextInt();
        volumeOfBox(width,length,heigth);

    }
    public static int volumeOfBox (int a, int b, int c){
        int result = a * b * c;
        System.out.println("Объем ящика:" + result);
        return result;
    }
}

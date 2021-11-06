import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelsLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//
        System.out.println("Введите строку");
        String ds = scan.nextLine();
        String sv = scan.nextLine();
      VowelsLetters  ob = new VowelsLetters();
        System.out.println(ob.equal(ds,sv));
    }
    public boolean equal(String  ds, String sv) {
        return ds.equals(sv);
    }}
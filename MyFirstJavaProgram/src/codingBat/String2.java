package codingBat;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String2 obj = new String2();
        System.out.println(obj.countHi("hihi"));
        System.out.println(obj.catDog("1cat1cadodog"));
        System.out.println(obj.countCode("codexxcoze"));
        System.out.println(obj.endOther("abc", "hiabc"));
        System.out.println(obj.xyzThere("xyz"));
        System.out.println(obj.bobThere("abcbob"));
        System.out.println(obj.xyBalance("axyyy"));
        System.out.println(obj.repeatEnd("hello", 3));
        System.out.println(obj.getSandwich("breadjambread"));



    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;

    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat"))
                cat++;
            if (str.substring(i, i + 3).equals("dog"))
                dog++;
        }
        return cat == dog;

    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e"))
                count++;
        }
        return count;

    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).equals(b);
        } else if (a.length() < b.length()) {
            return b.substring(b.length() - a.length()).equals(a);
        }
        return false;

    }

    public boolean xyzThere(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.substring(i - 1, i).equals(".")) {
                return true;
            }
        }
        return false;

    }

    public boolean bobThere(String str) {
        // abcbob;
        //  String word = "";
        if (str.length() >= 3 && str.substring(0, 1).equals("b") && str.substring(2).equals("b")) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;

    }

    public boolean xyBalance(String str) {
        int x = str.lastIndexOf('x');
        int y = str.lastIndexOf('y');
        return x <= y;
    }

    public String repeatEnd(String str, int n) {
        String last = str.substring(str.length() - n);
        String total = "";
        for (int i = 0; i < n; i++) {
            total += last;

        }
        return total;

    }

    public String repeatFront(String str, int n) {
        String words = "";
        for (int i = n; n > 0; n--) {
            words += str.substring(0, n);
        }
        return words;

    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count - 1; i++) {
            sb.append(word);
            sb.append(sep);
        }
        sb.append(word);
        return sb.toString();

    }

    public String getSandwich(String str) {
        int first = 0;
        int last = 0;
        for (int i = 0; i < str.length() - 5; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                first = i;
                break;
            }

        }
        for (int i = str.length() - 5; i > 0; i--) {
            if (str.substring(i, i + 5).equals("bread")) {
                last = i;
                break;
            }
        }
        if (first != last) {

            return str.substring(first + 5, last);
        }
        return "";


    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == '*' && str.charAt(i-1 ) != str.charAt(i+1) ){
                return false;
            }
        }return true;


    }
    public String oneTwo(String str) {
      String result = "";
      for (int i = 0; i < str.length() - 2; i+=3){
          result = result + str.substring(i + 1, i + 3) + str.charAt(i);
        }return result;

    }
    public String zipZap(String str) {
        String word = "";
        str.toLowerCase();
        for (int i = 0; i < str.length();i+=3){
            if(i > 0 && str.charAt(i) == 'z' && str.charAt(i + 1) == 'p' ){
                word += str.substring(i, i + 1);
            }
        }return word;

    }


    }
















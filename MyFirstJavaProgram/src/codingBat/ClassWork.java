package codingBat;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Baktygul", 5));
        System.out.println(endOther("abchi", "hiabc"));



    }
//    Given two strings, return true if either of the strings appears
//    at the very end of the other string, ignoring upper/lower case differences
//            (in other words, the computation should not be "case sensitive").
//    Note: str.toLowerCase() returns the lowercase version of a string.
//    endOther("Hiabc", "abc") → true
//    endOther("AbC", "HiaBc") → true
//    endOther("abc", "abXabc") → true

    public static boolean endOther (String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        // a = hiabc; b = abc;
        // ABC, Hiabc;
        // a.endWith(b)
        // b.endWith(a)
        if(a.endsWith(b) || b.endsWith(a)){
        } return a.endsWith(b) || b.endsWith(a);

    }
    public static String repeatEnd(String str, int m){
        // str = shkola;
        // int m = 3;
       // String str1 = "";
        for (int i = 0; i < str.length(); i++){
          //  str1= str1 + str.substring(str.length() - m);

        } return str.substring(str.length() - m);

    }

}

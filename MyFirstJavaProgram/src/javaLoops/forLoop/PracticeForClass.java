package javaLoops.forLoop;

import java.util.Locale;

public class PracticeForClass {
    public static void main(String[] args) {
        PracticeForClass obj = new PracticeForClass();
        System.out.println(obj.chekEnd("samurai", "muram"));
        System.out.println(obj.getWord("comp", "lete"));
        System.out.println(obj.doubleChar("bakulya"));
    }
    public boolean chekEnd(String str, String word) {
//            checkEnd("abc", "bc") ➞ true
//            checkEnd("abc", "d") ➞ false
//            checkEnd("samurai", "zi") ➞ false
//            checkEnd("feminine", "nine") ➞ true
//            checkEnd("convention", "tio") ➞ false
        if (str.length() > word.length()) {
        }
        return str.substring(str.length() - word.length()).equals(word);

    }

    //    countWords("Just an example here move along") ➞ 6
//    countWords("This is a test") ➞ 4
//    countWords("What an easy task, right") ➞ 5
//    public int countWords(String word) {
//        int count = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        return count;
//    }

//    getWord("seas", "onal") ➞ "Seasonal"
//    getWord("comp", "lete") ➞ "Complete"
//    getWord("lang", "uage") ➞ "Language"

    public String getWord (String a, String b){
        return a.substring(0,1).toUpperCase() + a.substring(1)+ b.substring(0).toLowerCase();
    }

//    doubleChar("String") ➞ "SSttrriinngg"
//    doubleChar("Hello World!") ➞ "HHeelllloo  WWoorrlldd!!"
//    doubleChar("1234!_ ") ➞ "11223344!!__  "

    public String doubleChar (String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            result = result +  str.charAt(i) + str.charAt(i);

        } return result;
    }

    }










package codingBat;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class CodingBatClass {

    public static void main(String[] args) {

        CodingBatClass obj = new CodingBatClass();
        System.out.println(obj.helloName("Bob"));
        System.out.println(obj.makeOutWord("<<>>", "Yay"));
        System.out.println(obj.firstHalf("WooHoo"));
        System.out.println(obj.nonStart("Hello", "There"));
        System.out.println(obj.theEnd("Hello", false));
        System.out.println(obj.endsLy("oddly"));
        System.out.println(obj.nTwice("hello", 2));
        System.out.println(obj.makeAbba("hi", "bye"));
        System.out.println(obj.makeTags("i", "Yay"));
        System.out.println(obj.extraEnd("hi"));
        System.out.println(obj.firstTwo("h"));
        System.out.println(obj.withoutEnd("coding"));
        System.out.println(obj.comboString("aaa", "b"));
        System.out.println(obj.left2("hi"));
        System.out.println(obj.right2("hello"));
        System.out.println(obj.withoutEnd2("a"));
        System.out.println(obj.middleTwo("practice"));
        System.out.println(obj.twoChar("hello", 1));
        System.out.println(obj.middleThree("candy"));
        System.out.println(obj.hasBad("xbad"));
        System.out.println(obj.atFirst(""));
        System.out.println(obj.lastChars("hi", "java"));
        System.out.println(obj.conCat("abc", "cat"));
        System.out.println(obj.lastTwo("coding"));
        System.out.println(obj.seeColor("redxx"));
        System.out.println(obj.seeColor("blueTimes"));
        System.out.println(obj.frontAgain("edited"));
        System.out.println(obj.minCat("java", "hello"));
        System.out.println(obj.extraFront("hello"));
        System.out.println(obj.without2("H"));
        System.out.println(obj.deFront("Hello"));
        System.out.println(obj.withoutX("xhix"));
        System.out.println(obj.withoutX2("hxi"));


    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);

    }

    public String firstHalf(String str) {

        return str.substring(0, str.length() / 2);
    }

    public String nonStart(String a, String b) {

        return a.toLowerCase().substring(1) + b.toLowerCase().substring(1);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return str.substring(str.length() - 2).endsWith("ly");
        }
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length());

    }

    public String makeAbba(String a, String b) {
        return a.concat(b) + b.concat(a);
    }

    public String makeTags(String tag, String word) {
        return "<" + ">" + word + "<" + "/" + tag + ">";

    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);

    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);

    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b.concat(a) + b;
        }
        return a.concat(b) + a;

    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);

    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String withoutEnd2(String str) {
        if (str.length() <= 1) {
            return "";
        }
        return str.substring(1, str.length() - 1);

    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);

    }

    public String twoChar(String str, int index) {
        if (index > str.length() - 2 || index == 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);

    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);


    }

    public boolean hasBad(String str) {
        if (str.length() < 3  ) {
            return false;
        } else if (str.substring(0, 3).equals("bad")) {
            return true;
        } else if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() < 2) {
            str = str + "@@";
        }
        return str.substring(0, 2);

    }

    public String lastChars(String a, String b) {
        a = a + "@";
        b = "@" + b;
        return a.substring(0, 1) + b.substring(b.length() - 1);

    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        }
        return a + b;

    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2) +
                    str.substring(str.length() - 1) +
                    str.substring(str.length() - 2, str.length() - 1);
        }
    }

    public String seeColor(String str) {
        if ((str.length() > 2) && (str.substring(0, 3).equals("red"))) {
            return "red";
        } else if ((str.length() > 3) && (str.substring(0, 4).equals("blue"))) {
            return "blue";
        }
        return "";

    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        } else
            return str.length() == 2 || str.substring(0, 2).equals(str.substring(str.length() - 2));

    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        } else {
            return a.substring(a.length() - b.length()) + b;

        }


    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);

    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);

        }
        return str;

    }

    public String deFront(String str) {
        if (str.substring(0).equals("a")) {
            return str.substring(0) + str.substring(2);
        } else if (str.substring(1).equals("b")) {
            return str.substring(0) + str.substring(2);
        }
        return str.substring(2);

    }

    public String withoutX(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            str = (str.substring(0, str.length() - 1));
        }
        return str;

    }

    public String withoutX2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1);


        }
        return str;
    }


    }





public class My {
    public static void main(String[] args) {

        String s1 = "a";
        s1 = "xy";
        String s2 = s1.concat("b");
        s2.concat("c");
        System.out.println(s1);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("w");
        sb1.append("o");
        sb1.append("r");
        sb1.append("l");
        sb1.append("d");
        System.out.println(sb1);

    }
}

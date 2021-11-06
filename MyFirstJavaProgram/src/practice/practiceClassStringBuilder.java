package practice;

public class practiceClassStringBuilder {
    public static void main(String[] args) {

    // insert
        // LeonardoDiCaprio
        //                                    0123456789
        StringBuilder sb = new StringBuilder("LeonardoCaprio");
        System.out.println(sb);
        sb.insert(8, "Di");
        System.out.println(sb);

    // .replace

        // Ala-Too
        //                                     012345
        StringBuilder sb1 = new StringBuilder("Ala-to");
        sb1.replace(4,7, "Too");
        System.out.println(sb1);  // Ala-Too

    // .reverse

        StringBuilder sb2 = new StringBuilder("Monday");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);

    // .delete

        // Glasses
        StringBuilder sb3 = new StringBuilder("SunGlasses");
        sb3.delete(0,3);
        System.out.println(sb3);  // Glasses

    // .deleteCharAt

        sb3.deleteCharAt(6);
        System.out.println(sb3);
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());  // 16
        sb4.append("123456789012345").append("1").append("45678");  //22
        System.out.println(sb4.capacity());  // 34  16*2+2
        sb4.append("098765432123456vhgvjkbfchmc");  // 34*2+2=70
        System.out.println(sb4.capacity());
        StringBuilder sb5 = new StringBuilder(9);
        System.out.println(sb5.capacity());
    }
}

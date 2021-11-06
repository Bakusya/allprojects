package stringBuilder1;

public class StringBuilderPractice {
    public static void main(String[] args) {

        StringBuilder name1 = new StringBuilder("RIO-DE");
        name1.replace(1, 7, "io de Janeiro");
        System.out.println(name1);

        //1.
        StringBuilder name2 = new StringBuilder("TesssLA");
        name2.delete(3,7).insert(3, "la");
        System.out.println(name2);
        //2.
        StringBuilder name3 = new StringBuilder("TesssLA");
        name3.replace(3,7, "la");
        System.out.println(name3);


    }
}

package codingBat;

public class String3 {
    public static void main(String[] args) {
        System.out.println(withoutString("hello there", "llo"));

    }
    public static String withoutString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length(); i++){
            for (int j = 0; j < remove.length();j++){
                if (!base.substring(i, i+1).equals(remove.substring(j,j+1))){


                }
            }
        }return result;

    }

}

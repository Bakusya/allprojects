package methods;

public class ReturnMethods {
    public static void main(String[] args) {

        System.out.println(convertingIntoSom(200));
        System.out.println(convertingIntoSom(500));
        System.out.println(toKnownNormWeight(56));  // 54
        ReturnMethods greetingObject = new ReturnMethods();
        System.out.println(greetingObject.greeting("Bems"));
        System.out.println(greetingObject.greeting("Nuta"));
        greetingObject.info("Lolita", 35, "singer");
        greetingObject.showLyricsOfSong();
    }
    // Return method
    public static int convertingIntoSom(int dollar){
        int result = 82 * dollar;
        return result;
    }
    public static double toKnownNormWeight(double weight){
        double normWeight = weight - 2;
        return normWeight;
    }
    public String greeting(String name){
        return "Hello " + name;
    }
    // Non-Return method
    public void info(String name, int age, String profession){
        System.out.println("Your name is: " + name + "\n"
                + "Your age is: " + age + "\n"
                + "Your profession is: " + profession);
    }
    public void showLyricsOfSong(){
        String lyrics = "Fly me to the Moon!";
        System.out.println(lyrics);
    }
// return --> return specific data types
// void --> return is nothing
    }




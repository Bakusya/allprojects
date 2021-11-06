package switchTasks;

public class SwitchClass {
    public static void main(String[] args) {

        System.out.print("Temperature in Kyrgyzstan ");
        String season = "Winter";
        switch (season){
            case "Winter" :
                System.out.println("Winter -10  +5 ");
                break;
            case "Spring" :
                System.out.println("Spring +10 +20");
                break;
            case "Summer" :
                System.out.println("Summer +30 +40");
                break;
            case "Fall" :
                System.out.println("Fall +20 + 8");
                break;
            default:
                System.out.println("This is not a season. Please enter this symbols: W, S, s, F");
        }
        System.out.println("_____________________________");
        int digit = 20;
        switch(digit){   //20
            case 100 :
                System.out.println("Hundred");
                break;
            case 0 :
                System.out.println("Zero");
                break;
            case 71 :
                System.out.println("Seventy one");
                break;
            case 20 :
                System.out.println("Twenty");
                break;
        }
        int n = 12;
        float f = 45.9f;
        boolean b = true;
        char c = 's';
        String str = "Hello!";

        //literal --> means value of variables
        //Literal of float?  --> literal of float is 45.9f
        //Literal of boolean? --> literal of float is true
        //constant --> means value, which we cannot change never!
        //for constant variable we have to use "final" key word

        final int dateOfBirthKetty = 1975;
        System.out.println("Ketty was born " + dateOfBirthKetty);

        // break -> optional statement
        // default -> optional statement




    }
}

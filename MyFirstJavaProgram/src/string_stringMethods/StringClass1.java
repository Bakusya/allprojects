package string_stringMethods;

public class StringClass1 {
    public static void main(String[] args) {

        // String ---> type any symbols inside of double quotes
//        Creating String with literal
//        String str = "Hello";
//        String str2 = "Hi";
//        String str3 = "h";
//
//        double price = 23.9;
//
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();

        // short command for comments
        //mac  --> 1. highlight line/lines
        //         2. [COMMAND] + [/]  --> comment
        //         3. [COMMAND] + [/]  --> uncomment
        //windows/Linux ---> 1. highlight line/lines  --> comment
        //                      2. CTRL] + [/]        --> uncomment

//        Creating String with key word "new"

        String str = new String("Welcome");
        System.out.println(str);
        String strr = "Welcome";
        System.out.println(strr);
        String school = "School";
        //length -> from 1 = 6symbols
        //index -> from 0 = 5indexes
        //                         1         2         3         4        --> length
        String name = "Bems";  // [B]->[0], [e]->[1], [m]->[2], [s]->[3],
        //                         0         1         2         3        --> indexes
        // length -> 4symbols (from 1)
        // index -> 3indexes (from 0)
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //Methods of String

        //                           1      2      3      4      5
        String phone = "Nokia";  // [N] -> [o] -> [k] -> [i] -> [a]
        //                           0      1      2      3      4
        String slogan = " - Connecting People";


        //  .length() --> returns  symbol quantity of String


        System.out.println(phone.length() ); // 5


        //  .charAt()  --> inside of parenthesis we provide index, then it will return symbol


        System.out.println(phone.charAt(2));  // k
        System.out.println(phone.charAt(3));  // i
        System.out.println(phone.charAt(0));  // N


        //  .concat() --> concatenation strings


        // first way of concatenation  --> we can concatenate any data types

        System.out.println(phone + slogan);  // Nokia - Connecting People
        // second way of concatenation ---> we can concatenate String with String
        System.out.println(phone.concat(slogan));  // Nokia - Connecting People


        //   .subString --> returns the substring of the string. The substring starts with the character at the specified index.


        // " - Connecting People"; --> 20symbols,

        System.out.println(slogan.substring(14)); // People
        System.out.println(slogan.substring(3)); // Connecting People


        //   .subString --> returns substring between beginning and ending indexes


        // " - Connecting People"; --> 20symbols,

        System.out.println(slogan.substring(3, 8)); // beginning in// dex [C]->[3], ending index [c]-[8] (but shows index 7[e]);
        // "Nokia";
        System.out.println(phone.substring(2, 5)); // kia


        //  .trim  --> removes only spaces in the beginning and end of the String


        String userName = " Alex ";
        System.out.println(userName);
        System.out.println(userName.trim());


        //  .indexOf() -->


        //                            1     2      3
        String animal = "Dog";    //[D] -> [o] -> [g]
        //                           0      1      2
        System.out.println(animal.indexOf(68));   // 0
        System.out.println(animal.indexOf('s'));  // 2
        System.out.println(animal.indexOf("og"));  // 1
        System.out.println(userName.indexOf("ex"));// 3
        String lapTop = "MacBook o Pro";    // M a c B o o k    o    P r o
        //                                     0 1 2 3 4 5 6  7 8 9 10 11 12
        System.out.println(lapTop.indexOf('o')); // 4
        System.out.println(lapTop.indexOf('k', 2));  // 6
        String male = "Akmatov";
        String female = "Akmatova";
        if (male.contains("ov")){
            System.out.println("This is a boy");
        } else if (female.contains("ova")){
            System.out.println("This is a girl");
        } else{
            System.err.println("LGBT");
        }

        System.out.println("---------12.05.2021-----------");




        String noteBook = "office book is my book and that Mac book my too ";
        System.out.println(noteBook.indexOf('f'));  // 1
        System.out.println(noteBook.indexOf('f', 2));  // 2
        System.out.println(noteBook.indexOf("book")); // 7
        System.out.println(noteBook.indexOf("book", 8)); // 18
        System.out.println(noteBook.indexOf("book", 20)); // 36


        // .lastIndexOf()


        //              012345
        String color = "Yellow";
        System.out.println(color.indexOf('l'));
        System.out.println(color.indexOf('l', 3));  // 3
        System.out.println(color.lastIndexOf('l'));  //3
        String morning = "Good morning";
        System.out.println(morning.lastIndexOf('o'));  // 6


        // .equals()


        String shoot1 = "shoot";
        String shoot2 = "shoot";
        boolean result1 = shoot1 == shoot2; // true   ==  +
        System.out.println(result1);
        boolean result2 = shoot1.equals(shoot2);  //true   .equals - .concat
        System.out.println(result2);
        System.out.println("one".equals("one")); // true
        System.out.println("James".equals("James")); // true
        String animal1 = "mOuse";
        String animal2 = "MousE";
        boolean res1 = animal1.equals(animal2); // false
        System.out.println(res1);
        boolean res2 = animal1.equalsIgnoreCase(animal2);  // true
        System.out.println(res2);
        boolean res3 = "monkey".equals("Monkey"); // false
        System.out.println(res3);
        boolean res4 = "Dolphin".equalsIgnoreCase("Shark");  //false
        System.out.println(res4);


        // .toLowerCase


        String firstName = "Johnson";
        System.out.println(firstName.toLowerCase()); // johnson
        String nickName = "KinGsmAn";
        System.out.println(nickName.toLowerCase());  // kingsman


        // .toUpperCase()


        String brand = "GuccI";
        System.out.println(brand.toUpperCase());  // GUCCI


        // .replace()


        String singer = "lady Gaga";
        System.out.println(singer.replace('l', 'L'));  // Lady Gaga
        String actor = " Joy Depp";
        System.out.println(actor);
        System.out.println(actor.replaceAll("Joy", "Johny"));
        String word = " UNIVERSAL ";
        System.out.println(word);  // UNIVERSAL
        String lowerCase = word.toLowerCase();  // universal
        System.out.println(lowerCase);
        String replace = lowerCase.replace('u', 'U');  // Universal
        System.out.println(replace);
        String trim = replace.trim();
        System.out.println(trim);


        //Method chaining


        String output = " DISNEY "
                .toLowerCase()
                .replace('d', 'D')
                .trim();
        System.out.println(output);

        // Harry Potter
        String harry = "Hary POTER    ".toLowerCase().replace('h', 'H').replace('p', 'P').trim();
        //                             012345678
        System.out.println(harry);  // Hary Poter
        String replaceAll = harry.replaceAll("Hary Poter", "Harry Potter");
        System.out.println(replaceAll);  // Harry Potter

        String one = "one";
        one = "two";
        System.out.println(one);

        String partName1 = "Leonardo";
        String partName2 = partName1.concat(" di-");
        System.out.println(partName2);  // Leonardo di-

//        partName2.concat("Caprio");  // Leonardo di-
//        System.out.println(partName2);

        String partName3 = partName2.concat("Caprio");
        System.out.println(partName3);

        // String pool and heap
        String apple1 = "Apple";
        String apple2 = "Apple";
        boolean ress1 = apple1 == apple2;  // true
        System.out.println(ress1);
        String apple3 = new String("Apple");  // false
        boolean ress2 = apple1 == apple3;
        System.out.println(ress2);




    }
}

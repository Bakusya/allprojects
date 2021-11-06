package methods;

public class JavaMethods3 {
    public static void main(String[] args) {

        // calling static method
        multiplicationOf2(6);  //2 * 6 = 12
        multiplicationOf2(9);  //2 * 9 = 18
        multiplicationOf2(5);  //2 * 5 = 10
        // calling non-static method
        JavaMethods3 object = new JavaMethods3();
        object.multiplicationOf5(9); // 5 * 9 = 45
        object.multiplicationOf5(7); // 5 * 7 = 35
    }
    public static void multiplicationOf2(int num){
        int result = num * 2;
        System.out.println(result);
    }
    public void multiplicationOf5(int num){
        int result = num * 5;
        System.out.println(result);
    }
// Static method --> access for current class, and calling name of method itself inside of current class
// non-Static method --> access for current and another classes, but only via creating objects



    }


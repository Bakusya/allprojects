package methods;

public class MethodOverLoading {

        public static void main(String[] args) {
            //Method overloading
            sum(8,9);
             MethodOverLoading obj = new MethodOverLoading();
            System.out.println(obj.greeting("Alex"));
            System.out.println(obj.greeting("Bred", "Pitt"));
            System.out.println("Hello".substring(2));
            System.out.println(obj.greeting("Johny", "Dep"));
        }
        int multiplication(int x, int y){
            return x * y;
        }
        int multiplication(int x, short y){
            return x * y;
        }
        //byte, short, int, long
        public String greeting(String name){

            return "Hi " + name + "!";
        }
        public String greeting(String firstName, String lastName){

            return "Hi " + firstName + " " + lastName + "!";
        }
        static void sum(int num1, int num2){
            System.out.println(num1 + num2);
        }
        public long sum(int x, long y){

            return x + y;
        }
        // Method overloading --> creating method with same name, but difference parameters (difference dataTypes, not difference name of variables)
        // 1. sum(int num1, int num2){}  --> sum(int , int)
        // 2. sum(int x, int y){}        --> sum(int , int)
        // public
        // private
        // protected
        // default
    }


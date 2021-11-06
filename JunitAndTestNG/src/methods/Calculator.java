package methods;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,1));


    }


  public  int add (int a, int b){
      int x = a + b;
      return x;
  }
}

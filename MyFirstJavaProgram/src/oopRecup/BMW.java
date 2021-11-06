package oopRecup;

public class BMW extends Car{
    public BMW(String mark, String model, String color, int yearOfRelease) {
        super(mark, model, color, yearOfRelease);
    }
    public void driving(){
        System.out.println("Boom boom!");
    }
    // inheritance --> nasledovanie
    // extends --> rasSHirenie (nasledovanie)
    // class BMW  --> childClass / sub class
    // class Car  --> superClass / paren class
    // method override --> pereopredelyaet method
    // 1. class -->  fields, constructors, methods, Getter Setter, toString
    // 2. object --> parameters, .methods(), getValue(), setValue, calling object
    // 1. Encapsulation --> get access Getter and Setter for private instance variables
    // 2. Inheritance --> extends, super
    // 3. Polymorphism  --> 1. overloading (same name of method, but different parameters)
    //                  --> 2. overriding (same name of method, but different implementation(realizaciya))
    // 4. Abstraction
    // 5. Interface
}


package oopAbstraction;

abstract public class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract public void voice();
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // abstract classes use keyword "abstract"
    // abstract classes: 1.regular methods, 2.abstract methods
    // abstract methods cannot have a body
    // if you have abstract methods, current class must be declare as a abstract class
    // 1. Regular method can a have body
    // 2. Abstract methods cannot have a body
    // We cannot create object by abstract class
    // If we want to create object by abstract class, we have to inherit another class from abstract class
}

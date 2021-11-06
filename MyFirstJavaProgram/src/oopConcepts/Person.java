package oopConcepts;

public class Person {

    // instance variable
    public String name;
    public int age;
    private String profession;
    public char gender;

    // constructor
    public Person(String name, int age, String profession, char gender) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.gender = gender;
    }

    // Getter
    public String getProfession() {
        return profession;
    }

    // Setter
    public void setProfession(String profession) {
        this.profession = profession;
    }

    // methods
    public void speak() {
        System.out.println("Hello, Hello, Hello");
    }

    public void speak(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hi-Hi-Hi");
        }
    }

    @Override  // annotation
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", gender=" + gender +
                '}';
    }
}
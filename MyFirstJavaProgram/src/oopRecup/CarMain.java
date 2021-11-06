package oopRecup;

public class CarMain {
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes", "S", "White", 2020);
        System.out.println(mercedes.mark + " " + mercedes.model + " " + mercedes.color + " " + mercedes.getYearOfRelease());
        mercedes.driving();
        BMW bmw = new BMW("BMW", "X5", "Black", 2020);
        System.out.println(bmw);
        bmw.driving();
        Ferrari ferrari = new Ferrari("Ferrari", "F50", "red", 2020);
        System.out.println(ferrari);
        ferrari.driving();
    }
}

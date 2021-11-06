package oopConcepts2;

public class Car {
    // fields
    public String mark;
    public String model;
    public String color;
    private double price;

    // constructor
    public Car(String mark, String model, String color, double price) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //getter
    public double getPrice() {
        return price;
    }

    //setter
    public void setPrice(double price) {
        this.price = price;
    }

    // method
    public String speed(int speed) {
        return speed + "km/h";
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
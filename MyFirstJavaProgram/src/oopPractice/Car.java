package oopPractice;

import java.security.PublicKey;

public class Car {
    public String name;
    public  String model;
    public int year;
    private int price ;

    public Car(String name,String model,int year, int price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;

    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

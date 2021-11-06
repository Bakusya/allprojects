package oopRecup;

public class Car {
    //identity
    public String mark;
    //state
    public String model;
    public String color;
    private int yearOfRelease;
    // method --> action/ behavior
    public void driving(){
        System.out.println("Vrooom - vroom");
    }
    // Getter
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    // Setter
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    // constructor
    public Car(String mark, String model, String color, int yearOfRelease){
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }
    @Override  // annotation
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
    // Windows --> alt + insert
    // Mac --> command + N
}


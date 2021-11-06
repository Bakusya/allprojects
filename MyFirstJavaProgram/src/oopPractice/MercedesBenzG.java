package oopPractice;

public class MercedesBenzG extends Mersedec{
    String amg;
    public MercedesBenzG(String name, String model, int year, int price) {
        super(name, model, year, price);
        this.amg = amg;

    }

    public String getAmg() {
        return amg;
    }

    public void setAmg(String amg) {
        this.amg = amg;
    }

    @Override
    public String toString() {
        return "MercedesBenzG{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amg='" + amg + '\'' +
                '}';
    }

}

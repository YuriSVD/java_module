package lessons.lesson2;

public class Workstation extends Laptop {
    int numbersOfMonitors;

    public Workstation() {
    }
    public Workstation(String brand, String model, int price, double weight, String tablet, int numbersOfMonitors) {
        super(brand, model, price, weight, tablet);
        this.numbersOfMonitors = numbersOfMonitors;
    }
}

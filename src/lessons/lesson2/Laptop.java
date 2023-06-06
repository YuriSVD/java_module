package lessons.lesson2;

public class Laptop extends PC {
    String tablet;
    public Laptop() {
    }

    public Laptop(
            String brand,
            String model,
            int price,
            double weight,
            String tablet) {
        super(brand, model, price, weight);
        this.tablet = tablet;
    }
}

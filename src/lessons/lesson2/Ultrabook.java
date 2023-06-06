package lessons.lesson2;

public class Ultrabook extends Laptop {
    boolean isLight;

    public Ultrabook() {
    }

    public Ultrabook(String brand, String model, int price, double weight, String tablet, boolean isLight) {
        super(brand, model, price, weight, tablet);
        this.isLight = isLight;
    }
}

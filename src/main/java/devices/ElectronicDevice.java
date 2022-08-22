package devices;

public abstract class ElectronicDevice {

    private String brand;
    private double price;

    public ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String turnOn() {
        return "Beep bop bop beep";
    }

    public String turnOff() {
        return "Poof...";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

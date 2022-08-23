package devices;

import interfaces.IAdvertise;

public abstract class ElectronicDevice implements IAdvertise {

    private String brand;
    private String name;
    private double price;

    public ElectronicDevice(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    //Abstract method:
    public abstract String turnOn();

    public String turnOff() {
        return "Poof...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String advertise() {
        return String.format("You can have this wonderful %s for only %s.", this.getName(), this.getPrice());
    }
}

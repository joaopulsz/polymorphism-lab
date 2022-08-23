package services;

import interfaces.IAdvertise;

public abstract class Service implements IAdvertise {

    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String advertise() {
        return String.format("%s here for only %s! Don't miss out!", this.getName(), this.getPrice());
    }
}

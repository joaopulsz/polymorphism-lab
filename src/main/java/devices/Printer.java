package devices;

import devices.ElectronicDevice;

public class Printer extends ElectronicDevice {

    private String resolution;
    private boolean twoSided;
    private int remainingInk;

    public Printer(String brand, String name, double price, String resolution, boolean twoSided, int remainingInk) {

        super(brand, name, price);
        this.resolution = resolution;
        this.twoSided = twoSided;
        this.remainingInk = remainingInk;
    }

    public String print(int pages) {
       return "Done, " + pages + " pages printed.";
    }

    public String checkInk() {
        if (this.getRemainingInk() >= 15) {
            return "There is " + this.getRemainingInk() + " percent of total ink left in the cartridges.";
        } else if (this.getRemainingInk() < 15 && this.getRemainingInk() > 0) {
            return "Please refill as soon as possible, there is just " + this.getRemainingInk() + " percent of total ink left in the cartridges.";
        } else {
            return "No ink left. Please refill the cartridges.";
        }
    }

    public void refillInk() {
        setRemainingInk(100);
    }

    public void setRemainingInk(int remainingInk) {
        this.remainingInk = remainingInk;
    }

    public int getRemainingInk() {
        return remainingInk;
    }

    public String turnOn() {
        return "Beep bop bop beep.";
    }
}

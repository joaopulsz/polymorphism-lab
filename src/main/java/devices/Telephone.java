package devices;

public class Telephone extends ElectronicDevice {

    private boolean corded;

    public Telephone(String brand, String name, double price, boolean corded) {

        super(brand, name, price);
        this.corded = corded;
    }

    //Method overload:
    public String call(long phoneNumber) {
        return "Beep beep...";
    }
    public String call(String savedContactName) {
        return String.format("Calling %s, beep beep...", savedContactName);
    }

    public String turnOn() {
        return "Beeeeeeeeeeeeep...";
    }
}

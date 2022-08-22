package devices;

public class Telephone extends ElectronicDevice {

    private boolean corded;

    public Telephone(String brand, float price, boolean corded) {

        super(brand, price);
        this.corded = corded;
    }

    
}

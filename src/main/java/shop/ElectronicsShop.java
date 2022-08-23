package shop;

import devices.ElectronicDevice;
import services.Service;

import java.util.ArrayList;

public class ElectronicsShop {

    private String name;
    private float till;
    private ArrayList<ElectronicDevice> stock;

    public ElectronicsShop(String name) {

        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void addDeviceToStock(ElectronicDevice device) {
        this.stock.add(device);
    }

    public ArrayList<ElectronicDevice> getStock() {
        return this.stock;
    }

    public float getTill() {
        return till;
    }

    public void sellDevice(ElectronicDevice device) {
        this.till += device.getPrice();
        this.stock.remove(device);
    }

    public void sellService(Service service) {
        this.till += service.getPrice();
    }

    public String advertiseDevice(ElectronicDevice device) {
        return device.advertise();
    }

    public String advertiseService(Service service) {
        return service.advertise();
    }

}

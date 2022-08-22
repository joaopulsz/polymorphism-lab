package shop;

import devices.ElectronicDevice;

import java.util.ArrayList;

public class ElectronicsShop {

    private String name;
    private float till;
    private ArrayList<ElectronicDevice> stock;

    public ElectronicsShop(String name, int desks) {

        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void addDeviceToStock(ElectronicDevice device) {
        this.stock.add(device);
    }

    public void sellDevice(ElectronicDevice device) {
        this.till += device.getPrice();
        this.stock.remove(device);
    }

}

package shop;

import devices.Computer;
import devices.Printer;
import devices.Telephone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.ProgrammingCourse;
import services.Repair;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicsShopTest {

    private ElectronicsShop shop;
    private Computer computer;
    private Printer printer;
    private Telephone telephone;
    private Repair repair;
    private ProgrammingCourse programmingCourse;

    @BeforeEach
    public void setUp() {
        this.shop = new ElectronicsShop("Bright's Tech Shop");
        this.computer = new Computer("Apple", "MacBook", 1200.00,"MacOS Monterey", "M2", 16, 512);
        this.printer = new Printer("HP", "InkMaster", 999.99, "4K", true, 100);
        this.telephone = new Telephone("Samsung", "Galaxy Landline", 99.90, true);
        shop.addDeviceToStock(computer);
        shop.addDeviceToStock(printer);
        shop.addDeviceToStock(telephone);
        this.repair = new Repair("Fix broken smartphone screen", 150, true);
        this.programmingCourse = new ProgrammingCourse("Backend development course", 4000, true, "Python", "Tomorrow");
    }

    @Test
    public void canSellDevice() {
        shop.sellDevice(computer);
        assertEquals(shop.getTill(), computer.getPrice());
        assertEquals(shop.getStock().size(), 2);
    }

    @Test
    public void canSellService() {
        shop.sellService(repair);
        assertEquals(shop.getTill(), repair.getPrice());
    }

    @Test
    public void canAdvertiseDevice() {
        assertEquals(shop.advertiseDevice(printer), "You can have this wonderful InkMaster for only 999.99.");
    }

    @Test
    public void canAdvertiseService() {
        assertEquals(shop.advertiseService(programmingCourse), "Backend development course here for only 4000.0! Don't miss out!");
    }
}

package devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    private Printer printer;

    @BeforeEach
    public void setUp() {
        this.printer = new Printer("HP", "InkMaster", 999.99, "4K", true, 0);
    }

    @Test
    public void canTurnOnAndOff() {
        assertEquals(printer.turnOn(), "Beep bop bop beep.");
        assertEquals(printer.turnOff(), "Poof...");
    }

    @Test
    public void canCheckInk() {
        assertEquals(printer.checkInk(), "No ink left. Please refill the cartridges.");
    }

    @Test
    public void canRefillInk() {
        printer.refillInk();
        assertEquals(printer.checkInk(), "There is 100 percent of total ink left in the cartridges.");
    }
}

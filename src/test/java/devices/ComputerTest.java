package devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {

    private Computer computer;

    @BeforeEach
    public void setUp() {
        this.computer = new Computer("Apple", "MacBook", 1200.00,"MacOS Monterey", "M2", 16, 512);
    }

    @Test
    public void canTurnOn() {
        assertEquals(computer.turnOn(), "Welcome back, please enter your password.");
    }

    @Test
    public void canFunctionProperly() {
        assertEquals(computer.browseInternet(), "Enter an url or search Google.");
        assertEquals(computer.checkEmails(), "No new email.");
        assertEquals(computer.writeCode(), "Creating new Java project.");
        assertEquals(computer.editText(), "Type here.");
        assertEquals(computer.createSpreadsheet(), "Type here.");
    }
}

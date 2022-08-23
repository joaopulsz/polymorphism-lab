package devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelephoneTest {

    private Telephone telephone;

    @BeforeEach
    public void setUp() {
        this.telephone = new Telephone("Samsung", "Galaxy Landline", 99.90, true);
    }

    @Test
    public void canCall() {
        assertEquals(telephone.call(12345678), "Beep beep...");
        assertEquals(telephone.call("Joao"), "Calling Joao, beep beep...");
    }
}

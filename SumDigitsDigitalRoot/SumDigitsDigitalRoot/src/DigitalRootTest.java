import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

class DigitalRootTest {

    @org.junit.jupiter.api.Test
    void digitsSum() {
        DigitalRoot digitalRoot = new DigitalRoot();
        assertEquals("Nope!",7,  digitalRoot.DigitsSum(16));
        assertEquals("Nope!", 6, digitalRoot.DigitsSum(456));
    }
}
package tests;

import main.RgbToHex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RgbToHexTest {

    @Test
    public void rgb() {
        assertEquals("For input: (0, 0, 0)", "000000", RgbToHex.rgb(0, 0, 0));
    }
}
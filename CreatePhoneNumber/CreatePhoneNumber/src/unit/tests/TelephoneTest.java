package unit.tests;

import main.Telephone;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelephoneTest {

    @Test
    public void formatArray() {
        assertEquals("(123) 456-7890", Telephone.formatArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
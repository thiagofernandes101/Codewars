package tests;

import main.PigLatin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PigLatinTest {

    @Test
    public void pigIt() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("hisTay siay ymay pecialsay haractercay !", PigLatin.pigIt("This is my special character !"));
    }
}
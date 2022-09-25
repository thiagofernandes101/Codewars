package tests;

import main.WordsManipulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsManipulationTest {

    @Test
    public void reverseWords() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", WordsManipulation.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", WordsManipulation.reverseWords("apple"));
        assertEquals("a b c d", WordsManipulation.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", WordsManipulation.reverseWords("double  spaced  words"));
    }
}
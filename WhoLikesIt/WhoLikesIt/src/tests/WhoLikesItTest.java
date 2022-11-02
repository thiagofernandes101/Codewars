package tests;

import main.WhoLikesIt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {

    @Test
    public void showIt() {
        assertEquals("no one likes this", WhoLikesIt.showIt());
        assertEquals("Peter likes this", WhoLikesIt.showIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.showIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.showIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.showIt("Alex", "Jacob", "Mark", "Max"));
    }
}
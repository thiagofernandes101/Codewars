package tests;

import main.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void removeElementsPresentInAnotherList() {
        assertArrayEquals(new int[] {2}, Kata.removeElementsPresentInAnotherList(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Kata.removeElementsPresentInAnotherList(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Kata.removeElementsPresentInAnotherList(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Kata.removeElementsPresentInAnotherList(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Kata.removeElementsPresentInAnotherList(new int [] {}, new int[] {1,2}));
    }
}
package main;


import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[] removeElementsPresentInAnotherList(int[]firstArray, int[] secondArray) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : firstArray) {
            if (!Arrays.stream(secondArray).anyMatch(x -> x == element)) {
                result.add(element);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

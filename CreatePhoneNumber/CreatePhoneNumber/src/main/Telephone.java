package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Telephone {
    public static String formatArray(int[] numbers) {
        List<Integer> rawNumbers = Arrays.stream(numbers).boxed().toList();
        String areaCode =rawNumbers.stream().limit(3).map(Object::toString).collect(Collectors.joining(""));
        String firstThreeDigits = rawNumbers.stream().skip(3).limit(3).map(Object::toString).collect(Collectors.joining(""));
        String lastFourDigits = rawNumbers.stream().skip(6).map(Object::toString).collect(Collectors.joining(""));
        return String.format("(%s) %s-%s", areaCode, firstThreeDigits, lastFourDigits);
    }
}

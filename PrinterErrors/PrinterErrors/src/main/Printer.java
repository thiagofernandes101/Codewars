package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {
    public static void main(String[] args) {
        String colors = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(colors));
    }

    public static String printerError(String colors) {
        Pattern pattern = Pattern.compile("([n-z])");
        Matcher problemOccurrences = pattern.matcher(colors);
        long numberOfOccurrences = problemOccurrences.results().count();
        return String.format("%d/%d", numberOfOccurrences, colors.length());
    }
}
